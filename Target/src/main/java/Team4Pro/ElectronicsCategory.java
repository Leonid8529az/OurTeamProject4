package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsCategory extends OurAPI {

    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/TVs-5xtdw-211108-1636382089222?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement TVsAndHomeTheater;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/GUEST_85b6eeef-44ed-4979-8b83-d07545346f78']")
    WebElement electronicFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor54334335']")
    WebElement addToCard;






    public void clickOnTVsAndHomeTheater (){click(TVsAndHomeTheater);}
    public void clickOnElectronicFirstItem (){click(electronicFirstItem);}
    public void clickAddToCard (){click(addToCard);}


}
