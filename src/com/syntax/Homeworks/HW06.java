package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW06 {
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement fillUser=driver.findElement(By.xpath("//input[@id='email']"));
        fillUser.sendKeys("abc@gmail.com");

        WebElement fillpass=driver.findElement(By.xpath("//input[@id='pass']"));
        fillpass.sendKeys("123456");

        WebElement logButton=driver.findElement(By.xpath("//button[@name='login']"));
        logButton.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
