package Team4Pro;

import Team4Pro.careersPages.*;
import Team4Pro.homePage.Careers;
import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiversityAndInclusionTest extends OurAPI {

    @Test
    public void grantsTest() {

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        CompanyGrants companyGrants = new CompanyGrants(driver);
        CyberGrant cyberGrant = new CyberGrant(driver);

        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
        careers.setDiversityAndInclusion();
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        scrollToView(diversityAndInclusionPage.grants);
        diversityAndInclusionPage.setGrants();
        scrollToView(companyGrants.cyberGrants);
        wait.until(ExpectedConditions.visibilityOf(companyGrants.cyberGrants));
        companyGrants.setCyberGrants();
        waitSeconds(3);
        switchToDifferentTab();
        Assert.assertEquals(companyGrants.getTitle(),"CyberGrants FrontDoor");
        cyberGrant.setRegisterToday();
        Assert.assertEquals(cyberGrant.getTitle(),"CyberGrants FrontDoor");

    }


    @Test
    public void relationshipTest(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        CompanyRelationship companyRelationship = new CompanyRelationship(driver);
        HabitsOfHumanity habitsOfHumanity = new HabitsOfHumanity(driver);

        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
        careers.setDiversityAndInclusion();
        waitSeconds(3);
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        scrollToView(diversityAndInclusionPage.relationship);
        diversityAndInclusionPage.setRelationship();
        wait.until(ExpectedConditions.titleIs("Company Development Relationships - State Farm®"));
        Assert.assertEquals(diversityAndInclusionPage.getTitle(),"Company Development Relationships - State Farm®");
        scrollToView(companyRelationship.learnAboutAmericanRed);
        companyRelationship.setLearnAboutAmericanRed();
        switchToDifferentWindow();
        Assert.assertEquals(companyRelationship.getTitle(),"American Red Cross | Help Those Affected by Disasters");
//        switchToDifferentWindow();
//        scrollToView(companyRelationship.learnAboutHabits);
//        companyRelationship.setLearnAboutHabits();
//        habitsOfHumanity.setLearAboutOurWork();

    }

    @Test
    public void safetyTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        SaferCommunity saferCommunity = new SaferCommunity(driver);
        AutoSafety autoSafety = new AutoSafety(driver);

        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
        careers.setDiversityAndInclusion();
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
        waitSeconds(3);
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        scrollToView(diversityAndInclusionPage.safety);
        wait.until(ExpectedConditions.visibilityOf(diversityAndInclusionPage.safety));
        diversityAndInclusionPage.setSafety();
        scrollToView(saferCommunity.autoSafety);
        wait.until(ExpectedConditions.elementToBeClickable(saferCommunity.autoSafety));
        saferCommunity.setAutoSafety();
        autoSafety.setLearnAboutIIHS();
        Assert.assertEquals(autoSafety.getTitle(),"Auto Safety - State Farm®");


    }


    @Test
    public void educationTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        CommunityInvolvement communityInvolvement = new CommunityInvolvement(driver);
        EducationAssistPage educationAssistPage = new EducationAssistPage(driver);

        scrollToView(careers.diversityAndInclusion);
        waitSeconds(2);
        careers.setDiversityAndInclusion();
        waitSeconds(3);
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        scrollToView(diversityAndInclusionPage.education);
        diversityAndInclusionPage.setEducation();
        Assert.assertEquals(diversityAndInclusionPage.getTitle(),"Community Service & Involvement - State Farm®");
        communityInvolvement.setEducationAssist();
        Assert.assertEquals(communityInvolvement.getTitle(),"Education Assist® - State Farm®");
        scrollToView(educationAssistPage.pathwayForFuture);
        educationAssistPage.setPathwayForFuture();
        wait.until(ExpectedConditions.titleIs(driver.getTitle()));
        Assert.assertEquals(driver.getTitle(),"Education Assist® - State Farm®");

    }

    @Test
    public void supplierDiversityTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        SupplierDiversityPage supplierDiversityPage = new SupplierDiversityPage(driver);


        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
        careers.setDiversityAndInclusion();
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
       wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        scrollToView(diversityAndInclusionPage.supplierDiversity);
        diversityAndInclusionPage.setSupplierDiversity();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"B2B | Supplier Diversity Program - State Farm®");
        scrollToView(supplierDiversityPage.eligibility);
        supplierDiversityPage.setEligibility();
        supplierDiversityPage.setRegistration();
        supplierDiversityPage.setProducts();
        supplierDiversityPage.FQA();
        Assert.assertEquals(driver.getTitle(),"B2B | Supplier Diversity Program - State Farm®");

    }


    @Test
    public void companyOverviewTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        CompanyOverviewPage companyOverviewPage = new CompanyOverviewPage(driver);
        StateFarmAnnualReport stateFarmAnnualReport = new StateFarmAnnualReport(driver);

        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.visibilityOf(careers.diversityAndInclusion));
        careers.setDiversityAndInclusion();
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        wait.until(ExpectedConditions.titleIs(driver.getTitle()));
        scrollToView(diversityAndInclusionPage.companyOverview);
        diversityAndInclusionPage.setCompanyOverview();
        Assert.assertEquals(driver.getTitle(),"Company Overview - State Farm®");
        scrollToView(companyOverviewPage.codeOfConduct);
        companyOverviewPage.setCodeOfConduct();
        wait.until(ExpectedConditions.titleIs(driver.getTitle()));
