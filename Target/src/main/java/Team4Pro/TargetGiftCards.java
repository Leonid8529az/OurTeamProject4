package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class TargetGiftCards extends OurAPI {

    @FindBy(xpath = "//div[contains(@class,'Row-sc-uds8za-0 StoryblocksRow-sc-mwfgc1-0 fYHWLy iXQJIS h-margin-b-default storyblockRiftRow')]//div[1]//a[1]//div[2]//h3[1]")
    WebElement targetGiftCardButton;
    @FindBy(xpath = "//span[normalize-space()='Baby']")
    WebElement babyTargetGiftCard;
    @FindBy(xpath = "//h2[contains(@class,'Heading__StyledHeading-sc-1mp23s9-0 fSrhRC h-display-block h-margin-b-tiny')]")
    WebElement allBabyResults;
    @FindBy(xpath = "//a[@aria-label='3 Cute Animals Target GiftCard']")
    WebElement babyGiftCard;
    @FindBy(xpath = "//div[normalize-space()='FAQs']")
    WebElement questionsAndAnswers;
    @FindBy(xpath = "//div[normalize-space()='Fraud prevention info']")
    WebElement fraudPreventionInfo;










    public void clickTargetGiftCards (){click(targetGiftCardButton);}

    public void clickBabyTargetGiftCard(){click(babyTargetGiftCard);}

    public String setAllBabyResults() {
        return allBabyResults.getText();
    }

    public void clickBabyGiftCard(){click(babyGiftCard);}

    public void FAQS (){click(questionsAndAnswers);}

    public void targetFraudPreventionInfo (){click(fraudPreventionInfo);}



}
