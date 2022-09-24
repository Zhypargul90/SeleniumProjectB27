package com.cydeo.tests.homeWork.day4HW;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class XpathLOCATORpractice {
    public static void main(String[] args) {
        //XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to http://practice.cydeo.com/multiple_buttons
         driver.get("http://practice.cydeo.com/multiple_buttons");


        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();


        //4. Verify text displayed is as expected: Expected: “Clicked on button one!”
        WebElement buttonText = driver.findElement(By.id("Result"));
        String expectedText = "Clocked on button one!";
        String actualText = buttonText.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Clicked button text verification passed");
        }else{
            System.out.println("Clicked button text verification failed");
        }

        driver.quit();



    }
}
