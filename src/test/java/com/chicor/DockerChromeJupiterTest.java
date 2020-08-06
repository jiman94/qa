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

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DockerChromeJupiterTest {

    @BeforeAll
    static void setup() {
  
    	//WebDriverManager.chromedriver().setup();
    	 //ChromeOptions options = new ChromeOptions();
        // options.addArguments("--no-sandbox");
        // options.setAcceptInsecureCerts(true);
        // options.setHeadless(true);
    	
    	System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver");

        
    }	
	
	
    @Test
    public void GNBTest() {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	 
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
    }

	 


}
// end::snippet-in-doc[]
