package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategory extends OurAPI {

    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/Womens_Clothing213189-200109_1578607254295?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement womenClothing;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/GUEST_b3911106-a1ff-44dc-bfb0-3f5d4542cc2f?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement womenActivewear;
    @FindBy(xpath = "//a[@aria-label=\"Women's Essential Crewneck Short Sleeve T-Shirt - All in Motion™\"]")
    WebElement womenFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor80881485']")
    WebElement addToCard;






    public void clickOnWomenClothing (){click(womenClothing);}
    public void setWomenActivewear (){click(womenActivewear);}
    public void clickWomenFirstItem (){click(womenFirstItem);}
    public void clickOnAddToCard (){click(addToCard);}


}
