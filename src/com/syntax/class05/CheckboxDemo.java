package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
    public static String url = "http://syntaxprojects.com/basic-checkbox-demo.php";
    // because the method is in a public static field
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> optionCheckboxes=driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
        int size=optionCheckboxes.size();
        System.out.println(size);
        for(WebElement option: optionCheckboxes){ // to check all boxes
            option.click();
        }
        //for(WebElement option: optionCheckboxes){ // just for check 2
        //    String checkBoxValue=option.getAttribute("value");
        //    if(checkBoxValue.equals("Option-2")){
        //        option.click();
        //        break;
        //    }
        //}
    }
}
