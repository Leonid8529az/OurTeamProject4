package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccoladeHealth extends OurAPI {
    public AccoladeHealth(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='member.accolade.com']")
            public
    WebElement memberAccolade;

    public void setMemberAccolade() {click(memberAccolade);}

}