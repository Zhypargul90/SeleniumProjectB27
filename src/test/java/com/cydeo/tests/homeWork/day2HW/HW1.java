package com.cydeo.tests.homeWork.day2HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

        //Etsy Title Verification
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");


//3. Search for “wooden spoon”
        //WebElement searchBox = driver.findElement(By.name ("wooden spoon"));

        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("wooden spoon" + Keys.ENTER);

//4. Verify title:Expected: “Wooden spoon | Etsy”

        String expectedTitle = "wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title Etsy is passed");
        }else{
            System.out.println("Title Etsy is failed");
        }

    }

}
