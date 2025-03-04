package com.testingacademy.task23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {
    @Test
    public void testMethod03() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        eo.addArguments("--incognito");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //<a id="btn-make-appointment" href="./profile.php#login"
        // class="btn btn-dark btn-lg">
        // Make Appointment
        // </a>

        WebElement makeAppointment = driver.findElement(By.linkText("Make Appointment"));
        makeAppointment.click();

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("Soundar");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("sdfnoisf");

        List<WebElement> loginButton = driver.findElements(By.tagName("button"));
        loginButton.get(0).click();

        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
