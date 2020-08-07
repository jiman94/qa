package com.chicor;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RunningTestOnDocker {

    @Test
    public void runTestOnDocker() throws Exception {
        DesiredCapabilities dcap = DesiredCapabilities.chrome();
       // String driverPath = System.getProperty("user.dir") + "/chromedriver/chromedriver";
        String driverPath = "/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // You should check the Port No here.
        URL gamelan = new URL("http://localhost:4444/wd/hub");
       // URL gamelan = new URL("http://localhost:8088/wd/hub");
        
        
        WebDriver driver = new RemoteWebDriver(gamelan, dcap);
        // Get URL
        driver.get("https://www.google.com/");
        // Print Title
        System.out.println(driver.getTitle());
    }
}