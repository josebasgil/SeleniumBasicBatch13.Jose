package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement ageRadioButton= driver.findElement(By.cssSelector("input[value='5 - 15']"));
        boolean isAgeRadioButtonEnabled = ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled); // means you can perform actions in the element

        boolean isAgeRadioButtonDisplayed= ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed); // sometimes an element has code but is not displayed on page

        boolean isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println(isAgeRadioButtonSelected);
        Thread.sleep(2000);
        ageRadioButton.click();
        isAgeRadioButtonSelected=ageRadioButton.isSelected(); // After Click we need to ask again
        System.out.println(isAgeRadioButtonSelected);
    }
}
