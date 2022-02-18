package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessPayment extends OurAPI {

    public BusinessPayment (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//*[text()='Find your payment solution']")
    public
    WebElement findPaymentSolution;

    public void setFindPaymentSolution(){click(findPaymentSolution);}

}
