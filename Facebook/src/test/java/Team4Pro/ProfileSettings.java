package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileSettings extends OurAPI {
    String email = "testFaceBookEmail111@gmail.com";
    String newEmail = "socwaloze999@gmail.com";
    String password = "12345abc!";
    String newPass = "12345abcd@";
    String emailIsInUse = "wormike778@gmail.com";
    SettingsGeneralPage settingsGeneralPage;
    LoginPage loginPage;
    SettingsSecurityPage settingsSecurityPage;
    PrivacyPage privacyPage;
    PrivacyBasicsPage privacyBasicsPage;
    ProfileAndTaggingPage profileAndTaggingPage;
    LocationPage locationPage;

    @BeforeMethod
    public void librarySetUp() {
        settingsGeneralPage = PageFactory.initElements(driver, SettingsGeneralPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        settingsSecurityPage = PageFactory.initElements(driver, SettingsSecurityPage.class);
        privacyPage = PageFactory.initElements(driver, PrivacyPage.class);
        privacyBasicsPage = PageFactory.initElements(driver, PrivacyBasicsPage.class);
        profileAndTaggingPage = PageFactory.initElements(driver, ProfileAndTaggingPage.class);
        locationPage = PageFactory.initElements(driver, LocationPage.class);
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
    }

    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void FBTesting_011() {
        String firtsName = "Leoa";
        String middleName = "Leob";
        String lastName = "Leoc";
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        switchToIFrame(settingsGeneralPage.iFrame);
        waitSeconds(1);
        Assert.assertEquals(settingsGeneralPage.getTextGeneral(), "General Account Settings");
        settingsGeneralPage.clickOnEdit();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.getTextFirstName(), "First");
        settingsGeneralPage.nameField.clear();
        feedDataWithNoClick(settingsGeneralPage.nameField, firtsName);
        Assert.assertEquals(settingsGeneralPage.getTextLastName(), "Last");
        settingsGeneralPage.lastNameField.clear();
        feedDataWithNoClick(settingsGeneralPage.lastNameField, lastName);
        Assert.assertEquals(settingsGeneralPage.getTextMiddleName(), "Middle");
        settingsGeneralPage.middleNameField.clear();
        feedDataWithNoClick(settingsGeneralPage.middleNameField, middleName);
        settingsGeneralPage.clickOnReview();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.getPassText(), "Password");
        settingsGeneralPage.insertPass(password);
        settingsGeneralPage.cancelClick();
    }

    @Test
    public void FBTesting_012() {
        String firtsName = "Leonid111";
        String middleName = "Leonid222";
        String lastName = "Leonid333";
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        switchToIFrame(settingsGeneralPage.iFrame);
        waitSeconds(1);
        Assert.assertEquals(settingsGeneralPage.getTextGeneral(), "General Account Settings");
        settingsGeneralPage.clickOnEdit();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.getTextFirstName(), "First");
        settingsGeneralPage.nameField.clear();
        feedDataWithNoClick(settingsGeneralPage.nameField, firtsName);
        Assert.assertEquals(settingsGeneralPage.getTextLastName(), "Last");
        settingsGeneralPage.lastNameField.clear();
        feedDataWithNoClick(settingsGeneralPage.lastNameField, lastName);
        Assert.assertEquals(settingsGeneralPage.getTextMiddleName(), "Middle");
        settingsGeneralPage.middleNameField.clear();
        feedDataWithNoClick(settingsGeneralPage.middleNameField, middleName);
        settingsGeneralPage.clickOnReview();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.errorMessageGetText(), "Please enter your profile name using only letters.");
    }

    @Test
    public void FBTesting_013() {
        String firtsName = "LeonidAAA";
        String middleName = "LeonidBBB";
        String lastName = "LeonidCCC";
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        switchToIFrame(settingsGeneralPage.iFrame);
        waitSeconds(1);
        Assert.assertEquals(settingsGeneralPage.getTextGeneral(), "General Account Settings");
        settingsGeneralPage.clickOnEdit();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.getTextFirstName(), "First");
        settingsGeneralPage.nameField.clear();
        feedDataWithNoClick(settingsGeneralPage.nameField, firtsName);
        Assert.assertEquals(settingsGeneralPage.getTextLastName(), "Last");
        settingsGeneralPage.lastNameField.clear();
        feedDataWithNoClick(settingsGeneralPage.lastNameField, lastName);
        Assert.assertEquals(settingsGeneralPage.getTextMiddleName(), "Middle");
        settingsGeneralPage.middleNameField.clear();
        feedDataWithNoClick(settingsGeneralPage.middleNameField, middleName);
        settingsGeneralPage.clickOnReview();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.errorMessageGetText(), "Profile names can't have too many capital letters. Learn more about our name policies.");
    }

    @Test
    public void FBTesting_014() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        switchToIFrame(settingsGeneralPage.iFrame);
        waitSeconds(1);
        Assert.assertEquals(settingsGeneralPage.getTextGeneral(), "General Account Settings");
        settingsGeneralPage.clickOnEditByContact();
        waitSeconds(2);
        //settingsGeneralPage.clickOnMakePrimary();
        //settingsGeneralPage.inputPassForPrimaryEmail(password);
        settingsGeneralPage.clickOnAddAnotherEmail();
        settingsGeneralPage.inputNewEmail(newEmail);
        settingsGeneralPage.clickOnAdd();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.addEmailConfirmMessageGetText(),"An email has been sent to socwaloze999@gmail.com to make sure it is a valid address.");
    }
    @Test
    public void FBTesting_015() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        switchToIFrame(settingsGeneralPage.iFrame);
        waitSeconds(1);
        Assert.assertEquals(settingsGeneralPage.getTextGeneral(), "General Account Settings");
        settingsGeneralPage.clickOnEditByContact();
        waitSeconds(2);
        //settingsGeneralPage.clickOnMakePrimary();
        //settingsGeneralPage.inputPassForPrimaryEmail(password);
        settingsGeneralPage.clickOnAddAnotherEmail();
        settingsGeneralPage.inputNewEmail(emailIsInUse);
        settingsGeneralPage.clickOnAdd();
        waitSeconds(2);
        Assert.assertEquals(settingsGeneralPage.emailIsInUseGetText(),"The email address you entered is already in use on another Facebook account.");
    }
    @Test
    public void FBTesting_016() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        switchToIFrame(settingsGeneralPage.iFrame);
        waitSeconds(1);
        Assert.assertEquals(settingsGeneralPage.getTextGeneral(), "General Account Settings");
        settingsGeneralPage.clickOnEditByContact();
        waitSeconds(2);
        settingsGeneralPage.clickOnRemoveButton();
        waitSeconds(2);
        driver.navigate().refresh();
        //settingsGeneralPage.refreshThisPage();
        waitSeconds(7);
        try {
            Assert.assertFalse(settingsGeneralPage.pendingEmail.isEnabled());
        } catch (Exception e) {
            Assert.assertTrue(true);
        }


    }
    @Test
    public void FBTesting_017() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        privacyPage.clickOnPrivacy();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(privacyPage.getTextPrivacySettingsAndTools(), "Privacy Settings and Tools");
        privacyPage.clickOnLearnMorePrivacyBasic();
        switchToDifferentTab();
        waitSeconds(2);
        Assert.assertEquals(privacyBasicsPage.getTextPrivacyBasics(),"You have control over who sees what you share on Facebook.");
        privacyBasicsPage.clickOnTopTopics();
        Assert.assertEquals(privacyBasicsPage.getTextTopTopics(),"Top Topics");
        privacyBasicsPage.clickOnYouAreInCharge();
        Assert.assertEquals(privacyBasicsPage.getTextYouAreInCharge(),"You’re In Charge");
        privacyBasicsPage.clickOnManageYourPrivacy();
        Assert.assertEquals(privacyBasicsPage.getTextAssertionText(),"Manage Your Privacy");
        privacyBasicsPage.clickOnStaySafeAndSecure();
        Assert.assertEquals(privacyBasicsPage.getTextAssertionText(),"Stay Safe and Secure");
        privacyBasicsPage.clickOnAdvertising();
        Assert.assertEquals(privacyBasicsPage.getTextAssertionText(),"Advertising");
        privacyBasicsPage.clickOnWorkingTogether();
        Assert.assertEquals(privacyBasicsPage.getTextAssertionText(),"Working Together");
        privacyBasicsPage.clickOnPrivacyPrinciples();
        Assert.assertEquals(privacyBasicsPage.getTextPrivacyPrinciples(),"Facebook’s Privacy Principles");
        privacyBasicsPage.clickOnDataPolicy();
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(privacyBasicsPage.getTextDataPolicy(),"Data Policy");
    }
    @Test
    public void FBTesting_018() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        privacyPage.clickOnPrivacy();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(privacyPage.getTextPrivacySettingsAndTools(), "Privacy Settings and Tools");
        privacyPage.clickOnEditByWhoCanSeeYourFuturePosts();
        Assert.assertEquals(privacyPage.getTextEditByWhoCanSeeYourFuturePosts(), "Who can see your future posts?");
        privacyPage.clickOnDropDownByFuturePosts();
        privacyPage.clickPublicOptionInMenu();
        privacyPage.closeWhoCanSeeYourFuturePosts();
        privacyPage.clickOnEditByPeoplePagesAndLists();
        Assert.assertEquals(privacyPage.getTextEditByPeoplePagesAndLists(), "Who can see the people, Pages and lists you follow?");
        privacyPage.clickOndropdownByPeoplePagesAndList();
        privacyPage.clickOnFriendsOptionInPeoplePagesAndList();
        privacyPage.closeEditPeoplePagesAndList();
        scroller("400");
        privacyPage.clickOnFriendRequest();
        Assert.assertEquals(privacyPage.getTextFriendOfFriends(), "Who can send you friend requests?");
        waitSeconds(1);
        privacyPage.clickOnDropdownFriendRequest();
        privacyPage.clickOnFriendsOfFriendsOptionInFriendRequest();
        privacyPage.closeByFriendRequest();
        privacyPage.clickOnFriendList();
        Assert.assertEquals(privacyPage.getTextFriendList(), "Who can see your friends list?");
        waitSeconds(1);
        privacyPage.clickOnDropDownByFriendList();
        //privacyPage.clickOnFriendsOptionInDropDownByFriendList();
        privacyPage.closeFriendList();
        scroller("400");
        privacyPage.clickOnLookUpEmail();
        Assert.assertEquals(privacyPage.getTextLookUpEmail(), "Who can look you up using the email address you provided?");
        privacyPage.clickOnDropDownMenuByLookUpEmail();
        privacyPage.closeLookUpEmail();
        privacyPage.clickOnLookUpPhone();
        Assert.assertEquals(privacyPage.getTextLookUpPhone(), "Who can look you up using the phone number you provided?");
        privacyPage.clickOnDropDownByLookUpPhone();
        privacyPage.closeLookUpPhone();
        privacyPage.clickOnSearchEngine();
        Assert.assertEquals(privacyPage.getTextSearchEngine(), "Do you want search engines outside of Facebook to link to your profile?");
        privacyPage.clickOnCheckBoxSearchEngine();
        try {
            privacyPage.clickOnTurnOffButton();
        } catch (Exception e){

        }
        privacyPage.closeSearchEngine();
        privacyPage.clickOnPotentialConnectionsFriendsOfFriends();
        Assert.assertEquals(privacyPage.getTextpotentialConnectionsFriendsOfFriends(), "For friends of friends on Facebook, deliver requests to:");
        privacyPage.clickOnDropDownByPotentialConnectionsFriendsOfFriends();
        privacyPage.closePotentialConnectionsFriendsOfFriends();
        privacyPage.clickOnOthersOnFacebook();
        Assert.assertEquals(privacyPage.getTextOthersOnFacebook(), "For others on Facebook, deliver requests to:");
        privacyPage.clickOnDropDownByOthersOnFacebook();
        privacyPage.closeOthersOnFacebook();
        privacyPage.clickOnAccountOnInstagram();
        Assert.assertEquals(privacyPage.getTextAccountOnInstagram(), "For accounts on Instagram, deliver requests to:");
        privacyPage.clickOnDropDownByAccountOnInstagram();
        privacyPage.closeAccountOnInstagram();
    }
    @Test
    public void FBTesting_019() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        profileAndTaggingPage.clickOnProfileAndTagging();
        //waitSeconds(1);
        //switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(profileAndTaggingPage.getTextWhoCanPostInYourProfile(),"Who can post on your profile?");
        profileAndTaggingPage.clickOnButtonByWhoCanPostInYourProfile();
        waitSeconds(1);
        profileAndTaggingPage.clickOnOptionInWhoCanPostInYourProfile();
        Assert.assertEquals(profileAndTaggingPage.getTextSeeWhatOthersPost(),"Who can see what others post on your profile?");
        profileAndTaggingPage.clickOnButtonBySeeWhatOthersPostText();
        waitSeconds(1);
        profileAndTaggingPage.clickOptionBySeeWhatOthersPost();
        profileAndTaggingPage.clickOnHideComments();
        Assert.assertEquals(profileAndTaggingPage.getTextHideComments(),"Choose a list of words, phrases or emojis you want to hide from your profile.");
        profileAndTaggingPage.incertDataIntoTextFieldInHideComments("hello");
        profileAndTaggingPage.saveSeeWhatOthersPost();
        Assert.assertEquals(profileAndTaggingPage.getTextWhoCanSeePostsYouAreTagged(),"Who can see posts you're tagged in on your profile?");
        scroller("500");
        profileAndTaggingPage.clickOnButtonByWhoCanSeePostsYouAreTagged();
        waitSeconds(1);
        profileAndTaggingPage.clickOptionByWhoCanSeePostsYouAreTagged();
        Assert.assertEquals(profileAndTaggingPage.getTextWhoDoYouWantToAddToAudience(),"When you're tagged in a post, who do you want to add to the audience of the post if they can't already see it?");
        profileAndTaggingPage.clickbuttonByWhoDoYouWantToAddToAudience();
        waitSeconds(1);
        profileAndTaggingPage.clickOnOptionInWhoDoYouWantToAddToAudience();
        Assert.assertEquals(profileAndTaggingPage.getTextReviewPosts(),"Review posts you're tagged in before the post appears on your profile");
        profileAndTaggingPage.clickOnCheckBoxReviewPosts();
        Assert.assertEquals(profileAndTaggingPage.getTextReviewTags(),"Review tags people add to your posts before the tags appear on Facebook?");
        profileAndTaggingPage.clickOnCheckBoxReviewTags();

    }
    @Test
    public void FBTesting_020() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        locationPage.clickOnLocation();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        locationPage.clickOnLocalHistoryButton();
        Assert.assertEquals(locationPage.getTextLocalHistory(),"Turn on Location History for your mobile devices?");
        locationPage.clickOnDropDownByLocalHistory();
        locationPage.clickOn();
        locationPage.closeLocalHistory();
        locationPage.clickOnViewLocationHistory();
        driver.get("https://www.facebook.com/location_history/view/?ref=settings");
        Assert.assertEquals(locationPage.getTextLocationHistoryView(),"Location History View");


    }

}
