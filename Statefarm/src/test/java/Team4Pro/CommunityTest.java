package Team4Pro;

import Team4Pro.homePage.DifferentArticles;
import base.OurAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommunityTest extends OurAPI {
    @Test
    public void teacherAssistTest(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        TeacherAssistPage teacherAssistPage = new TeacherAssistPage(driver);
        NewYorkForTeacherAssist newYorkForTeacherAssist = new NewYorkForTeacherAssist(driver);

        scrollToView(differentArticles.communityInvolvement);
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        communityInvolvement.setTeacherAssist();
        Assert.assertEquals(communityInvolvement.getTitle(),"Community Service & Involvement - State Farm®");
        waitSeconds(3);
        switchToDifferentTab();
        Assert.assertEquals(teacherAssistPage.getTitle(),"200 Winners - $500,000 in Teacher Assists");
        scrollToView(teacherAssistPage.stateForTeacherAssist);
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
        scrollToView(communityInvolvement.newsRoom);
        waitSeconds(2);
        Assert.assertEquals(communityInvolvement.getTitle(),"Community Service & Involvement - State Farm®");
        communityInvolvement.setNewsRoom();
        scrollToView(goodNeighborPage.environment);
        waitSeconds(3);
        goodNeighborPage.setEnvironment();
        Assert.assertEquals(environmentPage.getTitle(),"Environment");
        scrollToView(environmentPage.planningAppreciation);
        waitSeconds(2);
        environmentPage.setPlanningAppreciation();
        waitSeconds(2);
        scrollToView(environmentPage.jenniferYoungEmail);
        waitSeconds(2);
        environmentPage.setJenniferYoungEmail();
        Assert.assertEquals(environmentPage.getTitle(),"Planting Appreciation for the Environment | State Farm");

    }


    @Test
    public void simpleInsightsTest(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        SimpleInsightPage simpleInsightPage = new SimpleInsightPage(driver);
        CollectionOfArticle collectionOfArticle = new CollectionOfArticle(driver);


        scrollToView(differentArticles.communityInvolvement);
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        waitSeconds(2);
        Assert.assertEquals(differentArticles.getTitle(),"Community Service & Involvement - State Farm®");
        scrollToView(communityInvolvement.simpleInsights);
        waitSeconds(3);
        communityInvolvement.setSimpleInsights();
        Assert.assertEquals(differentArticles.getTitle(),"Simple Insights from State Farm - State Farm®");
        scrollToView(simpleInsightPage.badWeatherDriving);
        simpleInsightPage.setBadWeatherDriving();
        scrollToView(collectionOfArticle.drivingInTheRain);
        waitSeconds(2);
        collectionOfArticle.setDrivingInTheRain();
        waitSeconds(2);
        Assert.assertEquals(communityInvolvement.getTitle(),"Tips for Driving Safely in the Rain - State Farm®");

    }

    @Test
    public void nationalCommunityTest(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        FoundationPage foundationPage = new FoundationPage(driver);

        scrollToView(differentArticles.communityInvolvement);
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        Assert.assertEquals(differentArticles.getTitle(),"Community Service & Involvement - State Farm®");
        scrollToView(communityInvolvement.foundation);
        communityInvolvement.setFoundation();
        Assert.assertEquals(communityInvolvement.getTitle(),"State Farm Foundation - State Farm®");
        scrollToView(foundationPage.nationalMerit);
        foundationPage.setNationalMerit();
        Assert.assertEquals(foundationPage.getTitle(),"State Farm Foundation - State Farm®");

    }

    @Test
    public void sponsorshipProposalTest(){
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        SponsorShipSubmission sponsorShipSubmission = new SponsorShipSubmission(driver);

        scrollToView(differentArticles.communityInvolvement);
        waitSeconds(3);
        differentArticles.setCommunityInvolvement();
        waitSeconds(2);
        scrollToView(communityInvolvement.sponsorshipProposal);
        Assert.assertEquals(differentArticles.getTitle(),"Community Service & Involvement - State Farm®");
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
