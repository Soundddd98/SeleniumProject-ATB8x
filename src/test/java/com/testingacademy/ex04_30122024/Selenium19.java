package com.testingacademy.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium19 {
    @Test
    public void testMethod01() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://www.idrive360.com/enterprise/login");

        //<input _ngcontent-fgr-c4=""
        // autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

        // WebElement username = driver.findElement(By.id("username")); - 1 possible method -> Using HTML

        //Using Xpath

        Thread.sleep(2000);
        WebElement username_xpath;
        username_xpath = driver.findElement(By.xpath("//input[@id='username']"));
        username_xpath.sendKeys("augtest_040823@idrive.com");

        WebElement password_xpath = driver.findElement(By.xpath("//input[@id='password']"));
        password_xpath.sendKeys("123456");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        submitButton.click();

        Thread.sleep(15000);

        WebElement freeTrialEnded = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        //Assert.assertEquals(freeTrialEnded.(),"Your free trial has expired");

        driver.quit();


    }
}
