package com.syntax.Pages;

import com.syntax.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    public WebElement username = driver.findElement(By.id("txtUsername"));
    public WebElement password = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton=driver.findElement(By.id("btnLogin"));
    //public WebElement skipEset=driver.findElement(By.xpath("//button[@class='button_secondary_margin']"));

}
