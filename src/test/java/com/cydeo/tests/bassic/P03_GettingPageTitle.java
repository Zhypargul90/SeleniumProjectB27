package com.cydeo.tests.bassic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);


        if(title.equals("Cydeo")){
            System.out.println("test passed");
        }else{
            System.out.println("test faild");
        }
        driver.quit();

    }
}
