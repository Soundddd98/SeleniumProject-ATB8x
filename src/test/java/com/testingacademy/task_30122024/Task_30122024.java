package com.testingacademy.task_30122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task_30122024 {
    @Test
    public void testMethod01() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://www.idrive360.com/enterprise/login");


    }
}
