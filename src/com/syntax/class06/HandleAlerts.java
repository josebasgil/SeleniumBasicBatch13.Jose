package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    // http://www.uitestpractice.com/Students/Switchto
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(1000);
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.dismiss();
        Thread.sleep(1000);
        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Dont replace my chromedriver");
        promptAlert.accept();
    }
}
