package br.com.rsinet.hub_tdd.automationRun;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.appModules.Search_Action;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;
import br.com.rsinet.hub_tdd.utility.Screenshot;
import sun.nio.cs.ext.EUC_CN;

public class Search_TC {
	private static ChromeDriver driver;

	@BeforeClass
	public static void openBrowser() throws Exception {
		ExcelUtils.setProdutosFile(Constant.Path_TestData + Constant.File_TestData , "Produtos");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void txtSearch() throws Exception {
		driver.get("http://advantageonlineshopping.com/");
		Search_Action.Execute(driver);

		Screenshot.captureScreenShot(driver);
	}
	
	@AfterClass
	public static void closeBrowser() throws Exception {
		ExcelUtils.setCellData("NAO", 1, 2);
//		driver.quit();
	}
}
