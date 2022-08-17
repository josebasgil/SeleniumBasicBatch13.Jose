package com.syntax.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW05 {
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement newAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        newAccount.click();
        Thread.sleep(2000);
        WebElement dayOption=driver.findElement(By.id("day"));
        Select selectDay= new Select(dayOption);
        List<WebElement> optionsDay=selectDay.getOptions();
        int sizeDay=optionsDay.size();
        System.out.println(sizeDay);

        Thread.sleep(2000);
        WebElement monthOption=driver.findElement(By.id("month"));
        Select selectMonth= new Select(monthOption);
        List<WebElement> optionsMonth=selectMonth.getOptions();
        int sizeMonth=optionsMonth.size();
        System.out.println(sizeMonth);

        Thread.sleep(2000);
        WebElement yearOption=driver.findElement(By.id("year"));
        Select selectYear= new Select(yearOption);
        List<WebElement> optionsYear=selectYear.getOptions();
        int sizeYear=optionsYear.size();
        System.out.println(sizeYear);
        Thread.sleep(2000);
        selectDay.selectByVisibleText("29");
        Thread.sleep(2000);
        selectMonth.selectByVisibleText("sep");
        Thread.sleep(2000);
        selectYear.selectByVisibleText("1982");
        Thread.sleep(2000);
        driver.quit();

    }
}
