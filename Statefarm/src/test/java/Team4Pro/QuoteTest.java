package Team4Pro;

import Team4Pro.homePage.Quotes;
import Team4Pro.insurancePages.LifeQuote;
import Team4Pro.investmentPages.PersonalInfo;
import Team4Pro.quotePages.*;
import base.OurAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuoteTest extends OurAPI {

    @Test
    public void homeOwnerQuote(){
        Quotes quotes = new Quotes(driver);
        HomeOwnersQuote homeOwnersQuote = new HomeOwnersQuote(driver);

        quotes.setGetAQuoteInHomePage();
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setSelectProductForQuote("Homeowners");
        quotes.setZipCodeForQuote("11214");
        quotes.setStartQuoteButton();
        homeOwnersQuote.setFirstNameForHomeQuote("john");
        homeOwnersQuote.setLastNameForHomeQuote("preu");
        homeOwnersQuote.setSuffixForHomeQuote("SR");
        homeOwnersQuote.setAddressForHomeQuote("100 john street");
        homeOwnersQuote.setCityForHomeQuote("manhattan");
        homeOwnersQuote.setZipCodeForHomeQuote("10013");
        homeOwnersQuote.setDateOfBirthForHomeQuote("12/11/1980");
        scrollToView(homeOwnersQuote.sameAsAboveForHomeQuote);
        homeOwnersQuote.setSameAsAboveForHomeQuote();
        scrollToView(homeOwnersQuote.continueForHomeQuote);
        Assert.assertEquals(homeOwnersQuote.getTitle(),"Welcome Homeowners State Farm");
        homeOwnersQuote.setContinueForHomeQuote();
    }

    @Test
    public void condoOwnerTest(){
        Quotes quotes = new Quotes(driver);
        CondoQuote condoQuote = new CondoQuote(driver);


        quotes.setGetAQuoteInHomePage();
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setSelectProductForQuote("Condo Owners");
        quotes.setZipCodeForQuote("11214");
        quotes.setStartQuoteButton();
        condoQuote.setFirstNameForCondoQuote("jack");
        Assert.assertEquals(condoQuote.getTitle(),"Welcome - Condo Unitowners Quote - State Farm");
        condoQuote.setLastNameForCondoQuote("freud");
        condoQuote.setSuffixForCondoQuote("SR");
        condoQuote.setAddressForCondoQuote("100 john street");
        condoQuote.setCityForCondoQuote("manhattan");
        condoQuote.setZipCodeForCondoQuote("10013");
        condoQuote.setMonthOfBirthForCondoQuote("12");
        condoQuote.setDayOfBirthForCondoQuote("12");
        condoQuote.setYearOfBirthForCondoQuote("1980");
        scrollToView(condoQuote.continueButtonForCondoQuote);
        condoQuote.setContinueButtonForCondoQuote();
        Assert.assertEquals(condoQuote.getTitle(),"Welcome - Condo Unitowners Quote - State Farm");

    }

    @Test
    public void renterQuote(){
        Quotes quotes = new Quotes(driver);
        FireUIRenters fireUIRenters = new FireUIRenters(driver);

        quotes.setGetAQuoteInHomePage();
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setSelectProductForQuote("Renters");
        quotes.setZipCodeForQuote("11214");
        quotes.setStartQuoteButton();
        fireUIRenters.setAddressForRenterQuote("100 john street");
        waitSeconds(3);
        fireUIRenters.setCityForRenterQuote("manhattan");
        waitSeconds(3);
        fireUIRenters.setStateForRenterQuote("NY");
        waitSeconds(3);
        fireUIRenters.setZipCodeForRenterQuote("10013");
        waitSeconds(3);
        fireUIRenters.setContinueButtonForRenterQuote();
        Assert.assertEquals(fireUIRenters.getTitle(),"Fire UI Renters");

    }

    @Test
    public void hospitalIncomeTest(){
        Quotes quotes = new Quotes(driver);
        PolicyAndPersonalInfo policyAndPersonalInfo = new PolicyAndPersonalInfo(driver);

        quotes.setGetAQuoteInHomePage();
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setSelectProductForQuote("Hospital Income");
        quotes.setStateForQuote("NY");
        quotes.setStartQuoteButton();
        policyAndPersonalInfo.setAgeVerification("12-12-1980");
        Assert.assertEquals(policyAndPersonalInfo.getTitle(),"Policy and Personal Information - Health Rate Quote - State Farm");
        policyAndPersonalInfo.setContinueForAge();
        policyAndPersonalInfo.setGenderForHospitalIncome();
        policyAndPersonalInfo.setDateOfBirthForHospitalIncome("12-12-1980");
        policyAndPersonalInfo.setSpouseInfo();
        scrollToView(policyAndPersonalInfo.childrenInfo);
        policyAndPersonalInfo.setChildrenInfo();
        policyAndPersonalInfo.setCounty("Kings");
        scrollToView(policyAndPersonalInfo.continueButtonForHospital);
        policyAndPersonalInfo.setContinueButtonForHospital();
        Assert.assertEquals(policyAndPersonalInfo.getTitle(),"Quote - Health Rate Quote - State Farm");

    }

    @Test
    public void petQuote(){
        Quotes quotes = new Quotes(driver);
        PetInsuranceQuote petInsuranceQuote = new PetInsuranceQuote(driver);


        quotes.setGetAQuoteInHomePage();
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setSelectProductForQuote("Pet Insurance");
        quotes.setZipCodeForQuote("10013");
        quotes.setStartQuoteButton();
        petInsuranceQuote.setFirstNameForPetQuote("jack");
        Assert.assertEquals(petInsuranceQuote.getTitle(),"Get A Pet Insurance Quote - Pet Insurance - State Farm");
        petInsuranceQuote.setLastNameForPetQuote("monroe");
        petInsuranceQuote.setAddressForPetQuote("100 john street");
        petInsuranceQuote.setZipCodeForPetQuote("10013");
        petInsuranceQuote.setCityForPetQuote("manhattan");
        scrollToView(petInsuranceQuote.continueButtonForPetQuote);
        petInsuranceQuote.setContinueButtonForPetQuote();
        Assert.assertEquals(petInsuranceQuote.getTitle(),"Get A Pet Insurance Quote - Pet Insurance - State Farm");

    }

    @Test
    public void lifeQuote(){
        Quotes quotes = new Quotes(driver);
        LifeQuote lifeQuote = new LifeQuote(driver);

        quotes.setGetAQuoteInHomePage();
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setSelectProductForQuote("Life");
        quotes.setStateForQuote("NY");
        quotes.setStartQuoteButton();
        lifeQuote.setYesForTermLifeQuote();
        Assert.assertEquals(lifeQuote.getTitle(),"Life Quote - State Farm");
        lifeQuote.setDateOfBirthForLifeQuote("12-11-1983");
        lifeQuote.setContinueForBirthDayLifeQuote();
        lifeQuote.setGenderForTermLife();
        lifeQuote.setTobaccoForTermLife();
        lifeQuote.setMonthForLstTobacco("May");
        lifeQuote.setLastYearForTobacco("2020");
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
    public void autoQuote(){
        Quotes quotes = new Quotes(driver);
        AutoQuote autoQuote = new AutoQuote(driver);
        Assert.assertEquals(quotes.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        quotes.setGetAQuoteInHomePage();
        quotes.setSelectProductForQuote("Auto");
        quotes.setZipCodeForQuote("10012");
        quotes.setStartQuoteButton();
        autoQuote.setFirstNameForAutoQuote("john");
        Assert.assertEquals(autoQuote.getTitle(),"Welcome - Auto Quote - State Farm");
        autoQuote.setLastNameForAutoQuote("monroe");
        autoQuote.setAddressForAutoQuote("100 john street");
        autoQuote.setDateOfBirthForAutoQuote("12/11/1982");
        waitSeconds(3);
        autoQuote.setSuffixForAutoQuote("Sr");
        waitSeconds(3);
        autoQuote.setCityForAutoQuote("manhattan");
        autoQuote.setZipCodeForAutoQuote("10012");
        autoQuote.setNextForAutoQuote();
        Assert.assertEquals(autoQuote.getTitle(),"Welcome - Auto Quote - State Farm");

    }

}
