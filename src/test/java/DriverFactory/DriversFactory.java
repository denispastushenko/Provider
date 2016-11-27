package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriversFactory {

 public static WebDriver getDriver(){
    WebDriver webDriver;
       String nameDriver = System.getProperty("webDriver","firefoxEd");
        switch (nameDriver){

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;

                case "fireFox":
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\geckodriver.exe");
                    webDriver = new FirefoxDriver();
                    break;
            case "ie":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\ IEDriverServer.exe");
                webDriver = new InternetExplorerDriver();
                break;
            case "edge":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\MicrosoftWebDriver.exe");
                webDriver = new EdgeDriver();
                break;


                default:
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;

        }
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
