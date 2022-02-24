package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayingBills extends OurAPI {
    public PayingBills(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Pay a Bill')]")
    WebElement payBilliInHomePage;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-paymentSelect\"]")
    WebElement paymentMethod;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-phoneNo\"]")
    WebElement phoneNumberToPayBill;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-DOB\"]")
    WebElement dateOfBirthToPayBill;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-submitButton\"]")
    WebElement payNowButton;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-policyNumber\"]")
    WebElement policyNumberToPayBill;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-policy-zip\"]")
    WebElement zipCodeToPayBillWithPolicy;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-payment-accNo\"]")
    WebElement paymentPlanNumber;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-acc-zip\"]")
    WebElement zipCodeToPayBillWithAccountNumber;



    public void setPayBilliInHomePage(){click(payBilliInHomePage);}
    public void setPaymentMethod(String option){selectDropDownOption(paymentMethod,option);}
    public void setPhoneNumberToPayBill(String phoneNumber){enterText(phoneNumberToPayBill,phoneNumber);}
    public void setDateOfBirthToPayBill(String dateOfBirth){enterText(dateOfBirthToPayBill,dateOfBirth);}
    public void setPolicyNumberToPayBill(String policyNumber){enterText(policyNumberToPayBill,policyNumber);}
    public void setZipCodeToPayBill(String zipCode){enterText(zipCodeToPayBillWithPolicy,zipCode);}
    public void setPaymentPlanNumber(String number){enterText(paymentPlanNumber,number);}
    public void setZipCodeToPayBillWithAccountNumber(String zip){enterText(zipCodeToPayBillWithAccountNumber,zip);}
    public void setPayNowButton(){click(payNowButton);}


}
