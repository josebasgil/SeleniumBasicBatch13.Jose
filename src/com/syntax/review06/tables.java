package com.syntax.review06;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tables {
    //HW    //Go to aa.com/homePage.d   //select depart date  //select return date
    //select destination   //click on search   //quit the browser
    public static String url = "http://www.aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement skip=driver.findElement(By.xpath("//button[@class='optoutmulti_button']"));
        skip.click();

        WebElement calendar = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
        calendar.click();

        WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));

        WebElement dMonth = driver.findElement(By.className("ui-datepicker-month"));
        System.out.println(dMonth.getText());
        String dMonthText = dMonth.getText();
        while (!dMonthText.equals("October")) {
            try {
                nextButton.click();
            } catch (StaleElementReferenceException e) {
                nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
                nextButton.click();
            }
            try {
                dMonthText = dMonth.getText();
            } catch (StaleElementReferenceException r) {
                dMonth = driver.findElement(By.className("ui-datepicker-month"));
                dMonthText = dMonth.getText();
            }

        }

        List<WebElement> departDates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
        for (WebElement departDate : departDates) {
            if (departDate.getText().equals("17")) {
                departDate.click();
                break;
            }

        }

        WebElement Rcalendar = driver.findElement(By.xpath("//label[@for='aa-returningFrom']/following-sibling::button"));
        Rcalendar.click();
        WebElement RMonth = driver.findElement(By.className("ui-datepicker-month"));
        String RMonthText = RMonth.getText();
        while (!RMonthText.equals("December")){
            try {
                nextButton.click();

            } catch (StaleElementReferenceException d) {
                nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
                nextButton.click();
            }

            try {
                RMonthText = RMonth.getText();
            } catch (StaleElementReferenceException t) {
                RMonth = driver.findElement(By.className("ui-datepicker-month"));
                RMonthText = RMonth.getText();
            }

        }

        List<WebElement> returnDates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
        for (WebElement returnDate : returnDates) {
            if (returnDate.getText().equals("23")) {
                returnDate.click();
                break;
            }

        }

        WebElement Destination = driver.findElement(By.xpath("//input[@name='destinationAirport']"));
        Destination.sendKeys("JFK");
        WebElement Submit = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
        Submit.click();

        driver.quit();
    }

}

