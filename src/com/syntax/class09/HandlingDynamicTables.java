package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTables {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton= driver.findElement(By.className("button"));
        loginButton.click();

        List<WebElement> rows=driver.findElements((By.xpath("//table[@class='SampleTable']/tbody/tr")));
        for (int i=1;i< rows.size();i++){
            String rowText=rows.get(i).getText();
            System.out.println(rowText);
            if (rowText.contains("FamilyAlbum")){
                List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                // to locate the check box column
                checkboxes.get(i-1).click(); // to compensate start in 1 in order to avoid heather data
            }
        }


    }
}
