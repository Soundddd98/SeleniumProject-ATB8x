package com.testingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium30 {
    @Test
    public void testmethod01(){
        // Incase of get, no way to go back or forward.
        // Can be done with the help of navigate.to
        EdgeDriver driver = new EdgeDriver();
        driver.navigate().to("https://sdet.live");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
