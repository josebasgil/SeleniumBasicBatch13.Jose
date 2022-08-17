package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static String url = "http://syntaxprojects.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement StartPractic=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        StartPractic.click();
        Thread.sleep(2000);
        WebElement SimpleFormDemo=driver.findElement(By.xpath("//a[@class='list-group-item'][1]"));
        SimpleFormDemo.click();
        Thread.sleep(2000);
        WebElement EnterText=driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        EnterText.sendKeys("Hello There");
        Thread.sleep(2000);
        WebElement clickSend=driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        clickSend.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
