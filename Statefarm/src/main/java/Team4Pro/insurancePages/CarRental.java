package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRental extends OurAPI {
    public CarRental(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='Car insurance deductibles and coverages: choosing well']")
    public
    WebElement carInsuranceDeductibles;
    public void setCarInsuranceDeductibles(){click(carInsuranceDeductibles);}



}
