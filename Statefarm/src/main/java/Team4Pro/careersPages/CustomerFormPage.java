package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerFormPage extends OurAPI {
    public CustomerFormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"firstNameId\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastNameId\"]")
    WebElement lastName;

    @FindBy(xpath = "//body/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/label[1]")
            public
    WebElement contactPreference;

    @FindBy(xpath = "//*[@id=\"emailId\"]")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"notesId\"]")
    WebElement textToEnter;

    @FindBy(xpath = "(//*[@type=\"submit\"])[5]")
    WebElement submitButton;

    @FindBy(xpath = "//*[text()='Previous']")
    WebElement previousButton;

    @FindBy(xpath = "//*[@id=\"contactPersonPhoneNormalizedId\"]")
            public
    WebElement phoneNumber;




    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setContactPreference(){click(contactPreference);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setTextToEnter(String text){enterText(textToEnter,text);}
    public void setSubmitButton(){click(submitButton);}
    public void setPreviousButton(){click(previousButton);}
    public void setPhoneNumber(String number){enterText(phoneNumber,number);}
}
