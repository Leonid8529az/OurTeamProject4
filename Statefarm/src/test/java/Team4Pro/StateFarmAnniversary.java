package Team4Pro;

import Team4Pro.homePage.DifferentArticles;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class StateFarmAnniversary extends OurAPI {

    @Test
    public void anniversaryTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        Anniversary anniversary = new Anniversary(driver);
        AttentionStateFarm attentionStateFarm = new AttentionStateFarm(driver);

        scrollToView(differentArticles.explore100Years);
        waitSeconds(2);
        differentArticles.setExplore100Years();
        waitSeconds(2);
        wait.until(ExpectedConditions.titleIs("State Farm 100th Anniversary"));
        Assert.assertEquals(anniversary.getTitle(),"State Farm 100th Anniversary");
        anniversary.setEmailFieldForStory("john@gmail.com");
        anniversary.setSignUp();
        waitSeconds(4);
        scrollToView(attentionStateFarm.nameToSignUp);
        attentionStateFarm.setNameToSignUp("john monroe");
        attentionStateFarm.setEmailToSignUp("john@gmail.com");
        attentionStateFarm.setAddressToSignUp("100 john street");
        attentionStateFarm.setCityToSignUp("manhattan");
        attentionStateFarm.setStateToSignUp("new york");
        scrollToView(attentionStateFarm.zipCodeToSignUp);
        waitSeconds(2);
        attentionStateFarm.setZipCodeToSignUp("10012");
        attentionStateFarm.setAgreeToSignUp();
        Assert.assertTrue(attentionStateFarm.agreeToSignUp.isSelected());
        attentionStateFarm.setSignUpButton();
        Assert.assertEquals(attentionStateFarm.getTitle(),"Attention State Farm Retirees!");

    }

    @Test
    public void driveAndSave(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        DriveSafePage driveSafePage = new DriveSafePage(driver);

        scrollToView(differentArticles.learnAboutDriveSafe);
        waitSeconds(2);
        differentArticles.setLearnAboutDriveSafe();
        waitSeconds(2);



    }


}
