package Team4Pro;

import base.OurAPI;
import org.checkerframework.checker.formatter.qual.Format;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublicPostsPage extends OurAPI {
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=followers\"]")
    WebElement publicPostButton;
    @FindBy(xpath = "//*[text()='Who Can Follow Me']")
    WebElement whoCanFollowMeText;
    @FindBy(xpath = "//a[@class='_42ft _4jy0 _55pi _5vto _55_p _2agf _4o_4 _p _4jy3 _517h _51sy']")
    WebElement dropDownByWhoCanFollowMe;
    @FindBy(xpath = "//div[@class=\"uiContextualLayer uiContextualLayerBelowLeft\"]/div/div/ul/li/a")
    WebElement optionInDropDownByWhoCanFollowMe;
    @FindBy(xpath = "//a[@href=\"/settings?tab=followers&section=comment\"]")
    WebElement publicPostCommentsButton;
    @FindBy(xpath = "//a[@class=\"_42ft _42fu _4-s1 _2agf _4o_4 _p\"]")
    WebElement dropDownByPublickPostComments;
    @FindBy(xpath = "//h3[contains(text(),\"Public Post Comments\")]")
    WebElement publicPostCommentsText;
    @FindBy(xpath = "//div[@class = '_54nq _57di _569t _54hy']/div/ul/li[3]/a")
    WebElement optionPublicPostComments;
    @FindBy(xpath = "//strong[contains(text(),'Public Post Notifications')]")
    WebElement publicPostNotificationText;
    @FindBy(xpath = "//a[@href=\"/settings?tab=followers&section=notifications\"]")
    WebElement publicPostNotificationButton;
    @FindBy(xpath = "//span[contains(text(),\"Nobody\")]")
    WebElement optionInDropDownByPublicPostNotification;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li[2]/ul/li[2]/div/div/div/div[2]/div/form/div/div/a")
    WebElement dropDownByPublicPostNotification;
    @FindBy(xpath = "//a[@href=\"/settings?tab=followers&section=public_profile_media\"]")
    WebElement publicProfileInfoButton;
    @FindBy(xpath = "//strong[contains(text(),'Public Profile Info')]")
    WebElement publicProfileInfoText;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li[2]/ul/li[3]/div/div/div/div[2]/div/form/div/div/a")
    WebElement dropDownByPublicProfileInfo;
    @FindBy(xpath = "(//div[@data-testid=\"undefined\"])[8]/div/div/div/ul/li/a")
    WebElement optionInDropDownByPublicProfileInfo;
    @FindBy(xpath = "//span[contains(text(),'Off-Facebook Previews')]")
    WebElement offFacebookPreviewText;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li[3]/div/div[3]/div/a")
    WebElement dropDownByOffFacebookPreview;
    @FindBy(xpath = "//a[@aria-checked=\"false\"]/span/span")
    WebElement optionInDropDownByOffFacebookPreview;
    @FindBy(xpath = "//a[@href=\"/settings?tab=followers&section=ranked_comments\"]")
    WebElement commentRankingButton;
    @FindBy(xpath = "//strong[contains(text(),'Comment Ranking')]")
    WebElement commentRankingText;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li[4]/ul/li/div/div/div/div[2]/div/form/div/div/a")
    WebElement dropDownByCommentRanking;
    @FindBy(xpath = "//div[@id=\"globalContainer\"]/div[6]/div/div/div/ul/li/a")
    WebElement optionIndropDownByCommentRanking;
    @FindBy(xpath = "//a[@href=\"/settings?tab=followers&section=username\"]")
    WebElement usernameButton;
    @FindBy(xpath = "//div[contains(text(),'Your account must be verified before you can change your username.')]")
    WebElement textInsideUsernameButton;
    @FindBy(xpath = "//input[@value=\"Close\"]")
    WebElement closeButton;

    public void clickPublicPostButton() {
        click(publicPostButton);
    }
    public String getTextWhoCanFollowMe() {
        return whoCanFollowMeText.getText();
    }
    public void clickOnDropDownByWhoCanFollowMe() {
        click(dropDownByWhoCanFollowMe);
    }
    public void clickOnOptionInDropDownByWhoCanFollowMe() {
        click(optionInDropDownByWhoCanFollowMe);
    }
    public void clickOnPublicPostCommentsButton() {
        click(publicPostCommentsButton);
    }
    public String getTextPublicPostComment() {
        return publicPostCommentsText.getText();
    }
    public void clickOnDropDownByPublicPostComments() {
        click(dropDownByPublickPostComments);
    }
    public void clickOnOptionPublicPostComments() {
        click(optionPublicPostComments);
    }
    public void clickOnPublicPostNotificationButton() {
        click(publicPostNotificationButton);
    }
    public String getTextPublicPostNotification() {
        return publicPostNotificationText.getText();
    }
    public void clickOnDropDownByPublicPostNotification() {
        click(dropDownByPublicPostNotification);
    }
    public void clickOnOptionInDropDownByPublicPostNotification() {
        click(optionInDropDownByPublicPostNotification);
    }
    public void clickOnPublicProfileInfoButton() {
        click(publicProfileInfoButton);
    }
    public String getTextPublicProfileInfo() {
        return publicProfileInfoText.getText();
    }
    public void clickOnDropDownByPublicProfileInfo() {
        click(dropDownByPublicProfileInfo);
    }
    public void clickOnOptionInDropDownByPublicProfileInfo() {
        click(optionInDropDownByPublicProfileInfo);
    }
    public String getTextOffFacebookPreview() {
        return offFacebookPreviewText.getText();
    }
    public void clickOnDropDownByOffFacebookPreview() {
        click(dropDownByOffFacebookPreview);
    }
    public void clickOnOptionInDropDownByOffFacebookPreview() {
        click(optionInDropDownByOffFacebookPreview);
    }
    public void clickOnCommentRanking() {
        click(commentRankingButton);
    }
    public String getTextCommentRanking() {
        return commentRankingText.getText();
    }
    public void clickOnDropDownByCommentRanking() {
        click(dropDownByCommentRanking);
    }
    public void clickOnOptionIndropDownByCommentRanking() {
        click(optionIndropDownByCommentRanking);
    }
    public void clickOnUsername() {
        click(usernameButton);
    }
    public String getTextUsername() {
        return textInsideUsernameButton.getText();
    }
    public void clickOnCloseButton() {
        click(closeButton);
    }
}
