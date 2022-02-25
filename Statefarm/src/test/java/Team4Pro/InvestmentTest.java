package Team4Pro;

import Team4Pro.bankingPages.AgentNearBy;
import Team4Pro.homePage.Investment;
import Team4Pro.insurancePages.LifeInsurance;
import Team4Pro.investmentPages.*;
import base.OurAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        waitSeconds(2);
        Assert.assertEquals(forgotUserName.getTitle(),"Forgot UserId / Password");
        waitSeconds(2);
        forgotUserName.setPhoneNumberToFindAccount("6463521652");
        waitSeconds(4);
        forgotUserName.setDateOfBirthToFindAccount("12-11-1980");
        waitSeconds(4);
        forgotUserName.setEmailToFindAccount("john@gmail.com");
        waitSeconds(3);
        forgotUserName.setPreferTextToFindAccount();
        waitSeconds(4);
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




}
