package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;

public class WorkAndEducationPage extends OurAPI {
    @FindBy(xpath = "//span[contains(text(),'Add a workplace')]")
    WebElement addAWorkplace;
    @FindBy(xpath = "//input[@aria-label=\"Company\"]")
    WebElement companyTextBox;
    @FindBy(xpath = "//label[@aria-label=\"Company\"]/div/div/span")
    WebElement companyText;
    @FindBy(xpath = "//label[@aria-label=\"Position\"]/div/div/span")
    WebElement positionText;
    @FindBy(xpath = "//label[@aria-label=\"Position\"]/div/div/input")
    WebElement positionTextBox;
    @FindBy(xpath = "//label[@aria-label=\"City/Town\"]/div/div/span")
    WebElement cityTonwText;
    @FindBy(xpath = "//label[@aria-label=\"City/Town\"]/div/div/input")
    WebElement cityTownTextBox;
    @FindBy(xpath = "//label[@aria-label=\"Description\"]/div/div/span")
    WebElement descriptionText;
    @FindBy(xpath = "//label[@aria-label=\"Description\"]/div/div/textarea")
    WebElement descriptionTextBox;
    @FindBy(xpath = "//input[@name=\"is_current\"]")
    WebElement currentlyWorkHereCheckbox;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[1]/div/div/div/div")
    WebElement firstYearDropDown;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[3]/div/div/div/div")
    WebElement secondYearDropDown;
    @FindBy(xpath = "//span[contains(text(),'2020')]")
    WebElement optionForFirstYearDropDown;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[1]/div/div[2]/div/div")
    WebElement firstMonthDropDown;
    @FindBy(xpath = "//span[contains(text(),'April')]")
    WebElement optionForFirstMonthDropDown;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[1]/div/div[3]/div")
    WebElement firstDayDropDown;
    @FindBy(xpath = "//span[contains(text(),'11')]")
    WebElement optionForFirstDayDropDown;
    @FindBy(xpath = "(//span[contains(text(),'2022')])[2]")
    WebElement optionForSecondYearDropDown;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[3]/div/div[2]/div/div")
    WebElement secondMonthDropDown;
    @FindBy(xpath = "//span[contains(text(),'June')]")
    WebElement optionForSecondMonthDropDown;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[3]/div/div[3]/div")
    WebElement secondDayDropDown;
    @FindBy(xpath = "(//span[contains(text(),'20')])[4]")
    WebElement optionForSecondDayDropDown;
    @FindBy(xpath = "//div[@aria-label=\"Save\"]")
    WebElement clickOnSaveButton;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[1]/div/div/div/div/span")
    WebElement firstYearText;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[3]/div/div/div/div/span")
    WebElement secondYearText;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[1]/div/div[2]/div/div/span")
    WebElement firstMonthText;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[3]/div/div[2]/div/div/span")
    WebElement secondMonthText;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[1]/div/div[3]/div/span")
    WebElement firstDayText;
    @FindBy(xpath = "//div[@class=\"sv5sfqaa lhclo0ds j83agx80 bp9cbjyn\"]/div[3]/div/div[3]/div/span")
    WebElement secondDayText;
    @FindBy(xpath = "//div[@aria-label=\"Options\"]")
    WebElement optionsInAddWork;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 swg4t2nn\"]/div/div/div/div/div/div/div[1]")
    WebElement editWorkPlaceButton;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr l9j0dhe7\"]/div/div[1]/div[2]/div/div/span")
    WebElement editWorkPlaceText;
    @FindBy(xpath = "//label[@aria-label=\"Description\"]/div/div/span[2]")
    WebElement descriptionTextWhenYouEditWorkplace;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr l9j0dhe7\"]/div/div[2]/div[2]/div/div/span")
    WebElement deleteWorkplaceText;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 swg4t2nn\"]/div/div/div/div/div/div/div[2]")
    WebElement deleteWorkplaceButton;
    @FindBy(xpath = "//div[@aria-label=\"Are you sure?\"]/div[4]/div/div[1]/div[1]")
    WebElement conforimInDeleteWorkplace;
    @FindBy(xpath = "//div[@aria-label=\"Are you sure?\"]/div/div/h2/span/span")
    WebElement areYouSureText;
    @FindBy(xpath = "//div[@aria-label=\"Are you sure?\"]/div[4]/div/div[2]/div[2]")
    WebElement cancelInDeleteWorkplace;
    @FindBy(xpath = "//div[@aria-label=\"Are you sure?\"]/div[4]/div/div[2]/div[2]/div/div/div/span/span")
    WebElement cancelText;
    @FindBy(xpath = "//div[@aria-label=\"Are you sure?\"]/div[4]/div/div[1]/div[1]/div/div/div/span/span")
    WebElement confirmText;
    @FindBy(xpath = "//div[@class=\"dati1w0a tu1s4ah4 f7vcsfb0 discj3wi\"]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/span")
    WebElement textOfWorkplaceInSaved;
    @FindBy(xpath = "//div[@class=\"dati1w0a tu1s4ah4 f7vcsfb0 discj3wi\"]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/span/a/span/span")
    WebElement textOfCompanyInSaved;
    @FindBy(xpath = "//span[contains(text(),'Add a high school')]")
    WebElement addAHighSchool;
    @FindBy(xpath = "//label[@aria-label=\"School\"]/div/div/span")
    WebElement schoolText;
    @FindBy(xpath = "//label[@aria-label=\"School\"]/div/div/input")
    WebElement schoolTextBox;
    @FindBy(xpath = "//input[@name=\"is_current\"]")
    WebElement graduatedCheckBox;
    @FindBy(xpath = "//span[contains(text(),'2017')]")
    WebElement optionForEditFirsYear;
    @FindBy(xpath = "//span[contains(text(),'December')]")
    WebElement optionForEditFirstMonth;
    @FindBy(xpath = "//span[contains(text(),'4')]")
    WebElement optionForEditFirstDay;
    @FindBy(xpath = "//span[contains(text(),'2019')]")
    WebElement optionForEditSecondYear;
    @FindBy(xpath = "//span[contains(text(),'September')]")
    WebElement optionForEditSecondMonth;
    @FindBy(xpath = "//span[contains(text(),'14')]")
    WebElement optionForEditSecondDay;
    @FindBy(xpath = "//div[@aria-label=\"Options\"]")
    WebElement optionButton;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div[1]/div/div[1]")
    WebElement editSchoolButton;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div/span")
    WebElement editSchoolText;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/span")
    WebElement deleteSchoolText;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div[1]/div/div[2]")
    WebElement deleteSchool;
    @FindBy(xpath = "//span[contains(text(),'Add a college')]")
    WebElement addACollege;
    @FindBy(xpath = "(//label[@aria-label=\"Concentration\"])[1]")
    WebElement firstConcentration;
    @FindBy(xpath = "(//label[@aria-label=\"Concentration\"])[1]/div/div/span")
    WebElement firstConcentrationText;
    @FindBy(xpath = "(//label[@aria-label=\"Concentration\"])[2]")
    WebElement secondConcentartion;
    @FindBy(xpath = "(//label[@aria-label=\"Concentration\"])[2]/div/div/span")
    WebElement secondConcentrationText;
    @FindBy(xpath = "(//label[@aria-label=\"Concentration\"])[3]")
    WebElement thirdConcentartion;
    @FindBy(xpath = "(//label[@aria-label=\"Concentration\"])[3]/div/div/span")
    WebElement thirdConcentrationText;
    @FindBy(xpath = "(//input[@name=\"attended_for\"])[2]")
    WebElement graduateSchoolCheckbox;
    @FindBy(xpath = "(//input[@name=\"attended_for\"])[1]")
    WebElement collegeCheckbox;
    @FindBy(xpath = "//label[@aria-label=\"Degree\"]/div/div/span")
    WebElement degreeText;
    @FindBy(xpath = "//label[@aria-label=\"Degree\"]")
    WebElement degreeTextBox;



    public void clickOnAddWorkplace() {
        click(addAWorkplace);
    }
    public String getTextAddAWorkplace() {
        return addAWorkplace.getText();
    }
    public String getTextCompany() {
        return companyText.getText();
    }
    public void insertDataInCompanyTextBox(String text) {
        enterText(companyTextBox,text);
    }
    public String getTextPosition() {
        return positionText.getText();
    }
    public void insertDataInPositionTextBox(String text) {
        enterText(positionTextBox,text);
    }
    public String getTextCityOrTown() {
        return cityTonwText.getText();
    }
    public void insertDataInCityTownTextBox(String text) {
        enterText(cityTownTextBox,text);
    }
    public String getTextDescription() {
        return descriptionText.getText();
    }
    public void insertDataDescriptionField(String text) {
        enterText(descriptionTextBox,text);
    }
    public void clickOnCurrentlyWorkThereCheckBox() {
        click(currentlyWorkHereCheckbox);
    }
    public String getTextFirstYearDropDown() {
        return firstYearText.getText();
    }
    public void clickOnFirstYearDropDown() {
        click(firstYearDropDown);
    }
    public void clickOnOptionForFirstYearDropDown() {
        click(optionForFirstYearDropDown);
    }
    public String getTextSelectedOptionFirstYear() {
        return optionForFirstYearDropDown.getText();
    }
    public String getTextFirstMonthDropDown() {
        return firstMonthText.getText();
    }
    public void clickOnFirstMonthDropDown() {
        click(firstMonthDropDown);
    }
    public void clickOnOptionForFirstMonthDropDown() {
        click(optionForFirstMonthDropDown);
    }
    public String getTextSelectedOptionFirstMonth() {
        return optionForFirstMonthDropDown.getText();
    }
    public String getTextFirstDayDropDown() {
        return firstDayText.getText();
    }
    public void clickOnFirstDayDropDown() {
        click(firstDayDropDown);
    }
    public void clickOnOptionForFirstDayDropDown() {
        click(optionForFirstDayDropDown);
    }
    public String getTextSelectedOptionFirstDay() {
        return optionForFirstDayDropDown.getText();
    }
    public String getTextSecondYearDropDown() {
        return secondYearText.getText();
    }
    public void clickOnSecondYearDropDown() {
        click(secondYearDropDown);
    }
    public void clickOnOptionForSecondYearDropDown() {
        click(optionForSecondYearDropDown);
    }
    public String getTextSelectedOptionSecondYear() {
        return optionForSecondYearDropDown.getText();
    }
    public String getTextSecondMonthDropDown() {
        return secondMonthText.getText();
    }
    public void clickOnSecondMonthDropDown() {
        click(secondMonthDropDown);
    }
    public void clickOnOptionForSecondMonthDropDown() {
        click(optionForSecondMonthDropDown);
    }
    public String getTextSelectedOptionSecondMonth() {
        return optionForSecondMonthDropDown.getText();
    }
    public String getTextSecondDayDropDown() {
        return secondDayText.getText();
    }
    public void clickOnSecondDayDropDown() {
        click(secondDayDropDown);
    }
    public void clickOnOptionForSecondDayDropDown() {
        click(optionForSecondDayDropDown);
    }
    public String getTextSelectedOptionSecondDay() {
        return optionForSecondDayDropDown.getText();
    }
    public void clickOnSaveButton() {
        click(clickOnSaveButton);
    }
    public List<WebElement> getYearOptions() {
        return driver.findElements(By.xpath("//span[contains(text(),'2022')]"));
    }
    public void clickOnOptionsInAddWork() {
        click(optionsInAddWork);
    }
    public String getTextEditWorkPlace() {
        return editWorkPlaceText.getText();
    }
    public void clickOnEditWorkPlace() {
        click(editWorkPlaceButton);
    }
    public void cleanCompanyField() {
        companyTextBox.sendKeys(Keys.CONTROL + "a");
        companyTextBox.sendKeys(Keys.DELETE);
    }
    public void cleanPositionField() {
        positionTextBox.sendKeys(Keys.CONTROL + "a");
        positionTextBox.sendKeys(Keys.DELETE);
    }
    public void cleanCityTownField() {
        cityTownTextBox.sendKeys(Keys.CONTROL + "a");
        cityTownTextBox.sendKeys(Keys.DELETE);
    }
    public void cleanDescriptionField() {
        descriptionTextBox.sendKeys(Keys.CONTROL + "a");
        descriptionTextBox.sendKeys(Keys.DELETE);
    }
    public String getTextDescriptionWhenYouEditWorkplcae() {
        return descriptionTextWhenYouEditWorkplace.getText();
    }
    public String getTextDeleteWorkplace() {
        return deleteWorkplaceText.getText();
    }
    public void clickOnDeleteWorkplace() {
        click(deleteWorkplaceButton);
    }
    public String getTextAreYouSure() {
        return areYouSureText.getText();
    }
    public String getTextCancelDeleteWorkplace() {
        return cancelText.getText();
    }
    public String getTextConfirmDeleteWorkplace() {
        return confirmText.getText();
    }
    public void clickCancelDeleteWorkplace() {
        click(cancelInDeleteWorkplace);
    }
    public void clickConfirmDeleteWokrplace() {
        click(conforimInDeleteWorkplace);
    }
    public String getTextOfTheWorkplaceInSaved() {
        return textOfWorkplaceInSaved.getText();
    }
    public String getTextOfTheCompanyInSaved() {
        return textOfCompanyInSaved.getText();
    }
    public String getTextAddASchool() {
        return addAHighSchool.getText();
    }
    public void clickAddHighSchool() {
        click(addAHighSchool);
    }
    public String getTextSchoolTextBox() {
        return schoolText.getText();
    }
    public void insertDataInSchoolTextBox(String text) {
        enterText(schoolTextBox,text);
    }
    public void clickOnGraduatedCheckbox() {
        click(graduatedCheckBox);
    }
    public void clickOnEditOptionFirstYear() {
        click(optionForEditFirsYear);
    }
    public void clickOnEditOptionFirstMonth() {
        click(optionForEditFirstMonth);
    }
    public void clickOnEditOptionFirstDay() {
        click(optionForEditFirstDay);
    }
    public void clickOnEditOptionSecondYear() {
        click(optionForEditSecondYear);
    }
    public void clickOnEditOptionSecondMonth() {
        click(optionForEditSecondMonth);
    }
    public void clickOnEditOptionSecondDay() {
        click(optionForEditSecondDay);
    }
    public void clickOnOption() {
        click(optionButton);
    }
    public String getTextEditSchool() {
        return editSchoolText.getText();
    }
    public void clickOnEditSchoolButton() {
        click(editSchoolButton);
    }
    public void cleanSchoolTextbox() {
        schoolTextBox.sendKeys(Keys.CONTROL + "a");
        schoolTextBox.sendKeys(Keys.DELETE);
    }
    public String getTextEditOptionFirstYear() {
        return optionForEditFirsYear.getText();
    }
    public String getTextEditOptionFirstMonth() {
        return optionForEditFirstMonth.getText();
    }
    public String getTextEditOptionFirstDay() {
        return optionForEditFirstDay.getText();
    }
    public String getTextEditOptionSecondYear() {
        return optionForEditSecondYear.getText();
    }
    public String getTextEditOptionSecondMonth() {
        return optionForEditSecondMonth.getText();
    }
    public String getTextEditOptionSecondDay() {
        return optionForEditSecondDay.getText();
    }
    public String getTextDeleteSchool() {
        return deleteSchoolText.getText();
    }
    public void clickOnDeleteSchool() {
        click(deleteSchool);
    }
    public void clickOnAddCollege() {
        click(addACollege);
    }
    public String getTextAddCollege() {
        return addACollege.getText();
    }
    public String getTextFirstConcentartion() {
        return firstConcentrationText.getText();
    }
    public void insertDataFirstConcentration(String text) {
        enterText(firstConcentration,text);
    }
    public String getTextSecondConcentaration() {
        return secondConcentrationText.getText();
    }
    public void insertDataSecondConcentartion(String text) {
        enterText(secondConcentartion,text);
    }
    public String getTextThirdConcentration() {
        return thirdConcentrationText.getText();
    }
    public void insertDataThirdConcentaration(String text) {
        enterText(thirdConcentartion,text);
    }
    public void clickOnCollegeCheckbox() {
        click(collegeCheckbox);
    }
    public void clickOnGraduateSchoolCheckbox() {
        click(graduateSchoolCheckbox);
    }
    public String getTextDegree() {
        return degreeText.getText();
    }
    public void insertDataDegree(String text) {
        enterText(degreeTextBox,text);
    }
    public void cleanConcentrationOne() {
        firstConcentration.sendKeys(Keys.CONTROL + "a");
        firstConcentration.sendKeys(Keys.DELETE);
    }
    public void cleanConcentrationTwo() {
        secondConcentartion.sendKeys(Keys.CONTROL + "a");
        secondConcentartion.sendKeys(Keys.DELETE);
    }
    public void cleanConcentrationThree() {
        thirdConcentartion.sendKeys(Keys.CONTROL + "a");
        thirdConcentartion.sendKeys(Keys.DELETE);
    }
    public void cleanDegree() {
        degreeTextBox.sendKeys(Keys.CONTROL + "a");
        degreeTextBox.sendKeys(Keys.DELETE);
    }


}
