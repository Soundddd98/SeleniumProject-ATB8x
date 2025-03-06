package com.testingacademy.task_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumProjectCRM {
    @Test
    public void testMethod01() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");

        Thread.sleep(4000);
        //button[@id="btn-login"]
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();

        Thread.sleep(4000);

        WebElement createAccountButton = driver.findElement(By.xpath("//span[text()='Create Account']"));
        createAccountButton.click();

        WebElement nameField = driver.findElement(By.xpath("//*[@id='account-edit-1000']/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input"));
        nameField.sendKeys("Soundar");

        driver.quit();
    }
}
