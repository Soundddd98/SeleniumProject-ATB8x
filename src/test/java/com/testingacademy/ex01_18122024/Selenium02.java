package com.testingacademy.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void test_selenium(){
        WebDriver driver = new EdgeDriver();  //to be used when we have to run the tc in edge and chrome
        // driver = new EdgeDriver;
        // ChromeDriver driver = new ChromeDriver(); -> To be used when we havee to run the test case in chrome only
        // RemoteDriver driver -> To be used when we have to run the tc in all the browsers
    }
}
