package Team4Pro;

import Team4Pro.claimsPages.FileAClaim;
import Team4Pro.homePage.Claims;
import Team4Pro.homePage.LoggingPage;
import Team4Pro.investmentPages.ForgotUserName;
import base.OurAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClaimsTest extends OurAPI {


    @Test
    public void autoAndMotorCycleTest(){

        Claims claims = new Claims(driver);
        FileAClaim fileAClaim = new FileAClaim(driver);

        claims.setClaimsHeaderInHomePage();
        Assert.assertEquals(claims.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        claims.setClaimsSubTitle_fileAClaim();
        fileAClaim.setAutoAndMotor();
        fileAClaim.setStartClaimForAuto();
        Assert.assertEquals(fileAClaim.getTitle(),"File A Claim - State Farm®");
        fileAClaim.setOtherInsuranceCarrier();
        fileAClaim.setContinueForAutoClaim();
        fileAClaim.setGetStartClaimForAuto();
        fileAClaim.setAccidentDayForAutoClaim("12-11-2020");
        fileAClaim.setContinueForAccident();
        Assert.assertEquals(fileAClaim.getTitle(),"File A Loss");

    }

    @Test
    public void autoGlassTest(){
        Claims claims = new Claims(driver);
        FileAClaim fileAClaim = new FileAClaim(driver);
        LoggingPage loggingPage = new LoggingPage(driver);

        claims.setClaimsHeaderInHomePage();
        Assert.assertEquals(claims.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        claims.setClaimsSubTitle_fileAClaim();
        fileAClaim.setAutoGlass();
        Assert.assertEquals(fileAClaim.getTitle(),"File A Claim - State Farm®");
        fileAClaim.setStartClaimForAutoGlass();
        loggingPage.setUserIdToLogging("john");
        loggingPage.setPassWordToLogging("ascdfr");
        Assert.assertEquals(loggingPage.getTitle(),"Log In");

    }

    @Test
    public void homeAndPropertyTest(){
        Claims claims = new Claims(driver);
        FileAClaim fileAClaim = new FileAClaim(driver);
        LoggingPage loggingPage = new LoggingPage(driver);
        ForgotUserName forgotUserName = new ForgotUserName(driver);

        claims.setClaimsHeaderInHomePage();
        Assert.assertEquals(claims.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        claims.setClaimsSubTitle_fileAClaim();
        fileAClaim.setHomeAndProperty();
        Assert.assertEquals(fileAClaim.getTitle(),"File A Claim - State Farm®");
        fileAClaim.setStartClaimForHome();
        loggingPage.setTroubleLogging();
        waitSeconds(2);
        Assert.assertEquals(loggingPage.getTitle(),"Forgot UserId / Password");
        waitSeconds(2);
        forgotUserName.setPhoneNumberToFindAccount("6461521723");
        forgotUserName.setDateOfBirthToFindAccount("12-10-1982");
        forgotUserName.setEmailToFindAccount("john@gmail.com");
        forgotUserName.setSubmitToFindAccount();
        Assert.assertEquals(forgotUserName.getTitle(),"Forgot UserId / Password");

    }

}
