package Team4Pro;

import base.OurAPI;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class IntroTest extends OurAPI {
    LoginPage loginPage;
    MainProfilePage mainProfilePage;
    WorkAndEducationPage workAndEducationPage;
    PlaceLivedPage placeLivedPage;
    RelationshipStatusPage relationshipStatusPage;
    String email = "testFaceBookEmail111@gmail.com";
    String password = "12345abc!";

    @BeforeMethod
    public void librarySetUp() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainProfilePage = PageFactory.initElements(driver, MainProfilePage.class);
        workAndEducationPage = PageFactory.initElements(driver, WorkAndEducationPage.class);
        placeLivedPage = PageFactory.initElements(driver, PlaceLivedPage.class);
        relationshipStatusPage = PageFactory.initElements(driver, RelationshipStatusPage.class);
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void introTest37() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        Assert.assertEquals(mainProfilePage.getTextIntro(),"Intro");
        Assert.assertEquals(mainProfilePage.getTextAddBio(),"Add Bio");
        mainProfilePage.clickOnAddBio();
        Assert.assertEquals(mainProfilePage.getTextDescribeYourself(),"Describe who you are");
        mainProfilePage.insertDateInBioTextBox();
        mainProfilePage.clickOnSaveBio();
        waitSeconds(3);
        Assert.assertEquals(mainProfilePage.getTextYourSavedBio(),"I am robot, but i feel like human");
    }
    @Test
    public void introTest38() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        Assert.assertEquals(mainProfilePage.getTextIntro(),"Intro");
        Assert.assertEquals(mainProfilePage.getTextEditBio(),"Edit bio");
        mainProfilePage.clickOnEditButton();
        mainProfilePage.cleanBioTextField();
        Assert.assertEquals(mainProfilePage.getTextDescribeYourself(),"Describe who you are");
        mainProfilePage.clickOnSaveBio();
        waitSeconds(3);
        try {
            mainProfilePage.getTextYourSavedBio();
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void introTest39() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        Assert.assertEquals(mainProfilePage.getTextIntro(),"Intro");
        Assert.assertEquals(mainProfilePage.getTextAddBio(),"Add Bio");
        mainProfilePage.clickOnAddBio();
        Assert.assertEquals(mainProfilePage.getTextDescribeYourself(),"Describe who you are");
        mainProfilePage.insertDataToBioToTestBoundaries();
        Assert.assertEquals(mainProfilePage.getTextSaveButtonIsDisabled(),"true");
        Assert.assertEquals(mainProfilePage.getTextHowManyCharsRemaining(),"-1 characters remaining");
    }
    @Test
    public void introTest40() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        workAndEducationPage.clickOnAddWorkplace();
        waitSeconds(1);
        workAndEducationPage.clickOnAddWorkplace();
        scroller("300");
        Assert.assertEquals(workAndEducationPage.getTextCompany(),"Company");
        workAndEducationPage.insertDataInCompanyTextBox("Snakes");
        Assert.assertEquals(workAndEducationPage.getTextPosition(),"Position");
        workAndEducationPage.insertDataInPositionTextBox("Airplane pilot");
        Assert.assertEquals(workAndEducationPage.getTextCityOrTown(),"City/Town");
        workAndEducationPage.insertDataInCityTownTextBox("Moon");
        Assert.assertEquals(workAndEducationPage.getTextDescription(),"Description");
        workAndEducationPage.insertDataDescriptionField("I was the best");
        workAndEducationPage.clickOnCurrentlyWorkThereCheckBox();
        scroller("200");
        Assert.assertEquals(workAndEducationPage.getTextFirstYearDropDown(),"Year");
        workAndEducationPage.clickOnFirstYearDropDown();
        workAndEducationPage.clickOnOptionForFirstYearDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstYear(),"2020");
        Assert.assertEquals(workAndEducationPage.getTextFirstMonthDropDown(),"Month");
        workAndEducationPage.clickOnFirstMonthDropDown();
        workAndEducationPage.clickOnOptionForFirstMonthDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstMonth(),"April");
        Assert.assertEquals(workAndEducationPage.getTextFirstDayDropDown(),"Day");
        workAndEducationPage.clickOnFirstDayDropDown();
        workAndEducationPage.clickOnOptionForFirstDayDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstDay(),"11");
        Assert.assertEquals(workAndEducationPage.getTextSecondYearDropDown(),"Year");
        workAndEducationPage.clickOnSecondYearDropDown();
        workAndEducationPage.clickOnOptionForSecondYearDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondYear(),"2022");
        Assert.assertEquals(workAndEducationPage.getTextSecondMonthDropDown(),"Month");
        workAndEducationPage.clickOnSecondMonthDropDown();
        workAndEducationPage.clickOnOptionForSecondMonthDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondMonth(),"June");
        Assert.assertEquals(workAndEducationPage.getTextSecondDayDropDown(),"Day");
        workAndEducationPage.clickOnSecondDayDropDown();
        workAndEducationPage.clickOnOptionForSecondDayDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondDay(),"20");
        workAndEducationPage.clickOnSaveButton();

    }
    @Test
    public void introTest41() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        workAndEducationPage.clickOnAddWorkplace();
        waitSeconds(1);
        scroller("300");
        workAndEducationPage.clickOnOptionsInAddWork();
        Assert.assertEquals(workAndEducationPage.getTextEditWorkPlace(),"Edit Workplace");
        //waitSeconds(1000);
        workAndEducationPage.clickOnEditWorkPlace();
        Assert.assertEquals(workAndEducationPage.getTextCompany(),"Company");
        workAndEducationPage.cleanCompanyField();
        workAndEducationPage.insertDataInCompanyTextBox("Turtles");
        Assert.assertEquals(workAndEducationPage.getTextPosition(),"Position");
        workAndEducationPage.cleanPositionField();
        workAndEducationPage.insertDataInPositionTextBox("Lumber carrier");
        Assert.assertEquals(workAndEducationPage.getTextCityOrTown(),"City/Town");
        workAndEducationPage.cleanCityTownField();
        workAndEducationPage.insertDataInCityTownTextBox("Mars");
        waitSeconds(1);
        workAndEducationPage.cleanDescriptionField();
        Assert.assertEquals(workAndEducationPage.getTextDescriptionWhenYouEditWorkplcae(),"Description");
        workAndEducationPage.insertDataDescriptionField("I still was the best");
        workAndEducationPage.clickOnSaveButton();
    }
    @Test
    public void introTest42() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        workAndEducationPage.clickOnAddWorkplace();
        waitSeconds(1);
        scroller("300");
        workAndEducationPage.clickOnOptionsInAddWork();
        Assert.assertEquals(workAndEducationPage.getTextDeleteWorkplace(),"Delete workplace");
        workAndEducationPage.clickOnDeleteWorkplace();
        Assert.assertEquals(workAndEducationPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(workAndEducationPage.getTextCancelDeleteWorkplace(),"Cancel");
        workAndEducationPage.clickCancelDeleteWorkplace();
        try {
            Assert.assertEquals(workAndEducationPage.getTextOfTheWorkplaceInSaved(),"Lumber carrier at Turtles");
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
    @Test
    public void introTest43() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        workAndEducationPage.clickOnAddWorkplace();
        waitSeconds(1);
        scroller("300");
        workAndEducationPage.clickOnOptionsInAddWork();
        Assert.assertEquals(workAndEducationPage.getTextDeleteWorkplace(),"Delete workplace");
        workAndEducationPage.clickOnDeleteWorkplace();
        Assert.assertEquals(workAndEducationPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(workAndEducationPage.getTextConfirmDeleteWorkplace(),"Confirm");
        workAndEducationPage.clickConfirmDeleteWokrplace();
        waitSeconds(1);
        driver.navigate().refresh();
        waitSeconds(5);
        try {
            Assert.assertEquals(workAndEducationPage.getTextOfTheWorkplaceInSaved(),"Lumber carrier at Turtles");
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void introTest44() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddASchool(),"Add a high school");
        workAndEducationPage.clickAddHighSchool();
        waitSeconds(1);
        workAndEducationPage.clickAddHighSchool();
        Assert.assertEquals(workAndEducationPage.getTextSchoolTextBox(),"School");
        workAndEducationPage.insertDataInSchoolTextBox("Hogwarts");
        scroller("200");
        Assert.assertEquals(workAndEducationPage.getTextFirstYearDropDown(),"Year");
        workAndEducationPage.clickOnFirstYearDropDown();
        workAndEducationPage.clickOnOptionForFirstYearDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstYear(),"2020");
        Assert.assertEquals(workAndEducationPage.getTextFirstMonthDropDown(),"Month");
        workAndEducationPage.clickOnFirstMonthDropDown();
        workAndEducationPage.clickOnOptionForFirstMonthDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstMonth(),"April");
        Assert.assertEquals(workAndEducationPage.getTextFirstDayDropDown(),"Day");
        workAndEducationPage.clickOnFirstDayDropDown();
        workAndEducationPage.clickOnOptionForFirstDayDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstDay(),"11");
        Assert.assertEquals(workAndEducationPage.getTextSecondYearDropDown(),"Year");
        workAndEducationPage.clickOnSecondYearDropDown();
        workAndEducationPage.clickOnOptionForSecondYearDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondYear(),"2022");
        Assert.assertEquals(workAndEducationPage.getTextSecondMonthDropDown(),"Month");
        workAndEducationPage.clickOnSecondMonthDropDown();
        workAndEducationPage.clickOnOptionForSecondMonthDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondMonth(),"June");
        Assert.assertEquals(workAndEducationPage.getTextSecondDayDropDown(),"Day");
        workAndEducationPage.clickOnSecondDayDropDown();
        workAndEducationPage.clickOnOptionForSecondDayDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondDay(),"20");
        Assert.assertEquals(workAndEducationPage.getTextDescription(),"Description");
        workAndEducationPage.insertDataDescriptionField("I had only A's");
        workAndEducationPage.clickOnGraduatedCheckbox();
        workAndEducationPage.clickOnSaveButton();
    }
    @Test
    public void introTest45() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddASchool(),"Add a high school");
        workAndEducationPage.clickAddHighSchool();
        waitSeconds(1);
        workAndEducationPage.clickOnOption();
        //waitSeconds(1000);
        Assert.assertEquals(workAndEducationPage.getTextEditSchool(),"Edit school");
        workAndEducationPage.clickOnEditSchoolButton();
        workAndEducationPage.cleanSchoolTextbox();
        Assert.assertEquals(workAndEducationPage.getTextSchoolTextBox(),"School");
        workAndEducationPage.insertDataInSchoolTextBox("Kids next door");
        scroller("200");
        Assert.assertEquals(workAndEducationPage.getTextFirstYearDropDown(),"2020");
        workAndEducationPage.clickOnFirstYearDropDown();
        workAndEducationPage.clickOnEditOptionFirstYear();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionFirstYear(),"2017");
        Assert.assertEquals(workAndEducationPage.getTextFirstMonthDropDown(),"April");
        workAndEducationPage.clickOnFirstMonthDropDown();
        workAndEducationPage.clickOnEditOptionFirstMonth();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionFirstMonth(),"December");
        Assert.assertEquals(workAndEducationPage.getTextFirstDayDropDown(),"11");
        workAndEducationPage.clickOnFirstDayDropDown();
        workAndEducationPage.clickOnEditOptionFirstDay();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionFirstDay(),"4");
        Assert.assertEquals(workAndEducationPage.getTextSecondYearDropDown(),"2022");
        workAndEducationPage.clickOnSecondYearDropDown();
        workAndEducationPage.clickOnEditOptionSecondYear();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionSecondYear(),"2019");
        Assert.assertEquals(workAndEducationPage.getTextSecondMonthDropDown(),"June");
        workAndEducationPage.clickOnSecondMonthDropDown();
        workAndEducationPage.clickOnEditOptionSecondMonth();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionSecondMonth(),"September");
        Assert.assertEquals(workAndEducationPage.getTextSecondDayDropDown(),"20");
        workAndEducationPage.clickOnSecondDayDropDown();
        workAndEducationPage.clickOnEditOptionSecondDay();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionSecondDay(),"14");
        workAndEducationPage.clickOnGraduatedCheckbox();
        workAndEducationPage.clickOnSaveButton();
    }
    @Test
    public void introTest46() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddASchool(),"Add a high school");
        workAndEducationPage.clickAddHighSchool();
        waitSeconds(1);
        workAndEducationPage.clickOnOption();
        Assert.assertEquals(workAndEducationPage.getTextDeleteSchool(),"Delete school");
        workAndEducationPage.clickOnDeleteSchool();
        waitSeconds(1);
        Assert.assertEquals(workAndEducationPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(workAndEducationPage.getTextCancelDeleteWorkplace(),"Cancel");
        workAndEducationPage.clickCancelDeleteWorkplace();
        try {
            Assert.assertEquals(workAndEducationPage.getTextOfTheWorkplaceInSaved(),"Went to Kids Next Door");
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
    @Test
    public void introTest47() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddASchool(),"Add a high school");
        workAndEducationPage.clickAddHighSchool();
        waitSeconds(1);
        workAndEducationPage.clickOnOption();
        Assert.assertEquals(workAndEducationPage.getTextDeleteSchool(),"Delete school");
        workAndEducationPage.clickOnDeleteSchool();
        waitSeconds(1);
        Assert.assertEquals(workAndEducationPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(workAndEducationPage.getTextConfirmDeleteWorkplace(),"Confirm");
        workAndEducationPage.clickConfirmDeleteWokrplace();
        waitSeconds(1);
        driver.navigate().refresh();
        waitSeconds(5);
        try {
            Assert.assertEquals(workAndEducationPage.getTextOfTheWorkplaceInSaved(),"Went to Kids Next Door");
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void introTest48() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddCollege(),"Add a college");
        workAndEducationPage.clickOnAddCollege();
        waitSeconds(1);
        workAndEducationPage.clickOnAddCollege();
        Assert.assertEquals(workAndEducationPage.getTextSchoolTextBox(),"School");
        workAndEducationPage.insertDataInSchoolTextBox("Spacemarine college");
        scroller("200");
        Assert.assertEquals(workAndEducationPage.getTextFirstYearDropDown(),"Year");
        workAndEducationPage.clickOnFirstYearDropDown();
        workAndEducationPage.clickOnOptionForFirstYearDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstYear(),"2020");
        Assert.assertEquals(workAndEducationPage.getTextFirstMonthDropDown(),"Month");
        workAndEducationPage.clickOnFirstMonthDropDown();
        workAndEducationPage.clickOnOptionForFirstMonthDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstMonth(),"April");
        Assert.assertEquals(workAndEducationPage.getTextFirstDayDropDown(),"Day");
        workAndEducationPage.clickOnFirstDayDropDown();
        workAndEducationPage.clickOnOptionForFirstDayDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionFirstDay(),"11");
        Assert.assertEquals(workAndEducationPage.getTextSecondYearDropDown(),"Year");
        workAndEducationPage.clickOnSecondYearDropDown();
        workAndEducationPage.clickOnOptionForSecondYearDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondYear(),"2022");
        Assert.assertEquals(workAndEducationPage.getTextSecondMonthDropDown(),"Month");
        workAndEducationPage.clickOnSecondMonthDropDown();
        workAndEducationPage.clickOnOptionForSecondMonthDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondMonth(),"June");
        Assert.assertEquals(workAndEducationPage.getTextSecondDayDropDown(),"Day");
        workAndEducationPage.clickOnSecondDayDropDown();
        workAndEducationPage.clickOnOptionForSecondDayDropDown();
        Assert.assertEquals(workAndEducationPage.getTextSelectedOptionSecondDay(),"20");
        Assert.assertEquals(workAndEducationPage.getTextDescription(),"Description");
        workAndEducationPage.insertDataDescriptionField("Was so easy, i even skipped half of a year");
        Assert.assertEquals(workAndEducationPage.getTextFirstConcentartion(),"Concentration");
        workAndEducationPage.insertDataFirstConcentration("Wex");
        Assert.assertEquals(workAndEducationPage.getTextSecondConcentaration(),"Concentration");
        workAndEducationPage.insertDataSecondConcentartion("Quas");
        Assert.assertEquals(workAndEducationPage.getTextThirdConcentration(),"Concentration");
        workAndEducationPage.insertDataThirdConcentaration("Exort");
        scroller("200");
        workAndEducationPage.clickOnGraduateSchoolCheckbox();
        Assert.assertEquals(workAndEducationPage.getTextDegree(),"Degree");
        workAndEducationPage.insertDataDegree("Primarch");
        workAndEducationPage.clickOnSaveButton();
    }
    @Test
    public void introTest49() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddCollege(),"Add a college");
        workAndEducationPage.clickOnAddCollege();
        waitSeconds(1);
        workAndEducationPage.clickOnOption();
        Assert.assertEquals(workAndEducationPage.getTextEditSchool(),"Edit school");
        workAndEducationPage.clickOnEditSchoolButton();
        workAndEducationPage.cleanSchoolTextbox();
        Assert.assertEquals(workAndEducationPage.getTextSchoolTextBox(),"School");
        workAndEducationPage.insertDataInSchoolTextBox("Imperial Legion");
        scroller("200");
        Assert.assertEquals(workAndEducationPage.getTextFirstYearDropDown(),"2020");
        workAndEducationPage.clickOnFirstYearDropDown();
        workAndEducationPage.clickOnEditOptionFirstYear();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionFirstYear(),"2017");
        Assert.assertEquals(workAndEducationPage.getTextFirstMonthDropDown(),"April");
        workAndEducationPage.clickOnFirstMonthDropDown();
        workAndEducationPage.clickOnEditOptionFirstMonth();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionFirstMonth(),"December");
        Assert.assertEquals(workAndEducationPage.getTextFirstDayDropDown(),"11");
        workAndEducationPage.clickOnFirstDayDropDown();
        workAndEducationPage.clickOnEditOptionFirstDay();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionFirstDay(),"4");
        Assert.assertEquals(workAndEducationPage.getTextSecondYearDropDown(),"2022");
        workAndEducationPage.clickOnSecondYearDropDown();
        workAndEducationPage.clickOnEditOptionSecondYear();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionSecondYear(),"2019");
        Assert.assertEquals(workAndEducationPage.getTextSecondMonthDropDown(),"June");
        workAndEducationPage.clickOnSecondMonthDropDown();
        workAndEducationPage.clickOnEditOptionSecondMonth();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionSecondMonth(),"September");
        Assert.assertEquals(workAndEducationPage.getTextSecondDayDropDown(),"20");
        workAndEducationPage.clickOnSecondDayDropDown();
        workAndEducationPage.clickOnEditOptionSecondDay();
        Assert.assertEquals(workAndEducationPage.getTextEditOptionSecondDay(),"14");
        workAndEducationPage.cleanConcentrationOne();
        Assert.assertEquals(workAndEducationPage.getTextFirstConcentartion(),"Concentration");
        workAndEducationPage.insertDataFirstConcentration("Heavy Bolter");
        workAndEducationPage.cleanConcentrationTwo();
        Assert.assertEquals(workAndEducationPage.getTextSecondConcentaration(),"Concentration");
        workAndEducationPage.insertDataSecondConcentartion("Lasgun");
        workAndEducationPage.cleanConcentrationThree();
        Assert.assertEquals(workAndEducationPage.getTextThirdConcentration(),"Concentration");
        workAndEducationPage.insertDataThirdConcentaration("Sentry");
        workAndEducationPage.cleanDegree();
        Assert.assertEquals(workAndEducationPage.getTextDegree(),"Degree");
        workAndEducationPage.insertDataDegree("Chaplain");
        workAndEducationPage.clickOnSaveButton();
    }
    @Test
    public void introTest50(){
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddCollege(),"Add a college");
        workAndEducationPage.clickOnAddCollege();
        waitSeconds(1);
        workAndEducationPage.clickOnOption();
        Assert.assertEquals(workAndEducationPage.getTextDeleteSchool(),"Delete school");
        workAndEducationPage.clickOnDeleteSchool();
        waitSeconds(1);
        Assert.assertEquals(workAndEducationPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(workAndEducationPage.getTextCancelDeleteWorkplace(),"Cancel");
        workAndEducationPage.clickCancelDeleteWorkplace();
        try {
            Assert.assertEquals(workAndEducationPage.getTextOfTheWorkplaceInSaved(),"Studied Heavy Bolter at Imperial Legion");
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
    @Test
    public void introTest51() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(2);
        Assert.assertEquals(workAndEducationPage.getTextAddCollege(),"Add a college");
        workAndEducationPage.clickOnAddCollege();
        waitSeconds(1);
        workAndEducationPage.clickOnOption();
        Assert.assertEquals(workAndEducationPage.getTextDeleteSchool(),"Delete school");
        workAndEducationPage.clickOnDeleteSchool();
        waitSeconds(1);
        Assert.assertEquals(workAndEducationPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(workAndEducationPage.getTextConfirmDeleteWorkplace(),"Confirm");
        workAndEducationPage.clickConfirmDeleteWokrplace();
        waitSeconds(2);
        driver.navigate().refresh();
        waitSeconds(5);
        try {
            Assert.assertEquals(workAndEducationPage.getTextOfTheWorkplaceInSaved(),"Went to Kids Next Door");
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void introTest52(){
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(1);
        placeLivedPage.clickOnAddCurrentCity();
        waitSeconds(1);
        placeLivedPage.clickOnAddCurrentCity();
        scroller("150");
        Assert.assertEquals(placeLivedPage.getTextCurrentCityText(),"Current City");
        placeLivedPage.insertDataInCurrentCity("Phoenix");
        placeLivedPage.clickOnSuggestionInCurrentCity();
        try {
            placeLivedPage.clickOnSaveCurrentCity();
        } catch (Exception e) {
            placeLivedPage.globalSaveButton();
        }
        waitSeconds(3);
        placeLivedPage.clickOnAddHometown();
        Assert.assertEquals(placeLivedPage.getTextHometown(),"Hometown");
        placeLivedPage.insertDataInHometown("New York");
        placeLivedPage.clickOnSuggestionInHometown();
        try {
            placeLivedPage.clickOnSaveHometown();
        } catch (Exception e) {
            placeLivedPage.globalSaveButton();
        }
        waitSeconds(3);
        placeLivedPage.clickOnAddCity();
        Assert.assertEquals(placeLivedPage.getTextCity(),"City");
        placeLivedPage.insertDataInCity("Los Angeles");
        placeLivedPage.clickOnSuggestionInCity();
        //waitSeconds(1000);
        Assert.assertEquals(placeLivedPage.getTextYear(),"2022");
        placeLivedPage.clickOnYearsDropDown();
        placeLivedPage.clickOnOptionForYear();
        Assert.assertEquals(placeLivedPage.getTextYear(),"2019");
        Assert.assertEquals(placeLivedPage.getTextMonthDropDown(),"Month");
        placeLivedPage.clickOnMonthDropDown();
        placeLivedPage.clickOnOptionForMonth();
        Assert.assertEquals(placeLivedPage.getTextMonthDropDown(),"October");
        Assert.assertEquals(placeLivedPage.getTextDayDropDown(),"Day");
        placeLivedPage.clickDayDropDown();
        placeLivedPage.clickOnOptionForDay();
        Assert.assertEquals(placeLivedPage.getTextDayDropDown(),"27");
        try {
            placeLivedPage.clickOnSaveCity();
        } catch (Exception e) {
            placeLivedPage.globalSaveButton();
        }
        waitSeconds(3);
    }
    @Test
    public void introTest53() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(1);
        placeLivedPage.clickOnEditInEditDetails();
        scroller("150");
        placeLivedPage.clickOnOptionsOne();
        Assert.assertEquals(placeLivedPage.getTextEditButton(),"Edit current city");
        placeLivedPage.clickOnEditButton();
        placeLivedPage.cleanCurrentCityTextBox();
        Assert.assertEquals(placeLivedPage.getTextCurrentCityText(),"Current City");
        placeLivedPage.insertDataInCurrentCity("Washington");
        placeLivedPage.clickOnSuggestionInCurrentCity();
        try {
            placeLivedPage.clickOnSaveCurrentCity();
        } catch (Exception e) {
            placeLivedPage.globalSaveButton();
        }
        waitSeconds(3);
        placeLivedPage.clickOnOptionsTwo();
        Assert.assertEquals(placeLivedPage.getTextEditButton(),"Edit hometown");
        placeLivedPage.clickOnEditButton();
        placeLivedPage.cleanHometownTextBox();
        Assert.assertEquals(placeLivedPage.getTextHometown(),"Hometown");
        placeLivedPage.insertDataInHometown("Miami");
        placeLivedPage.clickOnSuggestionInHometown();
        try {
            placeLivedPage.clickOnSaveHometown();
        } catch (Exception e) {
            placeLivedPage.globalSaveButton();
        }
        waitSeconds(3);
        placeLivedPage.clickOnOptionsThree();
        Assert.assertEquals(placeLivedPage.getTextEditButton(),"Edit city");
        placeLivedPage.clickOnEditButton();
        placeLivedPage.cleanCityTextBox();
        Assert.assertEquals(placeLivedPage.getTextCity(),"City");
        placeLivedPage.insertDataInCity("Chicago");
        placeLivedPage.clickOnSuggestionInCity();
        try {
            placeLivedPage.clickOnSaveCity();
        } catch (Exception e) {
            placeLivedPage.globalSaveButton();
        }
        waitSeconds(3);
    }
    @Test
    public void introTest54() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(1);
        placeLivedPage.clickOnEditInEditDetails();
        scroller("150");
        placeLivedPage.clickOnOptionsOne();
        Assert.assertEquals(placeLivedPage.getTextDeleteButton(),"Delete current city");
        placeLivedPage.clickOnDeleteButton();
        Assert.assertEquals(placeLivedPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(placeLivedPage.getTextCancelButton(),"Cancel");
        placeLivedPage.clickOnCancel();
        try {
            Assert.assertEquals(placeLivedPage.getTextSavedCurrentCity(),"Fife, Washington");
        } catch (Exception e) {
            Assert.assertFalse(true);
        }
        placeLivedPage.clickOnOptionsTwo();
        Assert.assertEquals(placeLivedPage.getTextDeleteButton(),"Delete hometown");
        placeLivedPage.clickOnDeleteButton();
        Assert.assertEquals(placeLivedPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(placeLivedPage.getTextCancelButton(),"Cancel");
        placeLivedPage.clickOnCancel();
        try {
            Assert.assertEquals(placeLivedPage.getTextSavedHometown(),"Miami, Florida");
        } catch (Exception e) {
            Assert.assertFalse(true);
        }
        placeLivedPage.clickOnOptionsThree();
        Assert.assertEquals(placeLivedPage.getTextDeleteButton(),"Delete");
        placeLivedPage.clickOnDeleteButton();
        Assert.assertEquals(placeLivedPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(placeLivedPage.getTextCancelButton(),"Cancel");
        placeLivedPage.clickOnCancel();
        try {
            Assert.assertEquals(placeLivedPage.getTextSavedCity(),"Chicago, Illinois");
        } catch (Exception e) {
            Assert.assertFalse(true);
        }

    }
    @Test
    public void introTest55() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(1);
        placeLivedPage.clickOnEditInEditDetails();
        scroller("150");
        placeLivedPage.clickOnOptionsOne();
        Assert.assertEquals(placeLivedPage.getTextDeleteButton(),"Delete current city");
        placeLivedPage.clickOnDeleteButton();
        Assert.assertEquals(placeLivedPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(placeLivedPage.getTextConfirmButton(),"Confirm");
        placeLivedPage.clickOnConfirem();
        waitSeconds(2);
        driver.navigate().refresh();
        try {
            Assert.assertEquals(placeLivedPage.getTextSavedCurrentCity(),"Fife, Washington");
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
        placeLivedPage.clickOnOptionsOne();
        Assert.assertEquals(placeLivedPage.getTextDeleteButton(),"Delete hometown");
        placeLivedPage.clickOnDeleteButton();
        Assert.assertEquals(placeLivedPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(placeLivedPage.getTextConfirmButton(),"Confirm");
        placeLivedPage.clickOnConfirem();
        waitSeconds(2);
        driver.navigate().refresh();
        try {
            Assert.assertEquals(placeLivedPage.getTextSavedHometown(),"Miami, Florida");
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
        placeLivedPage.clickOnOptionsOne();
        Assert.assertEquals(placeLivedPage.getTextDeleteButton(),"Delete");
        placeLivedPage.clickOnDeleteButton();
        Assert.assertEquals(placeLivedPage.getTextAreYouSure(),"Are you sure?");
        Assert.assertEquals(placeLivedPage.getTextConfirmButton(),"Confirm");
        placeLivedPage.clickOnConfirem();
        waitSeconds(2);
        driver.navigate().refresh();
        try {
            Assert.assertEquals(placeLivedPage.getTextSavedCity(),"Chicago, Illinois");
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void introTest56() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(1);
        relationshipStatusPage.clickOnRelationshipStatus();
        waitSeconds(1);
        relationshipStatusPage.clickOnRelationshipStatus();
        Assert.assertEquals(relationshipStatusPage.getTextStatusDropDown(),"Status");
        relationshipStatusPage.clickOnStatusDropDown();
        relationshipStatusPage.clickOnSingle();
        Assert.assertEquals(relationshipStatusPage.getTextStatusDropDown(),"Single");
        relationshipStatusPage.clickOnSaveButtonRelationship();
        relationshipStatusPage.clickOnAddFamilyMember();
        Assert.assertEquals(relationshipStatusPage.getTextFamiliMemberField(),"Family Member");
        relationshipStatusPage.insertDataInFamilyTextBox("Cow");
        relationshipStatusPage.clickRelationshipDropDown();
        relationshipStatusPage.clickOnSon();
        relationshipStatusPage.clickOnSaveButtonFamily();
        waitSeconds(1);
        relationshipStatusPage.clickOnAddFamilyMember();
        Assert.assertEquals(relationshipStatusPage.getTextFamiliMemberField(),"Family Member");
        relationshipStatusPage.insertDataInFamilyTextBox("Parrot");
        //waitSeconds(1000);
        relationshipStatusPage.clickRelationshipDropDown();
        relationshipStatusPage.clickOnFather();
        relationshipStatusPage.clickOnSaveButtonFamily();
        waitSeconds(1);
        relationshipStatusPage.clickOnAddFamilyMember();
        Assert.assertEquals(relationshipStatusPage.getTextFamiliMemberField(),"Family Member");
        relationshipStatusPage.insertDataInFamilyTextBox("Snake");
        relationshipStatusPage.clickRelationshipDropDown();
        relationshipStatusPage.clickOnNephew();
        relationshipStatusPage.clickOnSaveButtonFamily();
        waitSeconds(1);
    }
    @Test
    public void introTest57() {
        mainProfilePage.clickOnMyProfileButton();
        mainProfilePage.clickOnEditDetailsButton();
        waitSeconds(1);
        relationshipStatusPage.clickOnEditButtonRelationship();
        relationshipStatusPage.clickOnEditStatus();
        relationshipStatusPage.clickOnStatusDropDown();
        relationshipStatusPage.clickOnMarriedOption();
        Assert.assertEquals(relationshipStatusPage.getTextStatusDropDown(),"Married");
        Assert.assertEquals(relationshipStatusPage.getTextPartnerField(),"Partner");
        relationshipStatusPage.insertDataInPartnerField("Frog");
        Assert.assertEquals(relationshipStatusPage.getTextYearDropDown(),"Year");
        relationshipStatusPage.clickOnYearDropdown();
        relationshipStatusPage.clickOnOptionInYear();
        Assert.assertEquals(relationshipStatusPage.getTextYearDropDown(),"2014");
        Assert.assertEquals(relationshipStatusPage.getTextMonthDropdown(),"Month");
        relationshipStatusPage.clickOnMonthDropDown();
        relationshipStatusPage.clickOnOptionForMonth();
        Assert.assertEquals(relationshipStatusPage.getTextMonthDropdown(),"August");
        Assert.assertEquals(relationshipStatusPage.getTextDayDropdown(),"Day");
        relationshipStatusPage.clickOnDayDropDown();
        relationshipStatusPage.clickOnOptionForDay();
        Assert.assertEquals(relationshipStatusPage.getTextDayDropdown(),"15");
        relationshipStatusPage.clickOnSaveButtonRelationship();
        waitSeconds(5);
        relationshipStatusPage.clickOnEditButtonByFamilyOne();
        Assert.assertEquals(relationshipStatusPage.getTextEditFamilyMember(),"Edit family member");
        relationshipStatusPage.clickOnEditFamilyMember();
        Assert.assertEquals(relationshipStatusPage.getTextFamiliMemberField(),"Family Member");
        relationshipStatusPage.cleanFamilyMemberField();
        relationshipStatusPage.insertDataInFamilyTextBox("Monkey");
        relationshipStatusPage.clickRelationshipDropDown();
        relationshipStatusPage.clickOnOptionUncle();
        relationshipStatusPage.clickOnSaveButtonFamily();
        waitSeconds(2);
        relationshipStatusPage.clickOnEditButtonByFamilyTwo();
        Assert.assertEquals(relationshipStatusPage.getTextEditFamilyMember(),"Edit family member");
        relationshipStatusPage.clickOnEditFamilyMember();
        Assert.assertEquals(relationshipStatusPage.getTextFamiliMemberField(),"Family Member");
        relationshipStatusPage.cleanFamilyMemberField();
        relationshipStatusPage.insertDataInFamilyTextBox("Giraffe");
        relationshipStatusPage.clickRelationshipDropDown();
        relationshipStatusPage.clickOnOptionStepson();
        relationshipStatusPage.clickOnSaveButtonFamily();
        waitSeconds(2);
        relationshipStatusPage.clickOnEditButtonByFamilyThree();
        Assert.assertEquals(relationshipStatusPage.getTextEditFamilyMember(),"Edit family member");
        relationshipStatusPage.clickOnEditFamilyMember();
        Assert.assertEquals(relationshipStatusPage.getTextFamiliMemberField(),"Family Member");
        relationshipStatusPage.cleanFamilyMemberField();
        relationshipStatusPage.insertDataInFamilyTextBox("Fish");
        relationshipStatusPage.clickRelationshipDropDown();
        relationshipStatusPage.clickOnOptionBrother();
        relationshipStatusPage.clickOnSaveButtonFamily();
        waitSeconds(2);







    }

}
