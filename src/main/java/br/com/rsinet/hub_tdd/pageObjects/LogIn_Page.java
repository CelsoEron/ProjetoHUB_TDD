package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement bxUser(WebDriver driver) {

		element = driver.findElement(By.name("username"));
		return element;
	}

	public static WebElement bxPassword(WebDriver driver) {

		element = driver.findElement(By.name("password"));
		return element;
	}

	public static WebElement btnSignIn(WebDriver driver) {

		element = driver.findElement(By.id("sign_in_btnundefined"));
		return element;
	}

	public static WebElement lnkNewAccount(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		return element;
	}
}
