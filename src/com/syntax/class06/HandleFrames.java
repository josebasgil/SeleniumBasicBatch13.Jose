package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        driver.manage().window().maximize();
        WebElement textbox=driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 13 forever");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to the frame");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        WebElement frameElement=driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("hkjjhk");
    }
}