package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageObEx {
    private static WebDriver webDriver;
    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();


    }

    @Test
    public  void login() throws InterruptedException {
        webDriver.get("https://mail.ru/");
        webDriver.findElement(By.id("mailbox__login")).sendKeys("d-pastushenko@inbox.ru");
        webDriver.findElement(By.id("mailbox__password")).sendKeys("1996baba");
        webDriver.findElement(By.id("mailbox__auth__button")).click();
        Thread.sleep(2000);
        Assert.assertEquals(webDriver.findElement(By.id("PH_user-email")).getText(),"d-pastushenko@inbox.ru");
    }
    @AfterClass
    public void down() throws Exception {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
