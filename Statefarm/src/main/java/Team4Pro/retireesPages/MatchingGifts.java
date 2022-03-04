package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatchingGifts extends OurAPI {

    public MatchingGifts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'State Farm Companies Foundation Matching Gift Prog')]")
    WebElement matchingGiftProgram;

    public void setMatchingGiftProgram(){click(matchingGiftProgram);}

}
