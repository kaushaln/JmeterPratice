package com.seljmeterprac;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample {

		sample() {
			
		}

		@Test
		public static void LaunchWebSite() {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WaitFor(3000);
			driver.close();
		}
		
		public static void WaitFor(long waitAmt) {
			try {
				Thread.sleep(waitAmt);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}