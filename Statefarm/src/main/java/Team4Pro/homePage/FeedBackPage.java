package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedBackPage extends OurAPI {
    public FeedBackPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Give Us Feedback']")
            public
    WebElement feedback;

    @FindBy(xpath = "(//*[@title=\"Opens in a new window\"])[2]")
            public
    WebElement bottomOfThePage;

    @FindBy(xpath = "//*[@id=\"kampyleForm1164\"]")
            public
    WebElement frame;

    @FindBy(xpath = "//*[@id=\"148d-2ce0-489c-5efc-0b0e-3f9d-05cc-5c1d\"]")
    WebElement feedBackTopic;

    @FindBy(xpath = "//*[@id=\"Page 13\"]")
    WebElement whatDoYouThink;

    @FindBy(xpath = "(//*[@aria-label=\"3,Average\"])[1]")
            public
    WebElement rating1;

    @FindBy(xpath = "(//*[@aria-label=\"3,Average\"])[2]")
            public
    WebElement getRating2;

    @FindBy(xpath = "//*[@id=\"9e5c-95bb-75a6-3bf8-841c-4ec6-6bc2-ffd11\"]")
    WebElement notStateFarmCustom;

    @FindBy(xpath = "//*[@id=\"117d-5fc0-e43c-29e9-092f-bb4d-693d-54061\"]")
    WebElement accomplishment;
    @FindBy(xpath = "//*[@class=\"btn submit-btn formSelectDropDown form-submit-btn ng-binding ng-scope neb-focused\"]")
    WebElement submit;






    public void setFeedback(){click(feedback);}
    public void setFeedBackTopic(String topic){selectDropDownOption(feedBackTopic,topic);}
    public void setWhatDoYouThink(String text){enterText(whatDoYouThink,text);}
    public void setRating1(){click(rating1);}
    public void setNotStateFarmCustom(){click(notStateFarmCustom);}
    public void setAccomplishment(){click(accomplishment);}
    public void setGetRating2(){click(getRating2);}
    public void setSubmit(){click(submit);}

}
