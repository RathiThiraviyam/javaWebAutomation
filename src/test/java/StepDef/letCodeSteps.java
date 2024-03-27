package StepDef;

import BasePage.StartDriver;
import Pages.letCodePages;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class letCodeSteps {

    private WebDriver driver;
    private letCodePages letCodePages;


    @Given("As a User I Launch URL")
    public void asAUserILaunchURL() {
        driver = StartDriver.getDriver();
        letCodePages = new letCodePages(driver);
        letCodePages.visit();
    }

    @When("I click on Log in button")
    public void iClickOnAboutUs() {
        letCodePages.clickLoginBtn();
    }

    @When("I Enter {string} and passwords:")
    public void iEnterUsernameAndPassword(String email, DataTable passwordsTable) {
        List<String> passwords = passwordsTable.asList(String.class);
        letCodePages.enterUsername(email);
        System.out.println("Enter Username" + email);
        for (String password : passwords) {
            System.out.println("Enter Password" + password);
            letCodePages.clearPasswordField();
            letCodePages.enterPassword(password);
        }
    }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
        letCodePages.clickLoginButton();
    }

}
