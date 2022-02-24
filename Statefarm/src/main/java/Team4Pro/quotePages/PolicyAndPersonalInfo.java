package Team4Pro.quotePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyAndPersonalInfo extends OurAPI {
    public PolicyAndPersonalInfo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"userBirthDateId\"]")
    WebElement ageVerification;
    @FindBy(xpath = "//*[@id=\"coppaContinueButtonId\"]")
    WebElement continueForAge;
    @FindBy(xpath = "//*[@id=\"piGender_maleLabel\"]")
    WebElement genderForHospitalIncome;
    @FindBy(xpath = "//*[@id=\"piBirthDateId\"]")
    WebElement dateOfBirthForHospitalIncome;
    @FindBy(xpath = "//body/div[@id='content']/div[2]/form[1]/div[8]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement spouseInfo;
    @FindBy(xpath = "//body/div[@id='content']/div[2]/form[1]/div[10]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/label[1]")
    public
    WebElement childrenInfo;
    @FindBy(xpath = "//select[@id='county']")
    public
    WebElement county;
    @FindBy(xpath = "//*[@id=\"navigationBtnContId\"]")
    public
    WebElement continueButtonForHospital;

    public void setAgeVerification(String datOfBirth){enterText(ageVerification,datOfBirth);}
    public void setContinueForAge(){click(continueForAge);}
    public void setGenderForHospitalIncome(){click(genderForHospitalIncome);}
    public void setDateOfBirthForHospitalIncome(String dateOfBirth){enterText(dateOfBirthForHospitalIncome,dateOfBirth);}
    public void setSpouseInfo(){click(spouseInfo);}
    public void setChildrenInfo(){click(childrenInfo);}
    public void setCounty(String option){selectDropDownOption(county,option);}
    public void setContinueButtonForHospital(){click(continueButtonForHospital);}



}
