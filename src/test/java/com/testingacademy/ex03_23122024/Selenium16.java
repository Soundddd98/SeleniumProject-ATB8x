package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Selenium16 {
    @Test
    public void testmethod02() throws InterruptedException {
        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        eo.addArguments("--incognito");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://app.vwo.com");

        //Assert.assertEquals(driver.getTitle(),"Login - VWO");
        //Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // Find the input box and enter email id

        //rules

        // order ->> Unique ID > Name > Class Name > TagName > Link text / Partial > CSS Selector > XPath
        // if dynamic / changes -> we have to avoid
        // in the above, the class is dynamic because 100% represents the resolution and will vary based on the system. hence class should be avoided here
        // in the above, id is unique and type = email is not unique.
        // shortest and easy to remember locator


        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        WebElement buttomSubmit = driver.findElement(By.id("js-login-btn"));

        emailInputBox.sendKeys("soundar@gmail.com");
        passwordInputBox.sendKeys("Soundar123");
        buttomSubmit.click();
        Thread.sleep(3000);
        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");
        assertThat (errorMessage.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");

        Thread.sleep(3000);




        driver.quit();
    }
}
