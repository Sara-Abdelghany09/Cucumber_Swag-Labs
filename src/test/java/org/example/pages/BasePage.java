package org.example.pages;

import org.openqa.selenium.WebDriver;

public class BasePage
{
    WebDriver driver;
    /***************** Class Constructor **************************/
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
}
