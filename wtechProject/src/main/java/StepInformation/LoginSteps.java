package StepInformation;

import ObjectModel.loginPage;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.Driver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    ObjectModel.loginPage loginPage = new loginPage();

    @Given("^Go to Hepsiburada website$")
    public void go_to_hepsiburada_website() {

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


    }

    @Given("Click login menu")
    public void click_login_menu() {

        loginPage.clickGirisYapButton();

        System.out.println("Button clicked");

        loginPage.clickGirisYapButton1();

        System.out.println("Giris Yap button clicked");

    }

    @Given("^Type email$")
    public void type_email() {

        loginPage.typeEmail();

    }

    @Given("^Type password$")
    public void type_password() {

        loginPage.typePassword();

    }

    @When("^Click login button$")
    public void click_login_button() {

        loginPage.clickOnGirisYapButonu();

    }

    @Then("Check the cart")
    public void check_the_cart() {

        loginPage.clickCartButton();

        System.out.println("Login is successful");

        loginPage.assertTheMassage();
    }

    @Given("Go to the Mainpage")

    public void go_to_the_mainpage() {
        loginPage.clickMainPageButton();
        System.out.println("Anasayfaya dönüldü");

    }

    @And("Select random menu")
    public void select_random_menu() {

        loginPage.selectrandomMenu();

    }

    @And("Select random category")
    public void click_random_category() {

        loginPage.selectRandomCategory();
    }

    @And("Select random brand")
    public void click_random_brand() {

        loginPage.selectRandomBrand();
    }

    @And("Type Value Between 10 and 4000")
    public void type_value_between_10_and_4000() {
        loginPage.selectTypePrice();
        loginPage.selectTypePrice1();
        loginPage.clickSearch();
    }

    @And("Select Product")
    public void select_product () {

        loginPage.selectProduct();
    }
    @And("Add product and Go to Basket")
    public void add_and_go_to_basket () {

        loginPage.addToBasket();
        loginPage.goToBasket();
    }
    @And("Increase Product")
    public void increase_product () {
        loginPage.increaseProduct();
    }

    @And("Complete the Shopping")
    public void complete_the_shopping () {

        loginPage.completeTheShopping();
    }

    @And("Add New Address")
    public void add_new_address () {

            loginPage.addNewAddress();
            loginPage.typeName();
            loginPage.typeSurname();
            loginPage.typePhoneNumber();
    }

    @After
    public void quitDriver () throws InterruptedException {
        Thread.sleep(4000);
        Driver.closeDriver();
        }


    }

