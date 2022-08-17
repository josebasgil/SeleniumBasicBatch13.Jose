package com.syntax.Tests;

import com.syntax.Pages.DashBoardPage;
import com.syntax.Pages.LoginPageWithPageFactory;
import com.syntax.TestBase.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class LoginPageTest01 {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //Create objects for each corresponding page first:
        LoginPageWithPageFactory loginPageWithPageFactory = new LoginPageWithPageFactory();
        DashBoardPage dashboardPage = new DashBoardPage();

        /*
        loginPageWithPageFactory.username.sendKeys("Admin");
        loginPageWithPageFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginButton.click();
        */
        loginPageWithPageFactory.loginActions();

        TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);



        dashboardPage.welcomeAdmin.click();
        dashboardPage.logOut.click();
    }
}
