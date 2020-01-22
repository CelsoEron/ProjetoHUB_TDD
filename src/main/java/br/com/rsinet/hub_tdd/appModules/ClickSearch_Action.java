package br.com.rsinet.hub_tdd.appModules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.pageObjects.Products_Page;

public class ClickSearch_Action {

	public static void Execute(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 100);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Home_Page.produtoImg(driver));
		

		wait.until(ExpectedConditions.visibilityOf(Products_Page.produtoProcurado(driver)));
		executor.executeScript("arguments[0].click();", Products_Page.produtoProcurado(driver));
	}
	
	public static void ExecuteInvalid(WebDriver driver) throws Exception {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Home_Page.detailsProduct(driver));
		
	}
}
