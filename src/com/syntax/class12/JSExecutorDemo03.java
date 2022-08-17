package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo03 {
    public static String url = "https://www.google.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        // open a tab in an specific url
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.amazon.com')");
        // window.open() opens a blank tab

        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("Halo Spaceships");
    }
}
