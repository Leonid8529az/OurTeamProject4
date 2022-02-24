package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo extends OurAPI {
    public PersonalInfo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"firstName_0\"]")
    WebElement firstNameForRetirement;
    @FindBy(xpath = "//*[@id=\"GenderKind_0\"]")
    WebElement genderForRetirement;
    @FindBy(xpath = "//*[@id=\"dateOfBirth_0\"]")
    WebElement dateOfBirthForRetirement;
    @FindBy(xpath = "//*[@id=\"EmploymentStatusKind_0\"]")
    WebElement employmentForRetirement;
    @FindBy(xpath = "//*[@id=\"maritalStatus\"]")
    WebElement maritalStatusForRetirement;
    @FindBy(xpath = "//*[@id=\"stateOfResidence\"]")
    WebElement stateForRetirement;
    @FindBy(xpath = "//*[@class='au-target btn btn-ripple btn-forward']")
    WebElement continueForRetirement;

    public void setFirstNameForRetirement(String firstName){enterText(firstNameForRetirement,firstName);}
    public void setGenderForRetirement(String gender){selectDropDownOption(genderForRetirement,gender);}
    public void setDateOfBirthForRetirement(String dateOfBirth){enterText(dateOfBirthForRetirement,dateOfBirth);}
    public void setEmploymentForRetirement(String status){selectDropDownOption(employmentForRetirement,status);}
    public void setMaritalStatusForRetirement(String maritalStatus){selectDropDownOption(maritalStatusForRetirement,maritalStatus);}
    public void setStateForRetirement(String state){selectDropDownOption(stateForRetirement,state);}
    public void setContinueForRetirement(){click(continueForRetirement);}



}
