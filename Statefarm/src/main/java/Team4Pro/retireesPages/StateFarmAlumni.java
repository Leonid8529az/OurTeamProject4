package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmAlumni extends OurAPI {
    public StateFarmAlumni(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[@id='outer-body-container']/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/a[1]/img[1]")
    WebElement register;

    @FindBy(xpath = "//*[@id=\"gender\"]")
    WebElement suffixToRegister;

    @FindBy(xpath = "//*[@id=\"fFirstName\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"fLastName\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"fGeneralEmail\"]")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"fWorkzip\"]")
    WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"fPassword\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"fConfirmPassword\"]")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"signup-reg-btn\"]")
    WebElement submitButton;


    public void setRegister(){click(register);}
    public void setSuffixToRegister(String suffix){selectDropDownOption(suffixToRegister,suffix);}
    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setZipcode(String code){enterText(zipcode,code);}
    public void setPassword(String pass){enterText(password,pass);}
    public void setConfirmPassword(String pass){enterText(confirmPassword,pass);}
    public void setSubmitButton(){click(submitButton);}

    public void setFrame(){}
}
