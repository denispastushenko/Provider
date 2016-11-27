
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentMail extends  BasePage {
    @FindBy(xpath="//div[@class='b-input b-input_textarea js-compose-labels js-input compose__labels compose__labels_placehold-on-suggest b-contact-container'][1]")
    private WebElement fromWhomSent;
    @FindBy(id="tinymce")
    private WebElement text;

	@FindBy(xpath="")
private WebElement sentMess;
    @FindBy(xpath="/ [@id=\"ph_mail\"]/span")
    private WebElement Mail;
    public SentMail(WebDriver driver) {
        super(driver);
    }

    public SentMail mail( String mail, String text_) throws InterruptedException {
//Thread.sleep(3000);
        //new Actions(driver).dragAndDropBy(fromWhomSent,766,760);
       fromWhomSent.sendKeys(mail);
        text.sendKeys(text_);
        sentMess.click();
        Mail.click();
        return new SentMail(driver);
    }

}

