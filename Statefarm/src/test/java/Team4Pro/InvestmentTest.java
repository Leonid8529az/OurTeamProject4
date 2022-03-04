package Team4Pro;

import Team4Pro.bankingPages.AgentNearBy;
import Team4Pro.homePage.DifferentArticles;
import Team4Pro.homePage.Investment;
import Team4Pro.insurancePages.LifeInsurance;
import Team4Pro.investmentPages.*;
import base.OurAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class InvestmentTest extends OurAPI {


    @Test
    public void retirementPlan(){

        Investment investment = new Investment(driver);
        RetirementPlan retirementPlan = new RetirementPlan(driver);
        PrepareForRetirement prepareForRetirement = new PrepareForRetirement(driver);
        PersonalInfo personalInfo = new PersonalInfo(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_retirementPlan();
        retirementPlan.setOptimizeYourAssets();
        Assert.assertEquals(retirementPlan.getTitle(),"Prepare for Retirement - State Farm®");
        scrollToView(prepareForRetirement.calculateMyRetirement);
        prepareForRetirement.setCalculateMyRetirement();
        waitSeconds(2);
        Assert.assertEquals(prepareForRetirement.getTitle(),"Personal Information - Profile - MyBlocks by Envestnet MoneyGuide");
        waitSeconds(2);
        personalInfo.setFirstNameForRetirement("john");
        personalInfo.setGenderForRetirement("Male");
        personalInfo.setDateOfBirthForRetirement("12/1980");
        personalInfo.setEmploymentForRetirement("Employed");
        personalInfo.setMaritalStatusForRetirement("Single");
        personalInfo.setStateForRetirement("New York");
        personalInfo.setContinueForRetirement();
        Assert.assertEquals(personalInfo.getTitle(),"Personal Information - Profile - MyBlocks by Envestnet MoneyGuide");

    }

    @Test
    public void rothIRATest(){
        Investment investment = new Investment(driver);
        RothIRA rothIRA = new RothIRA(driver);
        TraditionalVSRoth traditionalVSRoth = new TraditionalVSRoth(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_RothIRA();
        rothIRA.setComparingRothIRAs();
        Assert.assertEquals(rothIRA.getTitle(),"Traditional vs Roth IRA Calculator");
        traditionalVSRoth.setRetirementAge("65");
        traditionalVSRoth.setRetirementContribution("1000");
        traditionalVSRoth.setRetirementYearOfContribution("30");
        traditionalVSRoth.setRetirementAssumedRate("5%");
        traditionalVSRoth.setRetirementCurrentTax("10%");
        traditionalVSRoth.setTaxAtRetirement("10%");
        scrollToView(traditionalVSRoth.calculateToCompareRetirement);
        traditionalVSRoth.setCalculateToCompareRetirement();
        Assert.assertEquals(traditionalVSRoth.getTitle(),"Page Not Found");

    }

    @Test
    public void businessRetirementTest(){
        Investment investment = new Investment(driver);
        SmallBusinessRetirement smallBusinessRetirement = new SmallBusinessRetirement(driver);
        SimplifiedEmployee simplifiedEmployee = new SimplifiedEmployee(driver);
        ArticleForSmallBusiness articleForSmallBusiness = new ArticleForSmallBusiness(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_BusinessRetirement();
        Assert.assertEquals(investment.getTitle(),"Small Business Retirement Plans - State Farm®");
        smallBusinessRetirement.setBusinessWithEmployee();
        smallBusinessRetirement.setLearMoreAboutSepIRA();
        scrollToView(simplifiedEmployee.owningSmallBusiness);
        simplifiedEmployee.setOwningSmallBusiness();
        Assert.assertEquals(simplifiedEmployee.getTitle(),"Articles to Help With Your Small Business Needs - State Farm®");
        scrollToView(articleForSmallBusiness.viewBusinessTips);
        articleForSmallBusiness.setViewBusinessTips();
        Assert.assertEquals(articleForSmallBusiness.getTitle(),"Small Business Financial Tips - State Farm®");

    }

    @Test
    public void selectingFundTest(){
        Investment investment = new Investment(driver);
        EstimateYourInvestment estimateYourInvestment = new EstimateYourInvestment(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_SelectingAFund();
        scrollToView(estimateYourInvestment.contactAgentForInvestment);
        estimateYourInvestment.setContactAgentForInvestment();
        agentNearBy.setZipcodeToFindAgent("11214");
        scrollToView(agentNearBy.getSammyMartinezEmail);
        agentNearBy.setGetSammyMartinezEmail();
        switchToDifferentWindow();
        agentNearBy.setNameFieldToEmailAgent("john");
        agentNearBy.setEmailFieldToEmailAgent("john100@gmail.com");
        agentNearBy.setTextToEmail("fgdcbqjfqergqevbgtgsd");
        scrollToView(agentNearBy.sendEmailToAgent);
        agentNearBy.setSendEmailToAgent();
        Assert.assertEquals(agentNearBy.getTitle(),"Email Agent");



    }

    @Test
    public void blackRockTest(){
        Investment investment = new Investment(driver);
        AmericanFunds americanFunds = new AmericanFunds(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_AmericanFunds();
        americanFunds.setAmcapFunds();
        Assert.assertEquals(americanFunds.getTitle(),"American Funds Mutual Funds - State Farm®");

    }

    @Test
    public void savingPlanTest(){
        Investment investment = new Investment(driver);
        SavingPlan savingPlan = new SavingPlan(driver);

        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_SavingPlan();
        Assert.assertEquals(savingPlan.getTitle(),"529 Savings Plan - State Farm®");
        savingPlan.setAccessSavingPlan();
        switchToDifferentTab();
        savingPlan.setUserNameForSavingPlan("john");
        savingPlan.setPasswordForSavingPlan("abcdewr12");
        scrollToView(savingPlan.loginForSavingPlan);
        waitSeconds(3);
        savingPlan.setLoginForSavingPlan();
        Assert.assertEquals(savingPlan.getTitle(),"State Farm 529 Savings Plan");
        waitSeconds(1);


    }

    @Test
    public void jointAccountTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Investment investment = new Investment(driver);
        JointTenancy jointTenancy = new JointTenancy(driver);
        MutualFunds mutualFunds = new MutualFunds(driver);
        ForgotUserName forgotUserName = new ForgotUserName(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_JointAccount();
        Assert.assertEquals(jointTenancy.getTitle(),"Joint Tenancy - State Farm®");
        scrollToView(jointTenancy.mutualFunds);
        jointTenancy.setMutualFunds();
        scrollToView(mutualFunds.troubleLogging);
        mutualFunds.setTroubleLogging();
        wait.until(ExpectedConditions.titleIs("Forgot UserId / Password"));
        Assert.assertEquals(forgotUserName.getTitle(),"Forgot UserId / Password");
        wait.until(ExpectedConditions.visibilityOf(forgotUserName.phoneNumberToFindAccount));
        forgotUserName.setPhoneNumberToFindAccount("6463521652");
        wait.until(ExpectedConditions.visibilityOf(forgotUserName.dateOfBirthToFindAccount));
        forgotUserName.setDateOfBirthToFindAccount("12-11-1980");
        wait.until(ExpectedConditions.visibilityOf(forgotUserName.emailToFindAccount));
        forgotUserName.setEmailToFindAccount("john@gmail.com");
        waitSeconds(3);
        forgotUserName.setPreferTextToFindAccount();
        waitSeconds(4);
        wait.until(ExpectedConditions.visibilityOf(forgotUserName.submitToFindAccount));
        forgotUserName.setSubmitToFindAccount();
        Assert.assertEquals(forgotUserName.getTitle(),"Forgot UserId / Password");


    }
    @Test
    public void federalTaxTest(){
        Investment investment = new Investment(driver);
        FederalEstate federalEstate = new FederalEstate(driver);
        EstatePlanningTool estatePlanningTool = new EstatePlanningTool(driver);

        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_FederalEstate();
        federalEstate.setEstatePlanningTool();
        Assert.assertEquals(federalEstate.getTitle(),"Estate Planning Tools - State Farm®");
        scrollToView(estatePlanningTool.testamentaryTrust);
        estatePlanningTool.setTestamentaryTrust();
        Assert.assertEquals(estatePlanningTool.getTitle(),"Testamentary Trusts - State Farm®");

    }

    @Test
    public void changeAnnuitiesTest(){
        Investment investment = new Investment(driver);
        NeedToMakeChange needToMakeChange = new NeedToMakeChange(driver);
        LifeInsurance lifeInsurance = new LifeInsurance(driver);


        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_ChangeAnnuity();
        Assert.assertEquals(needToMakeChange.getTitle(),"Need to Make a Change to an Existing Annuity - State Farm®");
        needToMakeChange.setLifeInsurance();
        lifeInsurance.setStateForTermLifeInsurance("NY");
        lifeInsurance.setGoForLifeInsurance();
        Assert.assertEquals(lifeInsurance.getTitle(),"Life Insurance - State Farm®");

    }

    @Test
    public void savingForCollegeTest(){
        Investment investment = new Investment(driver);
        SavingPlan savingPlan = new SavingPlan(driver);
        CollegeSavingCalculator collegeSavingCalculator = new CollegeSavingCalculator(driver);

        investment.setInvestmentHeaderInHomePage();
        Assert.assertEquals(investment.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        investment.setInvestmentSubTitle_SavingForCollege();
        Assert.assertEquals(savingPlan.getTitle(),"529 Savings Plan - State Farm®");
        scrollToView(savingPlan.savingCalculator);
        savingPlan.setSavingCalculator();
        Assert.assertEquals(savingPlan.getTitle(),"College Savings Calculator - State Farm®");
        collegeSavingCalculator.setChildName("jack");
        collegeSavingCalculator.setChildSchool("harvard");
        collegeSavingCalculator.setYearsUntilCollege("9");
        collegeSavingCalculator.setYearsAttendingCollege("4");
        collegeSavingCalculator.setCurrentCost("30000");
        collegeSavingCalculator.setCostIncrease("3");
        collegeSavingCalculator.setAmountSaved("30000");
        collegeSavingCalculator.setInterestGrowth("4");
        collegeSavingCalculator.setCalculateSaving();
        Assert.assertEquals(collegeSavingCalculator.getTitle(),"College Savings Calculator - State Farm®");

    }

    @Test
    public void americanFundTest(){
        Investment investment = new Investment(driver);
        AmericanFunds americanFunds = new AmericanFunds(driver);

        investment.setInvestmentHeaderInHomePage();
        investment.setInvestmentSubTitle_AmericanFunds();
        Assert.assertEquals(driver.getTitle(),"American Funds Mutual Funds - State Farm®");
        americanFunds.setMoneyMarketFund();
        scrollToView(americanFunds.theBondFundOfAmerica);
        americanFunds.setTheBondFundOfAmerica();
        Assert.assertEquals(driver.getTitle(),"American Funds Mutual Funds - State Farm®");

    }

    @Test
    public void businessToBusinessTest(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        DifferentArticles differentArticles = new DifferentArticles(driver);
        B2BPortal b2BPortal = new B2BPortal(driver);
        WelcomeB2B welcomeB2B = new WelcomeB2B(driver);

        scrollToView(differentArticles.businessToBusiness);
        differentArticles.setBusinessToBusiness();
        wait.until(ExpectedConditions.titleIs("B2B Portal | Home - State Farm®"));
        Assert.assertEquals(driver.getTitle(),"B2B Portal | Home - State Farm®");
        b2BPortal.setRegister();
        Assert.assertEquals(driver.getTitle(),"Welcome - B2B ®");
        welcomeB2B.setBusinessType("Engineering Firms");
        welcomeB2B.setReasonForContact("B2B Registration");
        welcomeB2B.setFirstName("john");
        welcomeB2B.setLastName("monroe");
        welcomeB2B.setEmailAddress("john@gmail.com");
        welcomeB2B.setPhoneNumber("646-123-3419");
        welcomeB2B.setTaxId("16648207684i");
        welcomeB2B.setNPIId("558h23481gdx324");
        welcomeB2B.setCompanyName("AAA");
        welcomeB2B.setCompanyWeb("www.AAA.us");
        welcomeB2B.setFaxNumber("646-141-1642");
        welcomeB2B.setNameOfRepresentative("marina");
        welcomeB2B.setNoForStateFarm();
        Assert.assertTrue(welcomeB2B.noForStateFarm.isEnabled());
        scrollToView(welcomeB2B.NPIId);
        welcomeB2B.setCountry("United States");
        welcomeB2B.setCity("manhattan");
        welcomeB2B.setState("New York");
        welcomeB2B.setZipcode("10012");
        welcomeB2B.setFullMailing("100 john street");
        welcomeB2B.setComment("tired");
        welcomeB2B.setSubmitButton();
        Assert.assertEquals(driver.getTitle(),"Welcome - B2B ®");

    }




}
