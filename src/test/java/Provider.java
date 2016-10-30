import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {
   private static WebDriver webDriver;
    @BeforeClass
    public  void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();


    }

    @Test(dataProvider = "Parameter")
    public void testProvider(String url) throws Exception {
webDriver.get(url);
        Thread.sleep(2000);
        Assert.assertEquals(webDriver.getCurrentUrl(),url,"Error");

    }

    @DataProvider(name = "Parameter")
    public static Object[][] Name() {
return new Object[][]{new Object[]{"https://mail.ru/"},new  Object[]{"https://www.google.com.ua/"}};
    }

    @AfterClass
public  void down() throws Exception {
        if(webDriver !=null){
    webDriver.quit();
}
    }
}
