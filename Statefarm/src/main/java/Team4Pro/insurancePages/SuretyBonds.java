package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuretyBonds extends OurAPI {

    public SuretyBonds(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@class=\"-oneX-panel__chevron-down\"])[1]")
            public
    WebElement licenceAndPermitBonds;

    @FindBy(xpath = "(//*[@class=\"-oneX-panel__chevron-down\"])[2]")
    WebElement publicOfficialBonds;

    @FindBy(xpath = "(//*[@class=\"-oneX-panel__chevron-down\"])[3]")
    WebElement probateBonds;

    @FindBy(xpath = "(//*[@class=\"-oneX-panel__chevron-down\"])[4]")
    WebElement otherTypeBonds;

    @FindBy(xpath = "(//*[@class=\"-oneX-panel__chevron-down\"])[5]")
    WebElement contactBonds;


    public void setLicenceAndPermitBonds(){click(licenceAndPermitBonds);}
    public void setPublicOfficialBonds(){click(publicOfficialBonds);}
    public void setProbateBonds(){click(probateBonds);}
    public void setOtherTypeBonds(){click(otherTypeBonds);}
    public void setContactBonds(){click(contactBonds);}
}
