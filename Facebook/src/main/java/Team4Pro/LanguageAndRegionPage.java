package Team4Pro;

import base.OurAPI;
import org.checkerframework.checker.formatter.qual.Format;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageAndRegionPage extends OurAPI {
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=language\"]")
    WebElement languageAndRegion;
    @FindBy(xpath = "//h2[@class=\"uiHeaderTitle\"]")
    WebElement languageAndRegionHeaderText;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/account.php\",\"rel\":\"async\"}']")
    WebElement facebookLanguage;
    @FindBy(xpath = "//h3[contains(text(),'Facebook language')]")
    WebElement facebookLanguageText;
    @FindBy(xpath = "//select[@name=\"new_language\"]")
    WebElement selectLanguage;
    @FindBy(xpath = "//option[@value=\"ru_RU\"]")
    WebElement russianLanguageOption;
    @FindBy(xpath = "//option[@value=\"en_US\"]")
    WebElement englishLangugeOption;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/account.php\"]/div/div[2]/div/label/input")
    WebElement saveButtonInLanguage;
    @FindBy(xpath = "//h3[contains(text(),'Region format')]")
    WebElement regionFormatText;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/region.php\",\"rel\":\"async\"}']")
    WebElement formatForDatesButton;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/region.php\"]/div/div/div/div[2]/span/a")
    WebElement dropDownFormatForDates;
    @FindBy(xpath = "//span[@placeholder=\"Search\"]/label/input")
    WebElement searchForFormatField;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/region.php\"]/div/div[2]/div/label[1]/input")
    WebElement saveButtonDates;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/temperature.php\",\"rel\":\"async\"}']")
    WebElement temperatureButton;
    @FindBy(xpath = "//select[@name=\"temperature\"]")
    WebElement selectTemperature;
    @FindBy(xpath = "//option[@value=\"2\"]")
    WebElement celsius;
    @FindBy(xpath = "//option[@value=\"1\"]")
    WebElement fahrenheits;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/region.php\"]/div/div/div/div")
    WebElement formatForDatesText;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/temperature.php\"]/div/div/div/div")
    WebElement temperatureText;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/temperature.php\"]/div/div[2]/div/label/input")
    WebElement saveButtonTemperatures;
    @FindBy(xpath = "//h3[contains(text(),'Posts from friends and Pages')]")
    WebElement postsFromFriendsText;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/primary.php\",\"rel\":\"async\"}']")
    WebElement translatePostsInto;
    @FindBy(xpath = "//select[@name=\"primary_dialect\"]")
    WebElement selectLanguageToTranslatePostsInto;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/primary.php\"]/div/div[2]/div/label/input")
    WebElement saveLanguageTranslatePostsInto;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/secondary.php\",\"rel\":\"async\"}']")
    WebElement languageYouDontWantToBeOfferedButton;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/secondary.php\"]/div/div/div/div[3]/div/div/div")
    WebElement inputBoxForLanguageYouDontWantToBeOffered;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/secondary.php\"]/div/div/div/div")
    WebElement languagesYouDontWantToBeOfferedText;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/secondary.php\"]/div/div[2]/div/label/input")
    WebElement saveButtonLanguagesYouDontWantToBeOffered;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/disable_autotranslate.php\",\"rel\":\"async\"}']")
    WebElement noAutomatiTranslation;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/disable_autotranslate.php\"]/div/div/div/div")
    WebElement noAromaticTranslationText;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/disable_autotranslate.php\"]/div/div/div/div[3]/div/div/div")
    WebElement inputFieldnoAromaticTranslation;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/disable_autotranslate.php\"]/div/div[2]/div/label/input")
    WebElement saveButtonFieldnoAtomaticTranslation;
    @FindBy(xpath ="//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/multilingual_composer.php\",\"rel\":\"async\"}']")
    WebElement multiligualPosts;
    @FindBy(xpath = "//h3[contains(text(),'Multilingual posts')]")
    WebElement multilingualPostsText;
    @FindBy(xpath = "//input[@id=\"multilingual_composer_enabled\"]")
    WebElement multilingualCheckbox;
    @FindBy(xpath = "//form[@action=\"/ajax/settings/language/multilingual_composer.php\"]/div/div[2]/div/label[1]")
    WebElement saveMultilangualPosts;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/multilingual_composer.php\",\"rel\":\"async\"}']/span[3]/div/div[2]/div")
    WebElement turnedOnAndOff;

    public void clickLanguageAndRegion() {
        click(languageAndRegion);
    }
    public String getTextLanguageAndRegion() {
        return languageAndRegionHeaderText.getText();
    }
    public void clickOnFacebookLanguage() {
        click(facebookLanguage);
    }
    public String getTextFacebookLanguage() {
        return facebookLanguageText.getText();
    }
    public void clickSelectLanguage() {
        click(selectLanguage);
    }
    public void clickOnRussianOption() {
        click(russianLanguageOption);
    }
    public void clickOnEnglishOtion() {
        click(englishLangugeOption);
    }
    public void clickOnSaveLanguage() {
        click(saveButtonInLanguage);
    }
    public void clickRegionFormtat() {
        click(formatForDatesButton);
    }
    public String getTextRegionFormat() {
        return regionFormatText.getText();
    }
    public String getTextFormatForDates() {
        return formatForDatesText.getText();
    }
    public void clickOnFormatDropDown() {
        click(dropDownFormatForDates);
    }
    public void insertDateForFormatField() {
        enterText(searchForFormatField,"Russian");
    }
    public void saveDatesFormat() {
        click(saveButtonDates);
    }
    public void clickOnTemperatureButton() {
        click(temperatureButton);
    }
    public String getTextTemperature() {
        return temperatureText.getText();
    }
    public void selectDropDownTempearture() {
        click(selectTemperature);
    }
    public void clickOnCelsius() {
        click(celsius);
    }
    public void clickOnFahrenheit() {
        click(fahrenheits);
    }
    public void clickSaveButtomTemperature() {
        click(saveButtonTemperatures);
    }
    public String getTextPostsFromFriends() {
        return postsFromFriendsText.getText();
    }
    public void clickTranslatePostsInto() {
        click(translatePostsInto);
    }
    public void selectLanguageToTranslateInto() {
        click(selectLanguageToTranslatePostsInto);
    }
    public void clickOnSaveLanguageTranslatePostsInto() {
        click(saveLanguageTranslatePostsInto);
    }
    public void clickOnLanguageYouDontWantToBeOffered() {
        click(languageYouDontWantToBeOfferedButton);
    }
    public String getTextLanguageYouDontWantToBeOffered() {
        return languagesYouDontWantToBeOfferedText.getText();
    }
    public void insertTextInInputBoxForLanguageYouDontWantToBeOffered() {
        enterText(inputBoxForLanguageYouDontWantToBeOffered,"Russian");
    }
    public void clickOnSaveButtonLanguagesYouDontWantToBeOffered() {
        click(saveButtonLanguagesYouDontWantToBeOffered);
    }
    public void clickOnNoAutomaticTranslation() {
        click(noAutomatiTranslation);
    }
    public String getTextNoAutomatiTranslation() {
        return noAromaticTranslationText.getText();
    }
    public void insertDateInNoAtomaticTransaltion() {
        enterText(inputFieldnoAromaticTranslation,"Russian");
    }
    public void clickOnSaveNoAutomaticTranslation() {
        click(saveButtonFieldnoAtomaticTranslation);
    }
    public void clickMultilingualPost() {
        click(multiligualPosts);
    }
    public String getTextMultilingualPost() {
        return multilingualPostsText.getText();
    }
    public void clickMultilingualCheckbox() {
        click(multilingualCheckbox);
    }
    public void clickSaveMultilingual() {
        click(saveMultilangualPosts);
    }
    public String getTextTurnedOnOrOff() {
        return turnedOnAndOff.getText();
    }
}
