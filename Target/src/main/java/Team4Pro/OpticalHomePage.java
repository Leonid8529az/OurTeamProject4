package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpticalHomePage extends OurAPI {

    @FindBy(xpath = "//span[normalize-space()='Ray-Ban Stories, now at Target Optical']")
    WebElement findYourPair;
    @FindBy(xpath = "//a[@aria-label='Continue to partner’s website - opens in a new tab' and @class='Link__StyledLink-sc-4b9qcv-0 fwEKwG h-margin-b-tight h-text-center']")
    WebElement continuePartnersWebsite;
    @FindBy(xpath = "//h1[@id='title-plp-shop']")
    WebElement nameOfSearch;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/Ray-Ban/8056597557153']")
    WebElement selectRayBanGlasses;
    @FindBy(xpath = "//label[@for='lens_1_']//span[@class='lens-option-title'][normalize-space()='Transition G-15']")
    WebElement singleVision;
    @FindBy(xpath = "//div[@class='addToCartText']")
    WebElement addYourLens;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/eyeglasses/womens?cid=EP-RET_191219-Target_TOpage_CategoryWomensEye']")
    WebElement womenSEye;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/eyeglasses/mens?cid=EP-RET_191219-Target_TOpage_CategoryMensEye']")
    WebElement menSEye;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/eyeglasses/kids?cid=EP-RET_191219-Target_TOpage_CategoryKidsEye']")
    WebElement kidsEyeglasses;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/sunglasses?cid=EP-RET_191219-Target_TOpage_CategorySUN']")
    WebElement sunglasses;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/contact-lenses?cid=EP-RET_191219-Target_TOpage_CategoryContactLenses']")
    WebElement contactLenses;
    @FindBy(xpath = "//span[text()='Contact Lens Accessories']")
    WebElement accessories;
    @FindBy(xpath = "//img[@alt='Cat & Jack']")
    WebElement catAndJackBrand;
    @FindBy(xpath = "//span[text()='Insurance plans accepted in store & online']")
    WebElement insurance;
    @FindBy(xpath = "//a[@href='https://www.targetoptical.com/to-us/locations?cid=EP-RET_191219-Target_TOpage_ServiceFindAStore' and @data-test='storyblock-storyblockLinkWrapper']")
    WebElement findStore;






    public void clickOnFindYourPair (){click(findYourPair);}
    public void clickContinuePartnersWebsite (){click(continuePartnersWebsite);}
    public String topNameOfSearch() {
        return nameOfSearch.getText();
    }
    public void clickOnRayBanGlasses (){click(selectRayBanGlasses);}
    public void clickSingleVision (){click(singleVision);}
    public void addYourLensToCard (){click(addYourLens);}
    public void womenSEyeglasses (){click(womenSEye);}
    public void menSEyeglasses (){click(menSEye);}
    public void clickOnKidsEyeglassesCategory (){click(kidsEyeglasses);}
    public void clickOnSunglasses (){click(sunglasses);}
    public void selectContactLenses(){click(contactLenses);}
    public void selectContactLensAccessories (){click(accessories);}
    public void selectCatAndJackBrand (){click(catAndJackBrand);}
    public void clickInsurance(){click(insurance);}
    public void clickOnFindStore(){click(findStore);}




}
