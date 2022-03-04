package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierDiversityPage extends OurAPI {

    public SupplierDiversityPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"v-pills-17-3296733-2\"]")
            public
    WebElement eligibility;
    @FindBy(xpath = "//*[@id=\"v-pills-17-3296733-3\"]")
    WebElement registration;
    @FindBy(xpath = "//*[@id=\"v-pills-17-3296733-4\"]")
    WebElement products;
    @FindBy(xpath = "//*[@id=\"v-pills-17-3296733-5\"]")
    WebElement FQA;


    public void setEligibility(){click(eligibility);}
    public void setRegistration(){click(registration);}
    public void setProducts(){click(products);}
    public void FQA(){click(FQA);}

}
