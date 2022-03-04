package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureValueRetirement extends OurAPI {
    public FutureValueRetirement(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"FutureValueOfPeriodicDepositsC14\"]")
    WebElement periodicContribution;
    @FindBy(xpath = "//*[@id=\"CurrentSumC14\"]")
    WebElement amountSaved;
    public
    @FindBy(xpath = "//*[@id=\"NumberOfMonthsC14\"]")
    WebElement monthsToSave;
    @FindBy(xpath = "//*[@id=\"AnnualInterestRateC14\"]")
    WebElement interestRate;
    @FindBy(xpath = "//*[@id=\"FrequencyC14\"]")
    WebElement monthlyContribution;
    @FindBy(xpath = "//*[@id=\"calculatorForm14Submit\"]")
    WebElement calculateButton;

    public void setPeriodicContribution(String amount){enterText(periodicContribution,amount);}
    public void setAmountSaved(String amount){enterText(amountSaved,amount);}
    public void setMonthsToSave(String months){enterText(monthsToSave,months);}
    public void setInterestRate(String rate){enterText(interestRate,rate);}
    public void setMonthlyContribution(String contribution){selectDropDownOption(monthlyContribution,contribution);}
    public void setCalculateButton(){click(calculateButton);}


}
