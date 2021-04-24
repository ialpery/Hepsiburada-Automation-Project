package ObjectModel;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends abstractClass {

    WebDriver driver;

    public loginPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "myAccount")
    private WebElement girisYapButton;

    public void clickGirisYapButton() {

        clickFunction(girisYapButton);
    }

    @FindBy(id = "login")
    private WebElement girisYapButton1;

    public void clickGirisYapButton1() {

        clickFunction(girisYapButton1);
    }

    @FindBy(id = "txtUserName")

    private WebElement emailBox;
    public void typeEmail(){
        sendKeysFunction(emailBox,"test_automation@gmail.com");

    }

    @FindBy(id = "txtPassword")

    private WebElement passwordBox;
    public void typePassword(){
        sendKeysFunction(passwordBox,"123456Test");
    }

    @FindBy(id = "btnLogin")

    private WebElement girisYapButonu;
    public void clickOnGirisYapButonu(){
        clickFunction(girisYapButonu);

    }

    @FindBy(id = "shoppingCart")

    private WebElement cartButton;
    public void clickCartButton() {
        clickFunction(cartButton);
    }

    @FindBy(css = "div.content_Z9h8v>h1")

    private WebElement cartMessage;
    public void assertTheMassage() {
        Assertion(cartMessage, "Sepetin şu an boş");
    }

    @FindBy( className = "sf-header-kbFsTm")

    private WebElement mainPage;
    public void clickMainPageButton() {
        clickFunction(mainPage);

    }

    @FindBy(className = "sf-MenuItems-2xUK7")

    private WebElement randomMenu;
    public void selectrandomMenu() {
        clickFunction(randomMenu);

    }

    @FindBy(className = "sf-ChildMenuItems-3R6bj")

    private WebElement selectRandomCategory;
    public void selectRandomCategory() {
        clickFunction(selectRandomCategory);

    }

    @FindBy(xpath = "/html/body/div[3]/main/div[4]/div/div/div/div[1]/section/div[1]/div[3]/div/div/ol/li[5]/ol/li[2]/label")

        private  WebElement selectRandomBrand;
        public void selectRandomBrand() {
            clickFunction(selectRandomBrand);
        }

    @FindBy(xpath = "/html/body/div[2]/main/div[4]/div/div/div/div[1]/section/div[1]/div[3]/div/div/ol/li[2]/div/div/div[1]/input")

        private WebElement typePrice;
        public void selectTypePrice() {
            sendKeysFunction(typePrice,"10");
        }

    @FindBy(xpath = "/html/body/div[2]/main/div[4]/div/div/div/div[1]/section/div[1]/div[3]/div/div/ol/li[2]/div/div/div[3]/input")

        private WebElement typePrice1;
        public void selectTypePrice1() {
            sendKeysFunction(typePrice1,"4000");
        }

    @FindBy(xpath = "/html/body/div[2]/main/div[4]/div/div/div/div[1]/section/div[1]/div[3]/div/div/ol/li[2]/div/div/div[4]/button")

        private WebElement search;
        public void clickSearch () {
            clickFunction(search);
        }

        @FindBy(xpath = "/html/body/div[2]/main/div[4]/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]/div/a/div[2]/h3")

        private WebElement selectProduct;
        public void selectProduct() {
            clickFunction(selectProduct);
        }

        @FindBy(id = "addToCart")

        private WebElement addToBasket;
        public void addToBasket() {
            clickFunction(addToBasket);
        }
        @FindBy(xpath = "/html/body/div[6]/div/div/div/div/div/div/div/div/div[1]/div[2]/button[1]")

        private WebElement goToBasket;
        public void goToBasket() {
            clickFunction(goToBasket);
        }

        @FindBy(className = "product_increase_3SpEx")

        private WebElement increaseProduct;
        public void increaseProduct() {
            clickFunction(increaseProduct);
        }

        @FindBy(className = "sc-AxjAm cxvjoB button_next_step_Dj-RE")

        private  WebElement completeTheShopping;
        public void completeTheShopping() {
            clickFunction(completeTheShopping);
        }

        @FindBy(className = "new_address_link_1fEiD has_no_address_1uAWQ")

        private WebElement addNewAddress;
        public void addNewAddress () {
            clickFunction(addNewAddress);
        }

        @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[1]/div/div[1]/div/div[1]/div/input")

        private WebElement typeName;
        public void typeName () {
            sendKeysFunction(typeName, "Test");
        }

        @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[1]/div/div[1]/div/div[2]/div/input")

        private WebElement typeSurname;
        public void typeSurname () {
            sendKeysFunction(typeSurname,"Otomasyon");
        }

        @FindBy(className = "form-control")

        private WebElement typePhoneNumber;
        public void typePhoneNumber () {
            sendKeysFunction(typePhoneNumber,"5556664433");
        }

    }