package Team4Pro.claimsPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimHelp extends OurAPI {
    public ClaimHelp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='auto-tab']")
    WebElement auto;
    @FindBy(xpath = "//*[@id='homeProperty-tab']")
    WebElement homeAndProperty;
    @FindBy(xpath = "//*[@id='healthLife-tab']")
    WebElement healthAndLife;
    @FindBy(xpath = "//*[@id='business-tab']")
    WebElement businessInsurance;
    @FindBy(xpath = "//*[@id='liability-tab']")
    WebElement liability;
    @FindBy(xpath = "//*[@id='open-auto-drawer-undefined']")
    public
    WebElement seeStepsForHelp;
    @FindBy(xpath = "//body/section[@id='auto-drawer']/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/button[1]")
    WebElement nextStep;
    @FindBy(xpath = "//body/section[@id='auto-drawer']/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/button[1]")
    WebElement previousStep;
    @FindBy(xpath = "//a[contains(text(),'Where can I find a list of repair contractors?')]")
    public
    WebElement repairContractor;
    @FindBy(xpath = "//h2[contains(text(),'Home + Property FAQs')]")
    public
    WebElement HomeAndProperty;
    @FindBy(xpath = "//body/div[@id='content']/div[2]/section[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]")
    public
    WebElement reportFraud;
    @FindBy(xpath = "//a[contains(text(),'Filing a Business Claim')]")
    WebElement fillingBusinessClaim;
    @FindBy(xpath = "//a[contains(text(),'Claims Filed Against You')]")
    public
    WebElement claimAgainstYou;


    public void setAuto(){click(auto);}
    public void setHomeAndProperty(){click(homeAndProperty);}
    public void setHealthAndLife(){click(healthAndLife);}
    public void setBusinessInsurance(){click(businessInsurance);}
    public void setLiability(){click(liability);}
    public void setSeeStepsForHelp(){click(seeStepsForHelp);}
    public void setNextStep(){click(nextStep);}
    public void setPreviousStep(){click(previousStep);}
    public void setRepairContractor(){click(repairContractor);}
    public void setReportFraud(){click(reportFraud);}
    public void setFillingBusinessClaim(){click(fillingBusinessClaim);}
    public void setClaimAgainstYou(){click(claimAgainstYou);}



}
