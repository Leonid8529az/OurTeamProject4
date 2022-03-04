package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotUserName extends OurAPI {
    public ForgotUserName(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"forgotPhoneInput\"]")
    public
    WebElement phoneNumberToFindAccount;
    @FindBy(xpath = "//*[@id=\"forgotDobInput\"]")
    public
    WebElement dateOfBirthToFindAccount;

    @FindBy(xpath = "//*[@id=\"forgotEmailInput\"]")
    public
    WebElement emailToFindAccount;

    @FindBy(xpath = "//*[@id='emailId']")
    public
    WebElement preferTextToFindAccount;

    @FindBy(xpath = "//*[@id='submitBtn']")
    public
    WebElement submitToFindAccount;


    public void setPhoneNumberToFindAccount(String number){enterText(phoneNumberToFindAccount,number);}
    public void setDateOfBirthToFindAccount(String date){enterText(dateOfBirthToFindAccount,date);}
    public void setEmailToFindAccount(String email){enterText(emailToFindAccount,email);}
    public void setPreferTextToFindAccount(){click(preferTextToFindAccount);}
    public void setSubmitToFindAccount(){click(submitToFindAccount);}


}
