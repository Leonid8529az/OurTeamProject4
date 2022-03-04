package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoticeOfPrivacy extends OurAPI {
    public NoticeOfPrivacy(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[9]")
            public
    WebElement importantInfo;
    @FindBy(xpath = "//*[@title='Privacy Comments and Suggestions']")
    WebElement emailUs;

    @FindBy(xpath = "//*[text()='New York Privacy Rights']")
            public
    WebElement newYorkPrivacyRight;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[1]")
            public
    WebElement ourPrivacy;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[2]")
            public
    WebElement weProtectCustomer;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[3]")
            public
    WebElement informationWeCollect;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[4]")
    WebElement useCustomerInfo;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[5]")
            public
    WebElement shareCustomerInfo;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[6]")
            public
    WebElement sharingLimit;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[7]")
            public
    WebElement familyOfCompany;

    @FindBy(xpath = "(//*[@class=\"-oneX-icon--chevron--down\"])[8]")
            public
    WebElement mobileApplication;





    public void setImportantInfo(){click(importantInfo);}
    public void setEmailUs(){click(emailUs);}
    public void setNewYorkPrivacyRight(){click(newYorkPrivacyRight);}
    public void setOurPrivacy(){click(ourPrivacy);}
    public void setWeProtectCustomer(){click(weProtectCustomer);}
    public void setInformationWeCollect(){click(informationWeCollect);}
    public void setUseCustomerInfo(){click(useCustomerInfo);}
    public void setShareCustomerInfo(){click(shareCustomerInfo);}
    public void setSharingLimit(){click(sharingLimit);}
    public void setFamilyOfCompany(){click(familyOfCompany);}
    public void setMobileApplication(){click(mobileApplication);}

}
