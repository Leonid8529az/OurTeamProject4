package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiversityAndInclusionPage extends OurAPI {

    public DiversityAndInclusionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Good Neighbor Citizenship Company Grants\"]")
            public
    WebElement grants;
    @FindBy(xpath = "//*[@title=\"Company Development Relationships\"]")
            public
    WebElement relationship;
    @FindBy(xpath = "//*[@title=\"Safer Communities\"]")
            public
    WebElement safety;
    @FindBy(xpath = "//*[@title=\"Community Service & Involvement\"]")
            public
    WebElement education;
    @FindBy(xpath = "//*[@title=\"B2B: Supplier Diversity\"]")
            public
    WebElement supplierDiversity;
    @FindBy(xpath = "//*[text()=\"Company Overview\"]")
            public
    WebElement companyOverview;
    @FindBy(xpath = "//*[text()=\"Innovation\"]")
            public
    WebElement innovation;
    @FindBy(xpath = "//*[text()=\"Accessibility Statement\"]")
            public
    WebElement accessibilityStatement;


    public void setGrants(){click(grants);}
    public void setRelationship(){click(relationship);}
    public void setSafety(){click(safety);}
    public void setEducation(){click(education);}
    public void setSupplierDiversity(){click(supplierDiversity);}
    public void setCompanyOverview(){click(companyOverview);}
    public void setInnovation(){click(innovation);}
    public void setAccessibilityStatement(){click(accessibilityStatement);}


}
