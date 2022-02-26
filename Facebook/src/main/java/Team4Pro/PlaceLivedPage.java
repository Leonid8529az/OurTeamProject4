package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.ws.WebEndpoint;
import java.security.SecureRandom;

public class PlaceLivedPage extends OurAPI {
    @FindBy(xpath = "//span[contains(text(),'Add current city')]")
    WebElement addCurrentCity;
    @FindBy(xpath = "//span[contains(text(),'Add hometown')]")
    WebElement addHometown;
    @FindBy(xpath = "//span[contains(text(),'Add city')]")
    WebElement addCity;
    @FindBy(xpath = "//label[@aria-label=\"Current City\"]")
    WebElement currentCityTextBox;
    @FindBy(xpath = "//label[@aria-label=\"Current City\"]/div/div/span")
    WebElement currentCityText;
    @FindBy(xpath = "//div[@aria-label=\"Save\"]")
    WebElement saveButtonGlobal;
    @FindBy(xpath = "(//div[@aria-label=\"Save\"])[1]")
    WebElement saveButtonPlaceLived;
    @FindBy(xpath = "(//div[@aria-label=\"Save\"])[2]")
    WebElement saveButtonHometown;
    @FindBy(xpath = "(//div[@aria-label=\"Save\"])[3]")
    WebElement saveButtonCity;
    @FindBy(xpath = "//label[@aria-label=\"Hometown\"]")
    WebElement hometownTextField;
    @FindBy(xpath = "//label[@aria-label=\"Hometown\"]/div/div/span")
    WebElement hometownText;
    @FindBy(xpath = "//label[@aria-label=\"City\"]")
    WebElement cityTextBox;
    @FindBy(xpath = "//label[@aria-label=\"City\"]/div/div/span")
    WebElement cityText;
    @FindBy(xpath = "//div[@class=\"dati1w0a tu1s4ah4 f7vcsfb0 discj3wi\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div")
    WebElement yearsDropDown;
    @FindBy(xpath = "//div[@class=\"dati1w0a tu1s4ah4 f7vcsfb0 discj3wi\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/span")
    WebElement textOfTheYear;
    @FindBy(xpath = "//span[contains(text(),'2019')]")
    WebElement optionForYear;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[2]")
    WebElement monthDropDown;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[2]/span")
    WebElement monthDropDownText;
    @FindBy(xpath = "//span[contains(text(),'October')]")
    WebElement optionForMonth;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[3]/span")
    WebElement dayDropDownText;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[3]")
    WebElement dayDropDown;
    @FindBy(xpath = "//span[contains(text(),'27')]")
    WebElement optionForDay;
    @FindBy(xpath = "//ul[@aria-label=\"۱۰ suggested searches\"]/li[1]")
    WebElement suggestionInCurrentCity;
    @FindBy(xpath = "//ul[@aria-label=\"۱۰ suggested searches\"]/li[1]")
    WebElement suggestionInHometown;
    @FindBy(xpath = "//ul[@aria-label=\"۱۰ suggested searches\"]/li[1]")
    WebElement suggestionInCity;
    @FindBy(xpath = "(//div[@aria-label=\"Options\"])[1]")
    WebElement firstOptionButton;
    @FindBy(xpath = "(//div[@aria-label=\"Options\"])[2]")
    WebElement secondOptionButton;
    @FindBy(xpath = "(//div[@aria-label=\"Options\"])[3]")
    WebElement thirdOptionButton;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div[1]/div/div[1]")
    WebElement editButtonInOption;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div/span")
    WebElement editButtonText;
    @FindBy(xpath = "(//a[@aria-label=\"Edit\"])[1]")
    WebElement clickOnEditInEditDetails;
    @FindBy(xpath = "//div[@data-pagelet=\"ProfileAppSection_0\"]/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/span/a/span/span")
    WebElement savedCurrentCityText;
    @FindBy(xpath = "//div[@data-pagelet=\"ProfileAppSection_0\"]/div/div/div/div/div[2]/div/div/div/div[4]/div/div/div/div/div[2]/div[1]/span/a/span/span")
    WebElement savedHometownText;
    @FindBy(xpath = "//div[@data-pagelet=\"ProfileAppSection_0\"]/div/div/div/div/div[2]/div/div/div/div[5]/div/div/div/div/div[2]/div[1]/span/a/span/span")
    WebElement savedCityText;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div[1]/div/div[2]")
    WebElement deleteButton;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/span")
    WebElement deleteButtonText;
    @FindBy(xpath = "//span[contains(text(),'Are you sure?')]")
    WebElement areYouSureText;
    @FindBy(xpath = "(//div[@aria-label=\"Cancel\"])[2]")
    WebElement cancelButton;
    @FindBy(xpath = "(//div[@aria-label=\"Cancel\"])[2]/div/div/div/span/span")
    WebElement cancelText;
    @FindBy(xpath = "(//div[@aria-label=\"Confirm\"])[1]")
    WebElement confirmButton;
    @FindBy(xpath = "(//div[@aria-label=\"Confirm\"])[1]/div/div/div/span/span")
    WebElement confirmText;


