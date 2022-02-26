package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeeklyAdDirectory extends OurAPI {


    @FindBy(xpath = "//span[normalize-space()='Feb 13 - Feb 19']")
    WebElement dateOfWeeklyAd;
    @FindBy(xpath = "//a[@href='https://weeklyad.target.com']//div[@class='Row-sc-uds8za-0 dVIRwU']")
    WebElement weeklyAdButton;
    @FindBy(xpath = "//span[normalize-space()='Feb 20 - Feb 26']")
    WebElement dateOfSneakPeek;
    @FindBy(xpath = "//button[normalize-space()='View the Sneak Peek']")
    WebElement viewTheSneakPeek;






    public String weeklyAdDate() {
        return dateOfWeeklyAd.getText();
    }

    public void selectWeeklyAdButton(){click(weeklyAdButton);}

    public String weeklyAdNewDate() {
        return dateOfSneakPeek.getText();
    }

    public void selectViewTheSneakPeek (){click(viewTheSneakPeek);}





}
