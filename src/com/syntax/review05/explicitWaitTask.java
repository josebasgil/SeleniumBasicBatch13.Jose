package com.syntax.review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitTask {
    public static String url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement alert = driver.findElement(By.id("//button[@id='alert']"));
        alert.click();
    }
}
