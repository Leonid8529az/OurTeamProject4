package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InforForLifeInsurance extends OurAPI {
    public InforForLifeInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"firstName_0\"]")
    public
    WebElement firstNameForLifeInsurance;
    @FindBy(xpath = "//*[@id=\"GenderKind_0\"]")
    WebElement genderForLifeInsurance;
    @FindBy(xpath = "//*[@id=\"dateOfBirth_0\"]")
    WebElement dateOfBirthForLifeInsurance;
    @FindBy(xpath = "//*[@id=\"EmploymentStatusKind_0\"]")
    WebElement employmentStatusForLifeInsurance;
    @FindBy(xpath = "//*[@id=\"maritalStatus\"]")
    WebElement maritalStatusForLifeInsurance;
    @FindBy(xpath = "//*[@id=\"stateOfResidence\"]")
    WebElement stateForLifeInsurance;
    @FindBy(xpath = "//*[@class=\"au-target btn btn-ripple btn-forward\"]")
    WebElement continueForLifeInsurance;

    public void setFirstNameForLifeInsurance(String firstName){enterText(firstNameForLifeInsurance,firstName);}
    public void setGenderForLifeInsurance(String gender){selectDropDownOption(genderForLifeInsurance,gender);}
    public void setDateOfBirthForLifeInsurance(String dateOfBirth){enterText(dateOfBirthForLifeInsurance,dateOfBirth);}
    public void setEmploymentStatusForLifeInsurance(String status){selectDropDownOption(employmentStatusForLifeInsurance,status);}
    public void setMaritalStatusForLifeInsurance(String status){selectDropDownOption(maritalStatusForLifeInsurance,status);}
    public void setStateForLifeInsurance(String state){selectDropDownOption(stateForLifeInsurance,state);}
    public void setContinueForLifeInsurance(){click(continueForLifeInsurance);}




}
