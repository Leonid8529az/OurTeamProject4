package Team4Pro.stores;

import Team4Pro.EmailDirectory;
import Team4Pro.HomePage;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerServiceChat extends OurAPI {


    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;


    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }



    @Test
    public void CustomerService(){
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("5500");
        waitSeconds(5);
        homePage.help();
        scroller("500");
        waitSeconds(2);
        storeDirectory.contactTarget();
        waitSeconds(2);
        storeDirectory.selectATopic();
        waitSeconds(2);
        storeDirectory.selectStoreExperience();
        waitSeconds(2);
        scroller("200");
        storeDirectory.startChat();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        storeDirectory.printName("Ash");
        waitSeconds(2);
        storeDirectory.printLastName("Perez");
        waitSeconds(2);
        storeDirectory.printEmail("ashleyindiracabrera@gmail.com");
        waitSeconds(2);
        //storeDirectory.continueButton();
        waitSeconds(10);
        storeDirectory.sendChat("Love your store");
        waitSeconds(4);
        storeDirectory.send();
        storeDirectory.closeChat();








    }


}

