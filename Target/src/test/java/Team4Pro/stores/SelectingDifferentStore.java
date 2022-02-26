package Team4Pro.stores;

import Team4Pro.EmailDirectory;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectingDifferentStore extends OurAPI {

    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;



    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }



    @Test
    public void addingEmailForLatestDeal(){
        storeDirectory.findStores();
        Assert.assertEquals(getTitle(), "Stores Near Me : Target");
        storeDirectory.storeLocator();
        scroller("170");
        waitSeconds(5);
        storeDirectory.PrintZipCode("33174");
        waitSeconds(3);











    }

}
