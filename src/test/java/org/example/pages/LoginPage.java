package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    /***************** Class Constructor **************************/
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    /*****************Locators**************************/
    private By userName=By.id("user-name");
    private By password=By.id("password");
    private By loginBtn=By.id("login-button");
    private By confirmLogin=By.xpath("//span[text()='Products']");

    /***************** Methods **************************/
    //Write userName
    public void clickOnUserName(String userNameChar)
    {
        driver.findElement(userName).sendKeys(userNameChar);
    }
    //Write password
    public void clickOnPassword(String userPassword)
    {
        driver.findElement(password).sendKeys(userPassword);
    }
    //click on login button
    public void clickOnLogin()
    {
        driver.findElement(loginBtn).click();
    }
    // check that product word is visible when login successfully
    public boolean loginSuccess()
    {
        return driver.findElement(confirmLogin).isDisplayed();
    }
}
