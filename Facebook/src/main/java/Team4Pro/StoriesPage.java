package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class StoriesPage extends OurAPI {
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=stories\"]")
    WebElement storiesButton;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/stories\\/story_to_story.php\",\"rel\":\"async\"}']")
    WebElement shareStoryInTheirOwnStory;
    @FindBy(xpath = "//h2[@class=\"uiHeaderTitle\"]")
    WebElement storiesSettings;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li/div/div/ul/li/div/div/div/div[1]")
    WebElement shareStoryInTheirOwnStoryText;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/stories/story_to_story.php\"]/div/div/a")
    WebElement dropDownInShareStoryInTheirStory;
    @FindBy(xpath = "//div[@id=\"globalContainer\"]/div[3]/div/div/div/ul/li[2]/a")
    WebElement optionInShareYourStoryInTheirStory;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li/div/div/ul/li/div/div/a")
    WebElement closeShareYourStoryInTheirStory;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/stories\\/mention_story_to_story.php\",\"rel\":\"async\"}']")
    WebElement shareIfYouMentionedThem;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li/div/div/ul/li[2]/div/div/div/div[1]")
    WebElement shareIfYouMentionedThemText;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/stories/mention_story_to_story.php\"]/div/div/a")
    WebElement dropDownByIfYouMentionedThem;
    @FindBy(xpath = "//div[@id=\"globalContainer\"]/div[4]/div/div/div/ul/li[1]/a")
    WebElement optionInIfYouMentionedThem;
    @FindBy(xpath = "//div[@id=\"SettingsPage_Content\"]/ul/li/div/div/ul/li[2]/div/div/a")
    WebElement closeOptionInIfYouMentionedThem;

    public void clickOnStoriesButton() {
        click(storiesButton);
    }
    public String getTextShareStoryInTheirOwnStory() {
        return shareStoryInTheirOwnStoryText.getText();
    }
    public void clickOnShareStoryInTheirOwnStory() {
        click(shareStoryInTheirOwnStory);
    }
    public String getTextStoriesSettings() {
        return storiesSettings.getText();
    }
    public void clickOnDropDownInShareStoryInTheirStory() {
        click(dropDownInShareStoryInTheirStory);
    }
    public void clickOnOptionInShareYourStoryInTheirStory() {
        click(optionInShareYourStoryInTheirStory);
    }
    public void clickOnCloseShareYourStoryInTheirStory() {
        click(closeShareYourStoryInTheirStory);
    }
    public void clickOnShareIfYouMentionedThem() {
        click(shareIfYouMentionedThem);
    }
    public String getTextShareIfYouMentionedThem() {
        return shareIfYouMentionedThemText.getText();
    }
    public void clickOnDropDownByIfYouMentionedThem() {
        click(dropDownByIfYouMentionedThem);
    }
    public void clickOnOptionInIfYouMentionedThem() {
        click(optionInIfYouMentionedThem);
    }
    public void clickOnCloseInIfYouMentionedThem() {
        click(closeOptionInIfYouMentionedThem);
    }

}