    public void clickOnAddCurrentCity() {
        click(addCurrentCity);
    }
    public void clickOnAddHometown() {
        click(addHometown);
    }
    public void clickOnAddCity() {
        click(addCity);
    }
    public String getTextCurrentCityText() {
        return currentCityText.getText();
    }
    public void insertDataInCurrentCity(String text) {
        feedDataWithNoClick(currentCityTextBox,text);
    }
    public String getTextHometown() {
        return hometownText.getText();
    }
    public void insertDataInHometown(String text) {
        feedDataWithNoClick(hometownTextField,text);
    }
    public String getTextCity() {
        return cityText.getText();
    }
    public void insertDataInCity(String text) {
        feedDataWithNoClick(cityTextBox,text);
    }
    public void clickOnSaveCurrentCity() {
        click(saveButtonPlaceLived);
    }
    public void clickOnSaveHometown() {
        click(saveButtonHometown);
    }
    public void clickOnSaveCity() {
        click(saveButtonCity);
    }
    public void globalSaveButton() {
        click(saveButtonGlobal);
    }
    public String getTextYear() {
        return textOfTheYear.getText();
    }
    public void clickOnYearsDropDown() {
        click(yearsDropDown);
    }
    public void clickOnOptionForYear() {
        click(optionForYear);
    }
    public void clickOnMonthDropDown() {
        click(monthDropDown);
    }
    public void clickOnOptionForMonth() {
        click(optionForMonth);
    }
    public void clickDayDropDown() {
        click(dayDropDown);
    }
    public void clickOnOptionForDay() {
        click(optionForDay);
    }
    public String getTextMonthDropDown() {
        return monthDropDownText.getText();
    }
    public String getTextDayDropDown() {
        return dayDropDownText.getText();
    }
    public void clickOnSuggestionInCurrentCity() {
        click(suggestionInCurrentCity);
    }
    public void clickOnSuggestionInHometown() {
        click(suggestionInHometown);
    }
    public void clickOnSuggestionInCity() {
        click(suggestionInCity);
    }
    public void clickOnOptionsOne() {
        click(firstOptionButton);
    }
    public void clickOnOptionsTwo() {
        click(secondOptionButton);
    }
    public void clickOnOptionsThree() {
        click(thirdOptionButton);
    }
    public void clickOnEditButton() {
        click(editButtonInOption);
    }
    public String getTextEditButton() {
        return editButtonText.getText();
    }
    public void clickOnEditInEditDetails() {
        click(clickOnEditInEditDetails);
    }
    public void cleanCurrentCityTextBox() {
        currentCityTextBox.sendKeys(Keys.CONTROL + "a");
        currentCityTextBox.sendKeys(Keys.DELETE);
    }
    public void cleanHometownTextBox() {
        hometownTextField.sendKeys(Keys.CONTROL + "a");
        hometownTextField.sendKeys(Keys.DELETE);
    }
    public void cleanCityTextBox() {
        cityTextBox.sendKeys(Keys.CONTROL + "a");
        cityTextBox.sendKeys(Keys.DELETE);

    }
    public void clickOnDeleteButton() {
        click(deleteButton);
    }
    public String getTextDeleteButton() {
        return deleteButtonText.getText();
    }
    public void clickOnCancel() {
        click(cancelButton);
    }
    public void clickOnConfirem() {
        click(confirmButton);
    }
    public String getTextAreYouSure() {
        return areYouSureText.getText();
    }
    public String getTextCancelButton() {
        return cancelText.getText();
    }
    public String getTextConfirmButton() {
        return confirmText.getText();
    }
    public String getTextSavedCurrentCity() {
        return savedCurrentCityText.getText();
    }
    public String getTextSavedHometown() {
        return savedHometownText.getText();
    }
    public String getTextSavedCity() {
        return savedCityText.getText();
    }


}
