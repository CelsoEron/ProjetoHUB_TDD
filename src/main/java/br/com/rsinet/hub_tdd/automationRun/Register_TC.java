package br.com.rsinet.hub_tdd.automationRun;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.appModules.Register_Action;
import br.com.rsinet.hub_tdd.appModules.Search_Action;
import br.com.rsinet.hub_tdd.utils.Screenshot;

public class Register_TC {
	private static ChromeDriver driver;

	@BeforeClass
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	@Test
//	public void validRegister() {
//		driver.get("http://advantageonlineshopping.com/");
//		Register_Action.ExecuteValid(driver);
//
//		Assert.assertEquals("http://advantageonlineshopping.com/#/", driver.getCurrentUrl());
//		Screenshot.captureScreenShot(driver);
//	}

//	@Test
//	public void invalidRegister() {
//		driver.get("http://advantageonlineshopping.com/");
//		Register_Action.ExecuteInvalid(driver);
//
//		Assert.assertEquals("http://advantageonlineshopping.com/#/register", driver.getCurrentUrl());
//		Screenshot.captureScreenShot(driver);
//	}
	
	@Test
	public void txtSearch() {
		driver.get("http://advantageonlineshopping.com/");
		Search_Action.Execute(driver);
		
		Screenshot.captureScreenShot(driver);
	}

	@AfterClass
	public static void closeBrowser() {
//		driver.quit();
	}
}
