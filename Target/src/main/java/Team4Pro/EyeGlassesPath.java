package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EyeGlassesPath extends OurAPI {

    @FindBy(xpath = "//div[@id='WC_CatalogSearchResultDisplay_div_6_1']//span[@class='brand-name'][normalize-space()='Ray-Ban']")
    WebElement womenSGlasses;
    @FindBy(xpath = "//label[@for='lens_1_']//span[@class='lens-option-title'][normalize-space()='Ray-Ban : Premium Polycarbonate']")
    WebElement rayBanPremium;
    @FindBy(xpath = "//div[@class='addToCartText']")
    WebElement addToCards;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/Oakley/888392133205']")
    WebElement selectMensGlasses;
    @FindBy(xpath = "//span[contains(@class,'badge-newest-pdp')]")
    WebElement bestSeller;
    @FindBy(xpath = "//label[@for='lens_1_']//span[@class='lens-option-title'][normalize-space()='ComfortLight: Plastic']")
    WebElement selectPlastic;
    @FindBy(xpath = "//div[@class='__prjid5_lensEdit_div']")
    WebElement addCToCard;
    @FindBy(xpath = "//h1[@id='title-plp-shop']")
    WebElement titleOfList;
    @FindBy(xpath = "//div[@id='WC_CatalogSearchResultDisplay_div_6_1']//img[@alt=\"Image for Kid's Eyeglasses from Glasses, Sunglasses, Contacts & Eyewear Online | Target Optical\"]")
    WebElement selectKidsGlasses;
    @FindBy(xpath = "//span[@class='lens-option-title']")
    WebElement selectSVComfortLightKids;
    @FindBy(xpath = "//div[@id='WC_CatalogSearchResultDisplay_div_6_1']//img[@alt='Image for sunglasses from Glasses, Sunglasses, Contacts & Eyewear Online | Target Optical']")
    WebElement selectBestSeller;
    @FindBy(xpath = "//label[@for='parentSku_18081756']//span[@class='lens-option-title'][normalize-space()='SunVision: Plastic']")
    WebElement sunVisionPlastic;
    @FindBy(xpath = "//label[@for='lens_1_1']//span[@class='lens-option-title'][normalize-space()='Brown']")
    WebElement colorBrown;
    @FindBy(xpath = "//img[@alt='1-DAY ACUVUE® MOIST, 90 pack $84.99']")
    WebElement firstItem;
    @FindBy(xpath = "//span[@id='sameEyesLabel']")
    WebElement prescriptionInformation;
    @FindBy(xpath = "//h1[contains(text(),'More brands')]")
    WebElement text;
    @FindBy(xpath = "//a[@href='/to-us/seemore'][normalize-space()='Shop Now']")
    WebElement shopOffers;
    @FindBy(xpath = "//picture[@data-test='@web/ProductCard/ProductCardImage/primary']//img[@alt='Lumify Eye Drops']")
    WebElement lumifyEyeDrops;
    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1mp23s9-0 kmgmYA']")
    WebElement topText;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor75001733' and @type='button']")
    WebElement addCard;
    @FindBy(xpath = "//div[@id='WC_CatalogSearchResultDisplay_div_6_1']//img[@alt='Image for Cat & Jack from Glasses, Sunglasses, Contacts & Eyewear Online | Target Optical']")
    WebElement firstSelectionOnBrand;
    @FindBy(xpath = "//a[@aria-label='view more accepted insurance plans']")
    WebElement viewMore;
    @FindBy(xpath = "//form[@name='storeResultsSearchForm']//input[@placeholder='Zip Code, City or State']")
    WebElement typeZipCode;
    @FindBy(xpath = "//form[@name='storeResultsSearchForm']//button[@type='submit'][normalize-space()='Search']")
    WebElement searchForStore;





    public void womenSRayBan (){click(womenSGlasses);}
    public void addGlassesToCard (){click(addToCards);}
    public void selectPremium (){click(rayBanPremium);}
    public void clickBestSellersMensGlasses(){click(selectMensGlasses);}
    public String setBestSeller() {
        return bestSeller.getText();
    }
    public void selectPlasticGlasses(){click(selectPlastic);}
    public void clickToCard(){click(addCToCard);}
    public String findTitleOfList() { return titleOfList.getText(); }
    public void clickOnFirstKidsGlasses(){click(selectKidsGlasses);}
    public void clickOnSVComfortLightKids(){click(selectSVComfortLightKids);}
    public void clickOnFirstBestSeller(){click(selectBestSeller);}
    public void selectSunVisionPlastic(){click(sunVisionPlastic);}
    public void selectColorBrown(){click(colorBrown);}
    public void addFirstItem(){click(firstItem);}
    public void selectSameForBothEyes(){click(prescriptionInformation);}
    public String setText() {
        return text.getText();
    }
    public void selectLumifyEyeDrops(){click(lumifyEyeDrops);}
    public String getText() {
        return topText.getText();
    }
    public void addTheItemToCard(){click(addCard);}
    public void clickOnItem(){click(firstSelectionOnBrand);}
    public void clickOnViewMoreInsurancePlansAcceptance(){click(viewMore);}
    public void clickAndTypeZipCode(String itemToSearch){ feedDataWithNoClick(typeZipCode, itemToSearch); }
    public void clickSearch(){click(searchForStore);}




//    public void typeFirstName(String itemToSearch) {
//        enterText(typeName, itemToSearch);
//    }
//    public void typeLastName(String itemToSearch) {
//        enterText(typeLName, itemToSearch);
//    }
//    public void setTypeDateOfBirth(String itemToSearch) {
//        enterText(typeDateOfBirth, itemToSearch);
//    }
//    public void selectNoOnInsurance (){click(noOnInsurance);}
//    public void selectContinue (){click(continueWithS);}




}
