package com.testingacademy.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import javax.sql.rowset.WebRowSet;
import java.util.List;

public class Selenium20 {
    @Test
    public void testMethod03() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        inputBox.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int size = Math.min(searchTitles.size(),searchTitlesPrices.size());
        for(int i = 0; i<size ; i++){
            System.out.println("Title: " + searchTitles.get(i).getText() + " || " + searchTitlesPrices.get(i).getText());
        }
        driver.quit();
    }
}
