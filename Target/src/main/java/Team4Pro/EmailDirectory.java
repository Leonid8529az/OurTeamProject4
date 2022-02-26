package Team4Pro;

import javafx.scene.control.ScrollToEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class EmailDirectory extends OurAPI {



    @FindBy(xpath = "//input[@id='email-address']")
    WebElement searchField;
    @FindBy(xpath = "//div[@class='styles__LabelWrapper-sc-upc6ut-1 eNbTFc']")
    WebElement  searchButton;
    @FindBy(xpath = "//p[@class='h-text-center']")//div[@data-test='adaptive-platform-footer']/div[2]/div/p
    WebElement  returnText;
    @FindBy(xpath = "//span[@class='sc-gsTCUz dZNyey']//div[@class='sc-hKgILt gTLZXx']//*[name()='svg']")
    WebElement signInDropDown;
    @FindBy(xpath = "//div[normalize-space()='Sign in']")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='username']")
    WebElement enterEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement enterPass;
    @FindBy(xpath = "//button[@id='login']")
    WebElement signInButton;





    public void searchElement(String itemToSearch){
        enterText(searchField, itemToSearch);
    }

    public String returnText() {
        return returnText.getText();
    }

    public void scrollToSearchField(){scrollToView(searchField);}

    public void typeEmail(String itemToSearch){
        enterText(enterEmail, itemToSearch);
    }
    public void typePassword(String itemToSearch) {
        enterText(enterPass, itemToSearch);

    }

    public void enter (){click(signInButton);}






}