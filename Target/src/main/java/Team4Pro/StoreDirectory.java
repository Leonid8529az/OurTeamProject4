package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreDirectory extends OurAPI {

    @FindBy(xpath = "//a[contains(text(),'Find Stores')  and @class='Link-sc-1khjl8b-0 iwassO']")
    WebElement findStore;
    @FindBy(xpath = "//button[text()='enter zip or city, state']")
    WebElement enterZipCode;
    @FindBy(xpath = "//button[text()='cancel']")
    WebElement typeZipCode;
    @FindBy(xpath = "//strong[normalize-space()='see contact options >']")
    WebElement contactUs;
    @FindBy(xpath = "//div//button[@class='adaptiveDropdown']")
    WebElement chooseATopic;
    @FindBy(xpath = "//span[normalize-space()='Store Experience']")
    WebElement storeExperience;
    @FindBy(xpath = "//button[normalize-space()='Chat Now']")
    WebElement chatNow;
    @FindBy(xpath = "//input[@id='visitorName']")
    WebElement typeName;
    @FindBy(xpath = "//input[@id='guestLastName']")
    WebElement typeLastName;
    @FindBy(xpath = "//label[@id='guestEmailLabel']")
    WebElement typeEmail;
    @FindBy(xpath = "//button[@id='prechat_submit']")
    WebElement clickButton;
    @FindBy(xpath = "//div//textarea[@id='liveAgentChatTextArea']")
    WebElement addChat;
    @FindBy(xpath = "//button[@title='Send']")
    WebElement clickSend;
    @FindBy(xpath = "//a[@title='close icon']//img")
    WebElement close;
   @FindBy(xpath = "//a[normalize-space()='Browse offers']")
   WebElement hundredsOfDeals;
    @FindBy(xpath = "//input[@id='uxCareerSearchText']")
    WebElement careerSearchBar;
    @FindBy(xpath = "//span[normalize-space()='Feedback']")
    WebElement greatJob;
    @FindBy(xpath = "//button[@id='submitBtn']")
    WebElement select;
    @FindBy(xpath = "//span[text()='Top Deals (69054)']")
    WebElement totalDeals;
    @FindBy(xpath = "//a[normalize-space()='Benefits']")
    WebElement benefits;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCard;








    public void findStores() {
        click(findStore);
    }

    public void storeLocator(){ click(enterZipCode); }

    public void PrintZipCode(String itemToSearch) {
        enterText(typeZipCode, itemToSearch);
    }

    public void contactTarget(){click(contactUs);}

    public void selectATopic(){click(chooseATopic);}

    public void selectStoreExperience(){click(storeExperience);}

    public void startChat(){click(chatNow);}

    public void printName(String itemToSearch){
        enterText(typeName, itemToSearch);
    }

    public void printLastName(String itemToSearch){
        enterText(typeLastName, itemToSearch);
    }

    public void printEmail(String itemToSearch){
        enterText(typeEmail, itemToSearch);
    }

    public void continueButton (){click(clickButton);}

    public void sendChat(String itemToSearch){
        enterText(addChat, itemToSearch);
    }

    public void send (){click(clickSend);}

    public void closeChat(){click(close);}

    public void browseOffers(){click(hundredsOfDeals);}

    public void searchForCareer(String itemToSearch){
        enterText(careerSearchBar, itemToSearch);
    }

    public void awesomeJob(){click(greatJob);}

    public void checkBenefits(){click(benefits);}

    public String allToDeals() {
        return totalDeals.getText();
    }

    public void checkOutButton (){click(addToCard);}




}
