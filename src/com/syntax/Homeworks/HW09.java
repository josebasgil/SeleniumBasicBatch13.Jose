package com.syntax.Homeworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW09 {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement simpleAlertButton= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(2000);

        WebElement confirmAlertButton= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.accept();
        Thread.sleep(2000);

        WebElement promptButton= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        promptButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.accept();
        Thread.sleep(2000);
    }
}
