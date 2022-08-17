package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static String url = "https://chercher.tech/practice/frames";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        // print the topic
        driver.switchTo().frame(0);
        // find the desire element topic
        WebElement topic= driver.findElement(By.xpath("//b[@id='topic']"));
        // get the text
        System.out.println(topic.getText());

        // go to dropdown animals and select big baby cat

        // change focus to default
        driver.switchTo().defaultContent();
        // switch
        driver.switchTo().frame(1);

        // select dropdown

        WebElement dropDown =driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropDown);
        select.selectByIndex(2);

        // Click the checkbox
        // Switch to default
        driver.switchTo().defaultContent();
        // switch to iframe 1 using webelement method
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        // switch to frame 3 by name or id
        driver.switchTo().frame("frame3");

        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();



    }
}
