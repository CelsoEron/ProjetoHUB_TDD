package br.com.rsinet.hub_tdd.appModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.pageObjects.Products_Page;

public class Search_Action {

	public static void Execute(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btnSearch(driver)));

		Home_Page.btnSearch(driver).click();
//
		Home_Page.bxtxtSearch(driver).sendKeys("Pavilion");

		Home_Page.bxtxtSearch(driver).sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.urlContains("search"));

		wait.until(ExpectedConditions.visibilityOf(Products_Page.produto1(driver)));
		Products_Page.produto1(driver).click();

	}

}
