package Team4Pro;

import Team4Pro.bankingPages.AgentNearBy;
import Team4Pro.homePage.Insurance;
import Team4Pro.insurancePages.*;
import base.OurAPI;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class InsuranceTest extends OurAPI {


    @Test
    public void carInsurance(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        CarInsurance carInsurance = new CarInsurance(driver);
        CarRental carRental = new CarRental(driver);
        ChoosingWell choosingWell = new ChoosingWell(driver);


        insurance.setInsuranceHeaderInHomePage();
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        insurance.setInsuranceSubTitle_CarInsurance();
        Assert.assertEquals(carInsurance.getTitle(),"Free Car Insurance Quote - Save on Auto Insurance - State Farm®");
        scrollToView(carInsurance.rentalInsurance);
        wait.until(ExpectedConditions.elementToBeClickable(carInsurance.rentalInsurance));
        carInsurance.setRentalInsurance();
        wait.until(ExpectedConditions.elementToBeClickable(carInsurance.rentalInsurance));
        carInsurance.setRentalReimbursement();
//        wait.until(ExpectedConditions.visibilityOfAllElements());
        waitSeconds(3);
        scrollToView(carRental.carInsuranceDeductibles);
        wait.until(ExpectedConditions.elementToBeClickable(carRental.carInsuranceDeductibles));
        carRental.setCarInsuranceDeductibles();
        Assert.assertEquals(carRental.getTitle(),"Car Insurance Deductibles: Choosing Well - State Farm®");




    }

    @Test
    public void homeAndProperty(){
        Insurance insurance = new Insurance(driver);
        HomeAndPropertyInsurance homeAndPropertyInsurance = new HomeAndPropertyInsurance(driver);
        HomeOwner homeOwner = new HomeOwner(driver);
        HomeOwnerDiscount homeOwnerDiscount = new HomeOwnerDiscount(driver);
        RoofingMaterial roofingMaterial = new RoofingMaterial(driver);


        insurance.setInsuranceHeaderInHomePage();
        waitSeconds(1);
        insurance.setInsuranceSubTitle_HomeAndProperty();
        waitSeconds(2);
        Assert.assertEquals(homeAndPropertyInsurance.getTitle(),"Home and Property Insurance - State Farm®");
        scrollToView(homeAndPropertyInsurance.unlockMoreForHomeOwners);
        waitSeconds(5);
        homeAndPropertyInsurance.setUnlockMoreForHomeOwners();
        waitSeconds(4);
        scrollToView(homeOwner.exploreHomeOwners);
        waitSeconds(2);
        homeOwner.setExploreHomeOwners();
        Assert.assertEquals(homeOwner.getTitle(),"Homeowners Insurance Discounts - State Farm®");
        waitSeconds(2);
        scrollToView(homeOwnerDiscount.seeRoofingDiscount);
        waitSeconds(2);
        homeOwnerDiscount.setSeeRoofingDiscount();
        Assert.assertEquals(homeOwnerDiscount.getTitle(),"Roofing Materials Home Insurance Discounts - State Farm®");
        waitSeconds(2);
        scrollToView(roofingMaterial.informationForRoofing);
        roofingMaterial.setInformationForRoofing();
        Assert.assertEquals(roofingMaterial.getTitle(),"Roofing Materials Home Insurance Discounts - State Farm®");

    }


    @Test
    public void condoQuote(){
        Insurance insurance = new Insurance(driver);
        CandoInsurance candoInsurance = new CandoInsurance(driver);
        WelcomeToCandoQuote welcomeToCandoQuote = new WelcomeToCandoQuote(driver);


        insurance.setInsuranceHeaderInHomePage();
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
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
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        insurance.setInsuranceSubTitle_MedicareSupplement();
        medicareSupplement.setSelectStateForMedicare("NY");
        Assert.assertEquals(medicareSupplement.getTitle(),"Medicare Supplement Insurance - State Farm®");
        waitSeconds(2);


    }

    @Test
    public void wholeLifeInsurance(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        WholeLifeInsurance wholeLifeInsurance = new WholeLifeInsurance(driver);
        LifeInsuranceBasic lifeInsuranceBasic = new LifeInsuranceBasic(driver);
        InforForLifeInsurance inforForLifeInsurance = new InforForLifeInsurance(driver);


        insurance.setInsuranceHeaderInHomePage();
        Assert.assertEquals(driver.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        insurance.setInsuranceSubTitle_WholeLife();
        wait.until(ExpectedConditions.titleIs("Whole Life Insurance – Get A Quote - State Farm®"));
        scrollToView(wholeLifeInsurance.whatToKnow);
        Assert.assertEquals(driver.getTitle(),"Whole Life Insurance – Get A Quote - State Farm®");
        wait.until(ExpectedConditions.elementToBeClickable(wholeLifeInsurance.lifeInsuranceResources));
        waitSeconds(4);
        wholeLifeInsurance.setLifeInsuranceResources();
        waitSeconds(3);
        wait.until(ExpectedConditions.titleIs("Blocks by Envestnet - MoneyGuide"));
        scrollToView(lifeInsuranceBasic.getStartedForLifeInsurance);
        wait.until(ExpectedConditions.elementToBeClickable(lifeInsuranceBasic.getStartedForLifeInsurance));
        lifeInsuranceBasic.setGetStartedForLifeInsurance();
        Assert.assertEquals(driver.getTitle(),"Blocks by Envestnet - MoneyGuide");
        wait.until(ExpectedConditions.visibilityOf(inforForLifeInsurance.firstNameForLifeInsurance));
        inforForLifeInsurance.setFirstNameForLifeInsurance("john");
        inforForLifeInsurance.setGenderForLifeInsurance("Male");
        inforForLifeInsurance.setDateOfBirthForLifeInsurance("12/1983");
        inforForLifeInsurance.setEmploymentStatusForLifeInsurance("Employed");
        inforForLifeInsurance.setMaritalStatusForLifeInsurance("Single");
        inforForLifeInsurance.setStateForLifeInsurance("New York");
        inforForLifeInsurance.setContinueForLifeInsurance();
        Assert.assertEquals(driver.getTitle(),"Personal Information - Profile - MyBlocks by Envestnet MoneyGuide");


    }


    @Test
    public void workerCompensation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        WorkersCompensation workersCompensation = new WorkersCompensation(driver);
        LossControl lossControl = new LossControl(driver);

        insurance.setInsuranceHeaderInHomePage();
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        insurance.setInsuranceSubTitle_WorkersCompensation();
        wait.until(ExpectedConditions.titleIs("Workers’ Compensation Insurance - State Farm®"));
        Assert.assertEquals(insurance.getTitle(),"Workers’ Compensation Insurance - State Farm®");
        scrollToView(workersCompensation.learnRisks);
        wait.until(ExpectedConditions.elementToBeClickable(workersCompensation.learnRisks));
        workersCompensation.setLearnRisks();
        waitSeconds(3);
        scrollToView(lossControl.otherAvailableResource);
        waitSeconds(2);
        Assert.assertEquals(lossControl.getTitle(),"Workers’ Compensation Insurance - State Farm®");
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
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        insurance.setInsuranceSubTitle_BusinessLiability();
        Assert.assertEquals(businessLiability.getTitle(),"Business Professional Liability Insurance - State Farm®");
        waitSeconds(2);
        scrollToView(businessLiability.floodInsurance);
        waitSeconds(1);
        businessLiability.setFloodInsurance();
        Assert.assertEquals(businessLiability.getTitle(),"Flood Insurance - State Farm®");
        scrollToView(floodInsurance.iceDams);
        floodInsurance.setIceDams();
        Assert.assertEquals(floodInsurance.getTitle(),"Winter Water Damage from Ice Dams & More - State Farm®");


    }

    @Test
    public void roadSide(){
        Insurance insurance = new Insurance(driver);
        GetRoadSideAssistance getRoadSideAssistance = new GetRoadSideAssistance(driver);
        EmergencyService emergencyService = new EmergencyService(driver);


        insurance.setInsuranceHeaderInHomePage();
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
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
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
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
        Assert.assertEquals(lifeQuote.getTitle(),"Life Quote - State Farm");


    }


    @Test
    public void manufacturedHome(){
        Insurance insurance = new Insurance(driver);
        ManufacturedHome manufacturedHome = new ManufacturedHome(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);

        insurance.setInsuranceHeaderInHomePage();
        Assert.assertEquals(insurance.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        insurance.setInsuranceSubTitle_ManufacturedHome();
        manufacturedHome.setZipCodeForManufacturedHome("11214");
        scrollToView(agentNearBy.getSammyMartinezEmail);
        agentNearBy.setGetSammyMartinezEmail();
        Assert.assertEquals(agentNearBy.getTitle(),"Find State Farm® Agents Near You - State Farm®");
        switchToDifferentWindow();
        agentNearBy.setNameFieldToEmailAgent("john");
        agentNearBy.setEmailFieldToEmailAgent("john-preu@gmail.com");
        agentNearBy.setTextToEmail("i am tired");
        scrollToView(agentNearBy.sendEmailToAgent);
        agentNearBy.setSendEmailToAgent();
        Assert.assertEquals(agentNearBy.getTitle(),"Email Agent");

    }


    @Test
    public void farmTest(){
        Insurance insurance = new Insurance(driver);
        FarmOrRanch farmOrRanch = new FarmOrRanch(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubtitle_farmAndRanch();
        Assert.assertEquals(driver.getTitle(),"Farm or Ranch Property Insurance - State Farm®");
        farmOrRanch.setZipCodeForAgent("11214");
        Assert.assertEquals(driver.getTitle(),"Find State Farm® Agents Near You - State Farm®");
        scrollToView(agentNearBy.sammyMartinezDirection);
        agentNearBy.setSammyMartinezDirection();
        switchToDifferentTab();
        Assert.assertEquals(driver.getTitle(),"Sammy Martinez - State Farm Insurance Agent for Auto, Home, Life and Financial in Brooklyn, NY");


    }

    @Test
    public void contractorTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        ContractorInsurance contractorInsurance = new ContractorInsurance(driver);
        AffordableSmallBusiness affordableSmallBusiness = new AffordableSmallBusiness(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_contractorPolicy();
        Assert.assertEquals(driver.getTitle(),"Contractors Insurance – Coverages & Quote - State Farm®");
        contractorInsurance.setAgentContactMe();
        wait.until(ExpectedConditions.titleIs("Find affordable Small Business Insurance – State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Find affordable Small Business Insurance – State Farm®");
        affordableSmallBusiness.setFirstName("john");
        affordableSmallBusiness.setLastName("monroe");
        affordableSmallBusiness.setPhoneNumber("646-234-1423");
        affordableSmallBusiness.setEmailAddress("john@gmail.com");
        affordableSmallBusiness.setNotStateFarmCustomer();
        Assert.assertTrue(affordableSmallBusiness.notStateFarmCustomer.isEnabled());
        affordableSmallBusiness.setPolicyType("Contractors policy");
        scrollToView(affordableSmallBusiness.city);
        affordableSmallBusiness.setPrimaryAddress("100 john street");
        affordableSmallBusiness.setCity("manhattan");
        affordableSmallBusiness.setState("NY");
        affordableSmallBusiness.setZipCode("10012");
        affordableSmallBusiness.setSubmitButton();
        Assert.assertEquals(driver.getTitle(),"Find affordable Small Business Insurance – State Farm®");

    }


    @Test
    public void individualHealthTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
       IndividualMedical individualMedical = new IndividualMedical(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubtitle_individualMedical();
        Assert.assertEquals(driver.getTitle(),"Individual Medical Health Insurance - State Farm®");
        individualMedical.setState("New York");
        individualMedical.setGoButton();
        Assert.assertEquals(driver.getTitle(),"Other Individual Health Insurance Options - State Farm®");

    }


    @Test
    public void dogInsuranceTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        PetInsurance petInsurance = new PetInsurance(driver);
        DogInsurance dogInsurance = new DogInsurance(driver);
        PetQuote petQuote = new PetQuote(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubtitle_petMedical();
        Assert.assertEquals(driver.getTitle(),"Pet Insurance – Get a free cat or dog insurance quote - State Farm®");
        scrollToView(petInsurance.dogInsurance);
        wait.until(ExpectedConditions.elementToBeClickable(petInsurance.dogInsurance));
        petInsurance.setDogInsurance();
        Assert.assertEquals(driver.getTitle(),"Dog Insurance – Get a free dog insurance quote - State Farm®");
        dogInsurance.setZipCodeForDogQuote("11214");
        dogInsurance.setStartDogQuote();
        wait.until(ExpectedConditions.titleIs("Dog Insurance – Get a free dog insurance quote - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"Dog Insurance – Get a free dog insurance quote - State Farm®");
        petQuote.setFirstName("john");
        petQuote.setLastName("monroe");
        petQuote.setStreetAddress("100 ohn street");
        petQuote.setApartment("10 D");
        petQuote.setZipcode("10012");
        scrollToView(petQuote.city);
        petQuote.setCity("manhattan");
        petQuote.setContinueForQuote();
        Assert.assertEquals(driver.getTitle(),"Get A Pet Insurance Quote - Pet Insurance - State Farm");

    }


    @Test
    public void catInsuranceTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        PetInsurance petInsurance = new PetInsurance(driver);
        CatInsurance catInsurance = new CatInsurance(driver);
        WhyCatInsurance whyCatInsurance = new WhyCatInsurance(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubtitle_petMedical();
        Assert.assertEquals(driver.getTitle(),"Pet Insurance – Get a free cat or dog insurance quote - State Farm®");
        scrollToView(petInsurance.catInsurance);
        petInsurance.setCatInsurance();
        Assert.assertEquals(driver.getTitle(),"Cat Insurance – Get a free cat insurance quote - State Farm®");
        scrollToView(catInsurance.whyCatInsurance);
        waitSeconds(2);
        catInsurance.setWhyCatInsurance();
        Assert.assertEquals(driver.getTitle(),"Why Your Cat Needs Health Insurance - State Farm®");
        whyCatInsurance.setKittensHealth();

    }

    @Test
    public void suretyTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        SuretyBonds suretyBonds = new SuretyBonds(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubtitle_suretyBonds();
        Assert.assertEquals(driver.getTitle(),"Surety Bonds and Fidelity Bonds – State Farm®");
        scrollToView(suretyBonds.licenceAndPermitBonds);
        waitSeconds(2);
        suretyBonds.setLicenceAndPermitBonds();
        suretyBonds.setPublicOfficialBonds();
        suretyBonds.setProbateBonds();
        suretyBonds.setOtherTypeBonds();
        suretyBonds.setContactBonds();

    }

    @Test
    public void motorHomeTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        RVInsurance rvInsurance = new RVInsurance(driver);
        TravelAndCamping travelAndCamping = new TravelAndCamping(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubtitle_motorHome();
        Assert.assertEquals(driver.getTitle(),"RV Insurance – Get a quote and compare coverage - State Farm®");
        scrollToView(rvInsurance.campingTrailer);
        rvInsurance.setCampingTrailer();
        Assert.assertEquals(driver.getTitle(),"Travel and Camping Trailer Insurance Quote - State Farm®");
        scrollToView(travelAndCamping.beforeBuyingRV);
        waitSeconds(2);
        travelAndCamping.setBeforeBuyingRV();
        wait.until(ExpectedConditions.elementToBeClickable(travelAndCamping.beforeBuyingRV));
        Assert.assertEquals(driver.getTitle(),"What to Know Before Buying an RV - State Farm®");

    }

    @Test
    public void motorcycleTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Insurance insurance = new Insurance(driver);
        MotorcycleInsurance motorcycleInsurance = new MotorcycleInsurance(driver);
        MotorcycleRatingPage motorcycleRatingPage = new MotorcycleRatingPage(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_Motorcycle();
        Assert.assertEquals(driver.getTitle(),"Motorcycle Insurance - State Farm®");
        scrollToView(motorcycleInsurance.ratingTool);
        motorcycleInsurance.setRatingTool();
        Assert.assertEquals(driver.getTitle(),"Motorcycle Insurance Ratings - State Farm®");
        motorcycleRatingPage.setMake("BMW");
        motorcycleRatingPage.setModel("C650GT");
        motorcycleRatingPage.setType(" BodyStyle ");
        motorcycleRatingPage.setSubmitButton();

    }

    @Test
    public void emergencyRoadTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Insurance insurance = new Insurance(driver);
        CarInsurance carInsurance = new CarInsurance(driver);
        CoverageType coverageType = new CoverageType(driver);
        BenefitsOfEmergency benefitsOfEmergency = new BenefitsOfEmergency(driver);
        EmergencyRoadSide emergencyRoadSide = new EmergencyRoadSide(driver);


        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_CarInsurance();
        Assert.assertEquals(driver.getTitle(),"Free Car Insurance Quote - Save on Auto Insurance - State Farm®");
        carInsurance.setCoverageOptions();
        Assert.assertEquals(driver.getTitle(),"Car Insurance Coverage Types - State Farm®");
        scrollToView(coverageType.emergencyRoadService);
        waitSeconds(2);
        coverageType.setEmergencyRoadService();
        waitSeconds(2);
        Assert.assertEquals(driver.getTitle(),"The Benefits of Emergency Road Service Coverage - State Farm®");
        benefitsOfEmergency.setRequestHelp();
        Assert.assertEquals(driver.getTitle(),"Emergency Roadside Service");
        emergencyRoadSide.setStartRequest();
        Assert.assertEquals(driver.getTitle(),"Emergency Roadside Service");
        emergencyRoadSide.setUserId("john");
        emergencyRoadSide.setPassword("123sfaff");
        emergencyRoadSide.setLoginButton();
        Assert.assertEquals(driver.getTitle(),"Log In");

    }

    @Test
    public void boatInsuranceTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Insurance insurance = new Insurance(driver);
        BoatInsurance boatInsurance = new BoatInsurance(driver);
        BoatSafety boatSafety = new BoatSafety(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_Boat();
        Assert.assertEquals(driver.getTitle(),"Boat Insurance - State Farm®");
        scrollToView(boatInsurance.stayingSafeInWater);
        boatInsurance.setStayingSafeInWater();
        wait.until(ExpectedConditions.elementToBeClickable(boatInsurance.stayingSafeInWater));
        Assert.assertEquals(driver.getTitle(),"Boat Safety - State Farm®");
        boatSafety.setBoatSeaworthy();
        Assert.assertEquals(driver.getTitle(),"Essential Spring Boat Maintenance Tips - State Farm®");

    }

    @Test
    public void personalArticleTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Insurance insurance = new Insurance(driver);
        PesonalArticle pesonalArticle = new PesonalArticle(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);

        insurance.setInsuranceHeaderInHomePage();
        insurance.setInsuranceSubTitle_PersonalArticle();
        Assert.assertEquals(driver.getTitle(),"Personal Articles Policy - State Farm®");
        scrollToView(pesonalArticle.talkToAnAgent);
        pesonalArticle.setTalkToAnAgent();
        Assert.assertEquals(driver.getTitle(),"Find State Farm® Agents Near You - State Farm®");
        agentNearBy.setZipcodeToFindAgent("11214");
        Assert.assertEquals(driver.getTitle(),"Find State Farm® Agents Near You - State Farm®");


    }


}
