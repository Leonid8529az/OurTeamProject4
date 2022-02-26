package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialtyGiftCardDirectory extends OurAPI {

    @FindBy(xpath = "//h3[normalize-space()='Specialty Gift Cards' and text()='Specialty Gift Cards']")
    WebElement sGiftCard;
    @FindBy(xpath = "//span[normalize-space()='Shop all']")
    WebElement allCategory;
    @FindBy(xpath = "//span[normalize-space()='Specialty Gift Cards (279)']")
    WebElement getsGiftCardResults;
    @FindBy(xpath = "//a[@aria-label='Bass Pro Shops Gift Card (Email Delivery)']")
    WebElement BassProGiftCard;
    @FindBy(xpath = "//button[@value='$50']")
    WebElement giftCardAmount;
    @FindBy(xpath = "//div[contains(text(),'2')]")
    WebElement twoQuantity;
    @FindBy(xpath = "//span[@class='style__PriceFontSize-sc-1o3i6gc-0 kfATIS']")
    WebElement getPrice;
    @FindBy(xpath = "//div[3]//button[1]//div[1]//div[1]//div[1]//div[1]//div[3]")
    WebElement vacationGiftCard;
    @FindBy(xpath = "//div[normalize-space()='Southwest Airlines Gift Card (Email Delivery)']")
    WebElement vacationGiftCardSouthWAirlines;
    @FindBy(xpath = "//span[normalize-space()='Southwest Airlines Gift Card (Email Delivery)']")
    WebElement nameOfTheGiftCard;
    @FindBy(xpath = "//h3[normalize-space()='Movies & Entertainment']")
    WebElement movieCategoryGiftCard;
    @FindBy(xpath = "//h2[@class='Heading__StyledHeading-sc-1mp23s9-0 UABvu h-display-block h-margin-b-tiny']")
    WebElement totalResults;
    @FindBy(xpath = "//a[@aria-label='Google Play Gift Card (Email Delivery)']")
    WebElement googlePlayGiftCard;






    public void specialtyGiftCard(){click(sGiftCard);}

    public void shopAllCategory(){click(allCategory);}

    public String allGiftCardResults() {
        return getsGiftCardResults.getText();
    }

    public void specialtyBassProGiftCard(){click(BassProGiftCard);}

    public void selectGiftCardAmount(){click(giftCardAmount);}

    public void selectTwoQuantity(){click(twoQuantity);}

    public String priceOfGiftCard() {
        return getPrice.getText();
    }

    public void goOnVacationGiftCard(){click(vacationGiftCard);}

    public void SouthWAirlinesGiftCard(){click(vacationGiftCardSouthWAirlines);}

    public String nameOfTheCard() {
        return nameOfTheGiftCard.getText();
    }

    public void movieAndEntertainmentGiftCard(){click(movieCategoryGiftCard);}

    public String totalNumberOfResults() {
        return totalResults.getText();
    }

    public void setGooglePlayGiftCard(){click(googlePlayGiftCard);}





}
