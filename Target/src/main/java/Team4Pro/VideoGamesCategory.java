package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoGamesCategory extends OurAPI {


    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/fd2hh-XboxSeriesXS-200924-1600973706147?wid=328&hei=328&qlt=80&fmt=webp']")
    WebElement xboxSeries;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/GUEST_bdc70c48-04c9-4341-84ba-92e2614807ec']")
    WebElement firstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor80744784']")
    WebElement addToCard;






    public void clickOnKitchenXboxSeries(){click(xboxSeries);}
    public void clickOnFirstItem(){click(firstItem);}
    public void clickAddToCard (){click(addToCard);}

}
