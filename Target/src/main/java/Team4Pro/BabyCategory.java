package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BabyCategory extends OurAPI {


    @FindBy(xpath = "//img [@src='//target.scene7.com/is/image/Target/9Wk1_BabyL1_CN_CN_9187483-190813_1565707355852?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement babyToys;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/GUEST_7c6ee0f2-5949-4248-8d56-9633b61d1fc5']")
    WebElement babyFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor76153042']")
    WebElement addToCard;






    public void clickOnBabyToys (){click(babyToys);}
    public void clickOnBabyFirstItem (){click(babyFirstItem);}
    public void clickAddToCard (){click(addToCard);}


}
