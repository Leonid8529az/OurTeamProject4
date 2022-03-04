package Team4Pro;

import Team4Pro.homePage.FeedBackPage;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
public class FeedBackTest extends OurAPI {
    public void feedTest(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        FeedBackPage feedBackPage = new FeedBackPage(driver);

        scrollToView(feedBackPage.bottomOfThePage);
        wait.until(ExpectedConditions.elementToBeClickable(feedBackPage.feedback));
        feedBackPage.setFeedback();
        Assert.assertEquals(driver.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        switchToIFrame(feedBackPage.frame);
        Assert.assertEquals(driver.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        feedBackPage.setFeedBackTopic("Technical Issue");
        feedBackPage.setWhatDoYouThink("im tired");
        feedBackPage.setRating1();
        Assert.assertTrue(feedBackPage.rating1.isSelected());
        feedBackPage.setNotStateFarmCustom();
        scrollToView(feedBackPage.getRating2);
        feedBackPage.setAccomplishment();
        feedBackPage.setGetRating2();
        Assert.assertTrue(feedBackPage.getRating2.isSelected());
        feedBackPage.setSubmit();
        Assert.assertEquals(driver.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");

    }
}
