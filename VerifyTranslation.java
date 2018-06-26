package com.qait.automation.Bing;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * @author Dell
 *
 *
 */
public class VerifyTranslation {
	Translation tl;
	WebDriver driver;
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ArpitMittal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		driver.manage().window().maximize();
		tl = new Translation(driver);
	}
     
	@Test
	public void step01_LanguageSelectionTest() {
		tl.selectLanguage("English", "Hindi");
	}
	
	@Test
	public void step02_LanguageTranslationTest() {
		String result = tl.translate("My name is Arpan");
		System.out.println(result);
	
		
	}
	
	@Test
	public void step03_LanguageSwappingTest() {
		boolean b = tl.swap();
		assertTrue(b);
		
		
	}

}
