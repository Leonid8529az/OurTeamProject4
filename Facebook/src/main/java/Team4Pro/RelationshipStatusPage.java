package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RelationshipStatusPage extends OurAPI {
    @FindBy(xpath = "//span[contains(text(),'Add a relationship status')]")
    WebElement addRelationshipStatus;
    @FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]")
    WebElement statusDropDown;
    @FindBy(xpath = "//div[@role=\"listbox\"]/div/div/div/div/div/div/div[2]")
    WebElement singleStatus;
    @FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]/span")
    WebElement statusDropDownText;
    @FindBy(xpath = "(//div[@aria-label=\"Save\"])[1]")
    WebElement saveButtonRelationshipStatus;
    @FindBy(xpath = "//div[@aria-label=\"Save\"]")
    WebElement globalSaveButton;
    @FindBy(xpath = "//label[@aria-label=\"Family Member\"]/div/div/span")
    WebElement familyMemberText;
    @FindBy(xpath = "//label[@aria-label=\"Family Member\"]/div/div/input")
    WebElement familyMemberTextBox;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[2]")
    WebElement relationshipDropDown;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])")
    WebElement relationshipDropDownTryCatch;
    @FindBy(xpath = "(//span[contains(text(),'Son')])[1]")
    WebElement optionSon;
    @FindBy(xpath = "(//span[contains(text(),'Father')])[1]")
    WebElement optionFather;
    @FindBy(xpath = "(//span[contains(text(),'Nephew')])[1]")
    WebElement optionNephew;
    @FindBy(xpath = "(//div[@aria-label=\"Save\"])[2]")
    WebElement saveButtonFamily;
    @FindBy(xpath = "//span[contains(text(),'Add a family member')]")
    WebElement addAFamilyMember;
    @FindBy(xpath = "//a[@aria-label=\"Edit\"]")
    WebElement editButtonRelationship;
    @FindBy(xpath = "//div[@aria-label=\"Edit relationship\"]")
    WebElement editStatus;
    @FindBy(xpath = "//span[contains(text(),'Married')]")
    WebElement marriedOption;
    @FindBy(xpath = "//label[@aria-label=\"Partner\"]")
    WebElement partnerTextField;
    @FindBy(xpath = "//label[@aria-label=\"Partner\"]/div/div/span")
    WebElement partnerText;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[2]")
    WebElement yearDropDown;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[2]/span")
    WebElement yearDropDownText;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[3]")
    WebElement monthDropDown;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[3]/span")
    WebElement monthDropDownText;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[4]")
    WebElement dayDropDown;
    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[4]/span")
    WebElement dayDropDownText;
    @FindBy(xpath = "//span[contains(text(),'2014')]")
    WebElement optionForYear;
    @FindBy(xpath = "//span[contains(text(),'August')]")
    WebElement optionForMonth;
    @FindBy(xpath = "//span[contains(text(),'15')]")
    WebElement optionForDay;
    @FindBy(xpath = "(//div[@aria-label=\"Options\"])[1]")
    WebElement editButtonFamilyOne;
    @FindBy(xpath = "(//div[@aria-label=\"Options\"])[2]")
    WebElement editButtonFamilyTwo;
    @FindBy(xpath = "(//div[@aria-label=\"Options\"])[3]")
    WebElement editButtonFamilyThree;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div/div/div[1]")
    WebElement editFamilyMember;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div/div/div[1]/div[2]/div/div/span")
    WebElement editFamiliMemberText;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div/div/div[2]")
    WebElement deleteFamilyMember;
    @FindBy(xpath = "//div[@role=\"menu\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/span")
    WebElement deleteFamilyMemberText;
    @FindBy(xpath = "(//span[contains(text(),'Uncle')])[1]")
    WebElement optionUncle;
    @FindBy(xpath = "(//span[contains(text(),'Brother')])[1]")
    WebElement optionBrother;
    @FindBy(xpath = "(//span[contains(text(),'Stepson')])[1]")
    WebElement optionStepson;



    public void clickOnRelationshipStatus() {
        click(addRelationshipStatus);
    }
    public String getTextStatusDropDown() {
        return statusDropDownText.getText();
    }
    public void clickOnSingle() {
        click(singleStatus);
    }
    public void clickOnStatusDropDown() {
        click(statusDropDown);
    }
    public void clickOnSaveButtonRelationship() {
        try {
            click(saveButtonRelationshipStatus);
        } catch (Exception e) {
            click(globalSaveButton);
        }
    }
    public void clickOnAddFamilyMember() {
        click(addAFamilyMember);
    }
    public String getTextFamiliMemberField() {
        return familyMemberText.getText();
    }
    public void insertDataInFamilyTextBox(String text) {
        enterText(familyMemberTextBox,text);
    }
    public void clickRelationshipDropDown() {
        try {
            click(relationshipDropDown);
        } catch (Exception e) {
            click(relationshipDropDownTryCatch);
        }
    }
    public void clickOnSon() {
        click(optionSon);
    }
    public void clickOnFather() {
        click(optionFather);
    }
    public void clickOnNephew() {
        click(optionNephew);
    }
    public void clickOnSaveButtonFamily() {
        try {
            click(saveButtonFamily);
        } catch (Exception e) {
            click(globalSaveButton);
        }
    }
    public void clickOnEditButtonRelationship() {
        click(editButtonRelationship);
    }
    public void clickOnEditStatus() {
        click(editStatus);
    }
    public void clickOnMarriedOption() {
        click(marriedOption);
    }
    public void insertDataInPartnerField(String text) {
        enterText(partnerTextField,text);
    }
    public String getTextPartnerField() {
        return partnerText.getText();
    }
    public void clickOnYearDropdown() {
        click(yearDropDown);
    }
    public void clickOnOptionInYear() {
        click(optionForYear);
    }
    public String getTextYearDropDown() {
        return yearDropDownText.getText();
    }
    public void clickOnMonthDropDown() {
        click(monthDropDown);
    }
    public void clickOnOptionForMonth() {
        click(optionForMonth);
    }
    public String getTextMonthDropdown() {
        return monthDropDownText.getText();
    }
    public void clickOnDayDropDown() {
        click(dayDropDown);
    }
    public void clickOnOptionForDay() {
        click(optionForDay);
    }
    public String getTextDayDropdown() {
        return dayDropDownText.getText();
    }
    public void clickOnEditButtonByFamilyOne() {
        click(editButtonFamilyOne);
    }
    public void clickOnEditButtonByFamilyTwo() {
        click(editButtonFamilyTwo);
    }
    public void clickOnEditButtonByFamilyThree() {
        click(editButtonFamilyThree);
    }
    public void cleanFamilyMemberField() {
        familyMemberTextBox.sendKeys(Keys.CONTROL + "a");
        familyMemberTextBox.sendKeys(Keys.DELETE);
    }
    public void clickOnOptionUncle() {
        click(optionUncle);
    }
    public void clickOnOptionBrother() {
        click(optionBrother);
    }
    public void clickOnOptionStepson() {
        click(optionStepson);
    }
    public String getTextEditFamilyMember() {
        return editFamiliMemberText.getText();
    }
    public void clickOnEditFamilyMember() {
        click(editFamilyMember);
    }
    public String getTextDeleteFamilyMember() {
        return deleteFamilyMemberText.getText();
    }
    public void clickOnDeleteFamilyMember() {
        click(deleteFamilyMember);
    }

}
