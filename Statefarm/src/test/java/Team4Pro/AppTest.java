package Team4Pro;


import base.OurAPI;
import org.testng.annotations.Test;

public class AppTest extends OurAPI {
    @Test
    public void findAnAgent() {
        click("//button[@class=\"-oneX-header-top-menu-btn \"and@data-for='findanagent']");
        enterText("//input[@id=\"oneX-findAnAgentZipCode\"]","11214");
        //click("//button[@id=\"findAnAgentButton\"]");
        click("//a[@class=\"-oneX-link--block visit-agent-site\"and @title='Sammy Martinez']");
        waitSeconds(2);
        switchToDifferentTab();
        selectDropDownOption("//select[@id=\"quote-product-select\"]","Homeowners");
        enterText("//input[@id=\"quote-zip-field\"]","11214");
        click("//button[@id=\"get-quote-button\"]");
    }
}
