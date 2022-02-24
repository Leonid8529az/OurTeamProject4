package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Investment extends OurAPI {
    public Investment(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//span[text()='Investments']")
    WebElement investmentHeaderInHomePage;
    @FindBy(xpath = "//*[text()='Retirement Planning']")
    WebElement investmentSubTitle_retirementPlan;
    @FindBy(xpath = "//*[text()='Roth IRA']")
    WebElement investmentSubTitle_RothIRA;
    @FindBy(xpath = "//*[text()='Business Retirement']")
    WebElement investmentSubTitle_BusinessRetirement;
    @FindBy(xpath = "//*[text()='Selecting a Fund']")
    WebElement investmentSubTitle_SelectingAFund;
    @FindBy(xpath = "//*[text()='BlackRock Funds']")
    WebElement investmentSubTitle_BlackRock;
    @FindBy(xpath = "//*[text()='State Farm® 529 Savings Plan']")
    WebElement investmentSubTitle_SavingPlan;
    @FindBy(xpath = "//*[text()='Federal Estate Tax']")
    WebElement investmentSubTitle_FederalEstate;
    @FindBy(xpath = "//*[text()='Joint Accounts']")
    WebElement investmentSubTitle_JointAccount;
    @FindBy(xpath = "//*[text()='Change an Annuity']")
    WebElement investmentSubTitle_ChangeAnnuity;
    @FindBy(xpath = "//*[text()='Saving for College']")
    WebElement investmentSubTitle_SavingForCollege;
    @FindBy(xpath = "//*[text()='American Funds']")
    WebElement investmentSubTitle_AmericanFunds;



    public void setInvestmentHeaderInHomePage(){click(investmentHeaderInHomePage);}
    public void setInvestmentSubTitle_retirementPlan(){click(investmentSubTitle_retirementPlan);}
    public void setInvestmentSubTitle_RothIRA(){click(investmentSubTitle_RothIRA);}
    public void setInvestmentSubTitle_BusinessRetirement(){click(investmentSubTitle_BusinessRetirement);}
    public void setInvestmentSubTitle_SelectingAFund(){click(investmentSubTitle_SelectingAFund);}
    public void setInvestmentSubTitle_BlackRock(){click(investmentSubTitle_BlackRock);}
    public void setInvestmentSubTitle_SavingPlan(){click(investmentSubTitle_SavingPlan);}
    public void setInvestmentSubTitle_FederalEstate(){click(investmentSubTitle_FederalEstate);}
    public void setInvestmentSubTitle_JointAccount(){click(investmentSubTitle_JointAccount);}
    public void setInvestmentSubTitle_ChangeAnnuity(){click(investmentSubTitle_ChangeAnnuity);}
    public void setInvestmentSubTitle_SavingForCollege(){click(investmentSubTitle_SavingForCollege);}
    public void setInvestmentSubTitle_AmericanFunds(){click(investmentSubTitle_AmericanFunds);}


}
