package Team4Pro;


import base.OurAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AppTest extends OurAPI {
    Team4Pro.webPage webPage;

    @BeforeMethod
    public void librarySetUp() {
        webPage = PageFactory.initElements(driver, Team4Pro.webPage.class);
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }


    @Test
    public void addddEmailForLatestDeal(){
        //Target
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//input[@id='email-address']")));
        waitSeconds(4);
        enterText("//input[@id='email-address']","ashleyindiracabrera@gmail.com");
        click("//button[@id='submit-button']");
        waitSeconds(2);
        System.out.println(driver.findElement(By.xpath("//p[text()='Thank you! Watch your inbox for deals, new items and more.']")).getText());


    }

    // @Test
    public void selectAnotherStores(){
        click("//a[text()='Find Stores' and @class='Link-sc-1khjl8b-0 iwassO']");
        click("//button[text()='enter zip or city, state']");
        enterText("//input[@id='zipcode']","33192");
        waitSeconds(2);
        click("//button[text()='make it my store' and @aria-label='Make it my store Miami Flagler']");

    }
    //@Test
    public void addingToCard(){
        enterText("//input[@id='search']","hand sanitizer");
        waitSeconds(2);
        click("//button[@class='SearchInputButton-sc-1opoijs-0 eOzuAz']");
        waitSeconds(3);
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//button[@class='SearchInputButton-sc-1opoijs-0 eOzuAz']")));
        waitSeconds(5);
        click("//a[text()='Hand Sanitizer Clear Gel - 8 fl oz - up & up™']");
        click("//button[@class='BaseButton-sc-3v3oog-0 ButtonPrimary-sc-9wgfzx-0 styles__StyledPrimaryButton-sc-1f2lsll-0 eVHdWy JRFKP bebHXQ' and text()='Pick it up']");
        waitSeconds(2);
        click("//button[@aria-label='close']");

    }
    //@Test
    public void categoriesSearch(){
        click("//span[text()='Categories']");
        waitSeconds(3);
        click("//div[@class='Row-sc-uds8za-0 dVIRwU' and @xpath='1']");
        waitSeconds(2);
        click("//div[@class='Row-sc-uds8za-0 dVIRwU' and @xpath='1']");
        waitSeconds(2);
        click("//div[@class='Row-sc-uds8za-0 dVIRwU' and @xpath='1']");

    }

    @Test
    public void customerServiceChat() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//span[@class='CellSkinny__TextWrapper-sc-117d15w-0 kuAfFc' and text()='Target Help']")));
        click("//span[@class='CellSkinny__TextWrapper-sc-117d15w-0 kuAfFc' and text()='Target Help']");
        click("//h3[@style='font-size: 19px; color: #333;' and text()='contact us']");
        click("//strong[text()='see contact options >']");
        click("//button[@type='button']");
        click("//span[normalize-space()='Store Experience']");
        waitSeconds(2);
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[normalize-space()='Chat Now']")).click();
        // click("//button[normalize-space()='Chat Now']");
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        enterText("//input[@id='visitorName']","Ashley");
        enterText("//input[@id='guestLastName']","Cabrera");
        waitSeconds(1);
        enterText("//label[@id='guestEmailLabel']","ashleyindiracabrera@gmail.com");
        waitSeconds(1);
        click("//button[@id='prechat_submit']");
        waitSeconds(5);
        enterText("//textarea[@id='liveAgentChatTextArea']","Love your store");
        waitSeconds(4);
        click("//button[@title='Send']");
        click("//a[@title='close icon']//img");

    }
    //@Test
    public void createAccount(){
        click("//span[@class='sc-gsTCUz dZNyey']//div[@class='sc-hKgILt gTLZXx']//*[name()='svg']");
        click("//div[normalize-space()='Create account']");
        enterText("//input[@id='username']","ashleyindiracabrera@gmail.com");
        enterText("//input[@id='firstname']","Ashley");
        enterText("//input[@id='lastname']","Cabrera");
        enterText("//input[@id='phone']","305-333-4444");
        enterText("//input[@id='password']","CAshley12345");
        click("//button[@id='createAccount']");


    }

    //@Test
    public void signIn(){
        click("//span[@class='sc-gsTCUz dZNyey']//div[@class='sc-hKgILt gTLZXx']//*[name()='svg']");
        waitSeconds(2);
        click("//div[normalize-space()='Sign in']");
        enterText("//input[@id='username']", "ashleyindiracabrera@gmail.com");
        waitSeconds(5);
        enterText("//input[@id='password']","CAshley12345");
        // click("//button[@id='login']");
    }
    //@Test
    public void findCareer(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//span[normalize-space()='Careers']")));
        click("//span[normalize-space()='Careers']");
        enterText("//input[@id='uxCareerSearchText']","QA engineers tester");
        click("//button[@id='uxCareerSearchSubmit2']");
        waitSeconds(7);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeAsyncScript("window.scrollBy(0,300)","");
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());


    }
}
