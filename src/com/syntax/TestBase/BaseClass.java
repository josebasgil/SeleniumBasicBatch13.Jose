package com.syntax.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    /*
    This method will navigate to a website by the given url ---> this annotation is called javadoc
    @param url
    the javadocs cannot be inside the method always outside
    We provide javadocs for each and every method by rule
     */
    public static void openWithSpecificUrl (String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    // this method will quit the open browser
    public static void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }

}
