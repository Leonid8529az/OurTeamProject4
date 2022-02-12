package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class webPage extends OurAPI {

    @FindBy(xpath = "//input[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "//span[text()='Store Experience']")
    WebElement menuDropdown;
    public void selectDropdownOption(WebElement menuDropdown, String option){
        selectDropdownOption(this.menuDropdown, option);
    }


//    public void searchButton() {
//    }
//
//    public List<WebElement> selectDropdownOptions() {
//
//        return null;
//    }
//
//    private void listOfWebElements(String s, String s1) {
//    }
//
//
//    private void selectDropDownOption(String s) {
//    }
//
//    private void enterText(String s) {
//    }
}
