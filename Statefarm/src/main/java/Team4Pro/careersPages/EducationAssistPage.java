package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationAssistPage extends OurAPI {
    public EducationAssistPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"External link: ASU/Pathways for the Future\"]")
            public
    WebElement pathwayForFuture;


    public void setPathwayForFuture(){click(pathwayForFuture);}
}
