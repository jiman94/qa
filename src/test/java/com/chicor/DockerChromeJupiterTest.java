/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.chicor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerChromeJupiterTest {

    @BeforeAll
    static void setup() {
  
    	//WebDriverManager.chromedriver().setup();
    	 //ChromeOptions options = new ChromeOptions();
        // options.addArguments("--no-sandbox");
        // options.setAcceptInsecureCerts(true);
        // options.setHeadless(true);
    	
    	System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver");
    	
    	
    	//Selenium selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://www.google.com");
    	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        
    	
    	//Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://my.test.site.org/");
    	//Selenium 2 clients should connect as follow:

    	//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
    	
    }	
	
	
    @Test
    public void GNBTest() {
    	
    	//WebDriver driver = new ChromeDriver();
    	
    	
    	
    	ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--start-maximized");
    	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    	WebDriver driver;
    	
    	
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
			
			
	        driver.get("https://chicor.com/main");
	        driver.manage().window().setSize(new Dimension(1516, 737));
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
	        driver.findElement(By.linkText("닫기")).click();
	        driver.findElement(By.linkText("오늘 하루 보지 않기")).click();
	        driver.findElement(By.linkText("닫기")).click();
	        driver.findElement(By.linkText("BEST")).click();
	        driver.findElement(By.linkText("BRANDS")).click();
	        driver.findElement(By.linkText("STORY")).click();
	        driver.findElement(By.linkText("DEAL")).click();
	        driver.close();
	        
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    			

    }

	 


}
// end::snippet-in-doc[]
