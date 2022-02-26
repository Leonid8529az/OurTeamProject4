package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BullseyeGiftCertificates extends OurAPI {

    @FindBy(xpath = "//a[@id='parent-title-54287']")
    WebElement bullseye50ShopGift;



    public void select50ShopGiftCertificate (){click(bullseye50ShopGift);}


}
