package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsCategory extends OurAPI {


    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/022022_FEBWK4_KIDSL1_CATNAV_TWEEN_V2-220126-1643241588949?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement tweenClothing;
    @FindBy(xpath = "//a[@href='/p/girls-farren-footbed-sandals-art-class/-/A-83848479?preselect=83815682#lnk=sametab']")
    WebElement kidsFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor83815682']")
    WebElement addToCard;






    public void clickOnTweenClothing (){click(tweenClothing);}
    public void clickOnKidsFirstItem (){click(kidsFirstItem);}
    public void clickAddToCard (){click(addToCard);}



}
