package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeCategory  extends OurAPI{


    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Spring-New-Arrivals4-211115-1637006793935?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement homeDecor;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Home-Decor-1-211130-1638298009391?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement rugs;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/GUEST_d5125880-4ec4-4816-bac7-4536c35d6c8d']")
    WebElement addFirstItemToCard;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor21407691']")
    WebElement card;






    public void clickOnHomeDecor (){click(homeDecor);}
    public void clickOnRugs (){click(rugs);}
    public void clickOnFirstItem (){click(addFirstItemToCard);}
    public void clickAddItemToCard (){click(card);}




}
