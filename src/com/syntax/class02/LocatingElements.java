package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.fb.com/");
        driver.findElement(By.id("email")).sendKeys("syntax@fas.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        // if the value of id contain numerical characters means is temporary and gonna change in next refresh: dynamic id
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();
        driver.findElement(By.partialLinkText("¿Olvidaste")).click();
        driver.quit();
    }
}