//        Assert.assertEquals(driver.getTitle(),"tgukfgg");

//        driver.switchTo().parentFrame();
//        companyOverviewPage.setAnnualReport();
//        stateFarmAnnualReport.setReport2020();

    }

    @Test
    public void innovationTest(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        InnovationPage innovationPage = new InnovationPage(driver);
        VentureOffice ventureOffice = new VentureOffice(driver);

        scrollToView(careers.diversityAndInclusion);
        wait.until(ExpectedConditions.elementToBeClickable(careers.diversityAndInclusion));
        careers.setDiversityAndInclusion();
        waitSeconds(3);
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        scrollToView(diversityAndInclusionPage.companyOverview);
        diversityAndInclusionPage.setInnovation();
        innovationPage.setVisitOurVenture();
        ventureOffice.setContactUs();
        switchToIFrame(ventureOffice.frame);
        ventureOffice.setFirstName("john");
        ventureOffice.setLastName("monroe");
        ventureOffice.setCompanyName("abc");
        ventureOffice.setEmailAddress("john@gmail.com");
        ventureOffice.setEmailConfirmation("john@gmail.com");
        ventureOffice.setZipCode("10011");
        ventureOffice.setPhoneNumber("646-124-6125");
        ventureOffice.setWebSite("www.abc.us");
        ventureOffice.setProject("im tired");
        ventureOffice.setHearAboutUs("Internet Search");
        ventureOffice.setSubmitButton();

    }


    @Test
    public void accessibilityTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        DiversityAndInclusionPage diversityAndInclusionPage = new DiversityAndInclusionPage(driver);
        AccessibilityStatementPage accessibilityStatementPage = new AccessibilityStatementPage(driver);
        CustomerFormPage customerFormPage = new CustomerFormPage(driver);

        scrollToView(careers.diversityAndInclusion);
        careers.setDiversityAndInclusion();
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        Assert.assertEquals(careers.getTitle(),"Diversity & Inclusion - State Farm®");
        wait.until(ExpectedConditions.titleIs("Diversity & Inclusion - State Farm®"));
        scrollToView(diversityAndInclusionPage.companyOverview);
        diversityAndInclusionPage.setAccessibilityStatement();
        Assert.assertEquals(driver.getTitle(),"Accessibility Statement - State Farm®");
        accessibilityStatementPage.setAccessibilityFeedback();
        waitSeconds(2);
        Assert.assertEquals(driver.getTitle(),"Accessibility Feedback");
        wait.until(ExpectedConditions.titleIs("Accessibility Feedback"));
        customerFormPage.setFirstName("john");
        customerFormPage.setLastName("monroe");
        customerFormPage.setContactPreference();
        Assert.assertTrue(customerFormPage.contactPreference.isEnabled());
        customerFormPage.setPhoneNumber("646-132-5124");
        customerFormPage.setEmailAddress("john@gmail.com");
        customerFormPage.setTextToEnter("i'm tired");
        scrollToView(customerFormPage.phoneNumber);
        customerFormPage.setSubmitButton();
        customerFormPage.setPreviousButton();
        Assert.assertEquals(driver.getTitle(),"Accessibility Feedback");

    }


}
