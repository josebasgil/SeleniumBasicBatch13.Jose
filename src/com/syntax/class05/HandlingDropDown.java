package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement daysDD=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
        select.selectByIndex(3);
        Thread.sleep(1000);
        select.selectByVisibleText("Thursday");
        Thread.sleep(1000);
        select.selectByValue("Friday");
        List<WebElement> allOptions=select.getOptions();
        int size=allOptions.size();
        System.out.println(size);
        // 0 is diasable in the order for dropdown and gonna get deselect
        for(int i=1;i<size;i++){
            String Option=allOptions.get(i).getText();
            System.out.println(Option);
            select.deselectByIndex(i);
            Thread.sleep(1000);
        }
    }
}
