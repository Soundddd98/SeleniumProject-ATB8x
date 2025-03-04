package com.testingacademy.ex01_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium04 {
    @Test
    public void testMethod01(){
         // Edge Options -> Various options available. Window Size, incognito mode, full UI Mode, extensions etc., can be set.
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com/");
        driver.quit();
    }
}
