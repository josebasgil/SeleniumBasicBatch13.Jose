package com.syntax.Pages;

import com.syntax.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends CommonMethods {
    @FindBy(id="welcome")
    public WebElement welcomeAdmin;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOut;

    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }
}
