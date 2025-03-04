package com.testingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test
    public void testmethod02() throws Exception {
        //EdgeOptions edgeoptions = new EdgeOptions();
        //edgeoptions.addArguments("--start-mazimized");

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://docs.katalon.com/");
        driver.manage().window().maximize(); // Alternate way to maximize

        //testng assertion
        Assert.assertEquals(driver.getTitle(),"Katalon Docs");

        if(driver.getPageSource().contains("Katalon Docs1234")){
            Assert.assertTrue(true);
        } else {
            throw new Exception("Heading Not Found");
        }

    }
}
