package Team4Pro.helpPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCare extends OurAPI {

    public CustomerCare(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"cc-link11\"]")
    WebElement cancelPolicy;

    @FindBy(xpath = "//*[@id=\"cc-link9\"]")
    WebElement viewBill;

    @FindBy(xpath = "//*[@id=\"cc-link8\"]")
    WebElement steerClear;

    @FindBy(xpath = "//*[@id=\"cc-link7\"]")
    WebElement odometer;

    @FindBy(xpath = "//*[text()='cancelling your State Farm insurance']")
    WebElement cancellingInsurance;

    @FindBy(xpath = "(//*[@title=\"Insurance Bill Pay\"])[2]")
    WebElement plentyOfOptions;

    @FindBy(xpath = "//a[contains(text(),\"report your vehicle's odometer readings\")]")
    WebElement vehicleOdometer;

    @FindBy(xpath = "//*[@title=\"Steer Clear Safe Driver Discount\"]")
            public
    WebElement gettingStartedWithSteer;




    public void setCancelPolicy(){click(cancelPolicy);}
    public void setViewBill(){click(viewBill);}
    public void setSteerClear(){click(steerClear);}
    public void setOdometer(){click(odometer);}
    public void setCancellingInsurance(){click(cancellingInsurance);}
    public void setPlentyOfOptions(){click(plentyOfOptions);}
    public void setVehicleOdometer(){click(vehicleOdometer);}
    public void setGettingStartedWithSteer(){click(gettingStartedWithSteer);}
}
