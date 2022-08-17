package com.syntax.Pages;

import com.syntax.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Identify elements by using FindBy annotations
public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@name='txtPassword']")
    public WebElement password;

    @FindBy(css="input#btnLogin")
    public WebElement loginButton;

    public void loginActions(){
        sendText(username,"Admin");
        sendText(password,"Hum@nhrm123");
    }
    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver, this);
    }

}
