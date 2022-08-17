package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW04 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement skipEset=driver.findElement(By.xpath("//button[@class='button_secondary_margin']"));
        skipEset.click();
        Thread.sleep(2000);
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement passWord=driver.findElement(By.xpath("//input[@id='txtPassword']"));

        Thread.sleep(2000);
        WebElement LogButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        LogButton.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
