package Team4Pro;


import base.OurAPI;
import jdk.internal.org.objectweb.asm.util.ASMifiable;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest extends OurAPI {
    HomePage homePage;
    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void findAnAgent() {
        click(homePage.FindAgentHomePage);
        enterText(homePage.FindAgentZipCode, "11214");
        click(homePage.SamiMartinezEmail);
        switchToDifferentTab();
        String expectedTitle = "Sammy Martinez - State Farm Insurance Agent in Brooklyn, NY";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        selectDropDownOption(homePage.SelectFromDropdownQuote, "Homeowners");
        enterText(homePage.QuoteZipCode, "11214");
        click(homePage.QuoteEnter);


    }
        @Test
    public void insurance() throws InterruptedException {
        click(homePage.InsuranceInHomePage);
        click(homePage.CarInsurnce);
        scrollToView(homePage.SportCar);
        waitSeconds(1);
        click(homePage.SportCar);
        click(homePage.SportCarArticle);
        click(homePage.FindAgentForSportCar);
//        enterText(homePage.ZipCodeForSpotCar, "11214");
        String expectedTitle = "Find State Farm® Agents Near You - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }

        @Test
    public void banking() throws InterruptedException {
        click(homePage.BankingInHomePage);
        click(homePage.CheckingAccount);
        click(homePage.CompareAccounts);
        click(homePage.Continue);
        switchToDifferentTab();
        scrollToView(homePage.Apply);
        click(homePage.ok);
        String expectedTitle = "Banking Made Simple | Easy Checking | State Farm & U.S. Bank";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }
          @Test
    public void investment() throws InterruptedException {
        click(homePage.InvestmentInHomePage);
        click(homePage.MutualFunds);
        scrollToView(homePage.InvestingStyle);
        click(homePage.InvestingStyle);
        scrollToView(homePage.UseForLifeInsurance);
        click(homePage.UseForLifeInsurance);
        selectDropDownOption(homePage.ChooseStateFromDropdown, "NY");
        click(homePage.ClickGoAfterChoosingState);
        click(homePage.ClickYes);
        enterText(homePage.EnterDateOfBirth, "07-2-1980");
        click(homePage.ClickContinue);
        String expectedTitle = "Life Quote - State Farm";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


          }

    @Test
    public void getAQuote() throws InterruptedException {
        click(homePage.GetAQuoteInHomePage);
        selectDropDownOption(homePage.PetInsuranceQuote,"Pet Insurance" );
        enterText(homePage.ZipCodeToStartAQuote, "11214");
        enterText(homePage.FirstNameForPetInsurance, "john");
        enterText(homePage.LastNameForPetInsurance, "preu");
        enterText(homePage.AddressToGetQuote, "10 john street");
        enterText(homePage.ZipCodeToGetQuote, "11110");
        enterText(homePage.CityToGetQuote, "new york");
        scrollToView(homePage.ContinueWithTheQuote);
        click(homePage.ContinueWithTheQuote);
        String expectedTitle = "Get A Pet Insurance Quote - Pet Insurance - State Farm";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);





    }
      @Test
    public void peyBill(){
        click(homePage.PayBillInHomePage);
        selectDropDownOption(homePage.ChooseFromListToPayBill, "Policy Number");
        enterText(homePage.PolicyNumber, "1234567348");
        enterText(homePage.ZipCodeToPayBill, "11214");




    }

      @Test
    public void claims(){
        click(homePage.ClaimsInHomePage);
        click(homePage.ClaimHeader);
        click(homePage.FileAClaim);
        click(homePage.HomeAndBoat);
        click(homePage.StartClaim);
        String expectedTitle = "Log In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }
       @Test
    public void help(){
        click(homePage.GeneralHelp);
        switchToDifferentTab();
        click(homePage.ForgotId);
        enterText(homePage.PhoneNumberToRetreiveId, "2123562735");
        enterText(homePage.DOBToRetreiveId, "12-12-1970");
        enterText(homePage.EmailToRetreiveId, "fraif@gmail.com");
        click(homePage.PreferText);
        Assert.assertTrue(homePage.PreferText.isEnabled());
        click(homePage.Submit);





    }



       @Test
    public void claimHlp() throws InterruptedException {
        click(homePage.ClaimsInHomePage);
        click(homePage.ClaimHelp);
        click(homePage.HomeClaims);
        scrollToView(homePage.SeeTheSteps);
        click(homePage.SeeTheSteps);
        click(homePage.NextStep);
        click(homePage.PreviousStep);
        String expectedTitle = "Claims Help - State Farm® - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);






    }

}
