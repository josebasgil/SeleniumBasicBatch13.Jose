package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandle {
    public static String url = "http://accounts.google.com/signup";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle(); // get the window handle for the main page
        System.out.println(mainPageHandle);

        WebElement helplink= driver.findElement(By.linkText("Ayuda"));
        helplink.click();

        Set<String> allWindowHandles= driver.getWindowHandles(); // Store all teh handles inside the set
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator(); // have an iterator in order to iterate throug the handles
        mainPageHandle=it.next(); // take first step and assign the main page handle
        String childHandle=it.next(); // Take a second step nad have a child handle

        driver.switchTo().window(mainPageHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);
        Thread.sleep(2000);
        driver.close(); // We have to switch to child tab to close child tab, same for other cases
        driver.switchTo().window(mainPageHandle);
        helplink.click();
        driver.quit();


    }
}
