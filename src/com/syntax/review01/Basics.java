package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.get("https://www.syntaxprojects.com/index.php");
        //WebElement button=driver.findElement(By.cssSelector("a#btn_basic_example"));
        //WebElement button=driver.findElement(By.linkText(" Start Practising "));
        WebElement button=driver.findElement(By.partialLinkText("Start Practising"));
        Thread.sleep(2000);
        button.click();
        Thread.sleep(2000);
        WebElement button1=driver.findElement(By.partialLinkText("Proceed Next"));
        Thread.sleep(2000);
        button1.click();
        //WebElement textBox = driver.findElement(By.id("user.message"));
        //textBox.sendKeys("Casa");
    }
}
