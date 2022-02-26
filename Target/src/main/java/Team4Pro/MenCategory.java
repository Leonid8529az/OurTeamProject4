package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenCategory extends OurAPI {


    @FindBy(xpath = "//img[@alt='Big & Tall']")
    WebElement menBigAndTall;
    @FindBy(xpath = "//a[@href='/p/men-s-standard-fit-short-sleeve-loring-polo-t-shirt-goodfellow-co-153/-/A-53599585?preselect=53481806#lnk=sametab']")
    WebElement menFirstItem;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor53481806']")
    WebElement addToCard;






    public void clickOnMenBigAndTall (){click(menBigAndTall);}
    public void clickMenFirstItem (){click(menFirstItem);}
    public void clickAddToCard (){click(addToCard);}



}
