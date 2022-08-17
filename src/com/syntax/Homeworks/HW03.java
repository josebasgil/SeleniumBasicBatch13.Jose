package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW03 {
    public static String url = "https://www.amazon.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: "+allLinks.size());
        for(WebElement link: allLinks) {
            String LinkText = link.getText(); // to print the elements that has link
            String fullLink = link.getAttribute("href"); // To print the links to
            if (!LinkText.isEmpty()) { // to null the empty spaces to have a result more clean
                System.out.println(LinkText + "      " + fullLink);
            }
        }

        driver.quit();
    }
}
