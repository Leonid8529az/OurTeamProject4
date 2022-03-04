package Team4Pro;

import Team4Pro.helpPages.CustomerCare;
import Team4Pro.helpPages.HowToCancelPolicy;
import Team4Pro.helpPages.SteerClear;
import Team4Pro.homePage.DifferentArticles;
import Team4Pro.homePage.LoggingPage;
import Team4Pro.insurancePages.InsuranceBill;
import Team4Pro.insurancePages.SafeDriver;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HelpFieldTest extends OurAPI {


    @Test
    public void cancelPolicyTest(){

        DifferentArticles differentArticles = new DifferentArticles(driver);
        CustomerCare customerCare = new CustomerCare(driver);
        HowToCancelPolicy howToCancelPolicy = new HowToCancelPolicy(driver);

        differentArticles.setHelpButton();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"Customer Care - State Farm®");
        customerCare.setCancelPolicy();
        customerCare.setCancellingInsurance();
        Assert.assertEquals(driver.getTitle(),"How to Cancel Your State Farm® Insurance Policy - State Farm®");
        scrollToView(howToCancelPolicy.cancelByMail);
        waitSeconds(2);
        howToCancelPolicy.setCancelByMail();
        howToCancelPolicy.setCancelInPerson();


    }


    @Test
    public void odometerTest(){

        DifferentArticles differentArticles = new DifferentArticles(driver);
        CustomerCare customerCare = new CustomerCare(driver);
        LoggingPage loggingPage = new LoggingPage(driver);


        differentArticles.setHelpButton();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"Customer Care - State Farm®");
        customerCare.setOdometer();
        customerCare.setVehicleOdometer();
        Assert.assertEquals(driver.getTitle(),"Log In");
        loggingPage.setUserIdToLogging("john");
        loggingPage.setPassWordToLogging("1234sdrea");
        Assert.assertEquals(driver.getTitle(),"Log In");

    }

    @Test
    public void viewBillTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CustomerCare customerCare = new CustomerCare(driver);
        InsuranceBill insuranceBill = new InsuranceBill(driver);

        differentArticles.setHelpButton();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"Customer Care - State Farm®");
        customerCare.setViewBill();
        customerCare.setPlentyOfOptions();
        Assert.assertEquals(driver.getTitle(),"Insurance Bill Pay - State Farm®");
        scrollToView(insuranceBill.moreWaysToPay);
        wait.until(ExpectedConditions.elementToBeClickable(insuranceBill.moreWaysToPay));
        insuranceBill.setMoreWaysToPay();
        wait.until(ExpectedConditions.elementToBeClickable(insuranceBill.moreWaysToPay));
        scrollToView(insuranceBill.whereIsMyKeycode);
        wait.until(ExpectedConditions.elementToBeClickable(insuranceBill.whereIsMyKeycode));
        insuranceBill.setWhereIsMyKeycode();

    }

    @Test
    public void steerTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        CustomerCare customerCare = new CustomerCare(driver);
        SteerClear steerClear = new SteerClear(driver);
        SafeDriver safeDriver = new SafeDriver(driver);

        differentArticles.setHelpButton();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"Customer Care - State Farm®");
        customerCare.setSteerClear();
        wait.until(ExpectedConditions.elementToBeClickable(customerCare.gettingStartedWithSteer));
        customerCare.setGettingStartedWithSteer();
        Assert.assertEquals(driver.getTitle(),"Steer Clear Safe Driver Discount - State Farm®");
        scrollToView(steerClear.startWithOnline);
        waitSeconds(2);
        steerClear.setStartWithOnline();
        wait.until(ExpectedConditions.elementToBeClickable(steerClear.startWithOnline));
        Assert.assertEquals(driver.getTitle(),"Safe Driver Training for Steer Clear® - State Farm®");
        scrollToView(safeDriver.insuranceDiscount);
        safeDriver.setInsuranceDiscount();




    }
}
