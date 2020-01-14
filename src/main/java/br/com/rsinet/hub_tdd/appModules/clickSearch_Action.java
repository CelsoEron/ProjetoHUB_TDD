package br.com.rsinet.hub_tdd.appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.pageObjects.Products_Page;

public class ClickSearch_Action {

	public static void Execute(WebDriver driver) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().window().maximize();

		driver.findElement(By.id("laptopsImg")).click();

		wait.until(ExpectedConditions.urlContains("Laptops"));

		wait.until(ExpectedConditions.visibilityOf(Products_Page.produto1(driver)));
		Products_Page.produto1(driver).click();
	}
}
