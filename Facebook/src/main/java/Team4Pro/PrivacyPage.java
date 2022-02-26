package Team4Pro;

import base.OurAPI;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.event.WindowEvent;

public class PrivacyPage extends OurAPI {
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=privacy\"]")
    WebElement privacyButton;
    @FindBy(xpath = "//div[@class='clearfix uiHeaderTop']/div[2]/h2")
    WebElement privacySettingsAndToolsText;
    @FindBy(xpath = "//a[@href='/about/basics/']")
    WebElement learnMorePrivacyBasic;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li/a")
    WebElement editByWhoCanSeeYourFuturePosts;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li/a/span[3]/div/div")
    WebElement whoCanSeeYourFuturePostsText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li/div/div/div/div[3]/div[2]/ul/li/div/div/div/a")
    WebElement dropDownByFuturePosts;
    @FindBy(xpath = "//div[@class='uiContextualLayerPositioner uiLayer']/div/div/div/div/div/div/div/ul/li[2]/a")
    WebElement publicOptionInMenu;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li/div/div/a")
    WebElement closeByWhoCanSeeYourFuturePosts;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li[4]/a")
    WebElement editByPeoplePagesAndLists;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li[4]/a/span[3]/div/div")
    WebElement editByPeoplePagesAndListsText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li[4]/div/div/div/div[3]/div/a")
    WebElement dropdownByPeoplePagesAndList;
    @FindBy(xpath = "//div[@class='uiContextualLayer uiContextualLayerAboveLeft']/div/div/div/div/div/div/ul/li[2]/a")
    WebElement friendsOptionInPeoplePagesAndList;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[2]/div/div/ul/li[4]/div/div/a")
    WebElement closeByEditByPeoplePagesAndListsText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li/a")
    WebElement friendRequest;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li/div/div/div/div[2]/div/a")
    WebElement dropDownFriendRequest;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li/div/div/a")
    WebElement closeByFriendRequest;
    @FindBy(xpath = "//*[text()='Friends of friends']")
    WebElement friendsOfFriendsOptionInFriendRequest;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li/div/div/div/div")
    WebElement friendsOfFriendsText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[2]/a")
    WebElement friendList;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[2]/div/div/div/div")
    WebElement friendListText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[2]/div/div/div/div[3]/div/a")
    WebElement dropDownByFriendList;
    @FindBy(xpath = "//div[@id='globalContainer']/div[6]/div/div/div/div/div/div/div/ul/li[2]/a")
    WebElement friendsOptionInDropDownByFriendList;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[2]/div/div/a")
    WebElement closeByFriendList;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[3]/a")
    WebElement lookUpEmail;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[3]/div/div/div/div[3]/div/a")
    WebElement dropDownByLookUpEmail;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[3]/div/div/a")
    WebElement closeByLookUpEmail;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[3]/div/div/div/div")
    WebElement lookUpEmailText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[4]/a")
    WebElement lookUpPhone;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[4]/a/span[3]/div/div")
    WebElement lookUpPhoneText;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[4]/div/div/div/div[3]/div/a")
    WebElement dropDownByLookUpPhone;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[4]/div/div/a")
    WebElement closeLookUpPhone;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[5]/a")
    WebElement searchEngine;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[5]/div/div/div/div")
    WebElement searchEngineText;
    @FindBy(xpath = "//span[@id='privacy_public_search_input']/span[2]/input")
    WebElement checkBoxSearchEngine;
    @FindBy(xpath = "//div[@id='contentArea']/div/div/ul/li[3]/div/div/ul/li[5]/div/div/a")
    WebElement closeSearchEngine;
    @FindBy(xpath = "//div[@id='pop_content']/div/div[3]/div/label/input")
    WebElement turnOffButtonSearchEngine;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[2]/ul/li/a")
    WebElement potentialConnectionsFriendsOfFriends;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[2]/ul/li/div/div/div[2]/div/div/a")
    WebElement dropDownByPotentialConnectionsFriendsOfFriends;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[2]/ul/li/div/div/div")
    WebElement potentialConnectionsFriendsOfFriendsText;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[2]/ul/li/div/a")
    WebElement closeByPotentialConnectionsFriendsOfFriends;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul/li/a")
    WebElement othersOnFacebook;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul/li/div/div/div")
    WebElement othersOnFacebookText;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul/li/div/div/div[2]/div/div/a")
    WebElement dropDownByOthersOnFacebook;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul/li/div/a")
    WebElement closeOthersOnFacebook;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul[2]/li/a")
    WebElement accountOnInstagram;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul[2]/li/div/div/div")
    WebElement accountOnInstagramText;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul[2]/li/div/div/div[2]/div/div/a")
    WebElement dropDownByAccountOnInstagram;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div[2]/div[2]/div[2]/div/div/ul/li[4]/div/div/div[3]/ul[2]/li/div/a")
    WebElement closeAccounOnInstagram;





    public void clickOnPrivacy() {
        click(privacyButton);
    }
    public String getTextPrivacySettingsAndTools() {
        return privacySettingsAndToolsText.getText();
    }
    public void clickOnLearnMorePrivacyBasic() {
        click(learnMorePrivacyBasic);
    }
    public void clickOnEditByWhoCanSeeYourFuturePosts() {
        click(editByWhoCanSeeYourFuturePosts);
    }
    public String getTextEditByWhoCanSeeYourFuturePosts() {
        return whoCanSeeYourFuturePostsText.getText();
    }
    public void clickOnDropDownByFuturePosts() {
        click(dropDownByFuturePosts);
    }
    public void clickPublicOptionInMenu() {
        click(publicOptionInMenu);
    }
    public void closeWhoCanSeeYourFuturePosts() {
        click(closeByWhoCanSeeYourFuturePosts);
    }
    public void clickOnEditByPeoplePagesAndLists() {
        click(editByPeoplePagesAndLists);
    }
    public String getTextEditByPeoplePagesAndLists() {
        return editByPeoplePagesAndListsText.getText();
    }
    public void clickOndropdownByPeoplePagesAndList() {
        click(dropdownByPeoplePagesAndList);
    }
    public void clickOnFriendsOptionInPeoplePagesAndList() {
        click(friendsOptionInPeoplePagesAndList);
    }
    public void closeEditPeoplePagesAndList() {
        click(closeByEditByPeoplePagesAndListsText);
    }
    public void clickOnFriendRequest() {
        click(friendRequest);
    }
    public void clickOnDropdownFriendRequest() {
        click(dropDownFriendRequest);
    }
    public void clickOnFriendsOfFriendsOptionInFriendRequest() {
        click(friendsOfFriendsOptionInFriendRequest);
    }
    public void closeByFriendRequest() {
        click(closeByFriendRequest);
    }
    public String getTextFriendOfFriends() {
        return friendsOfFriendsText.getText();
    }
    public void clickOnFriendList() {
        click(friendList);
    }
    public String getTextFriendList() {
        return friendListText.getText();
    }
    public void clickOnDropDownByFriendList() {
        click(dropDownByFriendList);
    }
    public void clickOnFriendsOptionInDropDownByFriendList() {
        click(friendsOptionInDropDownByFriendList);
    }
    public void closeFriendList() {
        click(closeByFriendList);
    }
    public void clickOnLookUpEmail() {
        click(lookUpEmail);
    }
    public String  getTextLookUpEmail() {
        return lookUpEmailText.getText();
    }
    public void clickOnDropDownMenuByLookUpEmail() {
        click(dropDownByLookUpEmail);
    }
    public void closeLookUpEmail() {
        click(closeByLookUpEmail);
    }
    public void clickOnLookUpPhone() {
        click(lookUpPhone);
    }
    public String getTextLookUpPhone() {
        return lookUpPhoneText.getText();
    }
    public void clickOnDropDownByLookUpPhone() {
        click(dropDownByLookUpPhone);
    }
    public void closeLookUpPhone() {
        click(closeLookUpPhone);
    }
    public void clickOnSearchEngine() {
        click(searchEngine);
    }
    public void clickOnCheckBoxSearchEngine() {
        click(checkBoxSearchEngine);
    }
    public void clickOnTurnOffButton() {
        click(turnOffButtonSearchEngine);
    }
    public void closeSearchEngine() {
        click(closeSearchEngine);
    }
    public String getTextSearchEngine() {
        return searchEngineText.getText();
    }
    public void clickOnPotentialConnectionsFriendsOfFriends() {
        click(potentialConnectionsFriendsOfFriends);
    }
    public String getTextpotentialConnectionsFriendsOfFriends() {
        return potentialConnectionsFriendsOfFriendsText.getText();
    }
    public void clickOnDropDownByPotentialConnectionsFriendsOfFriends() {
        click(dropDownByPotentialConnectionsFriendsOfFriends);
    }
    public void closePotentialConnectionsFriendsOfFriends() {
        click(closeByPotentialConnectionsFriendsOfFriends);
    }
    public void clickOnOthersOnFacebook() {
        click(othersOnFacebook);
    }
    public String getTextOthersOnFacebook() {
        return othersOnFacebookText.getText();
    }
    public void clickOnDropDownByOthersOnFacebook() {
        click(dropDownByOthersOnFacebook);
    }
    public void closeOthersOnFacebook() {
        click(closeOthersOnFacebook);
    }
    public void clickOnAccountOnInstagram() {
        click(accountOnInstagram);
    }
    public String getTextAccountOnInstagram() {
        return accountOnInstagramText.getText();
    }
    public void clickOnDropDownByAccountOnInstagram() {
        click(dropDownByAccountOnInstagram);
    }
    public void closeAccountOnInstagram() {
        click(closeAccounOnInstagram);
    }

}
