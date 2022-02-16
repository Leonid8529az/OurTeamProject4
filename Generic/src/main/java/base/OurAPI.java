package base;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import utility.GetProperties;

import java.io.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class OurAPI {
        XSSFWorkbook excelWorkBook;
        XSSFSheet excelSheet;
        XSSFCell cell;
        public WebDriver driver;
        Properties prop;

    public static com.relevantcodes.extentreports.ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            //takeScreenshot(result.getName());
        }
        driver.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

        @Parameters({"username", "password","useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})



        @BeforeMethod
        public void startingPoint(String username, String password, @Optional("false") boolean useCloudEnv,@Optional String cloudEnvName,
                                  @Optional("windows") String OS, @Optional("10") String os_version,
                                  @Optional("chrome") String browserName, @Optional("34") String browserVersion,
                                  @Optional("https://www.google.com/") String url) throws MalformedURLException {
            String browserstackUsername = username;
            String browserstackPassword = password;
            if(useCloudEnv == true) {
                if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                    getCloudDriver(cloudEnvName, browserstackUsername, browserstackPassword, OS, os_version, browserName, browserVersion);
                } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                    getCloudDriver(cloudEnvName, "", "", OS, os_version, browserName, browserVersion);
                }
            }else{
                getDriver(OS, browserName);

            }
            System.out.println("---------------------------------------------------");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(url);
        }
        public WebDriver getDriver(@Optional("windows") String os, String browserName) {
            String prop = System.getProperty("user.dir");
            if (browserName.equalsIgnoreCase("chrome")) {
                if (os.equalsIgnoreCase("windows")) {
                    System.setProperty("webdriver.chrome.driver", "../Generic/src/driver/chromedriver.exe");
                } else if (os.equalsIgnoreCase("OS X")) {
                    System.setProperty("webdriver.chrome.driver", "../Generic/src/driver/chromedriver");
                }
                driver = new ChromeDriver();
            }

            else if (browserName.equalsIgnoreCase("firefox")) {
                if (os.equalsIgnoreCase("windows")) {
                    System.setProperty("webdriver.chrome.driver", prop + "\\src\\driver\\geucodriver.exe");
                } else if (os.equalsIgnoreCase("mac")){
                    System.setProperty("webdriver.chrome.driver", prop + "\\src\\driver\\geucodriver");
                }
                driver = new FirefoxDriver();
            }

        return driver;
    }
    public WebDriver getCloudDriver(String envName, String EnvUsername, String envAccessKey, String os, String os_version, String browserName, String browserVersion) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("sauselabs")){
            driver = new RemoteWebDriver(new URL("http://"+ EnvUsername + ":" + envAccessKey + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("browserstack")){
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://"+ EnvUsername + ":" + envAccessKey + "@hub-cloud.browserstack.com:80/wd/hub"), cap);
        }
        return driver;
    }
    @AfterMethod
    public void endPoint() {
        driver.quit();
    }
    public String getTitle() {
           return driver.getTitle();
    }
    public void click(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).click();
        }
    }
    public void enterText(String locator, String whichTextYouWantToEnter) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(whichTextYouWantToEnter, Keys.ENTER);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(whichTextYouWantToEnter,Keys.ENTER);
        }
    }
    public void clickByID(String locator) {
        driver.findElement(By.id(locator)).click();
    }
    public void enterTextByID(String locator, String yourTextHere) {
        driver.findElement(By.id(locator)).sendKeys(yourTextHere,Keys.ENTER);
    }
    public void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public WebElement createWebElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        return element;
    }
    public WebElement createWebElementByID(String locator) {
        WebElement element = driver.findElement(By.id(locator));
        return element;
    }
    public List<WebElement> lisrOfWebElements(String dropdownLocator) {
        List<WebElement> list = driver.findElements(By.xpath(dropdownLocator));
        return list;
    }
    public List<WebElement> listOfWebElementsByID(String dropdownLocator) {
        List<WebElement> list = driver.findElements(By.id(dropdownLocator));
        return list;
    }
    public String getTextByID(String locator) {
        return driver.findElement(By.id(locator)).getText();
    }
    public String getText(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }
    public void selectDropDownOption(String locator, String option) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e) {
                select.selectByValue(option);
            }
        } catch (Exception e) {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e1) {
                select.selectByValue(option);
            }
        }
    }
    public void selectDropDownOptionByID(String locator, String option) {
        WebElement element = driver.findElement(By.id(locator));
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);
        }

    }
    public void switchToDifferentWindow() {
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
    public void switchToDifferentTab() {
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
    }
    public void alertClick(boolean trueOrFalse) {
        if (trueOrFalse == true) {
            driver.switchTo().alert().accept();
        } else {
            driver.switchTo().alert().dismiss();
        }
    }
    public String alertTextDetector() {
        return driver.switchTo().alert().getText();
    }
    public void scroller(String howManyPixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + howManyPixels + ")");

    }
    public WebElement createWebElementFromClassName(String locator) {
        return driver.findElement(By.className(locator));
    }
    public void hoverOver(String locator) {
        Actions action = new Actions(driver);
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            action.moveToElement(element).build().perform();
        } catch (Exception e) {
            WebElement element = driver.findElement(By.cssSelector(locator));
            action.moveToElement(element).build().perform();
        }
    }
    public void switchToIFrame(int index) {
        driver.switchTo().frame(index);
    }
    public void howManyIframesWeHave() {
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i<size;i++) {
            driver.switchTo().frame(i);
            System.out.println(i + " " + driver.getTitle());
        }
    }
    public void pressEnter(String locator) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
        }
    }
    public void checkIfIsChecked(String locator) {
        try {
            Assert.assertTrue(driver.findElement(By.xpath(locator)).isSelected());
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.cssSelector(locator)).isSelected());
        }

    }
    public void checkIfIsUnChecked(String locator) {
        try {
            Assert.assertFalse(driver.findElement(By.xpath(locator)).isSelected());
        } catch (Exception e) {
            Assert.assertFalse(driver.findElement(By.cssSelector(locator)).isSelected());
        }

    }
    public void checkIfIsVisible(String locator) {
        try {
            Assert.assertTrue(driver.findElement(By.xpath(locator)).isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.cssSelector(locator)).isDisplayed());
        }

    }
    public void checkIfIsNotVisible(String locator) {
        try {
            Assert.assertFalse(driver.findElement(By.xpath(locator)).isDisplayed());
        } catch (Exception e) {
            Assert.assertFalse(driver.findElement(By.cssSelector(locator)).isDisplayed());
        }

    }
    public void checkIfIsEnabled(String locator) {
        try {
            Assert.assertTrue(driver.findElement(By.xpath(locator)).isEnabled());
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.cssSelector(locator)).isEnabled());
        }

    }
    public void checkIfIsNotEnabled(String locator) {
        try {
            Assert.assertFalse(driver.findElement(By.xpath(locator)).isEnabled());
        } catch (Exception e) {
            Assert.assertFalse(driver.findElement(By.cssSelector(locator)).isEnabled());
        }

    }
    public void scrollToView(String locator) {
        try {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath(locator)));
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor)driver);
            js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.cssSelector(locator)));
        }
    }

    //List of same functions, but they take WebElement as an argument
    public void click(WebElement element) {
            element.click();
    }
    public void enterText(WebElement element, String whichTextYouWantToEnter) {
        try {
            element.sendKeys(whichTextYouWantToEnter, Keys.ENTER);
        } catch (Exception e) {
            element.sendKeys(whichTextYouWantToEnter,Keys.ENTER);
        }
    }
    public String getText(WebElement element) {
        return element.getText();
    }
    public void selectDropDownOption(WebElement element, String option) {
        try {
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e) {
                select.selectByValue(option);
            }
        } catch (Exception e) {
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e1) {
                select.selectByValue(option);
            }
        }
    }
    public void selectDropDownOptionByID(WebElement element, String option) {
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);
        }

    }
    public void hoverOver(WebElement element) {
        Actions action = new Actions(driver);
        try {
            action.moveToElement(element).build().perform();
        } catch (Exception e) {
            action.moveToElement(element).build().perform();
        }
    }
    public void pressEnter(WebElement element) {
        try {
            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            element.sendKeys(Keys.ENTER);
        }
    }
    public void checkIfIsChecked(WebElement element) {
        try {
            Assert.assertTrue(element.isSelected());
        } catch (Exception e) {
            Assert.assertTrue(element.isSelected());
        }

    }
    public void checkIfIsUnChecked(WebElement element) {
        try {
            Assert.assertFalse(element.isSelected());
        } catch (Exception e) {
            Assert.assertFalse(element.isSelected());
        }

    }
    public void checkIfIsVisible(WebElement element) {
        try {
            Assert.assertTrue(element.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(element.isDisplayed());
        }

    }
    public void checkIfIsNotVisible(WebElement element) {
        try {
            Assert.assertFalse(element.isDisplayed());
        } catch (Exception e) {
            Assert.assertFalse(element.isDisplayed());
        }

    }
    public void checkIfIsEnabled(WebElement element) {
        try {
            Assert.assertTrue(element.isEnabled());
        } catch (Exception e) {
            Assert.assertTrue(element.isEnabled());
        }

    }
    public void checkIfIsNotEnabled(WebElement element) {
        try {
            Assert.assertFalse(element.isEnabled());
        } catch (Exception e) {
            Assert.assertFalse(element.isEnabled());
        }

    }
    public void scrollToView(WebElement element) {
        try {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].scrollIntoView(true)", element);
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor)driver);
            js.executeScript("arguments[0].scrollIntoView(true)",element);
        }
    }
    public void feedDataWithNoClick(String locator, String whichTextYouWantToEnter) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(whichTextYouWantToEnter);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(whichTextYouWantToEnter);
        }
    }
    public void feedDataWithNoClick(WebElement element, String whichTextYouWantToEnter) {
        try {
            element.sendKeys(whichTextYouWantToEnter);
        } catch (Exception e) {
            element.sendKeys(whichTextYouWantToEnter);
        }
    }
    public void feedDataWithNoClickByID(String locator, String whichTextYouWantToEnter) {
            driver.findElement(By.id(locator)).sendKeys(whichTextYouWantToEnter);
    }
    public void clearTextField(String locator) {
        driver.findElement(By.xpath(locator)).clear();
    }
    public void clearTextField(WebElement element) {
        element.clear();
    }
    public void switchToIFrame(WebElement element) {
        driver.switchTo().frame(element);
    }
    public String getDataFromCell(String path, String sheet, int rowNumber, int columnNumber) {
        try {
            FileInputStream file = new FileInputStream(path);
            excelWorkBook = new XSSFWorkbook(file);
            excelSheet = excelWorkBook.getSheet(sheet);
            cell = excelSheet.getRow(rowNumber).getCell(columnNumber);
            file.close();
        } catch (Exception e) {
            System.out.println("No data found");
            return "";

        }
        return cell.getStringCellValue();
    }
    public void captureScreenshot() {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("screenshots/screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshot(String screenshotName){
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+File.pathSeparator+ "screenshots"+File.pathSeparator+screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            String path = System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".png";
            System.out.println(path);
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }
    }
}
