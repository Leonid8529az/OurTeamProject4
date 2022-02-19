package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileAndTaggingPage extends OurAPI {
    @FindBy(xpath = "//a[@href='https://www.facebook.com/settings?tab=timeline']")
    WebElement profileAndTagging;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div")
    WebElement buttonByWhoCanPostInYourProfile;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/span")
    WebElement whoCanPostInYourProfileText;
    @FindBy(xpath = "//div[@aria-checked='false']")
    WebElement optionInWhoCanPostInYourProfile;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[4]/div/div/div/div/div/div/div/span")
    WebElement seeWhatOthersPostText;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[4]/div/div/div[2]/div/div/div/span/div")
    WebElement buttonBySeeWhatOthersPostText;
    @FindBy(xpath = "//div[@aria-label='Select audience']/div/div/div[3]/div/div/div/div/div/div/div/div")
    WebElement optionBySeeWhatOthersPost;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[6]/div/div/div/div/div/div")
    WebElement hideComments;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div/div/span")
    WebElement hideCommentsText;
    @FindBy(xpath = "//textarea[@id='CometContentModerationBlocklist']")
    WebElement textFieldInHideComments;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div[4]/div/div/div")
    WebElement saveButtonSeeWhatOthersPost;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/span/div")
    WebElement buttonByWhoCanSeePostsYouAreTagged;
    @FindBy(xpath = "//div[@aria-label='Select audience']/div/div/div[3]/div/div/div/div/div/div/div")
    WebElement optionByWhoCanSeePostsYouAreTagged;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/span")
    WebElement whoCanSeePostsYouAreTaggedText;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[4]/div/div/div[2]/div")
    WebElement buttonByWhoDoYouWantToAddToAudience;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[4]/div/div/div/div/div/div/div/span")
    WebElement whoDoYouWantToAddToAudienceText;
    @FindBy(xpath = "//div[@aria-label='Select audience']/div/div/div[3]/div/div/div/div/div/div/div[2]/div")
    WebElement optionInWhoDoYouWantToAddToAudience;
    @FindBy(xpath = "//input[@aria-label=\"Toggle to enable allowing to review posts you're tagged in before the post appears on your Profile / page\"]")
    WebElement checkBoxReviewPosts;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[4]/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/span")
    WebElement reviewPostsText;
    @FindBy(xpath = "//div[@aria-label='Settings']/div/div/div/div/div/div[4]/div/div/div/div/div[2]/div/div/div[4]/div/div/div/div/div/div/div/span")
    WebElement reviewTagsText;
    @FindBy(xpath = "//input[@aria-label=\"Toggle to enable allowing to review tags people add to your posts before the tags appear on Facebook\"]")
    WebElement checkBoxReviewTags;

    public void clickOnProfileAndTagging() {
        click(profileAndTagging);
    }
    public String getTextWhoCanPostInYourProfile() {
        return whoCanPostInYourProfileText.getText();
    }
    public void clickOnButtonByWhoCanPostInYourProfile() {
        click(buttonByWhoCanPostInYourProfile);
    }
    public void clickOnOptionInWhoCanPostInYourProfile() {
        click(optionInWhoCanPostInYourProfile);
    }
    public String getTextSeeWhatOthersPost() {
        return seeWhatOthersPostText.getText();
    }
    public void clickOnButtonBySeeWhatOthersPostText() {
        click(buttonBySeeWhatOthersPostText);
    }
    public void clickOptionBySeeWhatOthersPost() {
        click(optionBySeeWhatOthersPost);
    }
    public void clickOnHideComments() {
        click(hideComments);
    }
    public String getTextHideComments() {
        return hideCommentsText.getText();
    }
    public void incertDataIntoTextFieldInHideComments(String whichWord) {
        enterText(textFieldInHideComments,whichWord);
    }
    public void saveSeeWhatOthersPost() {
        click(saveButtonSeeWhatOthersPost);
    }
    public void clickOnButtonByWhoCanSeePostsYouAreTagged() {
        click(buttonByWhoCanSeePostsYouAreTagged);
    }
    public void clickOptionByWhoCanSeePostsYouAreTagged() {
        click(optionByWhoCanSeePostsYouAreTagged);

    }
    public String getTextWhoCanSeePostsYouAreTagged() {
        return whoCanSeePostsYouAreTaggedText.getText();
    }
    public void clickbuttonByWhoDoYouWantToAddToAudience() {
        click(buttonByWhoDoYouWantToAddToAudience);
    }
    public void clickOnOptionInWhoDoYouWantToAddToAudience() {
        click(optionInWhoDoYouWantToAddToAudience);
    }
    public String getTextWhoDoYouWantToAddToAudience() {
        return whoDoYouWantToAddToAudienceText.getText();
    }
    public void clickOnCheckBoxReviewPosts() {
        click(checkBoxReviewPosts);
    }
    public String getTextReviewPosts() {
        return reviewPostsText.getText();
    }
    public String getTextReviewTags() {
        return reviewTagsText.getText();
    }
    public void clickOnCheckBoxReviewTags() {
        click(checkBoxReviewTags);
    }
}
