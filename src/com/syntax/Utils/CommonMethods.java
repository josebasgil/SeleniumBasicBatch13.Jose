package com.syntax.Utils;

import com.syntax.TestBase.BaseClass;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {
/*
This method will send a text to a given element
@param element
@param text
 */
    public void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
    /*
    This method will switch to a frame by index
    @param index
     */
    public void switchToFrame(int index){
        try{
            driver.switchTo().frame(index);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }
}
