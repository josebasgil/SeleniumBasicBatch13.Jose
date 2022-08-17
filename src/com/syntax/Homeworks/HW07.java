package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW07 {
    public static String url = "https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        List<WebElement> allCats=driver.findElements(By.xpath("//select[@id='gh-cat']/option"));

        for (WebElement cats:allCats){
            String catsText=cats.getText();
            if(!catsText.isEmpty()){
                System.out.println(catsText);
            }
            if (catsText.equals("Computadoras, tablets y redes")){
                cats.click();
            }
        }
        Thread.sleep(1000);
        WebElement searchButton=driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        String header=driver.getTitle();
        System.out.println(header);
    }
}
