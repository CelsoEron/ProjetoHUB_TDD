package br.com.rsinet.hub_tdd.appModules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.pageObjects.Products_Page;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class TextSearch_Action {

	public static void Execute(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 100);

		String sProduto = ExcelUtils.getCellData(1, 0);

		Home_Page.btnSearch(driver).click();

		Home_Page.bxtxtSearch(driver).sendKeys(sProduto);

		Home_Page.bxtxtSearch(driver).sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.urlContains("search"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Products_Page.btnClose(driver));

		wait.until(ExpectedConditions.visibilityOf(Products_Page.produtoProcurado(driver)));

		executor.executeScript("arguments[0].click();", Products_Page.produtoProcurado(driver));

	}

	public static void InvalidExecute(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 100);

		String sProduto = ExcelUtils.getCellData(3, 0);

		Home_Page.btnSearch(driver).click();

		Home_Page.bxtxtSearch(driver).sendKeys(sProduto);

		Home_Page.bxtxtSearch(driver).sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.urlContains("search"));
		
	}
}
