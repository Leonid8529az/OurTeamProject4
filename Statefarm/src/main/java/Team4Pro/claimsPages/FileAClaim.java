package Team4Pro.claimsPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileAClaim extends OurAPI {
    public FileAClaim(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//label[contains(text(),'Auto & Motorcycle')]")
    WebElement autoAndMotor;
    @FindBy(xpath = "//label[contains(text(),'Auto (Glass Only)')]")
    WebElement autoGlass;
    @FindBy(xpath = "//label[contains(text(),'Home, Boat, & Property')]")
    WebElement homeAndProperty;
    @FindBy(xpath = "//*[@id='accident']")
    WebElement startClaimForAuto;
    @FindBy(xpath = "//label[contains(text(),'I represent another insurance carrier')]")
    WebElement otherInsuranceCarrier;

    @FindBy(xpath = "//*[@id='oic-start']")
    WebElement continueForAutoClaim;

    @FindBy(xpath = "//button[@id='nextRouteButton']")
    WebElement getStartClaimForAuto;

    @FindBy(xpath = "//input[@id='incident-calendar']")
    WebElement accidentDayForAutoClaim;
    @FindBy(xpath = "//button[@id='continueButton']")
    WebElement continueForAccident;
    @FindBy(xpath = "//body/div[@id='content']/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement startClaimForAutoGlass;
    @FindBy(xpath = "//body/div[@id='content']/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement startClaimForHome;



    public void setAutoAndMotor(){click(autoAndMotor);}
    public void setStartClaimForAuto(){click(startClaimForAuto);}
    public void setOtherInsuranceCarrier(){click(otherInsuranceCarrier);}
    public void setContinueForAutoClaim(){click(continueForAutoClaim);}
    public void setGetStartClaimForAuto(){click(getStartClaimForAuto);}
    public void setAccidentDayForAutoClaim(String date){enterText(accidentDayForAutoClaim,date);}
    public void setContinueForAccident(){click(continueForAccident);}
    public void setAutoGlass(){click(autoGlass);}
    public void setStartClaimForAutoGlass(){click(startClaimForAutoGlass);}
    public void setHomeAndProperty(){click(homeAndProperty);}
    public void setStartClaimForHome(){click(startClaimForHome);}



}
