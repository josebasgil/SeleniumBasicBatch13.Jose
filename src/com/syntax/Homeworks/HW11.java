package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW11 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement getLink= driver.findElement(By.linkText("This is a Ajax link"));
        getLink.click();
        Thread.sleep(20000);
        WebElement textGet= driver.findElement(By.xpath("//div[@class='ContactUs']/p"));
        System.out.println(textGet.getText());
    }
}
