package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BlockingPage extends OurAPI {
    @FindBy(xpath = "//strong[contains(text(),'Block users')]")
    WebElement blockUsersText;
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=blocking\"]")
    WebElement blockingButton;
    @FindBy(xpath = "//h2[@class='uiHeaderTitle']")
    WebElement manageBlockingText;
    @FindBy(xpath = "//form[@action='/ajax/privacy/block_dispatcher/']/input[6]")
    WebElement blockUsersField;
    @FindBy(xpath = "//form[@action='/ajax/privacy/block_dispatcher/']/button")
    WebElement blockButton;
    @FindBy(xpath = "//div[@class='standardLayout']/div/div/div/div/div/div/div[2]/ul/li[2]/div/div/div/div[2]/div/form/label")
    WebElement confirmBlockButton;
    @FindBy(xpath = "//button[@class='_42ft _42fu layerConfirm uiOverlayButton selected _42g- _42gy']")
    WebElement blockButtonAgain;
    @FindBy(xpath = "//strong[contains(text(),'Block messages')]")
    WebElement blockMessagesText;
    @FindBy(xpath = "//div[@id='SettingsPage_Content']/ul/li[3]/div/span[2]/div[2]/table/tbody/tr/td/div/div/div/input")
    WebElement blockMessagesField;
    @FindBy(xpath = "//button[@aria-disabled=\"false\"]")
    WebElement doneButton;
    @FindBy(xpath = "//strong[contains(text(),'Block app invites')]")
    WebElement blockAppInvitesText;
    @FindBy(xpath = "//div[@id='SettingsPage_Content']/ul/li[4]/div/span[2]/div[2]/table/tbody/tr/td/div/div/div/input")
    WebElement blockAppInvitesField;
    @FindBy(xpath = "//strong[contains(text(),'Block event invites')]")
    WebElement blockEventsText;
    @FindBy(xpath = "//div[@id='SettingsPage_Content']/ul/li[5]/div/span[2]/div[2]/table/tbody/tr/td/div/div/div/input")
    WebElement blockEventsField;
    @FindBy(xpath = "//strong[contains(text(),'Block apps')]")
    WebElement blockAppsText;
    @FindBy(xpath = "//div[@id='SettingsPage_Content']/ul/li[6]/div/span[2]/div[2]/table/tbody/tr/td/div/div/div/input")
    WebElement blockAppsField;
    @FindBy(xpath = "//strong[contains(text(),'Block Pages')]")
    WebElement blockPagesText;
    @FindBy(xpath = "//div[@id='SettingsPage_Content']/ul/li[7]/div/span[2]/div[2]/table/tbody/tr/td/div/div/div/input")
    WebElement blockPageField;

    public void clickOnBlocking() {
        click(blockingButton);
    }
    public String getTextManageBlocking() {
        return manageBlockingText.getText();
    }
    public String getTextBlockUsers() {
        return blockUsersText.getText();
    }
    public void insertDataInBlockUsersField() {
        feedDataWithNoClick(blockUsersField,"Test User");
    }
    public void clickOnBlockUser() {
        click(blockButton);
    }
    public void clickOnConfirmBlocking() {
        click(confirmBlockButton);
    }
    public void clickOnBlockAgain() {
        click(blockButtonAgain);
    }
    public String getTextBlockMessages() {
        return blockMessagesText.getText();
    }
    public void insertTextInBlockMessagesField() {
        enterText(blockMessagesField,"Test User");
    }
    public void clickOnDoneButton() {
        click(doneButton);
    }
    public String getTextBlockAppInvites() {
        return blockAppInvitesText.getText();
    }
    public void insertTextBlockAppInvites() {
        enterText(blockAppInvitesField,"Test User");
    }
    public String getTextBlockEvents() {
        return blockEventsText.getText();
    }
    public void insertTextBlockEventsField() {
        feedDataWithNoClick(blockEventsField,"Test User");
    }
    public String getTextBlockApps() {
        return blockAppsText.getText();
    }
    public void insertBlockAppsField() {
        enterText(blockAppsField,"Chess.com");
    }
    public String getTextBlockPages() {
        return blockPagesText.getText();
    }
    public void insertInBlockPageField() {
        enterText(blockPageField,"Chess.com");
    }
}
