package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistryDirectory extends OurAPI {


    @FindBy(xpath = "//button[normalize-space()='Find a registry']")
    WebElement findRegistry;
    @FindBy(xpath = "//input[@id='RegistrantsName-firstName']")
    WebElement registryFirstName;
    @FindBy(xpath = "//input[@id='RegistrantsName-lastName']")
    WebElement registryLastName;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchRegistry;
    @FindBy(xpath = "//a[@class='Link__StyledLink-sc-4b9qcv-0 styles__StyledLink-sc-1evu2gd-3 TzecD hwTKfR']")
    WebElement organization;
    @FindBy(xpath = "//input[@id='RegistrantsName-firstName']")
    WebElement nameOrganization;







    public void findARegistry (){click(findRegistry);}

    public void typeFirstName(String itemToSearch){
        enterText(registryFirstName, itemToSearch);
    }

    public void typeLastName(String itemToSearch){
        enterText(registryLastName, itemToSearch);
    }

    public void findRegistry (){click(searchRegistry);}

    public void searchFromAnOrganization (){click(organization);}

    public void nameOfOrganization(String itemToSearch){
        enterText(nameOrganization, itemToSearch);
    }

//    public void nameOfOrganization (){click(nameOrganization);}





}
