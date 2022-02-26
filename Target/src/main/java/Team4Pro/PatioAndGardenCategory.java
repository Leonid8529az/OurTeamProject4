package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatioAndGardenCategory extends OurAPI {


    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Adaptive_PatioFurniture-211105-1636140752844?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement patioFurniture;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Adaptive_PatioTables-211105-1636141898452?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement patioTables;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/GUEST_659b13f0-3924-47ac-aff8-364012fa0fb3']")
    WebElement firstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor16299462']")
    WebElement cart;







    public void clickOnPatioFurniture (){click(patioFurniture);}
    public void clickOnPatioTables (){click(patioTables);}
    public void clickOnFirstItem (){click(firstItem);}
    public void AddToCart (){click(cart);}




}
