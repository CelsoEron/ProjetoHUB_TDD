package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class Products_Page {

	private static WebElement element = null;

	public static WebElement produto1(WebDriver driver) throws Exception {
		String sFullName = ExcelUtils.getCellData(1, 1);

		element = driver.findElement(By.linkText(sFullName));
		return element;
	}
	
	public static WebElement produto2(WebDriver driver) throws Exception {
		String sFullName = ExcelUtils.getCellData(1, 1);
		
		element = driver.findElement(By.linkText(sFullName));
		return element;
	}

	public static WebElement btnClose(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div"));

		return element;
	}
	
	public static WebElement noFound(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		return element;
	}
	
	public static WebElement titleProduct(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
		return element;
	}
}
