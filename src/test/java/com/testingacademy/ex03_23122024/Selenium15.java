package com.testingacademy.ex03_23122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium15 {
    @Test
    public void testmethod01(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(eo);
        driver.get("https://app.vwo.com");

        //html element -> Web element in selenium
        // Web Element Find - Interact with it
        //Selenium provides -> ID, name, vlass name, tag
        // Advance -> CSS, XPATH



    }
}
