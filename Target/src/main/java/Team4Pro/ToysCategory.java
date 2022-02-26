package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToysCategory extends OurAPI {


    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/action_figures217440-200319_1584637775767?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement actionFigures;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/AF-210817-1629212923656?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement setActionFigures;
    @FindBy(xpath = "//img [@src='//target.scene7.com/is/image/Target/Logo_Marvel199369-191022_1571772823570?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement marvel;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/GUEST_9a413239-f8eb-49ac-9452-62286f3c2848']")
    WebElement item;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor81964174']")
    WebElement addToCard;




    public void clickOnActionFigures (){click(actionFigures);}
    public void selectActionFigures (){click(setActionFigures);}
    public void clickOnMarvel (){click(marvel);}
    public void selectFirstItem (){click(item);}
    public void clickOnAddToCard (){click(addToCard);}


}
