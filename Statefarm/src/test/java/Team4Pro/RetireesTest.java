package Team4Pro;


import Team4Pro.homePage.Careers;
import Team4Pro.retireesPages.*;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RetireesTest extends OurAPI {


    @Test
    public void directoryTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        RetireesInfoPage retireesInfoPage = new RetireesInfoPage(driver);
        RetireesDirectory retireesDirectory = new RetireesDirectory(driver);
        StateFarmAlumni stateFarmAlumni = new StateFarmAlumni(driver);


        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.retirees));
        careers.setRetirees();
        wait.until(ExpectedConditions.titleIs("Retirees Information - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retirees Information - State Farm®");
        scrollToView(retireesInfoPage.directory);
        retireesInfoPage.setDirectory();
        wait.until(ExpectedConditions.titleIs("Retirees Directory - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retirees Directory - State Farm®");
        scrollToView(retireesDirectory.usDiscountLInk);
        retireesDirectory.setUsDiscountLInk();
        wait.until(ExpectedConditions.titleIs("Retirees Directory - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retirees Directory - State Farm®");
        switchToDifferentTab();
        stateFarmAlumni.setRegister();
        Assert.assertEquals(driver.getTitle(),"State Farm Alumni Marketplace");
        stateFarmAlumni.setSuffixToRegister("Mr.");
        stateFarmAlumni.setFirstName("john");
        stateFarmAlumni.setLastName("monroe");
        stateFarmAlumni.setEmailAddress("john@gmail.com");
        stateFarmAlumni.setZipcode("10012");
        stateFarmAlumni.setPassword("Asdfg1234@");
        stateFarmAlumni.setConfirmPassword("Asdfg1234@");
        stateFarmAlumni.setSubmitButton();
        wait.until(ExpectedConditions.titleIs("State Farm Alumni Marketplace - Please check your inbox."));
        Assert.assertEquals(driver.getTitle(),"State Farm Alumni Marketplace - Please check your inbox.");


    }

    @Test
    public void resourcesTest(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        RetireesInfoPage retireesInfoPage = new RetireesInfoPage(driver);
        RetireesResources retireesResources = new RetireesResources(driver);
        ArticleToHelp articleToHelp = new ArticleToHelp(driver);
        RetirementPlanningHelp retirementPlanningHelp = new RetirementPlanningHelp(driver);


        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.retirees));
        careers.setRetirees();
        wait.until(ExpectedConditions.titleIs("Retirees Information - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retirees Information - State Farm®");
        scrollToView(retireesInfoPage.resources);
        retireesInfoPage.setResources();
        wait.until(ExpectedConditions.titleIs("Retiree Resources - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retiree Resources - State Farm®");
        scrollToView(retireesResources.socialSecurityProvide);
        retireesResources.setSocialSecurityProvide();
        Assert.assertEquals(driver.getTitle(),"Articles to Help With Planning For Retirement - State Farm®");
        scrollToView(articleToHelp.planningTips);
        articleToHelp.setPlanningTips();
        wait.until(ExpectedConditions.titleIs("Articles to Help With Your Retirement Planning - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Articles to Help With Your Retirement Planning - State Farm®");
        retirementPlanningHelp.setSurvivorBenefits();

    }

    @Test
    public void accoladeHealthTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        RetireesInfoPage retireesInfoPage = new RetireesInfoPage(driver);
        AccoladeHealth accoladeHealth = new AccoladeHealth(driver);
        AccoladeLogin accoladeLogin = new AccoladeLogin(driver);


        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.retirees));
        careers.setRetirees();
        wait.until(ExpectedConditions.titleIs("Retirees Information - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retirees Information - State Farm®");
        scrollToView(retireesInfoPage.accoladeHelp);
        retireesInfoPage.setAccoladeHelp();
        Assert.assertEquals(driver.getTitle(),"Accolade Health Assistant - State Farm®");
        scrollToView(accoladeHealth.memberAccolade);
        accoladeHealth.setMemberAccolade();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"Accolade Log In");
        accoladeLogin.setUserName("646-123-2415");
        accoladeLogin.setPassword("Adfe134@");
        accoladeLogin.setLoginButton();
        Assert.assertEquals(driver.getTitle(),"Accolade Log In");


    }

    @Test
    public void matchingGiftTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        RetireesInfoPage retireesInfoPage = new RetireesInfoPage(driver);
        MatchingGifts matchingGifts = new MatchingGifts(driver);
        EmployeeEngagement employeeEngagement = new EmployeeEngagement(driver);


        scrollToView(careers.diversityAndInclusion);
        waitSeconds(2);
        careers.setRetirees();
        waitSeconds(2);
        wait.until(ExpectedConditions.titleIs("Retirees Information - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Retirees Information - State Farm®");
        scrollToView(retireesInfoPage.matchingGift);
        retireesInfoPage.setMatchingGift();
        Assert.assertEquals(driver.getTitle(),"Matching Gift Program - State Farm®");
        matchingGifts.setMatchingGiftProgram();
        Assert.assertEquals(driver.getTitle(),"Employee Engagement");
        employeeEngagement.setCreatePassword();
        employeeEngagement.setFirstInitial("J");
        employeeEngagement.setLastInitial("M");
        employeeEngagement.setAssociateId("01242244");
        employeeEngagement.setPassword("Asdfg1234");
        employeeEngagement.setPasswordConfirmation("Asdfg1234");
        employeeEngagement.setEmailAddress("john@gmail.com");
        employeeEngagement.setSubmitButton();
        Assert.assertEquals(driver.getTitle(),"Employee Engagement");

    }

    @Test
    public void subscribeTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        RetireesInfoPage retireesInfoPage = new RetireesInfoPage(driver);
        Careers careers = new Careers(driver);
        AttentionStateFarmRetiree attentionStateFarmRetiree = new AttentionStateFarmRetiree(driver);

        scrollToView(careers.diversityAndInclusion);
        careers.setRetirees();
        wait.until(ExpectedConditions.titleIs("Retirees Information - State Farm®"));
        scrollToView(retireesInfoPage.signupForNews);
        retireesInfoPage.setSignupForNews();
        Assert.assertEquals(driver.getTitle(),"Retirees Information - State Farm®");
        switchToDifferentTab();
        scrollToView(attentionStateFarmRetiree.zipcode);
        attentionStateFarmRetiree.setName("john");
        attentionStateFarmRetiree.setEmailAddress("john@gmail.com");
        attentionStateFarmRetiree.setStreetAddress("100 john street");
        attentionStateFarmRetiree.setCity("manhattan");
        attentionStateFarmRetiree.setState("new york");
        attentionStateFarmRetiree.setZipcode("10012");
        scrollToView(attentionStateFarmRetiree.agreeFor);
        waitSeconds(2);
        attentionStateFarmRetiree.setAgreeFor();
        checkIfIsChecked(attentionStateFarmRetiree.agreeFor);
        Assert.assertTrue(attentionStateFarmRetiree.agreeFor.isEnabled());
        attentionStateFarmRetiree.setSignupButton();
        Assert.assertEquals(driver.getTitle(),"Attention State Farm Retirees!");


    }

    @Test
    public void joinViaDesktopTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        RetireesInfoPage retireesInfoPage = new RetireesInfoPage(driver);
        Careers careers = new Careers(driver);
        GoodFor100 goodFor100 = new GoodFor100(driver);


        scrollToView(careers.diversityAndInclusion);
        careers.setRetirees();
        waitSeconds(2);
        Assert.assertEquals(driver.getTitle(),"Retirees Information - State Farm®");
        wait.until(ExpectedConditions.titleIs("Retirees Information - State Farm®"));
        scrollToView(retireesInfoPage.joinViaDesktop);
        retireesInfoPage.setJoinViaDesktop();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"100 for Good");
        goodFor100.setRegister();
        wait.until(ExpectedConditions.elementToBeClickable(goodFor100.status));
        goodFor100.setStatus();
        wait.until(ExpectedConditions.elementToBeClickable(goodFor100.dateOfBirth));
        goodFor100.setDateOfBirth("12-1980");
        wait.until(ExpectedConditions.elementToBeClickable(goodFor100.submitButton));
        goodFor100.setSubmitButton();
        wait.until(ExpectedConditions.elementToBeClickable(goodFor100.submitButton));
        wait.until(ExpectedConditions.elementToBeClickable(goodFor100.emailAddress));
        goodFor100.setEmailAddress("john@gmail.com");
        goodFor100.setContinueButton();

    }




}
