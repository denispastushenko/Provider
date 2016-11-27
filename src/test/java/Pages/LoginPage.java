package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage {
	@FindBy(id="mailbox__login")
	private WebElement log;

	@FindBy(id="mailbox__password")
	private WebElement pass;

    @FindBy(id="mailbox__auth__button")
    private WebElement buttonLog;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

   public AfterLogPage login(String name, String pass_) throws InterruptedException {
       Thread.sleep(2000);
    log.sendKeys(name);
    pass.sendKeys(pass_);
    buttonLog.click();
       Thread.sleep(1000);
    return new AfterLogPage(driver);
}


}
