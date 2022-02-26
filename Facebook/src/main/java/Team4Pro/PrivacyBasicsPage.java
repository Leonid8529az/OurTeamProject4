package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyBasicsPage extends OurAPI {
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[3]/div/div[2]")
    WebElement privacyBasicsText;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[2]")
    WebElement topTopics;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[3]")
    WebElement youAreInCharge;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[4]")
    WebElement manageYourPrivacy;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[5]")
    WebElement staySafeAndSecure;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[6]")
    WebElement advertising;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[7]")
    WebElement workingTogether;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[8]")
    WebElement privacyPrinciples;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[2]/a[9]")
    WebElement dataPolicy;
    @FindBy(xpath = "//div[@class='_utk']/div[4]/div/h3")
    WebElement topTopicsText;
    @FindBy(xpath = "//div[@class='_utk']/div[5]/div/h3")
    WebElement youAreInChargeText;
    @FindBy(xpath = "//div[@id='content']/div/div/div/div[3]/h3")
    WebElement assertionText;
    @FindBy(xpath = "//div[@id='content']/div/div/div[3]/div[2]/div/div/h2[2]")
    WebElement dataPolicyText;
    @FindBy(xpath = "//div[@id='globalContainer']/div/div/div/div/div[3]/h3")
    WebElement privacyPrinciplesText;

    public String getTextPrivacyBasics() {
        return privacyBasicsText.getText();
    }
    public void clickOnTopTopics() {
        click(topTopics);
    }
    public void clickOnYouAreInCharge() {
        click(youAreInCharge);
    }
    public void clickOnManageYourPrivacy() {
        click(manageYourPrivacy);
    }
    public void clickOnStaySafeAndSecure() {
        click(staySafeAndSecure);
    }
    public void clickOnAdvertising() {
        click(advertising);
    }
    public void clickOnWorkingTogether() {
        click(workingTogether);
    }
    public void clickOnPrivacyPrinciples() {
        click(privacyPrinciples);
    }
    public void clickOnDataPolicy() {
        click(dataPolicy);
    }
    public String getTextTopTopics() {
        return topTopicsText.getText();
    }
    public String getTextYouAreInCharge() {
        return youAreInChargeText.getText();
    }
    public String getTextAssertionText() {
        return assertionText.getText();
    }
    public String getTextDataPolicy() {
        return dataPolicyText.getText();
    }
    public String getTextPrivacyPrinciples() {
        return privacyPrinciplesText.getText();
    }
}
