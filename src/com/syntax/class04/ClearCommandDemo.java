package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(2000);
        password.clear();
        //WebElement button=driver.findElement(By.xpath("//input[@value='Login']"));
        //button.click();
    }
}
