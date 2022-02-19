package Team4Pro;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class webPage {
    @FindBy(xpath = "//input[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "//span[text()='Store Experience']")
    WebElement menuDropdown;
    public void selectDropdownOption(WebElement menuDropdown, String option){
        selectDropdownOption(this.menuDropdown, option);
    }
}
