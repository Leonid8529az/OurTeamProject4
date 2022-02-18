package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banking extends OurAPI {

    public Banking(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Banking']")
    WebElement bankingHeaderInHomePage;
    @FindBy(xpath = "//a[text()='Checking']")
    WebElement bankingSubTitle_CheckingAccount;
    @FindBy(xpath = "//*[text()='Savings'and@class='-oneX-link--block menuLevel2 ']")
    WebElement bankingSubTitle_savingAccount;
    @FindBy(xpath = "//*[text()='Home Loans']")
    WebElement bankingSubtitle_homeLoan;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[3]/a[1]")
    WebElement bankingSubTitle_creditCards;
    @FindBy(xpath = "//*[text()='CDs']")
    WebElement bankingSubTitle_CDs;
    @FindBy(xpath = "//*[text()='Payment Solutions']")
    WebElement bankingSubTitle_paymentSolution;
    @FindBy(xpath = "//*[text()='Loans & Lines of Credit']")
    WebElement bankingSubTitle_LoansAndLinesOfCredit;
    @FindBy(xpath = "//*[text()='Checking, Savings & Money Market']")
    WebElement bankingSubTitle_MoneyMarket;


    public void setBankingHeaderInHomePage(){click(bankingHeaderInHomePage);}
    public void setBankingSubTitle_CheckingAccount(){click(bankingSubTitle_CheckingAccount);}
    public void setBankingSubTitle_savingAccount(){click(bankingSubTitle_savingAccount);}
    public void setBankingSubtitle_homeLoan(){click(bankingSubtitle_homeLoan);}
    public void setBankingSubTitle_creditCards(){click(bankingSubTitle_creditCards);}
    public void setBankingSubTitle_CDs(){click(bankingSubTitle_CDs);}
    public void setBankingSubTitle_paymentSolution(){click(bankingSubTitle_paymentSolution);}
    public void setBankingSubTitle_LoansAndLinesOfCredit(){click(bankingSubTitle_LoansAndLinesOfCredit);}
    public void setBankingSubTitle_MoneyMarket(){click(bankingSubTitle_MoneyMarket);}


}
