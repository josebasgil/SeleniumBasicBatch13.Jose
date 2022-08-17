package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);


        WebElement InstagramButton= driver.findElement(By.linkText("Follow On Instagram")); // eliminate emptyspaces in front and back the linktext
        WebElement FacebookButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement InstaFaceButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));
        Thread.sleep(1000);
        InstagramButton.click();
        FacebookButton.click();
        InstaFaceButton.click();

        Set<String> allWindowsHandles=driver.getWindowHandles();
        System.out.println(allWindowsHandles.size());

        Iterator<String> it=allWindowsHandles.iterator();
        while (it.hasNext()){ // start iterating through the handles (tabs)
            String handle=it.next(); // get one handle from allWindowHandles
            if (!mainPageHandle.equals(handle)){// set a condition main page cannot be equal to handle
                driver.switchTo().window(handle); // Switch to an specific handle
                driver.manage().window().maximize();
                String title=driver.getTitle(); // get the title
                System.out.println(title);
                Thread.sleep(2000);
                driver.close(); // Close the tab
            }
        }
        driver.switchTo().window(mainPageHandle);
        InstagramButton.click();

    }
}
