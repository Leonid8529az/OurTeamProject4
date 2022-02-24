package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollegeSavingCalculator extends OurAPI {
    public CollegeSavingCalculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"ChildNameC20\"]")
    WebElement childName;
    @FindBy(xpath = "//*[@id=\"ChildSchoolC20\"]")
    WebElement childSchool;
    @FindBy(xpath = "//*[@id=\"YearsUntilCollegeBeginsC20\"]")
    WebElement yearsUntilCollege;
    @FindBy(xpath = "//*[@id=\"YearsAttendCollegeC20\"]")
    WebElement yearsAttendingCollege;
    @FindBy(xpath = "//*[@id=\"OneYearCostC20\"]")
    WebElement currentCost;
    @FindBy(xpath = "//*[@id=\"AnnualIncreaseCostC20\"]")
    WebElement costIncrease;
    @FindBy(xpath = "//*[@id=\"AmountSavedC20\"]")
    WebElement amountSaved;
    @FindBy(xpath = "//*[@id=\"GrowthRateC20\"]")
    WebElement interestGrowth;
    @FindBy(xpath = "//*[@id=\"calculatorForm20Submit\"]")
    WebElement calculateSaving;


    public void setChildName(String name){enterText(childName,name);}
    public void setChildSchool(String school){enterText(childSchool,school);}
    public void setYearsUntilCollege(String years){enterText(yearsUntilCollege,years);}
    public void setYearsAttendingCollege(String years){enterText(yearsAttendingCollege,years);}
    public void setCurrentCost(String cost){enterText(currentCost,cost);}
    public void setCostIncrease(String percentage){enterText(costIncrease,percentage);}
    public void setAmountSaved(String amount){enterText(amountSaved,amount);}
    public void setInterestGrowth(String growth){enterText(interestGrowth,growth);}
    public void setCalculateSaving(){click(calculateSaving);}

}
