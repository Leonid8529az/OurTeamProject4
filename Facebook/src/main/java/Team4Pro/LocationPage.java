package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationPage extends OurAPI {
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=location\"]")
    WebElement location;
    @FindBy(xpath = "//a[@class='fbSettingsListLink clearfix pvm phs']")
    WebElement localHistoryButton;
    @FindBy(xpath = "//li[@class='fbSettingsListItem clearfix openPanel']/div/div/div/div")
    WebElement localHistoryText;
    @FindBy(xpath = "//form[@action='/ajax/settings/location/location_history.php']/div/div/a")
    WebElement dropDownByLocalHistory;
    @FindBy(xpath = "//div[@class='uiContextualLayer uiContextualLayerBelowLeft']/div/div/ul/li/a")
    WebElement clickOn;
    @FindBy(xpath = "//a[@class='_cuh']")
    WebElement closeByLocalHistory;
    @FindBy(xpath = "//a[@data-testid='viewLocationHistory']")
    WebElement viewLocationHistory;
    @FindBy(xpath = "//h1[text()='Location History View']")
    WebElement locationHistoryViewText;

    public void clickOnLocation() {
        click(location);
    }
    public String getTextLocalHistory() {
        return localHistoryText.getText();
    }
    public void clickOnLocalHistoryButton() {
        click(localHistoryButton);
    }
    public void clickOnDropDownByLocalHistory() {
        click(dropDownByLocalHistory);
    }
    public void clickOn() {
        click(clickOn);
    }
    public void closeLocalHistory() {
        click(closeByLocalHistory);
    }
    public void clickOnViewLocationHistory() {
        click(viewLocationHistory);
    }
    public String getTextLocationHistoryView() {
        return locationHistoryViewText.getText();
    }
}
