package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarInsurance extends OurAPI {
    public CarInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@class='accordion_button analytics-selectors -w_px-0 -w_pb-16'and text()='RENTAL INSURANCE']")
    public
    WebElement rentalInsurance;
    @FindBy(xpath = "//body/div[@id='content']/section[5]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/p[1]/a[1]")
    WebElement rentalReimbursement;
    public void setRentalInsurance(){click(rentalInsurance);}
    public void setRentalReimbursement(){click(rentalReimbursement);}



}
