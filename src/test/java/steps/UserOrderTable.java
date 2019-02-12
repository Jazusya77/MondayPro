package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import utilities.Config;
import utilities.Driver;

public class UserOrderTable {
WebDriver driver;
    HomePage mn=new HomePage();
    @Given("user goes to url")
    public void user_goes_to_url() {

       driver=Driver.getDriver();
       driver.get(Config.getValue("url"));
       driver.manage().window().maximize();

      mn.login.click();

    }

    @When("user should be loggin")
    public void user_should_be_loggin() throws InterruptedException {
        WebDriverWait wt=new WebDriverWait(driver,7);
       mn.email.sendKeys(Config.getValue("username"));
Thread.sleep(5000);

       mn.password.sendKeys(Config.getValue("password"));
       mn.submit.click();

    }

    @Then("user should be check orders")
    public void user_should_be_check_orders() {
        mn.manu.click();

    }

    @Given("user should see order tables")
    public void user_should_see_order_tables() {
boolean check=mn.table.isDisplayed();
        Assert.assertEquals(true,check);
    }
}
