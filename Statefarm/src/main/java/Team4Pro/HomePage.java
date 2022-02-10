package Team4Pro;


import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends OurAPI {


//    FindAgentInHomePage

    @FindBy(xpath = "//button[@class=\"-oneX-header-top-menu-btn \"and@data-for='findanagent']")
    WebElement FindAgentHomePage;
    @FindBy(xpath = "//input[@id=\"oneX-findAnAgentZipCode\"]")
    WebElement FindAgentZipCode;
    @FindBy(xpath = "//a[@class=\"-oneX-link--block visit-agent-site\"and @title =\"Sammy Martinez\"]")
    WebElement SamiMartinezEmail;
    @FindBy(xpath = "//select[@id=\"quote-product-select\"]")
    WebElement SelectFromDropdownQuote;
    @FindBy(xpath = "//input[@id=\"quote-zip-field\"]")
    WebElement QuoteZipCode;
    @FindBy(xpath = "//button[@id=\"get-quote-button\"]")
    WebElement QuoteEnter;



//   Insurance

    @FindBy(xpath = "//button[@class=\"-oneX-header-top-menu-btn -oneX-header-top-menu-btn__has-submenu\"and @data-for = 'insurance']")
    WebElement InsuranceInHomePage;
    @FindBy(xpath = "//a[text()='Car Insurance']")
    WebElement CarInsurnce;
    @FindBy(xpath = "//button[@type=\"button\"and text() ='Sports cars']")
    WebElement SportCar;
    @FindBy(xpath = "//a[text() = 'insuring your sports car']")
    WebElement SportCarArticle;
    @FindBy(xpath = "//a[@title=\"Find an Agent - State Farm®\"]")
    WebElement FindAgentForSportCar;
    @FindBy(xpath = "//input[@id=\"locationText\"]")
    WebElement ZipCodeForSpotCar;


//Banking

    @FindBy(xpath = "//span[text()='Banking']")
    WebElement BankingInHomePage;
    @FindBy(xpath = "//a[text()='Checking']")
    WebElement CheckingAccount;
    @FindBy(xpath = "//a[@class=\"-oneX-btn-primary__anchor\"]")
    WebElement CompareAccounts;
    @FindBy(xpath = "//a[@id=\"thirdPartyLinkModal-continue\"]")
    WebElement Continue;
    @FindBy(xpath = "//*[text()='Best for your regular, everyday banking needs']")
    WebElement Apply;
    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[28]/div[1]/div[2]/a[2]")
    WebElement ok;


//    Investments

    @FindBy(xpath = "//button[@data-for=\"investments\"]")
    WebElement InvestmentInHomePage;
    @FindBy(xpath = "//a[@id=\"oneX-1-investments\"]")
    WebElement MutualFunds;
    @FindBy(xpath = "//a[@title=\"What Kind of Investor Are You\"]")
    WebElement InvestingStyle;
    @FindBy(xpath = "//a[@title=\"Uses of Life Insurance\"]")
    WebElement UseForLifeInsurance;
    @FindBy(xpath = "//select[@id=\"0-17-3126495-4\"]")
    WebElement ChooseStateFromDropdown;
    @FindBy(xpath = "//button[@type=\"submit\"and@data-name = \"State\"]")
    WebElement ClickGoAfterChoosingState;
    @FindBy(xpath = "//input[@id=\"quoteForYouYes\"]")
    WebElement ClickYes;
    @FindBy(xpath = "//input[@id=\"birthDate\"]")
    WebElement EnterDateOfBirth;
    @FindBy(xpath = "//input[@id='birthDateContinueButton']")
    WebElement ClickContinue;


//Pay a Bill

    @FindBy(xpath = "//*[@class=\"-oneX-header-top-menu-btn \"and @data-for='payabill']")
    WebElement PayBillInHomePage;
    @FindBy(xpath = "//*[@id=\"pay-a-bill-paymentSelect\"]")
    WebElement ChooseFromListToPayBill;
    @FindBy(xpath = "//*[@id='pay-a-bill-policyNumber']")
    WebElement PolicyNumber;
    @FindBy(xpath = "//*[@id='pay-a-bill-policy-zip']")
    WebElement ZipCodeToPayBill;


//Claims

    @FindBy(xpath = "//*[@class=\"-oneX-header-top-menu-btn \"and@data-for='claims']")
    WebElement ClaimsInHomePage;
    @FindBy(xpath = "//*[@id=\"claimsHdr\"]")
    WebElement ClaimHeader;
    @FindBy(xpath = "//*[@title=\"File A Claim\"and @role='button']")
    WebElement FileAClaim;
    @FindBy(xpath = "//*[@class=\"-oneX-font--reg panel_label -w_pb-15 -w_pt-15\"and@for='home-property']")
    WebElement HomeAndBoat;
    @FindBy(xpath = "//*[@class=\"-oneX-btn-fit-content -oneX-btn-primary__anchor continue\"]")
    WebElement StartClaim;



//    Business help


    @FindBy(xpath = "//*[text()=' Claims Help ']")
    WebElement ClaimHelp;
    @FindBy(xpath = "//*[@id=\"business-tab\"]")
    WebElement BusinessInsuranceHelp;
    @FindBy(xpath = "//*[@class=\"-oneX-link--block\"and text()='Report Insurance Fraud']")
    WebElement ReportAFraud;
    @FindBy(xpath = "//*[@title=\"Home + Property Claims - State Farm\"]")
    WebElement HomePropertyFraud;
    @FindBy(xpath = "//*[@title=\"Check Existing Claim\"]")
    WebElement TrackAClaim;


// GeneralHelp

    @FindBy(xpath = "//*[text()='Help']")
    WebElement GeneralHelp;
    @FindBy(xpath = "//*[@id=\"btn1\"]")
    WebElement ForgotId;
    @FindBy(xpath = "//*[@id=\"forgotPhoneInput\"]")
    WebElement PhoneNumberToRetreiveId;
    @FindBy(xpath = "//*[@id=\"forgotDobInput\"]")
    WebElement DOBToRetreiveId;
    @FindBy(xpath = "//*[@id=\"forgotEmailInput\"]")
    WebElement EmailToRetreiveId;
    @FindBy(xpath = "//*[@for=\"textId\"]")
    WebElement PreferText;
    @FindBy(xpath = "//*[@id=\"submitBtn\"]")
    WebElement Submit;


//    Home+Property Claims

    @FindBy(xpath = "//a[@id=\"homeProperty-tab\"]")
    WebElement HomeClaims;
    @FindBy(xpath = "//a[@id=\"open-homeProperty-drawer-undefined\"]")
    WebElement SeeTheSteps;
    @FindBy(xpath = "//body/section[@id='homeProperty-drawer']/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/button[1]")
    WebElement NextStep;
    @FindBy(xpath = "//body/section[@id='homeProperty-drawer']/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/button[1]")
    WebElement PreviousStep;



//  Get a quote

    @FindBy(xpath = "//button[@class=\"-oneX-header-top-menu-btn \"and@data-for = 'getaquote']")
    WebElement GetAQuoteInHomePage;
    @FindBy(xpath = "//select[@id=\"getaquote-select-product\"]")
    WebElement PetInsuranceQuote;
    @FindBy(xpath = "//input[@id=\"getaquote-zip\"]")
    WebElement ZipCodeToStartAQuote;
    @FindBy(xpath = "//*[@id=\"sfx_firstName_input\"]")
    WebElement FirstNameForPetInsurance;
    @FindBy(xpath = "//*[@id=\"sfx_lastName_input\"]")
    WebElement LastNameForPetInsurance ;
    @FindBy(xpath = "//*[@id=\"sfx_userAddress.streetAddress_input\"]")
    WebElement AddressToGetQuote;
    @FindBy(xpath = "//*[@id=\"sfx_userAddress.zipCode_input\"]")
    WebElement ZipCodeToGetQuote;
    @FindBy(xpath = "//*[@id=\"sfx_userAddress.city_input\"]")
    WebElement CityToGetQuote;
    @FindBy(xpath = "//*[@id=\"welcome.continue\"]")
    WebElement ContinueWithTheQuote;



}
