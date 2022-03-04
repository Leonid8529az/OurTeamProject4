package Team4Pro;

import Team4Pro.bankingPages.SearchBanking;
import Team4Pro.homePage.DifferentArticles;
import Team4Pro.insurancePages.FutureValueRetirement;
import Team4Pro.insurancePages.OffRoadInsurance;
import Team4Pro.insurancePages.PeriodicInvestment;
import Team4Pro.insurancePages.SearchInvestment;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class SearchFieldTest extends OurAPI {

    @Test
    public void searchAutoInsuranceTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        SearchPages searchPages = new SearchPages(driver);
        OffRoadInsurance offRoadInsurance = new OffRoadInsurance(driver);

        differentArticles.setSearchFieldButton();
        differentArticles.setSearchField("auto insurance");
        Assert.assertEquals(driver.getTitle(),"State Farm | Search");
        searchPages.setOffRoadVehicle();
        Assert.assertEquals(driver.getTitle(),"Off-Road Vehicle Insurance Quote - State Farm®");
        scrollToView(offRoadInsurance.tipsForCamping);
        waitSeconds(2);
        offRoadInsurance.setTipsForCamping();
        wait.until(ExpectedConditions.elementToBeClickable(offRoadInsurance.tipsForCamping));
        Assert.assertEquals(driver.getTitle(),"df");

    }

    @Test
    public void searchInvestmentTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        SearchPages searchPages = new SearchPages(driver);
        SearchInvestment searchInvestment = new SearchInvestment(driver);
        PeriodicInvestment periodicInvestment = new PeriodicInvestment(driver);
        FutureValueRetirement futureValueRetirement = new FutureValueRetirement(driver);

        differentArticles.setSearchFieldButton();
        differentArticles.setSearchField("investment");
        Assert.assertEquals(driver.getTitle(),"State Farm | Search");
        searchPages.setFinancialTools();
        Assert.assertEquals(driver.getTitle(),"State Farm | Search:investment");
        scrollToView(searchInvestment.periodicInvestment);
        wait.until(ExpectedConditions.elementToBeClickable(searchInvestment.periodicInvestment));
        searchInvestment.setPeriodicInvestment();
        Assert.assertEquals(driver.getTitle(),"Periodic Investment Plans - State Farm®");
        scrollToView(periodicInvestment.howMuchSavingBeWorth);
        periodicInvestment.setHowMuchSavingBeWorth();
        futureValueRetirement.setPeriodicContribution("50");
        scrollToView(futureValueRetirement.monthsToSave);
        futureValueRetirement.setAmountSaved("10000");
        futureValueRetirement.setMonthsToSave("36");
        futureValueRetirement.setInterestRate("2");
        futureValueRetirement.setPeriodicContribution("Monthly");
        futureValueRetirement.setCalculateButton();
//        Assert.assertEquals(driver.getTitle(),"");

    }

    @Test
    public void searchBankingTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        SearchPages searchPages = new SearchPages(driver);
        SearchBanking searchBanking = new SearchBanking(driver);

        differentArticles.setSearchFieldButton();
        differentArticles.setSearchField("banking");
        Assert.assertEquals(driver.getTitle(),"State Farm | Search");
        searchPages.setBanking();
        Assert.assertEquals(driver.getTitle(),"State Farm | Search:banking");

    }


}
