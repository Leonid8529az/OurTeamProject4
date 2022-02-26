package Team4Pro.targetRegistry;

import Team4Pro.*;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindARegistry extends OurAPI {



    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;
    SpecialtyGiftCardDirectory giftCardDirectory;
    RegistryDirectory registryDirectory;



    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        giftCardDirectory = PageFactory.initElements(driver, SpecialtyGiftCardDirectory.class);
        registryDirectory = PageFactory.initElements(driver, RegistryDirectory.class);


    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }


    @Test
    public void FindRegistry() {

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        waitSeconds(3);
        homePage.clickRegistry();
        registryDirectory.findARegistry();
        registryDirectory.typeFirstName("Linda");
        waitSeconds(2);
        registryDirectory.typeLastName("Perez");
        waitSeconds(2);
        registryDirectory.findRegistry();







    }
}
