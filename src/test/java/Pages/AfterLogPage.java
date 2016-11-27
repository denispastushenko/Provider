package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLogPage extends  BasePage{
	@FindBy(id="PH_user-email")
	private WebElement checkema;
    @FindBy(xpath="//a[@href='//mail.ru/']")
     private WebElement mail;
    @FindBy(id="js-mailbox-writemail")
    private WebElement compose;



    public AfterLogPage(WebDriver driver) {
        super(driver);
    }

   public String userEmailText(){
        return checkema.getText();

    }

    public SentMail compose(){
        mail.click();
        compose.click();
        return  new SentMail(driver);
    }
}
