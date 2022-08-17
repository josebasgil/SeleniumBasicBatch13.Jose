package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
    public static String url = "https://demo.guru99.com/test/radio.html";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement Option3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
        boolean state= Option3.isSelected();
        System.out.println("the state of radio button is: "+state);
        boolean displayed= Option3.isDisplayed();
        System.out.println("is de radio button displayed: "+displayed);

    }
}
