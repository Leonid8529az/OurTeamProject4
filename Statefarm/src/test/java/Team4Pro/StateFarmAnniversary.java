package Team4Pro;

import Team4Pro.homePage.DifferentArticles;
import base.OurAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StateFarmAnniversary extends OurAPI {

    @Test
    public void anniversaryTest(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        Anniversary anniversary = new Anniversary(driver);
        AttentionStateFarm attentionStateFarm = new AttentionStateFarm(driver);

        scrollToView(differentArticles.explore100Years);
        differentArticles.setExplore100Years();
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



    }


}
