package com.syntax.Tests;

import com.syntax.Pages.LoginPage;
import com.syntax.TestBase.BaseClass;

public class LoginPageTest {
    public static void main(String[] args) throws InterruptedException {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        LoginPage loginPage=new LoginPage();
        Thread.sleep(2000);
        loginPage.username.sendKeys("Admin");
        Thread.sleep(2000);
        loginPage.password.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        loginPage.loginButton.click();
        //Thread.sleep(2000);
        //loginPage.skipEset.click();
        BaseClass.tearDown();
    }
}
