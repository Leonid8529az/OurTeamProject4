package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavingPlan extends OurAPI {
    public SavingPlan(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Access Your State Farm 529 Savings Plan Account')]")
    WebElement accessSavingPlan;
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement userNameForSavingPlan;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordForSavingPlan;
    @FindBy(xpath = "//*[@class=\"dx-button-text\" and text()='Log in']")
    public
    WebElement loginForSavingPlan;
    @FindBy(xpath = "//a[contains(text(),'Use this calculator')]")
    public
    WebElement savingCalculator;


    public void setAccessSavingPlan(){click(accessSavingPlan);}
    public void setUserNameForSavingPlan(String user){enterText(userNameForSavingPlan,user);}
    public void setPasswordForSavingPlan(String password){enterText(passwordForSavingPlan,password);}
    public void setLoginForSavingPlan(){click(loginForSavingPlan);}
    public void setSavingCalculator(){click(savingCalculator);}


}
