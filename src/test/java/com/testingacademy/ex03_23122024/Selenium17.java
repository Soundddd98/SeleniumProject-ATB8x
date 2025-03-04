package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium17 {
    @Test
    public void testMethod03() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        eo.addArguments("--incognito");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://app.vwo.com");

        //patiral Link - Partial match - partialLinkText
        // Full match - linktext

        //WebElement linkFreeTrial = driver.findElement(By.linkText("Start a free trial"));
        //linkFreeTrial.click();
        WebElement linkFreeTrial = driver.findElement(By.partialLinkText("free trial"));
        linkFreeTrial.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
