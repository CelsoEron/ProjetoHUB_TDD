package br.com.rsinet.hub_tdd.automationRun;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.appModules.ClickSearch_Action;
import br.com.rsinet.hub_tdd.appModules.TextSearch_Action;
import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.pageObjects.Products_Page;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;
import br.com.rsinet.hub_tdd.utility.Screenshot;

public class Search_TC {
	private static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws Exception {
		ExcelUtils.setProdutosFile(Constant.Path_TestData + Constant.File_TestData, "Produtos");

		driver = DriverManager.startChrome();
	}

	@Test(groups = { "Pesquisa" }, priority = 4)
	public void txtSearch() throws Exception {
		DriverManager.openWebSite(driver);
		Reporter.log("Acessando o endereço da loja");

		TextSearch_Action.Execute(driver);
		Reporter.log("Executando o teste válido da pesquisa por texto");

		Assert.assertEquals(
				Products_Page.titleProduct(driver).getText().contains(ExcelUtils.getCellData(1, 1).toUpperCase()),
				true);
		Reporter.log("Verificando se o produto buscado é o mesmo na massa de dados");
		Screenshot.captureScreenShot(driver);
		Reporter.log("Tirando o print da página final");
	}

	@Test(groups = { "Pesquisa" }, priority = 5)
	public void invalidTxtSearch() throws Exception {
		DriverManager.openWebSite(driver);
		Reporter.log("Acessando o endereço da loja");

		TextSearch_Action.InvalidExecute(driver);
		Reporter.log("Executando o teste inválido da pesquisa por texto");

		Assert.assertEquals(Products_Page.noFound(driver).getText().contains("No results for"), true);
		Reporter.log("Verificando se o produto buscado é inválido");
		Screenshot.captureScreenShot(driver);
		Reporter.log("Tirando print da página final");
	}

	@Test(groups = { "Pesquisa" }, priority = 2)
	public void clickSearch() throws Exception {
		DriverManager.openWebSite(driver);
		Reporter.log("Acessando o endereço da loja");

		ClickSearch_Action.Execute(driver);
		Reporter.log("Executando o teste válido da pesquisa por clicks");

		assertEquals(Products_Page.produtoProcurado(driver).getText().contains(ExcelUtils.getCellData(1, 1)), true);

		Screenshot.captureScreenShot(driver);
		Reporter.log("Tirando print da página final");
	}

	@Test(groups = { "Pesquisa" }, priority = 3)
	public void clickSearchInvalid() throws Exception {
		DriverManager.openWebSite(driver);
		Reporter.log("Acessando o endereço da loja");

		ClickSearch_Action.ExecuteInvalid(driver);
		Reporter.log("Executando o teste inválido da pesquisa por clicks");

		assertEquals(Products_Page.titleProduct(driver).getText().contains("Folio"), false);

		Screenshot.captureScreenShot(driver);
		Reporter.log("Tirando print da página final");
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		ExcelUtils.setCellData("PASS", 1, 2);
		Reporter.log("Inserindo na massa se o teste passou");

		DriverManager.closeChrome(driver);
		Reporter.log("Saindo do Chrome");
	}
}
