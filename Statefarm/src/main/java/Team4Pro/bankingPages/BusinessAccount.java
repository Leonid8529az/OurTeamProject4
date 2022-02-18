package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessAccount extends OurAPI {
    public BusinessAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"input_firstName\"]")
    WebElement firsNameForBusinessAccount;
    @FindBy(xpath = "//*[@id='input_middleName']")
    WebElement middleNameForBusinessAccount;
    @FindBy(xpath = "//*[@id=\"input_lastName\"]")
    WebElement lastNameForBusinessAccount;
    @FindBy(xpath = "//*[@id=\"input_select_suffix\"]")
    WebElement suffixForBusinessAccount;
    @FindBy(xpath = "//*[@id=\"input_phoneNumber\"]")
    WebElement phoneNumberForBusinessAccount;
    @FindBy(xpath = "//*[@id=\"input_email\"]")
    WebElement emailForBusinessAccount;
    @FindBy(xpath = "//*[@id='input_altEmail']")
    WebElement altEmailForBusinessAccount;
    @FindBy(xpath = "//*[text()='Save and continue']")
    public
    WebElement saveAndContinueForBusinessAccount;


    public void setFirsNameForBusinessAccount(String firstName){enterText(firsNameForBusinessAccount,firstName);}
    public void setMiddleNameForBusinessAccount(String middleName){enterText(middleNameForBusinessAccount,middleName);}
    public void setLastNameForBusinessAccount(String lastName){enterText(lastNameForBusinessAccount,lastName);}
    public void setSuffixForBusinessAccount(String option){selectDropDownOption(suffixForBusinessAccount,option);}
    public void setPhoneNumberForBusinessAccount(String phoneNumber){enterText(phoneNumberForBusinessAccount,phoneNumber);}
    public void setEmailForBusinessAccount(String email){enterText(emailForBusinessAccount,email);}
    public void setAltEmailForBusinessAccount(String altEmail){enterText(altEmailForBusinessAccount,altEmail);}
    public void setSaveAndContinueForBusinessAccount(){click(saveAndContinueForBusinessAccount);}
}
