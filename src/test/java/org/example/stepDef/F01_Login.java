package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F01_Login
{
    WebDriver driver;
    LoginPage loginPage;
   @Given("Navigate to login page")
   public void navigateToLoginPage()
{
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.saucedemo.com/");
   loginPage=new LoginPage(driver);
}
  @When("The User Enter Username {string}")
   public void userEnterUsername(String username)
{
    loginPage.clickOnUserName(username);
}

    @And("The user Enter password {string}")
    public void theUserEnterPassword(String password)
    {
        loginPage.clickOnPassword(password);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton()
    {
        loginPage.clickOnLogin();
    }

    @Then("The user is Logged in Successfully")
    public void theUserIsLoggedInSuccessfully()
    {
        loginPage.loginSuccess();
    }

}
