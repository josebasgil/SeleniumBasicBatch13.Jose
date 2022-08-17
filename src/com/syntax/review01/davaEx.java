package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class davaEx {
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createAcc = driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createAcc.click();
        Thread.sleep(1000);



        WebElement daysDD = driver.findElement(By.xpath("//*[@id='month']"));
        // Thread.sleep(1000);
        Select select = new Select(daysDD);

        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);

        for (int i = 1; i < size; i++) {
            String option = allOptions.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }
    }
}
