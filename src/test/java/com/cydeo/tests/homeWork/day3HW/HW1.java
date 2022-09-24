package com.cydeo.tests.homeWork.day3HW;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW1 {
    public static void main(String[] args) {

        //NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Enter incorrect username into login box:

        WebElement inputUserName = driver.findElement(By.cssSelector("input[name ='USER_LOGIN']"));
        inputUserName.sendKeys("kdjfk;jsg;skJ");

        //4- Click to `Reset password` button

        WebElement clickResetPassword = driver.findElement(By.cssSelector("button[value = 'Reset password']"));
        clickResetPassword.click();

        String expectedLabel = "Login or E-mail not found";
        String actualLabel =driver.findElement(By.cssSelector("div errorText")).getText();

        if(expectedLabel.equals(actualLabel)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }



        //5- Verify “error” label is as expected Expected: Login or E-mail not found






    }
}
