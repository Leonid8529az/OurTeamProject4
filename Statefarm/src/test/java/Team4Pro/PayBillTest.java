package Team4Pro;

import Team4Pro.homePage.PayingBills;
import base.OurAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PayBillTest extends OurAPI {

    @Test
    public void phoneTest(){
        PayingBills payingBills = new PayingBills(driver);

        payingBills.setPayBilliInHomePage();
        Assert.assertEquals(payingBills.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        payingBills.setPaymentMethod("Phone Number");
        payingBills.setPhoneNumberToPayBill("646-123-6352");
        payingBills.setDateOfBirthToPayBill("12-11-1982");


    }
    @Test
    public void policyNumberTest(){
        PayingBills payingBills = new PayingBills(driver);

        payingBills.setPayBilliInHomePage();
        Assert.assertEquals(payingBills.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        payingBills.setPaymentMethod("Policy Number");
        payingBills.setPolicyNumberToPayBill("6243718453");
        payingBills.setZipCodeToPayBill("10012");

    }

    @Test
    public void paymentPanTest(){
        PayingBills payingBills = new PayingBills(driver);

        payingBills.setPayBilliInHomePage();
        Assert.assertEquals(payingBills.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        payingBills.setPaymentMethod("Payment Plan or Account Number");
        payingBills.setPaymentPlanNumber("6352745273");
        payingBills.setZipCodeToPayBillWithAccountNumber("10012");

    }
}
