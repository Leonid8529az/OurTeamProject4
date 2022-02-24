package Team4Pro;

import Team4Pro.claimsPages.ExistingClaim;
import Team4Pro.homePage.Claims;
import Team4Pro.insurancePages.OtherAutoInsurance;
import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TrackClaimsTest extends OurAPI {

    @Test
    public void trackClaimTest(){
        Claims claims = new Claims(driver);
        ExistingClaim existingClaim = new ExistingClaim(driver);
        OtherAutoInsurance otherAutoInsurance = new OtherAutoInsurance(driver);

        claims.setClaimsHeaderInHomePage();
        Assert.assertEquals(claims.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        claims.setClaimsSubTitle_trackAClaim();
        scrollToView(existingClaim.continueForExistingClaim);
        waitSeconds(3);
        existingClaim.setContinueForExistingClaim();
        waitSeconds(3);
        Assert.assertEquals(existingClaim.getTitle(),"Other Auto Insurance Carriers Find a Claim - State Farm® B2B");
        waitSeconds(2);
        otherAutoInsurance.setClaimAdjusterName("john");
        otherAutoInsurance.setInsuranceCarrierName("AAA");
        otherAutoInsurance.setEmailAddressForCarrier("john123@aaa.com");
        scrollToView(otherAutoInsurance.submitButton);
        otherAutoInsurance.setSubmitButton();
        Assert.assertEquals(otherAutoInsurance.getTitle(),"Other Auto Insurance Carriers Find a Claim - State Farm® B2B");

    }


}
