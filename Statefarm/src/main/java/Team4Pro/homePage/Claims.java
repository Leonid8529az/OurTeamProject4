package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Claims extends OurAPI {

    public Claims(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[contains(text(),'Claims')]")
    WebElement claimsHeaderInHomePage;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[6]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement claimsSubTitle_fileAClaim;
    @FindBy(xpath = "//a[contains(text(),'Track a Claim')]")
    WebElement claimsSubTitle_trackAClaim;
    @FindBy(xpath = "//a[contains(text(),'Claims Help')]")
    WebElement claimsSubTitle_claimHelp;

    public void setClaimsHeaderInHomePage(){click(claimsHeaderInHomePage);}
    public void setClaimsSubTitle_fileAClaim(){click(claimsSubTitle_fileAClaim);}
    public void setClaimsSubTitle_trackAClaim(){click(claimsSubTitle_trackAClaim);}
    public void setClaimsSubTitle_claimHelp(){click(claimsSubTitle_claimHelp);}
}
