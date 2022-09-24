package com.cydeo.tests.homeWork.day2HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        //Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("https://zero.webappsecurity.com/login.html");


        //3. Verify header text Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";

    }
}
