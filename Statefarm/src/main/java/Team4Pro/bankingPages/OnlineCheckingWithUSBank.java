package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineCheckingWithUSBank extends OurAPI {

    public OnlineCheckingWithUSBank(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='input_firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//*[@id='input_middleName']")
    WebElement middleNameField;
    @FindBy(xpath = "//*[@id='input_lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//*[@id='select_suffix']")
    WebElement suffix;
    @FindBy(xpath = "//*[@id='input_email']")
    WebElement emailField;
    @FindBy(xpath = "//*[@id='input_phoneNumber']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//*[@id='input_promocode']")
    WebElement promoCode;
    @FindBy(xpath = "//*[text()='Save and continue']")
    public
    WebElement saveAndContinue;


    public void setFirstNameField(String firstName){enterText(firstNameField,firstName);}
    public void setMiddleNameField(String middleName){enterText(middleNameField,middleName);}
    public void setLastNameField(String lastName){enterText(lastNameField,lastName);}
    public void setSuffix(String option){selectDropDownOption(suffix,option);}
    public void setEmailField(String email){enterText(emailField,email);}
    public void setPhoneNumberField(String number){enterText(phoneNumberField,number);}
    public void setPromoCode(String code){enterText(promoCode,code);}
    public void setSaveAndContinue(){click(saveAndContinue);}






}
