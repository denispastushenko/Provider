package Test;

import DriverFactory.DriversFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseTest {
    WebDriver webDriver;
    @BeforeSuite
    public void setttUp() throws Exception {
        webDriver = DriversFactory.getDriver();
    }

    @AfterSuite
    public void tearvvDown() throws Exception {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
