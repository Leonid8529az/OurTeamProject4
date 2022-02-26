package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamMemberServices extends OurAPI {
    @FindBy(xpath = "//b[normalize-space()='Bullseye Shop']")
    WebElement bullseyeShop;
    @FindBy(xpath = "//a[@aria-label='Continue to partner’s website - opens in a new tab']")
    WebElement continueToPartnersWeb;
    @FindBy(xpath = "//a[@id='parent-title-46730']")
    WebElement firstItemOfTheList;
    @FindBy(xpath = "//span[@id='js-item-code-46730']")
    WebElement productCode;
    @FindBy(xpath = "//input[@name='instantadd']")
    WebElement addToCart;
    @FindBy(xpath = "//a[@id='js-item-addtocartbtn-54287']")
    WebElement differentAddToCart;
    @FindBy(xpath = "//label[@for='inlineCheckbox2']//span")
    WebElement buyForSomeoneElse;
    @FindBy(xpath = "//input[@id='rname']")
    WebElement recipientName;
    @FindBy(xpath = "//input[@id='remail']")
    WebElement recipientEmail;
    @FindBy(xpath = "//input[@id='datetime']")
    WebElement scheduleDate;
    @FindBy(xpath = "//a[@id='parent-title-47570']")
    WebElement selectTopCategory;
    @FindBy(xpath = "//input[@id='js-item-qtybox-47570']")
    WebElement addQuantity;
    @FindBy(xpath = "//a[@id='js-item-addtocartbtn-47570']")
    WebElement card;










    public void clickBullseyeShop (){click(bullseyeShop);}
    public void clickContinueToPartnerWeb(){click(continueToPartnersWeb);}
    public void clickOnItem(){click(firstItemOfTheList);}
    public String returnProductCode() {
        return productCode.getText();
    }
    public void clickOnAddToCard(){click(addToCart);}
    public void addToCard(){click(differentAddToCart);}
    public void clickOnBuyForSomeoneElse(){click(buyForSomeoneElse);}
    public void typeRecipientName(String itemToSearch) {
        enterText(recipientName, itemToSearch);
    }
    public void typeRecipientEmail(String itemToSearch) {
        enterText(recipientEmail, itemToSearch);
    }
    public void selectDateToSend (){click(scheduleDate);}
    public void clickOnTopCategory (){click(selectTopCategory);}
    public void typeQuantity(String itemToSearch) {enterText(addQuantity, itemToSearch);}
    public void addAllToCard (){click(card);}


}
