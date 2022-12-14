package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); // setting the property to use chromedriver
        // for windows users add extension.exe
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
