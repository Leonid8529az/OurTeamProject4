package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoatSafety extends OurAPI {
    public  BoatSafety(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title=\"Essential Spring Boat Maintenance Tips\"]")
    WebElement boatSeaworthy;

    public void setBoatSeaworthy(){click(boatSeaworthy);}
}
