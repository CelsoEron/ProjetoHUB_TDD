package br.com.rsinet.hub_tdd.automationRun;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.appModules.Register_Action;

public class Register_TC {
	private static ChromeDriver driver;

	@BeforeClass
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void validRegister() {
		driver.get("http://advantageonlineshopping.com/");
		Register_Action.Execute(driver);

		Assert.assertEquals("http://advantageonlineshopping.com/#/", driver.getCurrentUrl());
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
