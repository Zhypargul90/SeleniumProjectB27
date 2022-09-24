package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork1 {
    /*

    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to
https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice

     */


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://practice.cydeo.com");


        String url = driver.getCurrentUrl();
        if(url.contains("cydeo")){
            System.out.println("It contains \" cydeo\"");
        }else{
            System.out.println("failed");
        }

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();




    }
}
