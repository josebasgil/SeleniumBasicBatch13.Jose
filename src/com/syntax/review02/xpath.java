package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static String url = "https://demo.guru99.com/insurance/v1/register.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement Surname = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        Surname.sendKeys("Bas");
        Thread.sleep(1000);
        WebElement Firstname = driver.findElement(By.xpath("//input[@id='user_firstname']"));
        Firstname.sendKeys("Jose");
        Thread.sleep(1000);
        WebElement DateBirth = driver.findElement(By.xpath("//label[text() = 'Date of Birth']"));
        WebElement Licence=driver.findElement(By.xpath("//label[contains (text(),'Licence Period')]"));
        System.out.println(Licence.getText());
        WebElement radioBtn=driver.findElement(By.xpath("//label[text()=’Full’]/following-sibling::input"));
        radioBtn.click();
        WebElement phoneNumb= driver.findElement(By.cssSelector("input#user_phone"));
        phoneNumb.sendKeys("89783279834792379");
        WebElement adress= driver.findElement(By.cssSelector("input[]"));
        phoneNumb.sendKeys("89783279834792379");

    }
}
