package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;

	public static WebElement btnUser(WebDriver driver) {

		element = driver.findElement(By.id("menuUser"));

		return element;
	}
}
