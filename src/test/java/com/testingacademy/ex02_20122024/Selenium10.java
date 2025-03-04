package test.java.com.testingacademy.ex02_20122024;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {
    @Test
    public void testmethod10(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addExtensions(new File("src/test/java/com/testingacademy/ex02_20122024/adblocker.crx"));

        ChromeDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://www.youtube.com/");

    }

}
