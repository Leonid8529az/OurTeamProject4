package Team4Pro;


import Team4Pro.homePage.Banking;
import Team4Pro.bankingPages.*;
import base.OurAPI;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingTest extends OurAPI {


    @Test
    public void checkingTest(){
        Banking banking = new Banking(driver);
        BankingMadeSimpleUSBank bankingMadeSimpleUSBank = new BankingMadeSimpleUSBank(driver);
        OnlineCheckingPage onlineCheckingPage = new OnlineCheckingPage(driver);
        WelcomeAllianceBank welcomeAllianceBank = new WelcomeAllianceBank(driver);
        OnlineCheckingWithUSBank onlineCheckingWithUSBank = new OnlineCheckingWithUSBank(driver);



        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_CheckingAccount();
        Assert.assertEquals(onlineCheckingPage.getTitle(),"Open an Online Checking Account that Fits Your Needs");
        waitSeconds(3);
        scrollToView(onlineCheckingPage.learnAboutEasyChecking);
        onlineCheckingPage.setLearnAboutEasyChecking();
        onlineCheckingPage.setContinueButton();
        switchToDifferentTab();
        waitSeconds(2);
        Assert.assertEquals(bankingMadeSimpleUSBank.getTitle(),"Banking Made Simple | Easy Checking | State Farm & U.S. Bank");
        waitSeconds(2);
        bankingMadeSimpleUSBank.setApplyNowForBasicChecking();
        Assert.assertEquals(welcomeAllianceBank.getTitle(),"Welcome!");
        waitSeconds(2);
        welcomeAllianceBank.setContinueAsGuest();
        Assert.assertEquals(onlineCheckingWithUSBank.getTitle(),"Open a checking account | State Farm & U.S. Bank");
        waitSeconds(3);
        onlineCheckingWithUSBank.setFirstNameField("john");
        onlineCheckingWithUSBank.setLastNameField("preu");
        onlineCheckingWithUSBank.setSuffix("Sr");
        onlineCheckingWithUSBank.setEmailField("john12@gmail.com");
        onlineCheckingWithUSBank.setPhoneNumberField("64614351627");
        onlineCheckingWithUSBank.setPromoCode("21355332");
        scrollToView(onlineCheckingWithUSBank.saveAndContinue);
        waitSeconds(2);
        onlineCheckingWithUSBank.setSaveAndContinue();


    }




    @Test
    public void savingTest(){

        Banking banking = new Banking(driver);
        TypesOfSavings typesOfSavings = new TypesOfSavings(driver);
        CompareSavingAccounts compareSavingAccounts = new CompareSavingAccounts(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_savingAccount();
        typesOfSavings.setCompareSavingAccounts();
        Assert.assertEquals(typesOfSavings.getTitle(),"Types of Savings Accounts - State Farm®");
        typesOfSavings.setContinueButton();
        switchToDifferentTab();
        Assert.assertEquals(compareSavingAccounts.getTitle(),"Compare savings accounts | Save with confidence | State Farm & U.S. Bank");
        waitSeconds(2);
        compareSavingAccounts.setApplyNowForSaving();
        Assert.assertEquals(typesOfSavings.getTitle(),"Welcome!");


    }


    @Test
    public void homeLoan(){
        Banking banking = new Banking(driver);
        LoanHome loanHome = new LoanHome(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubtitle_homeLoan();
        Assert.assertEquals(loanHome.getTitle(),"Welcome to a simple and seamless home loan experience");
        scrollToView(loanHome.zipCodeForHomeLoan);
        loanHome.setZipCodeForHomeLoan("11214");
        scrollToView(agentNearBy.sammyMartinezWebsite);
        Assert.assertEquals(agentNearBy.getTitle(),"Find State Farm® Agents Near You - State Farm®");
        agentNearBy.setGetSammyMartinezEmail();



    }

    @Test
    public void creditCards(){
        Banking banking = new Banking(driver);
        CreditCards creditCards = new CreditCards(driver);
        ContinueButton continueButton = new ContinueButton(driver);
        CashRewardVisa cashRewardVisa = new CashRewardVisa(driver);
        WelcomeAllianceBank welcomeAllianceBank = new WelcomeAllianceBank(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_creditCards();
        Assert.assertEquals(creditCards.getTitle(),"Visa Credit Cards from U.S. Bank® – State Farm®");
        scrollToView(creditCards.learnMoreAboutCashRewardVisa);
        creditCards.setLearnMoreAboutCashRewardVisa();
        continueButton.setContinueButton();
        switchToDifferentTab();
        Assert.assertEquals(cashRewardVisa.getTitle(),"Credit cards | Get the credit you deserve | State Farm and U.S. Bank");
        cashRewardVisa.setApplyForCashRewardVisa();
        welcomeAllianceBank.setContinueAsGuest();
        Assert.assertEquals(welcomeAllianceBank.getTitle(),"U.S. Bank Credit Cards");



    }

    @Test

    public void cds(){
        OnlineCheckingPage onlineCheckingPage = new OnlineCheckingPage(driver);
        Banking banking = new Banking(driver);
        WelcomeAllianceBank welcomeAllianceBank = new WelcomeAllianceBank(driver);
        CDsPage cDsPage = new CDsPage(driver);
        MaximizeSavingsRetirement maximizeSavingsRetirement = new MaximizeSavingsRetirement(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_CDs();
        waitSeconds(2);
        scrollToView(cDsPage.learnMoreBoutRetirementCDS);
        cDsPage.setLearnMoreBoutRetirementCDS();
        Assert.assertEquals(cDsPage.getTitle(),"Certificate of Deposit (CD) Accounts, Retirement CDs & Rates – State Farm®");
        waitSeconds(2);
        cDsPage.setContinueButtonForCds();
        switchToDifferentTab();
        Assert.assertEquals(maximizeSavingsRetirement.getTitle(),"Maximize Your Savings | Retirement CD | State Farm & U.S. Bank");
        maximizeSavingsRetirement.setStartSavingWithCDS();
        welcomeAllianceBank.setContinueAsGuest();


    }


    @Test
    public void paymentSolution(){
        Banking banking = new Banking(driver);
        BusinessPayment businessPayment = new BusinessPayment(driver);
        WelcomeAllianceBank welcomeAllianceBank = new WelcomeAllianceBank(driver);
        TalechPods talechPods = new TalechPods(driver);
        OnlineCheckingWithUSBank onlineCheckingWithUSBank = new OnlineCheckingWithUSBank(driver);
        TalechAccount talechAccount = new TalechAccount(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_paymentSolution();
        waitSeconds(2);
        scrollToView(businessPayment.findPaymentSolution);
        businessPayment.setFindPaymentSolution();
        Assert.assertEquals(businessPayment.getTitle(),"Welcome!");
        welcomeAllianceBank.setContinueAsGuest();
        Assert.assertEquals(welcomeAllianceBank.getTitle(),"talech POS");
        scrollToView(talechPods.overThePhone);
        waitSeconds(2);
        talechPods.setOverThePhone();
        Assert.assertEquals(onlineCheckingWithUSBank.getTitle(),"talech POS");
        onlineCheckingWithUSBank.setSaveAndContinue();
        scrollToView(talechAccount.continueForTalechAccount);
        waitSeconds(2);
        talechAccount.setContinueForTalechAccount();
        Assert.assertEquals(talechAccount.getTitle(),"Mobile | Open a Talech account | Talech");


    }


    @Test
    public void loanAndCredit(){
        Banking banking = new Banking(driver);
        BusinessLoan businessLoan = new BusinessLoan(driver);
        WelcomeAllianceBank welcomeAllianceBank = new WelcomeAllianceBank(driver);
        BeforeStartLoan beforeStartLoan = new BeforeStartLoan(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_LoansAndLinesOfCredit();
        waitSeconds(2);
        scrollToView(businessLoan.applyForEquipmentLoan);
        businessLoan.setApplyForEquipmentLoan();
        Assert.assertEquals(businessLoan.getTitle(),"Welcome!");
        welcomeAllianceBank.setContinueAsGuest();
        waitSeconds(2);
        Assert.assertEquals(welcomeAllianceBank.getTitle(),"Before we start | Open a business lending account | U.S. Bank");
        waitSeconds(2);
        beforeStartLoan.setGetStartedForLoan();
        Assert.assertEquals(beforeStartLoan.getTitle(),"Before we start | Open a business lending account | U.S. Bank");


    }

    @Test
    public void moneyMarket(){

        Banking banking = new Banking(driver);
        MoneyMarketPage moneyMarketPage = new MoneyMarketPage(driver);
        WelcomeAllianceBank welcomeAllianceBank = new WelcomeAllianceBank(driver);
        BeforeStartLoan beforeStartLoan = new BeforeStartLoan(driver);
        BusinessAccount businessAccount = new BusinessAccount(driver);



        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_MoneyMarket();
        waitSeconds(2);
        scrollToView(moneyMarketPage.applyForPlatinumBusinessPackage);
        moneyMarketPage.setApplyForPlatinumBusinessPackage();
        Assert.assertEquals(welcomeAllianceBank.getTitle(),"Welcome!");
        welcomeAllianceBank.setContinueAsGuest();
        Assert.assertEquals(beforeStartLoan.getTitle(),"Before we start | Open a business account | U.S. Bank");
        waitSeconds(2);
        beforeStartLoan.setGetStartedForLoan();
        businessAccount.setFirsNameForBusinessAccount("john");
        businessAccount.setLastNameForBusinessAccount("preu");
        businessAccount.setPhoneNumberForBusinessAccount("6461321524");
        businessAccount.setEmailForBusinessAccount("john-preu@gmail.com");
        businessAccount.setAltEmailForBusinessAccount("josh123@gmail.com");
        scrollToView(businessAccount.saveAndContinueForBusinessAccount);
        Assert.assertEquals(businessAccount.getTitle(),"Open a business account | U.S. Bank");
        businessAccount.setSaveAndContinueForBusinessAccount();

    }

    @Test
    public void cdsSpecial(){
        Banking banking = new Banking(driver);
        CDsPage cDsPage = new CDsPage(driver);
        CdsSpecial cdsSpecial = new CdsSpecial(driver);


        banking.setBankingHeaderInHomePage();
        banking.setBankingSubTitle_CDs();
        waitSeconds(2);
        Assert.assertEquals(cDsPage.getTitle(),"Certificate of Deposit (CD) Accounts, Retirement CDs & Rates – State Farm®");
        scrollToView(cDsPage.learMoreAboutTradeUp);
        cDsPage.setLearMoreAboutTradeUp();
        cDsPage.setContinueButtonForCds();


    }

    @Test
    public void homeLoans(){
        Banking banking = new Banking(driver);
        LoanHome loanHome = new LoanHome(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);


        banking.setBankingHeaderInHomePage();
        Assert.assertEquals(banking.getTitle(),"State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        banking.setBankingSubtitle_homeLoan();
        Assert.assertEquals(loanHome.getTitle(),"Welcome to a simple and seamless home loan experience");
        scrollToView(loanHome.zipCodeForHomeLoan);
        loanHome.setZipCodeForHomeLoan("11214");
        scrollToView(agentNearBy.sammyMartinezWebsite);
        Assert.assertEquals(agentNearBy.getTitle(),"Find State Farm® Agents Near You - State Farm®");
        agentNearBy.setGetSammyMartinezEmail();


    }

}
