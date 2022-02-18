package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeQuote extends OurAPI {
    public LifeQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"quoteForYouYes\"]")
    WebElement yesForTermLifeQuote;
    @FindBy(xpath = "//*[@id=\"birthDate\"]")
    WebElement dateOfBirthForLifeQuote;
    @FindBy(xpath = "//*[@id=\"birthDateContinueButton\"]")
    WebElement continueForBirthDayLifeQuote;
    @FindBy(xpath = "//*[@id=\"genderbutton1\"]")
    WebElement genderForTermLife;
    @FindBy(xpath = "//*[@id=\"tobaccobutton1\"]")
    WebElement tobaccoForTermLife;
    @FindBy(xpath = "//*[@id=\"select-1\"]")
    WebElement monthForLstTobacco;
    @FindBy(xpath = "//*[@id=\"select-2\"]")
    WebElement lastYearForTobacco;
    @FindBy(xpath = "//*[@id=\"tobaccoContinueButton\"]")
    WebElement continueForTobacco;
    @FindBy(xpath = "//*[@id=\"select-3\"]")
    WebElement heightFeet;
    @FindBy(xpath = "//*[@id=\"select-4\"]")
    WebElement heightInches;
    @FindBy(xpath = "//*[@id=\"heightContinueButton\"]")
    WebElement continueForHeight;
    @FindBy(xpath = "//*[@id=\"textField\"]")
    WebElement weight;
    @FindBy(xpath = "//*[@id=\"weightContinueButton\"]")
    WebElement continueForWeight;
    @FindBy(xpath = "//*[@id=\"buttonExcellent\"]")
    WebElement healthCondition;
    @FindBy(xpath = "//*[@id=\"select-5\"]")
    WebElement coverageNeeded;
    @FindBy(xpath = "//*[@id=\"select-6\"]")
    WebElement termLength;
    @FindBy(xpath = "//*[@id=\"coverageContinueButton\"]")
    WebElement continueForCoverage;

    public void setYesForTermLifeQuote(){click(yesForTermLifeQuote);}
    public void setDateOfBirthForLifeQuote(String dateOfBirth){enterText(dateOfBirthForLifeQuote,dateOfBirth);}
    public void setContinueForBirthDayLifeQuote(){click(continueForBirthDayLifeQuote);}
    public void setGenderForTermLife(){click(genderForTermLife);}
    public void setTobaccoForTermLife(){click(tobaccoForTermLife);}
    public void setMonthForLstTobacco(String month){selectDropDownOption(monthForLstTobacco,month);}
    public void setLastYearForTobacco(String year){selectDropDownOption(lastYearForTobacco,year);}
    public void setContinueForTobacco(){click(continueForTobacco);}
    public void setHeightFeet(String feet){selectDropDownOption(heightFeet,feet);}
    public void setHeightInches(String inches){selectDropDownOption(heightInches,inches);}
    public void setContinueForHeight(){click(continueForHeight);}
    public void setWeight(String lbs){enterText(weight,lbs);}
    public void setContinueForWeight(){click(continueForWeight);}
    public void setHealthCondition(){click(healthCondition);}
    public void setCoverageNeeded(String amount){selectDropDownOption(coverageNeeded,amount);}
    public void setTermLength(String length){selectDropDownOption(termLength,length);}
    public void setContinueForCoverage(){click(continueForCoverage);}



}
