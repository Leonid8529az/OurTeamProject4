package Team4Pro;

import base.OurAPI;
import com.sun.org.apache.bcel.internal.generic.LADD;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType;
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
    PublicPostsPage publicPostsPage;
    BlockingPage blockingPage;
    LanguageAndRegionPage languageAndRegionPage;
    StoriesPage storiesPage;

    @BeforeMethod
    public void librarySetUp() {
        settingsGeneralPage = PageFactory.initElements(driver, SettingsGeneralPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        settingsSecurityPage = PageFactory.initElements(driver, SettingsSecurityPage.class);
        privacyPage = PageFactory.initElements(driver, PrivacyPage.class);
        privacyBasicsPage = PageFactory.initElements(driver, PrivacyBasicsPage.class);
        profileAndTaggingPage = PageFactory.initElements(driver, ProfileAndTaggingPage.class);
        locationPage = PageFactory.initElements(driver, LocationPage.class);
        publicPostsPage = PageFactory.initElements(driver, PublicPostsPage.class);
        blockingPage = PageFactory.initElements(driver, BlockingPage.class);
        languageAndRegionPage = PageFactory.initElements(driver, LanguageAndRegionPage.class);
        storiesPage = PageFactory.initElements(driver, StoriesPage.class);
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
    @Test
    public void publicPosts21() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        publicPostsPage.clickPublicPostButton();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(publicPostsPage.getTextWhoCanFollowMe(),"Who Can Follow Me");
        publicPostsPage.clickOnDropDownByWhoCanFollowMe();
        publicPostsPage.clickOnOptionInDropDownByWhoCanFollowMe();
        publicPostsPage.clickOnPublicPostCommentsButton();
        Assert.assertEquals(publicPostsPage.getTextPublicPostComment(),"Public Post Comments");
        publicPostsPage.clickOnDropDownByPublicPostComments();
        publicPostsPage.clickOnOptionPublicPostComments();
        publicPostsPage.clickOnPublicPostNotificationButton();
        Assert.assertEquals(publicPostsPage.getTextPublicPostNotification(),"Public Post Notifications");
        publicPostsPage.clickOnDropDownByPublicPostNotification();
        publicPostsPage.clickOnOptionInDropDownByPublicPostNotification();
        scroller("500");
        publicPostsPage.clickOnPublicProfileInfoButton();
        Assert.assertEquals(publicPostsPage.getTextPublicProfileInfo(),"Public Profile Info");
        publicPostsPage.clickOnDropDownByPublicProfileInfo();
        waitSeconds(1);
        publicPostsPage.clickOnDropDownByPublicProfileInfo();

//        publicPostsPage.clickOnOptionInDropDownByPublicProfileInfo();
        Assert.assertEquals(publicPostsPage.getTextOffFacebookPreview(),"Off-Facebook Previews");
        publicPostsPage.clickOnDropDownByOffFacebookPreview();
        publicPostsPage.clickOnOptionInDropDownByOffFacebookPreview();
        publicPostsPage.clickOnCommentRanking();
        Assert.assertEquals(publicPostsPage.getTextCommentRanking(),"Comment Ranking");
        publicPostsPage.clickOnDropDownByCommentRanking();
        publicPostsPage.clickOnOptionIndropDownByCommentRanking();
        publicPostsPage.clickOnUsername();
        Assert.assertEquals(publicPostsPage.getTextUsername(),"Username");
        publicPostsPage.clickOnCloseButton();
    }
    @Test
    public void blocking22() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        blockingPage.clickOnBlocking();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(blockingPage.getTextManageBlocking(),"Manage Blocking");
        Assert.assertEquals(blockingPage.getTextBlockUsers(),"Block users");
        //waitSeconds(1000);
        blockingPage.insertDataInBlockUsersField();
        blockingPage.clickOnBlockUser();
        waitSeconds(2);
        blockingPage.clickOnConfirmBlocking();
        blockingPage.clickOnBlockAgain();
        waitSeconds(3);
        Assert.assertEquals(blockingPage.getTextBlockMessages(),"Block messages");
        blockingPage.insertTextInBlockMessagesField();
        blockingPage.clickOnDoneButton();
        Assert.assertEquals(blockingPage.getTextBlockAppInvites(),"Block app invites");
        blockingPage.insertTextBlockAppInvites();
        Assert.assertEquals(blockingPage.getTextBlockEvents(),"Block event invites");
        blockingPage.insertTextBlockEventsField();
        Assert.assertEquals(blockingPage.getTextBlockApps(),"Block apps");
        blockingPage.insertBlockAppsField();
        Assert.assertEquals(blockingPage.getTextBlockPages(),"Block Pages");
        blockingPage.insertInBlockPageField();
    }
    @Test
    public void languageAndRegion23() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        languageAndRegionPage.clickLanguageAndRegion();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(languageAndRegionPage.getTextLanguageAndRegion(),"Language and Region Settings");
        languageAndRegionPage.clickOnFacebookLanguage();
        Assert.assertEquals(languageAndRegionPage.getTextFacebookLanguage(),"Facebook language");
        languageAndRegionPage.clickSelectLanguage();
        languageAndRegionPage.clickOnRussianOption();
        languageAndRegionPage.clickOnSaveLanguage();
        waitSeconds(3);
        driver.get("https://www.facebook.com/settings?tab=language&section=account&view");
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(languageAndRegionPage.getTextLanguageAndRegion(),"Настройки языка и региона");
        waitSeconds(1);
        languageAndRegionPage.clickSelectLanguage();
        languageAndRegionPage.clickOnEnglishOtion();
        languageAndRegionPage.clickOnSaveLanguage();
        waitSeconds(3);
        driver.get("https://www.facebook.com/settings?tab=language&edited=account");
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(languageAndRegionPage.getTextLanguageAndRegion(),"Language and Region Settings");
        Assert.assertEquals(languageAndRegionPage.getTextRegionFormat(),"Region format");
        languageAndRegionPage.clickRegionFormtat();
        Assert.assertEquals(languageAndRegionPage.getTextFormatForDates(),"Formats for dates, times and numbers");
        waitSeconds(1);
        languageAndRegionPage.clickOnFormatDropDown();
        waitSeconds(1);
        languageAndRegionPage.insertDateForFormatField();
        languageAndRegionPage.saveDatesFormat();
        languageAndRegionPage.clickOnTemperatureButton();
        Assert.assertEquals(languageAndRegionPage.getTextTemperature(),"Temperature");
        languageAndRegionPage.selectDropDownTempearture();
        languageAndRegionPage.clickOnCelsius();
        languageAndRegionPage.clickSaveButtomTemperature();
        waitSeconds(3);
        switchToIFrame(settingsGeneralPage.iFrame);
        languageAndRegionPage.clickOnTemperatureButton();
        Assert.assertEquals(languageAndRegionPage.getTextTemperature(),"Temperature");
        languageAndRegionPage.selectDropDownTempearture();
        languageAndRegionPage.clickOnFahrenheit();
        languageAndRegionPage.clickSaveButtomTemperature();
        waitSeconds(3);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(languageAndRegionPage.getTextPostsFromFriends(),"Posts from friends and Pages");
        languageAndRegionPage.clickTranslatePostsInto();
        languageAndRegionPage.selectLanguageToTranslateInto();
        languageAndRegionPage.clickOnRussianOption();
        languageAndRegionPage.selectLanguageToTranslateInto();
        languageAndRegionPage.clickOnEnglishOtion();
        languageAndRegionPage.clickOnSaveLanguageTranslatePostsInto();
        languageAndRegionPage.clickOnLanguageYouDontWantToBeOffered();
        Assert.assertEquals(languageAndRegionPage.getTextLanguageYouDontWantToBeOffered(),"Languages you don't want to be offered translations for");
        languageAndRegionPage.insertTextInInputBoxForLanguageYouDontWantToBeOffered();
        languageAndRegionPage.clickOnSaveButtonLanguagesYouDontWantToBeOffered();
        languageAndRegionPage.clickOnNoAutomaticTranslation();
        Assert.assertEquals(languageAndRegionPage.getTextNoAutomatiTranslation(),"Languages you don't want automatically translated");
        languageAndRegionPage.insertDateInNoAtomaticTransaltion();
        languageAndRegionPage.clickOnSaveNoAutomaticTranslation();
        languageAndRegionPage.clickMultilingualPost();
        Assert.assertEquals(languageAndRegionPage.getTextMultilingualPost(),"Multilingual posts");
        languageAndRegionPage.clickMultilingualCheckbox();
        languageAndRegionPage.clickSaveMultilingual();
        Assert.assertEquals(languageAndRegionPage.getTextTurnedOnOrOff(),"Turned on");
        languageAndRegionPage.clickMultilingualPost();
        languageAndRegionPage.clickMultilingualCheckbox();
        languageAndRegionPage.clickSaveMultilingual();
        Assert.assertEquals(languageAndRegionPage.getTextTurnedOnOrOff(),"Turned off");
    }
    @Test
    public void stories24() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        storiesPage.clickOnStoriesButton();
        waitSeconds(1);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(storiesPage.getTextStoriesSettings(),"Stories Settings");
        storiesPage.clickOnShareStoryInTheirOwnStory();
        Assert.assertEquals(storiesPage.getTextShareStoryInTheirOwnStory(),"Allow others to share your public stories to their own story?");
        storiesPage.clickOnDropDownInShareStoryInTheirStory();
        storiesPage.clickOnOptionInShareYourStoryInTheirStory();
        storiesPage.clickOnCloseShareYourStoryInTheirStory();
        storiesPage.clickOnShareIfYouMentionedThem();
        Assert.assertEquals(storiesPage.getTextShareIfYouMentionedThem(),"Allow people to share your stories if you mention them?");
        storiesPage.clickOnDropDownByIfYouMentionedThem();
        storiesPage.clickOnOptionInIfYouMentionedThem();
        storiesPage.clickOnCloseInIfYouMentionedThem();

    }

}
