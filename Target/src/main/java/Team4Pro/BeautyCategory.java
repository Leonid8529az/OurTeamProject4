package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeautyCategory extends OurAPI {



    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Artboard1-210721-1626888130874?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement ultraBeautyAtTarget;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/GUEST_c19d1969-1089-4c0e-944d-d6e958d3ec59']")
    WebElement ultraFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor83443929']")
    WebElement addToCard;






    public void clickOnUltraBeautyAtTarget (){click(ultraBeautyAtTarget);}
    public void clickOnUltraFirstItem (){click(ultraFirstItem);}
    public void clickAddToCard (){click(addToCard);}





}
