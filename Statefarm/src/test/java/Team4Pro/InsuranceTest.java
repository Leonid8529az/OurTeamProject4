package Team4Pro;

import Team4Pro.bankingPages.AgentNearBy;
import Team4Pro.homePage.Insurance;
import Team4Pro.insurancePages.*;
import base.OurAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InsuranceTest extends OurAPI {


    @Test
    public void carInsurance(){
        Insurance insurance = new Insurance(driver);
        CarInsurance carInsurance = new CarInsurance(driver);
        CarRental carRental = new CarRental(driver);
        ChoosingWell choosingWell = new ChoosingWell(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_CarInsurance();
        Assert.assertEquals(carInsurance.getTitle(),"Free Car Insurance Quote - Save on Auto Insurance - State Farm®");
        scrollToView(carInsurance.rentalInsurance);
        carInsurance.setRentalInsurance();
        carInsurance.setRentalReimbursement();
        waitSeconds(2);
        scrollToView(carRental.carInsuranceDeductibles);
        waitSeconds(2);
        carRental.setCarInsuranceDeductibles();
        waitSeconds(2);



    }

    @Test
    public void homeAndProperty(){
        Insurance insurance = new Insurance(driver);
        HomeAndPropertyInsurance homeAndPropertyInsurance = new HomeAndPropertyInsurance(driver);
        HomeOwner homeOwner = new HomeOwner(driver);
        HomeOwnerDiscount homeOwnerDiscount = new HomeOwnerDiscount(driver);
        RoofingMaterial roofingMaterial = new RoofingMaterial(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_HomeAndProperty();
        Assert.assertEquals(homeAndPropertyInsurance.getTitle(),"Home and Property Insurance - State Farm®");
        scrollToView(homeAndPropertyInsurance.unlockMoreForHomeOwners);
        waitSeconds(5);
        homeAndPropertyInsurance.setUnlockMoreForHomeOwners();
        waitSeconds(4);
        scrollToView(homeOwner.exploreHomeOwners);
        waitSeconds(2);
        homeOwner.setExploreHomeOwners();
        waitSeconds(2);
        scrollToView(homeOwnerDiscount.seeRoofingDiscount);
        waitSeconds(2);
        homeOwnerDiscount.setSeeRoofingDiscount();
        waitSeconds(2);
        scrollToView(roofingMaterial.informationForRoofing);
//        waitSeconds(2);
        roofingMaterial.setInformationForRoofing();
        Assert.assertEquals(roofingMaterial.getTitle(),"Roofing Materials Home Insurance Discounts - State Farm®");

    }


    @Test
    public void candoQuote(){
        Insurance insurance = new Insurance(driver);
        CandoInsurance candoInsurance = new CandoInsurance(driver);
        WelcomeToCandoQuote welcomeToCandoQuote = new WelcomeToCandoQuote(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_Condominium();
        candoInsurance.setZipCodeForCando("11214");
        candoInsurance.setStarQuoteForCando();
        welcomeToCandoQuote.setFirstNameForCandoQuote("john");
        welcomeToCandoQuote.setLastNameForCandoQuote("preu");
        welcomeToCandoQuote.setAddressForCandoQuote("100 john street");
        welcomeToCandoQuote.setCityForCandoQuote("manhattah");
        welcomeToCandoQuote.setMonthOfBirthForCandoQuote("12");
        welcomeToCandoQuote.setDayOfBirthForCandoQuote("10");
        welcomeToCandoQuote.setYearOfBirthForCandoQuote("1980");
        scrollToView(welcomeToCandoQuote.continueForCandoQuote);
        welcomeToCandoQuote.setContinueForCandoQuote();
        Assert.assertEquals(welcomeToCandoQuote.getTitle(),"Welcome - Condo Unitowners Quote - State Farm");


    }

    @Test
    public void medicareSupplement(){

        Insurance insurance = new Insurance(driver);
        MedicareSupplement medicareSupplement = new MedicareSupplement(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_MedicareSupplement();
        medicareSupplement.setSelectStateForMedicare("NY");
        waitSeconds(2);


    }

    @Test
    public void wholeLifeInsurance(){
        Insurance insurance = new Insurance(driver);
        WholeLifeInsurance wholeLifeInsurance = new WholeLifeInsurance(driver);
        LifeInsuranceBasic lifeInsuranceBasic = new LifeInsuranceBasic(driver);
        InforForLifeInsurance inforForLifeInsurance = new InforForLifeInsurance(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_WholeLife();
        waitSeconds(2);
        scrollToView(wholeLifeInsurance.whatToKnow);
        waitSeconds(1);
        wholeLifeInsurance.setLifeInsuranceResources();
        scrollToView(lifeInsuranceBasic.getStartedForLifeInsurance);
        lifeInsuranceBasic.setGetStartedForLifeInsurance();
        inforForLifeInsurance.setFirstNameForLifeInsurance("john");
        inforForLifeInsurance.setGenderForLifeInsurance("Male");
        inforForLifeInsurance.setDateOfBirthForLifeInsurance("12/1983");
        inforForLifeInsurance.setEmploymentStatusForLifeInsurance("Employed");
        inforForLifeInsurance.setMaritalStatusForLifeInsurance("Single");
        inforForLifeInsurance.setStateForLifeInsurance("New York");
        inforForLifeInsurance.setContinueForLifeInsurance();
        Assert.assertEquals(inforForLifeInsurance.getTitle(),"Personal Information - Profile - MyBlocks by Envestnet MoneyGuide");


    }


    @Test
    public void workerCompensation(){
        Insurance insurance = new Insurance(driver);
        WorkersCompensation workersCompensation = new WorkersCompensation(driver);
        LossControl lossControl = new LossControl(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_WorkersCompensation();
        scrollToView(workersCompensation.learnRisks);
        waitSeconds(6);
        workersCompensation.setLearnRisks();
        waitSeconds(6);
        scrollToView(lossControl.otherAvailableResource);
        Assert.assertEquals(lossControl.getTitle(),"Loss Control and Prevention - State Farm®");
        lossControl.setAggressiveDriving();
        switchToDifferentTab();


    }

    @Test
    public void businessLiability(){
        Insurance insurance = new Insurance(driver);
        BusinessLiability businessLiability = new BusinessLiability(driver);
        FloodInsurance floodInsurance = new FloodInsurance(driver);
        WinterWeather winterWeather = new WinterWeather(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_BusinessLiability();
        Assert.assertEquals(businessLiability.getTitle(),"Business Professional Liability Insurance - State Farm®");
        waitSeconds(2);
        scrollToView(businessLiability.floodInsurance);
        waitSeconds(1);
        businessLiability.setFloodInsurance();
        scrollToView(floodInsurance.iceDams);
        floodInsurance.setIceDams();


    }

    @Test
    public void roadSide(){
        Insurance insurance = new Insurance(driver);
        GetRoadSideAssistance getRoadSideAssistance = new GetRoadSideAssistance(driver);
        EmergencyService emergencyService = new EmergencyService(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_RoadAssistance();
        getRoadSideAssistance.setGetAssistance();
        Assert.assertEquals(emergencyService.getTitle(),"Emergency Roadside Service");
        emergencyService.setStartRequestRoadSide();
        emergencyService.setUsePolicyForAssistance();
        emergencyService.setFirstNameForAssistance("john");
        emergencyService.setLastNameForAssistance("preu");
        emergencyService.setContinueForAssistance();
        emergencyService.setPolicyNumberForAssistance("12345678");
    }


    @Test
    public void termLife(){
        Insurance insurance = new Insurance(driver);
        TermLifeInsurance termLifeInsurance = new TermLifeInsurance(driver);
        LifeQuote lifeQuote = new LifeQuote(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_TermLife();
        scrollToView(termLifeInsurance.selectStateForTermLife);
        termLifeInsurance.setSelectStateForTermLife("NY");
        termLifeInsurance.setGoForTermLife();
        Assert.assertEquals(lifeQuote.getTitle(),"Term Life Insurance – Get A Quote - State Farm®");
        lifeQuote.setYesForTermLifeQuote();
        lifeQuote.setDateOfBirthForLifeQuote("12-11-1980");
        lifeQuote.setContinueForBirthDayLifeQuote();
        lifeQuote.setGenderForTermLife();
        waitSeconds(2);
        lifeQuote.setTobaccoForTermLife();
        waitSeconds(3);
        lifeQuote.setMonthForLstTobacco("April");
        lifeQuote.setLastYearForTobacco("2021");
        lifeQuote.setContinueForTobacco();
        lifeQuote.setHeightFeet("5");
        lifeQuote.setHeightInches("10");
        lifeQuote.setContinueForHeight();
        lifeQuote.setWeight("180");
        waitSeconds(2);
        lifeQuote.setContinueForWeight();
        waitSeconds(3);
        lifeQuote.setHealthCondition();
        lifeQuote.setCoverageNeeded("$500,000");
        lifeQuote.setTermLength("10 years");
        lifeQuote.setContinueForCoverage();


    }


    @Test
    public void manufacturedHome(){
        Insurance insurance = new Insurance(driver);
        ManufacturedHome manufacturedHome = new ManufacturedHome(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_ManufacturedHome();
        manufacturedHome.setZipCodeForManufacturedHome("11214");
        scrollToView(agentNearBy.getSammyMartinezEmail);
        agentNearBy.setGetSammyMartinezEmail();
        switchToDifferentWindow();
        agentNearBy.setNameFieldToEmailAgent("john");
        agentNearBy.setEmailFieldToEmailAgent("john-preu@gmail.com");
        agentNearBy.setTextToEmail("i am tired");
        scrollToView(agentNearBy.sendEmailToAgent);
        agentNearBy.setSendEmailToAgent();
        Assert.assertEquals(agentNearBy.getTitle(),"Email Agent");



    }





}
