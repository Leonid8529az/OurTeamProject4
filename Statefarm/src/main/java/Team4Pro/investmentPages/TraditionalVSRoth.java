package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TraditionalVSRoth extends OurAPI {
    public TraditionalVSRoth(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"sfx_submittedAge_input\"]")
    WebElement retirementAge;
    @FindBy(xpath = "//*[@id=\"sfx_submittedContribution_input\"]")
    WebElement retirementContribution;
    @FindBy(xpath = "//*[@id=\"sfx_submittedYearsToContribute_input\"]")
    WebElement retirementYearOfContribution;
    @FindBy(xpath = "//*[@id=\"sfx_submittedAssumedRateofReturn_input\"]")
    WebElement retirementAssumedRate;
    @FindBy(xpath = "//*[@id=\"sfx_submittedCurrentTaxRate_input\"]")
    WebElement retirementCurrentTax;
    @FindBy(xpath = "//*[@id=\"sfx_submittedTaxRateAtRetirement_input\"]")
    WebElement taxAtRetirement;
    @FindBy(xpath = "//*[@id=\"calculateButton\"]")
    public
    WebElement calculateToCompareRetirement;

    public void setRetirementAge(String age){enterText(retirementAge,age);}
    public void setRetirementContribution(String contribution){enterText(retirementContribution,contribution);}
    public void setRetirementYearOfContribution(String years){enterText(retirementYearOfContribution,years);}
    public void setRetirementAssumedRate(String rate){enterText(retirementAssumedRate,rate);}
    public void setRetirementCurrentTax(String currentTax){selectDropDownOption(retirementCurrentTax,currentTax);}
    public void setTaxAtRetirement(String tax){selectDropDownOption(taxAtRetirement,tax);}
    public void setCalculateToCompareRetirement(){click(calculateToCompareRetirement);}


}
