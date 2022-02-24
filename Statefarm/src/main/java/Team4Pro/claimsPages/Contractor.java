package Team4Pro.claimsPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contractor extends OurAPI {
    public Contractor(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Find a Contractor')]")
    public
    WebElement findContractorButton;
    @FindBy(xpath = "//*[@id='checkBoxID']")
    WebElement agreeButton;
    @FindBy(xpath = "//*[@id='submit']")
    WebElement submitButtonForContractor;

    public void setFindContractorButton(){click(findContractorButton);}
    public void setAgreeButton(){click(agreeButton);}
    public void setSubmitButtonForContractor(){click(submitButtonForContractor);}
}
