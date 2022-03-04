package Team4Pro;

import Team4Pro.claimsPages.ExistingClaim;
import Team4Pro.homePage.Claims;
import Team4Pro.insurancePages.OtherAutoInsurance;
import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class TrackClaimsTest extends OurAPI {

    @Test
    public void trackClaimTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Claims claims = new Claims(driver);
        ExistingClaim existingClaim = new ExistingClaim(driver);
        OtherAutoInsurance otherAutoInsurance = new OtherAutoInsurance(driver);

        claims.setClaimsHeaderInHomePage();
        Assert.assertEquals(driver.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        claims.setClaimsSubTitle_trackAClaim();
        scrollToView(existingClaim.continueForExistingClaim);
        waitSeconds(2);
        existingClaim.setContinueForExistingClaim();
        wait.until(ExpectedConditions.elementToBeClickable(existingClaim.continueForExistingClaim));
        Assert.assertEquals(driver.getTitle(),"Other Auto Insurance Carriers Find a Claim - State Farm® B2B");
        otherAutoInsurance.setClaimAdjusterName("john");
        otherAutoInsurance.setInsuranceCarrierName("AAA");
        otherAutoInsurance.setEmailAddressForCarrier("john123@aaa.com");
        scrollToView(otherAutoInsurance.submitButton);
        otherAutoInsurance.setSubmitButton();
        Assert.assertEquals(driver.getTitle(),"Other Auto Insurance Carriers Find a Claim - State Farm® B2B");

    }


}
