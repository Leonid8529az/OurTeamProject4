package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceBill extends OurAPI {

    public InsuranceBill(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title='See more ways to pay']")
            public
    WebElement moreWaysToPay;
    @FindBy(xpath = "//*[@title='Your Key Code']")
            public
    WebElement whereIsMyKeycode;

    public void setMoreWaysToPay(){click(moreWaysToPay);}
    public void setWhereIsMyKeycode(){click(whereIsMyKeycode);}

}
