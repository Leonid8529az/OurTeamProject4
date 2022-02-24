package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherAutoInsurance extends OurAPI {
    public OtherAutoInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement ClaimAdjusterName;
    @FindBy(xpath = "//*[@id=\"fname1\"]")
    WebElement insuranceCarrierName;
    @FindBy(xpath = "//*[@id=\"fname2\"]")
    WebElement emailAddressForCarrier;
    @FindBy(xpath = "//*[@id=\"buttonid\"]")
    public
    WebElement submitButton;

    public void setClaimAdjusterName(String name){enterText(ClaimAdjusterName,name);}
    public void setInsuranceCarrierName(String name){enterText(insuranceCarrierName,name);}
    public void setEmailAddressForCarrier(String email){enterText(emailAddressForCarrier,email);}
    public void setSubmitButton(){click(submitButton);}

}
