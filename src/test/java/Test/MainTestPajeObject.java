package test;

//import Pages.SentMail;

import Pages.AfterLogPage;
import Pages.LoginPage;
import Pages.SentMail;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTestPajeObject extends BaseTest {
    LoginPage loginPage;
    AfterLogPage afterLogPage;
    SentMail sentMail;
    @BeforeMethod
            public  void  setUp(){
        webDriver.get("https://mail.ru/");
        loginPage = new LoginPage(webDriver);
        afterLogPage = new AfterLogPage(webDriver);
        sentMail = new SentMail(webDriver);
    }

    @Test
    public void testMain() throws Exception {
        String actual = loginPage.login("d-pastushenko@inbox.ru","1996baba").userEmailText();

        Assert.assertEquals(actual,"d-pastushenko@inbox.ru");
        afterLogPage.compose();
        sentMail.mail("d-pastushenko@inbox.ru","Hi Denys");

    }

   /* @Test
    public void testLoc() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\geckodriver.exe");
        FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Firefox Developer Edition\\firefox.exe"));
        FirefoxProfile fur = new FirefoxProfile();
        FirefoxDriver driver = new FirefoxDriver(binary,fur);
        driver.get("https://mail.ru/");
        driver.quit();

    }*/

   /* @Test
    public void testFantom() throws Exception {
        File file = new File ("C:\\Users\\Denys\\Desktop\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
        PhantomJSDriver phjs = new PhantomJSDriver();
        phjs.get("https://mail.ru/");
    }*/
}
