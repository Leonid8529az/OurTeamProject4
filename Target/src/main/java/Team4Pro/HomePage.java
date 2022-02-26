package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends OurAPI {


    @FindBy(xpath = "//input[@id='search']")
    WebElement searchBar;
    @FindBy(xpath = "//a[@aria-label='Huggies Little Snugglers Baby Diapers – (Select Size and Count)']")
    WebElement firstItem;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement mainSearchButton;
    @FindBy(xpath = "//div//h2[@class='Heading__StyledHeading-sc-1mp23s9-0 UABvu h-display-block h-margin-b-tiny']")////div[@data-test='productGridContainer']/div/div[2]/div/h2
    WebElement resultsHeading;
    @FindBy(xpath = "//button[@id='addToCartButtonOrTextIdFor53550898']")
    WebElement addCard;
    @FindBy(xpath = "//a[@id='utilityNav-giftCards']")
    WebElement giftCardsButton;
    @FindBy(xpath = "//div//a[@class='MainMenuLink__MenuLink-sc-1wkog9x-0 kKPKoW' and @data-test='@web/Header/MainMenuLink']")
    WebElement categories;
    @FindBy(xpath = "//div[normalize-space()='Women']")
    WebElement womenCategory;
    @FindBy(xpath = "//div[@class='Row-sc-uds8za-0 dVIRwU']")
    WebElement womenCategoryClothing;
    @FindBy(xpath = "//div[normalize-space()='Activewear']")
    WebElement womenCategoryActive;
    @FindBy(xpath = "//div[@data-test='productGridContainer']/div/div/div/h2")
    WebElement totalResults;
    @FindBy(xpath = "//div[normalize-space()='Sports Bras']")
    WebElement womenSportBras;
    @FindBy(xpath = "//span[@class='CellSkinny__TextWrapper-sc-117d15w-0 kuAfFc' and text()='Target Help']")
    WebElement targetHelp;
    @FindBy(xpath = "//a[@id='secondary']")
    WebElement deals;
    @FindBy(xpath = "//span[@class='sc-gsTCUz dZNyey']//div[@class='sc-hKgILt gTLZXx']//*[name()='svg']")
    WebElement signIn;
    @FindBy(xpath = "//div[normalize-space()='Sign in']")
    WebElement signInButton;
    @FindBy(xpath = "//span[normalize-space()='Target Circle']")
    WebElement targetCircle;
    @FindBy(xpath = "//span[@data-test='sort-bar-content']")
    WebElement totalOffers;
    @FindBy(xpath = "//span[normalize-space()='Careers']")
    WebElement careers;
    @FindBy(xpath = "//span[normalize-space()='Feedback']")
    WebElement feedBack;
    @FindBy(xpath = "//span[normalize-space()='RedCard']")
    WebElement redCard;
    @FindBy (xpath = "//a[@class='Link-sc-1khjl8b-0 iwassO'][normalize-space()='Registry']")
    WebElement registry;
    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 iwassO' and text()='Weekly Ad']")
    WebElement weeklyAdButton;
    @FindBy(xpath = "//a[@id='secondary']")
    WebElement dealsButton;
    @FindBy(xpath = "//span[normalize-space()='Team Member Services']")
    WebElement TeamMemberServices;
    @FindBy(xpath = "//span[normalize-space()='Optical']")
    WebElement optical;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Womens-210913-1631564031377?wid=315&hei=315&qlt=60&fmt=webp']")//body/div[@id='__next']/div/div[@id='pageBodyContainer']/div[1]
    WebElement setWomenCategory;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Mens-210913-1631564040323?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement setMenCategory;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/Kids-210913-1631564048734?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement setKidsCategory;
    @FindBy(xpath = "//img [@src='https://target.scene7.com/is/image/Target/Baby-210913-1631564062108?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement setBabyCategory;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Furniture-210913-1631566212856?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement setHomeCategory;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/PatioGarden-210913-1631564082284?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement patioAndGarden;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/KitchenDining-210913-1631564122569?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement kitchenAndDining;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Beauty181103-190722_1563828945271?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement beauty;
    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/Electronics219475-200305_1583423525490?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement electronic;
    @FindBy(xpath = "//img [@src='//target.scene7.com/is/image/Target/Sept_Wk5-0930-Video_Games-Nintendo-CB-Consoles143381-180910_1536591280324?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement videoGames;
    @FindBy(xpath = "//img [@src='//target.scene7.com/is/image/Target/Toys219475-200305_1583423532760?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement toys;
    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/Sports_Outdoors219475-200305_1583425943604?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement sportAndOutdoors;
    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/Grocery219475-200305_1583423555572?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement grocery;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/HouseholdEssentials_Tide-200519-1589915606672?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement householdEssentials;
    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/Pets219475-200305_1583423545822?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement pets;
    @FindBy(xpath = "//span[normalize-space()='Optical']//img[@src='https://target.scene7.com/is/image/Target/CatNav_EvergreenGifting-200831-1598899914929?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement giftIdeas;
    @FindBy(xpath = "//img[@src='//target.scene7.com/is/image/Target/clearance97188-171020_1508525411214?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement clearance;
    @FindBy(xpath = "//img[@src='https://target.scene7.com/is/image/Target/Easter_CB-220114-1642199640630?wid=315&hei=315&qlt=60&fmt=webp']")
    WebElement easter;
//    @FindBy(xpath = "//span[normalize-space()='Optical']")
//    WebElement optical;












    public void itemToCard (){click(firstItem);}

    public void searchButton (){click(mainSearchButton);}

    public void searchBar(String itemToSearch){ feedDataWithNoClick(searchBar, itemToSearch); }

    public String resultHeading() {
        return resultsHeading.getText();
    }

    public void addToCard (){click(addCard);}

    public void giftCard (){click (giftCardsButton);}

    public void searchingCategories (){click(categories);}

    public void womenCategories (){click(womenCategory);}

    public void womenCategoryForClothing (){click(womenCategoryClothing);}

    public void womenActivewear (){click(womenCategoryActive);}

    public String completeResults() {
        return totalResults.getText();
    }

    public void sportBras (){click(womenSportBras);}

    public void help (){click(targetHelp);}

    public void dealsButton (){click( deals);}

    public void signInButtonDropDownList (){click(signIn);}

    public void signInButton (){click(signInButton);}

    public void targetdeals (){click(targetCircle);}

    public String allResults() { return totalOffers.getText(); }

    public void career (){click(careers);}

    public void feeBackButton (){click(feedBack);}

    public void clickRedCard (){click(redCard);}

    public void clickRegistry (){click(registry);}

    public void selectWeeklyAd (){click(weeklyAdButton);}

    public void selectDeals (){click(dealsButton);}

    public void selectTeamMemberServices (){click(TeamMemberServices);}

    public void clickOnOptical (){click(optical);}


    public void clickOnWomenCategory (){click(setWomenCategory);}

    public void clickOnMenCategory (){click(setMenCategory);}

    public void clickOnKidsCategory (){click(setKidsCategory);}

    public void clickOnBabyCategory (){click(setBabyCategory);}

    public void clickOnHomeCategory (){click(setHomeCategory);}

    public void clickOnPatioAndGarden (){click(patioAndGarden);}

    public void clickOnKitchenAndDining (){click(kitchenAndDining);}

    public void clickOnBeauty (){click(beauty);}

    public void clickOnElectronic (){click(electronic);}

    public void clickOnVideoGames (){click(videoGames);}

    public void clickOnToys (){click(toys);}

    public void clickOnSportAndOutdoors (){click(sportAndOutdoors);}

    public void clickOnGrocery (){click(grocery);}

    public void clickOnHouseholdEssentials (){click(householdEssentials);}

        public void clickOnPets (){click(pets);}

        public void clickOnGiftIdeas (){click(giftIdeas);}

        public void clickOnClearance (){click(clearance);}

        public void clickOnEaster (){click(easter);}

    //    public void clickOnOptical (){click(optical);}

    //    public void clickOnOptical (){click(optical);}









}
