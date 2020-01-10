package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {

	private static WebElement element = null;

	public static WebElement bx_username(WebDriver driver) {

		element = driver.findElement(By.name("usernameRegisterPage"));
		return element;
	}

	public static WebElement bx_email(WebDriver driver) {

		element = driver.findElement(By.name("emailRegisterPage"));
		return element;
	}

	public static WebElement bx_password(WebDriver driver) {

		element = driver.findElement(By.name("passwordRegisterPage"));
		return element;
	}

	public static WebElement bx_confirmPassword(WebDriver driver) {

		element = driver.findElement(By.name("confirm_passwordRegisterPage"));
		return element;
	}

	public static WebElement bx_firstName(WebDriver driver) {

		element = driver.findElement(By.name("first_nameRegisterPage"));
		return element;
	}

	public static WebElement bx_lastName(WebDriver driver) {

		element = driver.findElement(By.name("last_nameRegisterPage"));
		return element;
	}

	public static WebElement bx_phone(WebDriver driver) {

		element = driver.findElement(By.name("phone_numberRegisterPage"));
		return element;
	}

	public static Select selectbx_country(WebDriver driver) {

		 element = driver.findElement(By.name("countryListboxRegisterPage"));
		 Select oSelect = new Select(element);
		 
		 return oSelect;
	}

	public static WebElement bx_city(WebDriver driver) {

		element = driver.findElement(By.name("cityRegisterPage"));
		return element;
	}
	
	public static WebElement bx_adress(WebDriver driver) {
		
		element = driver.findElement(By.name("addressRegisterPage"));
		return element;
	}
	
	public static WebElement bx_state(WebDriver driver) {
		
		element = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		return element;
	}
	
	public static WebElement bx_postalcode(WebDriver driver) {
		
		element = driver.findElement(By.name("postal_codeRegisterPage"));
		return element;
	}
	
	public static WebElement chk_agree(WebDriver driver) {
		
		element = driver.findElement(By.name("i_agree"));
		return element;
	}
	
	public static WebElement btn_register(WebDriver driver) {
		
		element = driver.findElement(By.id("register_btnundefined"));
		return element;
	}

}
