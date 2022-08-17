package com.syntax.review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTaskTara {
    public static String url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,20);

        WebElement button = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Enabled']"));
        button2.click();
    }
}
