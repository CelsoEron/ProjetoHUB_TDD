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

	public static WebElement btnCreate(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		return element;
	}

	public static WebElement txtUser(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
		return element;
	}

	public static WebElement btnSearch(WebDriver driver) {

		element = driver.findElement(By.id("menuSearch"));
		return element;
	}

	public static WebElement bxtxtSearch(WebDriver driver) {

		element = driver.findElement(By.id("autoComplete"));
		return element;
	}

	public static WebElement closeBxtxtSearch(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/img[1]"));
		return element;
	}

	public static WebElement produtoImg(WebDriver driver) {

		element = driver.findElement(By.id("laptopsImg"));
		return element;
	}
}
