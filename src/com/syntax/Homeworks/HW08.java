package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW08 {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //My classmate ignores the pops up and adds and looks directly what the ex ask to solve

        /*driver.switchTo().frame("FrameOne");

        WebElement closeChat= driver.findElement(By.id("//div[@id='tawk-mpreview-close']"));
        closeChat.click();

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        */
        driver.switchTo().frame("FrameOne");
        WebElement header=driver.findElement(By.xpath("//h1[@class='heading-13']"));
        System.out.println("Header is displayed "+header.isDisplayed());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        driver.switchTo().frame("FrameTwo");
        WebElement enrollButton=driver.findElement(By.xpath("//p[@class='paragraph']/following-sibling::a"));
        System.out.println("Enroll button is "+enrollButton.isEnabled());
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
