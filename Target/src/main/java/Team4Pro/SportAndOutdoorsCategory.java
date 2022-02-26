package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportAndOutdoorsCategory extends OurAPI {



    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/1-210325-1616699318109?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement bikesAndCycling;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Adaptive_PatioTables-211105-1636141898452?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement bikes;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor77523386']")
    WebElement cart;







    public void clickOnBikesAndCycling (){click(bikesAndCycling);}
    public void clickOnBike (){click(bikes);}

    public void AddToCart (){click(cart);}




}
