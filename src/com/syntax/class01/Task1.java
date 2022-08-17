package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    print out the title and the url in the console
    close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); // setting the property to use chromedriver
        // for windows users add extension.exe
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String title= driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title+""+url);
        driver.quit();
    }
}
