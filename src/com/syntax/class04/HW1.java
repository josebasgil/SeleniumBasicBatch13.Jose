package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Navigate to http://syntaxprojects.com
    Click on start practicing
    Click on simple form demo
    Enter any text on first text box
    Click on show message
    Quite the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement button=driver.findElement(By.cssSelector("a#btn_basic_example"));
        Thread.sleep(2000);
        button.click();
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        Thread.sleep(2000);
        simpleFormDemo.click();
        WebElement texbox=driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        Thread.sleep(2000);
        texbox.sendKeys("Sameer");
        WebElement clickSend=driver.findElement(By.cssSelector("button[onclick *='show']"));
        clickSend.click();
        driver.quit();
    }
}
