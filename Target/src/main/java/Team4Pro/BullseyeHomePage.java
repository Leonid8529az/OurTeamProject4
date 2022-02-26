package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BullseyeHomePage extends OurAPI {

    @FindBy(xpath = "//body/header[@id='hd']/div[@class='container d-flex']/nav[@class='navbar navbar-expand-xl navbar-light nav-custom']/div[@id='navbarNav']/ul[@class='navbar-nav']/li[7]/a[1]")
    WebElement bullseyeSale;
    @FindBy(xpath = "//a[normalize-space()='Gift Certificates']")
    WebElement giftCertificates;
    @FindBy(xpath = "//input[@id='txtEmail']")
    WebElement addEmailBar;
    @FindBy(xpath = "//input[@id='submit']")
    WebElement submitEmail;
    @FindBy(xpath = "//a[@href='https://www.bullseyeshop.com/bullseyeshop/lifestyle/birthday']//div[@class='mx-auto']//img")
    WebElement birthday;
    @FindBy(xpath = "//a[@href='bullseyeshop/shop/dogs']//div[@class='mx-auto']//img")
    WebElement topCategory;





    public void selectBullseyeSale (){click(bullseyeSale);}
    public void clickGiftCertificates (){click(giftCertificates);}
    public void typeEmailOnSighUpBar(String itemToSearch) {
        enterText(addEmailBar, itemToSearch);
    }
    public void clickOnSubmitEmail (){click(submitEmail);}
    public void clickOnBirthday (){click(birthday);}
    public void clickOnTopCategory (){click(topCategory);}


}
