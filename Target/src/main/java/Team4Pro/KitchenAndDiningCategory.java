package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KitchenAndDiningCategory extends OurAPI {


    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/182867-170403_1491254994476?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement kitchenAppliances;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/KA_KitchenAid-200622-1592846144751?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement mixersAndAttachments;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/GUEST_df02fe4a-9f41-48b7-83cc-ba0d74f2663b']")
    WebElement kitchensFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor14297451']")
    WebElement addToCard;






    public void clickOnKitchenAppliances(){click(kitchenAppliances);}
    public void clickOnMixersAndAttachments(){click(mixersAndAttachments);}
    public void clickOnFirstItem (){click(kitchensFirstItem);}
    public void clickAddToCard (){click(addToCard);}

}
