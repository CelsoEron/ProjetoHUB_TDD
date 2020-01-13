package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products_Page {

	private static WebElement element = null;

	public static WebElement produto1(WebDriver driver) {

		element = driver.findElement(By.linkText("HP Pavilion 15t Touch Laptop"));
		return element;
	}
}
