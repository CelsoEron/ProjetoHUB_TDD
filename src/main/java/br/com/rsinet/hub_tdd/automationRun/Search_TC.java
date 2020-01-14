package br.com.rsinet.hub_tdd.automationRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.appModules.TextSearch_Action;
import br.com.rsinet.hub_tdd.pageObjects.Products_Page;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;
import br.com.rsinet.hub_tdd.utility.Screenshot;

public class Search_TC {
	private static ChromeDriver driver;

	@org.testng.annotations.BeforeClass
	public static void openBrowser() throws Exception {
		ExcelUtils.setProdutosFile(Constant.Path_TestData + Constant.File_TestData, "Produtos");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void txtSearch() throws Exception {
		driver.get("http://advantageonlineshopping.com/");
		TextSearch_Action.Execute(driver);

		Assert.assertEquals(true, Products_Page.titleProduct(driver).getText().contains(ExcelUtils.getCellData(1, 1).toUpperCase()));
		Screenshot.captureScreenShot(driver);
	}

	@Test
	public void invalidTxtSearch() throws Exception {
		driver.get("http://advantageonlineshopping.com/");

		TextSearch_Action.InvalidExecute(driver);
		Assert.assertEquals(true, Products_Page.noFound(driver).getText().contains("No results for"));
	}

//	@Test
//	public void clickSearch() throws Exception {
//		driver.get("http://advantageonlineshopping.com/");
//		ClickSearch_Action.Execute(driver);
//		
//		Screenshot.captureScreenShot(driver);
//	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		ExcelUtils.setCellData("PASS", 1, 2);
//		driver.quit();
	}
}
