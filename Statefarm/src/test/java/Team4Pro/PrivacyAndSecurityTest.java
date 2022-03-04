package Team4Pro;

import Team4Pro.bankingPages.AgentNearBy;
import Team4Pro.homePage.DifferentArticles;
import Team4Pro.privacyAndSecurityPges.*;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrivacyAndSecurityTest extends OurAPI {

    @Test
    public void privacyTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        PrivacyAndSecurity privacyAndSecurity = new PrivacyAndSecurity(driver);
        NoticeOfPrivacy noticeOfPrivacy = new NoticeOfPrivacy(driver);
        PrivacyComment privacyComment = new PrivacyComment(driver);

        scrollToView(differentArticles.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.privacy));
        differentArticles.setPrivacy();
        waitSeconds(2);
        wait.until(ExpectedConditions.titleIs("State Farm Privacy and Security - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"State Farm Privacy and Security - State Farm®");
        scrollToView(privacyAndSecurity.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(privacyAndSecurity.privacy));
        privacyAndSecurity.setPrivacy();
        wait.until(ExpectedConditions.elementToBeClickable(privacyAndSecurity.privacy));
        Assert.assertEquals(driver.getTitle(),"Notice of Privacy Policy - State Farm®");
        scrollToView(noticeOfPrivacy.importantInfo);
        noticeOfPrivacy.setImportantInfo();
        noticeOfPrivacy.setEmailUs();
        privacyComment.setFirstName("john");
        privacyComment.setLastName("monroe");
        privacyComment.setStreetAddress("100 john street");
        privacyComment.setCity("manhattan");
        privacyComment.setState("New York");
        privacyComment.setZipCode("10012");
        privacyComment.setEmailAddress("john@gmail.com");
        privacyComment.setComment("tired");
        scrollToView(privacyComment.comment);
        privacyComment.setSubmitButton();
        wait.until(ExpectedConditions.titleIs("Privacy Comments/Suggestions Confirmation"));
        Assert.assertEquals(driver.getTitle(),"Privacy Comments/Suggestions Confirmation");

    }

    @Test
    public void securityTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        PrivacyAndSecurity privacyAndSecurity = new PrivacyAndSecurity(driver);
        StateFarmSecurity stateFarmSecurity = new StateFarmSecurity(driver);
        HowToAvoidHacker howToAvoidHacker = new HowToAvoidHacker(driver);
        IdentityRestoration identityRestoration = new IdentityRestoration(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);

        scrollToView(differentArticles.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.privacy));
        differentArticles.setPrivacy();
        waitSeconds(2);
        wait.until(ExpectedConditions.titleIs("State Farm Privacy and Security - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"State Farm Privacy and Security - State Farm®");
        scrollToView(privacyAndSecurity.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(privacyAndSecurity.security));

        waitSeconds(2);
        privacyAndSecurity.setSecurity();
        waitSeconds(3);
        Assert.assertEquals(differentArticles.getTitle(),"State Farm Security - State Farm®");
        stateFarmSecurity.setHowToProtect();
        scrollToView(stateFarmSecurity.managePassword);
        stateFarmSecurity.setManagePassword();
        stateFarmSecurity.setHowToAvoidHacking();
        Assert.assertEquals(driver.getTitle(),"How to Avoid Your Account Getting Hacked - State Farm®");
        scrollToView(howToAvoidHacker.identityRestoration);
        howToAvoidHacker.setIdentityRestoration();
        Assert.assertEquals(differentArticles.getTitle(),"Identity Restoration and Fraud Loss Coverage - State Farm®");
//        wait.until(ExpectedConditions.visibilityOfAllElements());
        waitSeconds(3);
        scrollToView(identityRestoration.talkToAgent);
        identityRestoration.setTalkToAgent();
        agentNearBy.setZipcodeToFindAgent("11214");
        Assert.assertEquals(driver.getTitle(),"ygufufh8ft7fu");

    }

    @Test
    public void alertTest(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        PrivacyAndSecurity privacyAndSecurity = new PrivacyAndSecurity(driver);
        PrivacyAlerts privacyAlerts = new PrivacyAlerts(driver);
        IdentityTheft identityTheft = new IdentityTheft(driver);

        scrollToView(differentArticles.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.privacy));
        differentArticles.setPrivacy();
        wait.until(ExpectedConditions.titleIs("State Farm Privacy and Security - State Farm®"));
        scrollToView(privacyAndSecurity.alerts);
        wait.until(ExpectedConditions.elementToBeClickable(privacyAndSecurity.alerts));
        privacyAndSecurity.setAlerts();
        Assert.assertEquals(driver.getTitle(),"Privacy & Security Alerts - State Farm®");
        privacyAlerts.setSuspiciousEmails();
        scrollToView(privacyAlerts.federalTrade);
        privacyAlerts.setFederalTrade();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(), "IdentityTheft.gov");
        identityTheft.setLogin();
        Assert.assertEquals(driver.getTitle(),"IdentityTheft.gov");

    }


    @Test
    public void privacyRightTest(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        PrivacyAndSecurity privacyAndSecurity = new PrivacyAndSecurity(driver);
        NoticeOfPrivacy noticeOfPrivacy = new NoticeOfPrivacy(driver);
        NYDomesticViolence nyDomesticViolence = new NYDomesticViolence(driver);


        scrollToView(differentArticles.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.privacy));
        differentArticles.setPrivacy();
        waitSeconds(2);
        wait.until(ExpectedConditions.titleIs("State Farm Privacy and Security - State Farm®"));
        scrollToView(privacyAndSecurity.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(privacyAndSecurity.privacy));
        privacyAndSecurity.setPrivacy();
        Assert.assertEquals(driver.getTitle(),"Notice of Privacy Policy - State Farm®");
        scrollToView(noticeOfPrivacy.newYorkPrivacyRight);
        noticeOfPrivacy.setNewYorkPrivacyRight();
        scrollToView(nyDomesticViolence.requestForm);
        nyDomesticViolence.setRequestForm();

    }


    @Test
    public void requestTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        PrivacyAndSecurity privacyAndSecurity = new PrivacyAndSecurity(driver);
        RequestForm requestForm = new RequestForm(driver);


        scrollToView(differentArticles.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.privacy));
        differentArticles.setPrivacy();
        waitSeconds(2);
        wait.until(ExpectedConditions.titleIs("State Farm Privacy and Security - State Farm®"));
        Assert.assertEquals(differentArticles.getTitle(),"State Farm Privacy and Security - State Farm®");
        wait.until(ExpectedConditions.elementToBeClickable(privacyAndSecurity.requestForm));
        scrollToView(privacyAndSecurity.requestForm);
        privacyAndSecurity.setRequestForm();
        Assert.assertEquals(driver.getTitle(),"Customer Forms");
        requestForm.setFirstName("john");
        requestForm.setLastName("monroe");
        requestForm.setStreetAddress("100 john street");
        requestForm.setCity("manhattan");
        requestForm.setState("California");
        requestForm.setZipcode("10012");
        requestForm.setDateOfBirth("12/10/1990");
        requestForm.setPhoneNumber("646-123-5243");
        requestForm.setSocialSecurity("3241");
        requestForm.setRelationship();
        Assert.assertTrue(requestForm.relationship.isEnabled());
        scrollToView(requestForm.formReason);
        requestForm.setFormReason();
        requestForm.setResponsePreference();
        Assert.assertTrue(requestForm.responsePreference.isEnabled());
        requestForm.setResponseMethod();
        requestForm.setEmailAddress("john@gmail.com");
        requestForm.setNextButton();
        Assert.assertEquals(driver.getTitle(),"Data Access Request Form");


    }

    @Test
    public void fullPrivacyPolicyTest(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        PrivacyAndSecurity privacyAndSecurity = new PrivacyAndSecurity(driver);
        NoticeOfPrivacy noticeOfPrivacy = new NoticeOfPrivacy(driver);


        scrollToView(differentArticles.privacy);
        wait.until(ExpectedConditions.elementToBeClickable(differentArticles.privacy));
        differentArticles.setPrivacy();
        wait.until(ExpectedConditions.titleIs("State Farm Privacy and Security - State Farm®"));
        Assert.assertEquals(differentArticles.getTitle(),"State Farm Privacy and Security - State Farm®");
        privacyAndSecurity.setFullPrivacyPolicy();
        Assert.assertEquals(driver.getTitle(),"Notice of Privacy Policy - State Farm®");
        noticeOfPrivacy.setOurPrivacy();
        scrollToView(noticeOfPrivacy.informationWeCollect);
        noticeOfPrivacy.setWeProtectCustomer();
        noticeOfPrivacy.setInformationWeCollect();
        noticeOfPrivacy.setUseCustomerInfo();
        noticeOfPrivacy.setShareCustomerInfo();
        scrollToView(noticeOfPrivacy.importantInfo);
        noticeOfPrivacy.setSharingLimit();
        noticeOfPrivacy.setFamilyOfCompany();
        wait.until(ExpectedConditions.elementToBeClickable(noticeOfPrivacy.mobileApplication));
        noticeOfPrivacy.setMobileApplication();
        noticeOfPrivacy.setImportantInfo();

    }

}
