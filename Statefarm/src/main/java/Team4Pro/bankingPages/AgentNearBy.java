package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentNearBy extends OurAPI {
    public AgentNearBy (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"locationText\"]")
    WebElement zipcodeToFindAgent;

    @FindBy(xpath = "//*[text()='Agent Website'and@title='Sammy Martinez']")
    public
    WebElement sammyMartinezWebsite;
    @FindBy(xpath = "//*[text()='Get Directions'and@title='Sammy Martinez']")
    public
    WebElement sammyMartinezDirection;
    @FindBy(xpath = "//*[text()='Email Agent'and@title='Sammy Martinez']")
    public
    WebElement getSammyMartinezEmail;
    @FindBy(xpath = "//*[@id='contactAgentNameField']")
    WebElement nameFieldToEmailAgent;
    @FindBy(xpath = "//*[@id='contactAgentMailorPhoneField']")
    WebElement emailFieldToEmailAgent;
    @FindBy(xpath = "//*[@id='contactAgentMessageField']")
    WebElement textToEmail;
    @FindBy(xpath = "//*[@id='contactPageSendEmailBtn']")
    public
    WebElement sendEmailToAgent;

    @FindBy(xpath = "//*[@id='search-options-toggle']")
    WebElement advancedSearch;
    @FindBy(xpath = "//*[@id='language']")
    WebElement languageForAdvanced;
    @FindBy(xpath = "//*[@id='products']")
    WebElement productForAdvanced;
    @FindBy(xpath = "//*[@id='distanceDropdown']")
    WebElement distanceForAdvanced;


    public void setSammyMartinezWebsite(){click(sammyMartinezWebsite);}
    public void setSammyMartinezDirection(){click(sammyMartinezDirection);}
    public void setGetSammyMartinezEmail(){click(getSammyMartinezEmail);}
    public void setNameFieldToEmailAgent(String name){enterText(nameFieldToEmailAgent,name);}
    public void setEmailFieldToEmailAgent(String email){enterText(emailFieldToEmailAgent,email);}
    public void setTextToEmail(String text){enterText(textToEmail,text);}
    public void setSendEmailToAgent(){click(sendEmailToAgent);}
    public void setZipcodeToFindAgent(String zipcode){enterText(zipcodeToFindAgent,zipcode);}
    public void setAdvancedSearch(){click(advancedSearch);}
    public void setLanguageForAdvanced(String language){enterText(languageForAdvanced,language);}
    public void setProductForAdvanced(String product){selectDropDownOption(productForAdvanced,product);}
    public void setDistanceForAdvanced(String distance){selectDropDownOption(distanceForAdvanced,distance);}


}
