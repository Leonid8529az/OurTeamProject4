package Team4Pro;

import Team4Pro.homePage.DifferentArticles;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommunityTest extends OurAPI {
    @Test
    public void teacherAssistTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        TeacherAssistPage teacherAssistPage = new TeacherAssistPage(driver);
        NewYorkForTeacherAssist newYorkForTeacherAssist = new NewYorkForTeacherAssist(driver);

        scrollToView(differentArticles.communityInvolvement);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.communityInvolvement));
        differentArticles.setCommunityInvolvement();
        wait.until(ExpectedConditions.titleIs("Community Service & Involvement - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Community Service & Involvement - State Farm®");
        communityInvolvement.setTeacherAssist();
        switchToDifferentTab();
        Assert.assertEquals(teacherAssistPage.getTitle(),"200 Winners - $500,000 in Teacher Assists");
        scrollToView(teacherAssistPage.stateForTeacherAssist);
        wait.until(ExpectedConditions.elementToBeClickable(teacherAssistPage.stateForTeacherAssist));
        waitSeconds(3);
        teacherAssistPage.setStateForTeacherAssist();
        Assert.assertEquals(newYorkForTeacherAssist.getTitle(),"200 Winners - $500,000 in Teacher Assists");


    }

    @Test
    public void newRoomTest(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        GoodNeighborPage goodNeighborPage = new GoodNeighborPage(driver);
        EnvironmentPage environmentPage = new EnvironmentPage(driver);


        scrollToView(differentArticles.communityInvolvement);
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        waitSeconds(2);
        scrollToView(communityInvolvement.newsRoom);
        waitSeconds(2);
        Assert.assertEquals(communityInvolvement.getTitle(),"Community Service & Involvement - State Farm®");
        communityInvolvement.setNewsRoom();
        scrollToView(goodNeighborPage.environment);
        goodNeighborPage.setEnvironment();
        Assert.assertEquals(environmentPage.getTitle(),"Environment");
        scrollToView(environmentPage.planningAppreciation);
        environmentPage.setPlanningAppreciation();
        scrollToView(environmentPage.jenniferYoungEmail);
        waitSeconds(2);
        environmentPage.setJenniferYoungEmail();
        Assert.assertEquals(environmentPage.getTitle(),"Planting Appreciation for the Environment | State Farm");

    }


    @Test
    public void simpleInsightsTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        SimpleInsightPage simpleInsightPage = new SimpleInsightPage(driver);
        CollectionOfArticle collectionOfArticle = new CollectionOfArticle(driver);


        scrollToView(differentArticles.communityInvolvement);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.communityInvolvement));
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        waitSeconds(3);
//        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.communityInvolvement));
        wait.until(ExpectedConditions.titleIs("Community Service & Involvement - State Farm®"));
        Assert.assertEquals(differentArticles.getTitle(),"Community Service & Involvement - State Farm®");
        scrollToView(communityInvolvement.simpleInsights);
        wait.until(ExpectedConditions.elementToBeClickable(communityInvolvement.simpleInsights));
        communityInvolvement.setSimpleInsights();
        Assert.assertEquals(differentArticles.getTitle(),"Simple Insights from State Farm - State Farm®");
        scrollToView(simpleInsightPage.badWeatherDriving);
        simpleInsightPage.setBadWeatherDriving();
        scrollToView(collectionOfArticle.drivingInTheRain);
       wait.until(ExpectedConditions.elementToBeClickable(collectionOfArticle.drivingInTheRain));
        collectionOfArticle.setDrivingInTheRain();
        wait.until(ExpectedConditions.titleIs("Tips for Driving Safely in the Rain - State Farm®"));
        Assert.assertEquals(communityInvolvement.getTitle(),"Tips for Driving Safely in the Rain - State Farm®");

    }

    @Test
    public void nationalCommunityTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        FoundationPage foundationPage = new FoundationPage(driver);

        scrollToView(differentArticles.communityInvolvement);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.communityInvolvement));
        waitSeconds(2);
        differentArticles.setCommunityInvolvement();
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.communityInvolvement));
        Assert.assertEquals(driver.getTitle(),"Community Service & Involvement - State Farm®");
        scrollToView(communityInvolvement.foundation);
        communityInvolvement.setFoundation();
        Assert.assertEquals(communityInvolvement.getTitle(),"State Farm Foundation - State Farm®");
        scrollToView(foundationPage.nationalMerit);
        foundationPage.setNationalMerit();
        Assert.assertEquals(foundationPage.getTitle(),"State Farm Foundation - State Farm®");

    }

    @Test
    public void sponsorshipProposalTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        SponsorShipSubmission sponsorShipSubmission = new SponsorShipSubmission(driver);

        scrollToView(differentArticles.communityInvolvement);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.communityInvolvement));
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        wait.until(ExpectedConditions.titleIs("Community Service & Involvement - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Community Service & Involvement - State Farm®");
        scrollToView(communityInvolvement.sponsorshipProposal);
        communityInvolvement.setSponsorshipProposal();
        Assert.assertEquals(communityInvolvement.getTitle(),"Community Service & Involvement - State Farm®");
        switchToDifferentTab();
        scrollToView(sponsorShipSubmission.salutation);
        sponsorShipSubmission.setSalutation("Mr.");
        sponsorShipSubmission.setFirstName("john");
        sponsorShipSubmission.setLastName("monroe");
        sponsorShipSubmission.setJobTitle("tester");
        sponsorShipSubmission.setCompanyName("AAA");
        sponsorShipSubmission.setAddress("100 john street");
        sponsorShipSubmission.setCity("manhattan");
        sponsorShipSubmission.setState("New York");
        sponsorShipSubmission.setZipCode("10012");
        sponsorShipSubmission.setCounty("manhattan");
        sponsorShipSubmission.setPhoneNumber("646-234-1542");
        sponsorShipSubmission.setFax("646-123-1234");
        sponsorShipSubmission.setEmail("john@gmail.com");
        sponsorShipSubmission.setAreYouAStateFarmAgent("No");
        Assert.assertEquals(sponsorShipSubmission.getTitle(),"State Farm Sponsorship Submissions");

    }


}
