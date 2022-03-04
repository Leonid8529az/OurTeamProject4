package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance extends OurAPI {

    public Insurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "(//*[@class='-oneX-header-top-menu-btn -oneX-header-top-menu-btn__has-submenu'])[1]")
    WebElement insuranceHeaderInHomePage;
    @FindBy(xpath = "//a[text()='Car Insurance']")
    WebElement insuranceSubTitle_CarInsurance;
    @FindBy(xpath = "//*[@id='oneX-1-insurance']")
    WebElement insuranceSubTitle_HomeAndProperty;
    @FindBy(xpath = "//*[text()='Condominium']")
    WebElement insuranceSubTitle_Condominium;
    @FindBy(xpath = "//*[text()='Manufactured Home']")
    WebElement insuranceSubTitle_ManufacturedHome;
    @FindBy(xpath = "//*[text()='Term Life']")
    WebElement insuranceSubTitle_TermLife;
    @FindBy(xpath = "//*[text()='Medicare Supplement'and@class='-oneX-link--block menuLevel2 ']")
    WebElement insuranceSubTitle_MedicareSupplement;
    @FindBy(xpath = "//*[text()='Whole Life']")
    WebElement insuranceSubTitle_WholeLife;
    @FindBy(xpath = "//*[text()='Workers’ Compensation']")
    WebElement insuranceSubTitle_WorkersCompensation;
    @FindBy(xpath = "//*[text()='Business & Professional']")
    WebElement insuranceSubTitle_BusinessLiability;
    @FindBy(xpath = "//*[text()='Roadside Assistance']")
    WebElement insuranceSubTitle_RoadAssistance;
    @FindBy(xpath = "//*[text()='Farm and Ranch']")
    WebElement insuranceSubtitle_farmAndRanch;
    @FindBy(xpath = "//*[text()='Motorhome']")
    WebElement insuranceSubtitle_motorHome;
    @FindBy(xpath = "//*[@id=\"oneX-5-insurance\"]")
    WebElement insuranceSubtitle_petMedical;
    @FindBy(xpath = "//*[text()=\"Individual Medical\"]")
    WebElement insuranceSubtitle_individualMedical;
    @FindBy(xpath = "//*[text()=\"Surety & Fidelity Bonds\"]")
    WebElement insuranceSubtitle_suretyBonds;
    @FindBy(xpath = "//*[text()=\"Contractors Policy\"]")
    WebElement insuranceSubTitle_contractorPolicy;
    @FindBy(xpath = "//*[text()='Motorcycle']")
    WebElement insuranceSubTitle_Motorcycle;
    @FindBy(xpath = "//*[text()='Boat']")
    WebElement insuranceSubTitle_Boat;
    @FindBy(xpath = "//*[text()='Personal Articles']")
    WebElement insuranceSubTitle_PersonalArticle ;





    public void setInsuranceHeaderInHomePage(){click(insuranceHeaderInHomePage);}
    public void setInsuranceSubTitle_CarInsurance(){click(insuranceSubTitle_CarInsurance);}
    public void setInsuranceSubTitle_HomeAndProperty(){click(insuranceSubTitle_HomeAndProperty);}
    public void setInsuranceSubTitle_Condominium(){click(insuranceSubTitle_Condominium);}
    public void setInsuranceSubTitle_ManufacturedHome(){click(insuranceSubTitle_ManufacturedHome);}
    public void setInsuranceSubTitle_TermLife(){click(insuranceSubTitle_TermLife);}
    public void setInsuranceSubTitle_MedicareSupplement(){click(insuranceSubTitle_MedicareSupplement);}
    public void setInsuranceSubTitle_WholeLife(){click(insuranceSubTitle_WholeLife);}
    public void setInsuranceSubTitle_WorkersCompensation(){click(insuranceSubTitle_WorkersCompensation);}
    public void setInsuranceSubTitle_BusinessLiability(){click(insuranceSubTitle_BusinessLiability);}
    public void setInsuranceSubTitle_RoadAssistance(){click(insuranceSubTitle_RoadAssistance);}
    public void setInsuranceSubtitle_farmAndRanch(){click(insuranceSubtitle_farmAndRanch);}
    public void setInsuranceSubtitle_motorHome(){click(insuranceSubtitle_motorHome);}
    public void setInsuranceSubtitle_petMedical(){click(insuranceSubtitle_petMedical);}
    public void setInsuranceSubtitle_individualMedical(){click(insuranceSubtitle_individualMedical);}
    public void setInsuranceSubtitle_suretyBonds(){click(insuranceSubtitle_suretyBonds);}
    public void setInsuranceSubTitle_contractorPolicy(){click(insuranceSubTitle_contractorPolicy);}
    public void setInsuranceSubTitle_Motorcycle(){click(insuranceSubTitle_Motorcycle);}
    public void setInsuranceSubTitle_Boat(){click(insuranceSubTitle_Boat);}
    public void setInsuranceSubTitle_PersonalArticle(){click(insuranceSubTitle_PersonalArticle);}


}
