package Team4Pro;

import Team4Pro.careersPages.AgentRecruiter;
import Team4Pro.careersPages.LoginGeneralData;
import Team4Pro.careersPages.StateFarmJobs;
import Team4Pro.careersPages.StateFarmJobsSearch;
import Team4Pro.homePage.Careers;
import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class CareerTest extends OurAPI {




    @Test
    public void jobTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        StateFarmJobs stateFarmJobs = new StateFarmJobs(driver);
        StateFarmJobsSearch stateFarmJobsSearch = new StateFarmJobsSearch(driver);
        LoginGeneralData loginGeneralData = new LoginGeneralData(driver);

        scrollToView(careers.careersAtStateFarm);
        wait.until(ExpectedConditions.elementToBeClickable(careers.careersAtStateFarm));
        careers.setCareersAtStateFarm();
        waitSeconds(3);
        wait.until(ExpectedConditions.titleIs("State Farm Jobs & Careers - State Farm®"));
        Assert.assertEquals(stateFarmJobs.getTitle(),"State Farm Jobs & Careers - State Farm®");
        wait.until(ExpectedConditions.titleIs(driver.getTitle()));
        scrollToView(stateFarmJobs.joinOurCorporate);
        wait.until(ExpectedConditions.visibilityOf(stateFarmJobs.findJobsButton));
        stateFarmJobs.setFindJobsButton();
        wait.until(ExpectedConditions.elementToBeClickable(stateFarmJobsSearch.jobLocation));
        stateFarmJobsSearch.setApplyNowForJob();
        switchToIFrame(loginGeneralData.frame);
        loginGeneralData.setEmailForJob("john@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(loginGeneralData.acceptCondition));
        loginGeneralData.setAcceptCondition();
        loginGeneralData.setNextForJob();

    }

    @Test
    public void recruiterTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Careers careers = new Careers(driver);
        StateFarmJobs stateFarmJobs = new StateFarmJobs(driver);
        AgentRecruiter agentRecruiter = new AgentRecruiter(driver);

        scrollToView(careers.careersAtStateFarm);
        wait.until(ExpectedConditions.elementToBeClickable(careers.careersAtStateFarm));
        waitSeconds(2);
        careers.setCareersAtStateFarm();
        wait.until(ExpectedConditions.titleIs("State Farm Jobs & Careers - State Farm®"));
        Assert.assertEquals(stateFarmJobs.getTitle(),"State Farm Jobs & Careers - State Farm®");
        scrollToView(stateFarmJobs.joinOurCorporate);
        stateFarmJobs.setContactRecruiterButton();
        agentRecruiter.setFirstNameForRecruiter("john");
        agentRecruiter.setLastNameForRecruiter("monroe");
        agentRecruiter.setEmailForRecruiter("john@gmail.com");
        agentRecruiter.setZipCodeForRecruiter("10012");
        agentRecruiter.setPhoneNumberForRecruiter("646-123-1425");
        agentRecruiter.setLearnAboutOpportunityForRecruiter("Recruiter");
        scrollToView(agentRecruiter.learnAboutOpportunityForRecruiter);
        agentRecruiter.setSubmitForRecruiter();
        Assert.assertEquals(agentRecruiter.getTitle(),"Contact an Agent Recruiter - State Farm®");
    }

}
