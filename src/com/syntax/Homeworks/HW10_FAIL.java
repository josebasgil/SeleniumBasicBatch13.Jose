package com.syntax.Homeworks;
// This exercise has something wrong the website doesn't work

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW10_FAIL {
    public static String url = "https://demoqa.com/browser-windows";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);

        WebElement tabButton= driver.findElement(By.id("tabButton"));
        WebElement windowButton= driver.findElement(By.id("windowButton"));
        WebElement messageWindowButton= driver.findElement(By.id("messageWindowButton"));
        Thread.sleep(2000);

        tabButton.click();
        windowButton.click();
        messageWindowButton.click();

        Set<String> allWindowsHandles=driver.getWindowHandles();

        Iterator<String> it=allWindowsHandles.iterator();
        while (it.hasNext()){
            String handle=it.next();
            if (!mainPageHandle.equals(handle)){
                driver.switchTo().window(mainPageHandle);
                driver.switchTo().window(handle);
                String title= driver.getTitle(); // his part is failing, is not getting the title or text
                System.out.println(title);
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle);
/*
        for(String handle :allWindowsHandles){
            driver.switchTo().window(handle);
            if(driver.getCurrentUrl().equals("https://demoqa.com/sample")){
                driver.switchTo().window(mainPageHandle);
                driver.switchTo().window(handle);
                String title= driver.getTitle(); // his part is failing, is not getting the title
                System.out.println(title);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(mainPageHandle);
 */
    }
}
