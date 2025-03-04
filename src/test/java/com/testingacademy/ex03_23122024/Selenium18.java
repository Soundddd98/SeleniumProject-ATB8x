package com.testingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium18 {
    @Test
    public void testMethod03() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        eo.addArguments("--incognito");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");


        Thread.sleep(3000);
        //<input class="W(100%) Py(14px) input-text" placeholder="name@yourcompany.com" type="email" id="page-v1-step1-email" name="email" data-qa="page-su-step1-v1-email" required="">

        WebElement freeTrialID = driver.findElement(By.id("page-v1-step1-email"));
        freeTrialID.sendKeys("1234wrer");

        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)" type="checkbox" name="gdpr_consent_checkbox" id="page-free-trial-step1-cu-gdpr-consent-checkbox" value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox">

        WebElement freeTrialCheckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        freeTrialCheckbox.click();

        // <<button type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit">
        // Create a Free Trial Account
        // </button>
        // Since we cannot use partial as it is not <a>, we will use button list. in the page,
        // This is the first button
        List<WebElement> freeTrialSignButton = driver.findElements(By.tagName("button"));
        freeTrialSignButton.get(0).click();

        //<div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>
        // find element finds the first element, but findelements, we have to provide tags.

        //WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
        //Assert.assertEquals(errorMessage.getText(),"The email address you entered is incorrect.");

        Thread.sleep(3000);

        driver.quit();

    }
}
