package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages extends OurAPI {
    public SearchPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Off-Road Vehicle Insurance Quote - State Farm®']")
    WebElement offRoadVehicle;

    @FindBy(xpath = "//*[@title=\"Refine by: finances\"]")
    WebElement financialTools;
    @FindBy(xpath = "//*[@title=\"Refine by: banking\"]")
    WebElement banking;


    public void setOffRoadVehicle(){click(offRoadVehicle);}
    public void setFinancialTools(){click(financialTools);}
    public void setBanking(){click(banking);}
}
