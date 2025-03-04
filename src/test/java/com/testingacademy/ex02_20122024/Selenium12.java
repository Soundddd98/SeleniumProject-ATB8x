package com.testingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    @Test
    public void testmethod01() throws InterruptedException {
        EdgeDriver edgedriver = new EdgeDriver();
        edgedriver.get("https://sdet.live");

        Thread.sleep(5000);

        // Close vs Quit
        edgedriver.close();
        // Current browser window not the fill window
        // Closed the window, session ID is not equal to null. Webdriver session is open.
        Thread.sleep(3000);
        edgedriver.quit();

        // Quit - Session ID becomes null. the full window is closes. Closes the webdriver session also
    }
}
