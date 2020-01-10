package br.com.rsinet.hub_tdd.appModules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.pageObjects.Register_Page;

public class Register_Action {

	
	public static void Execute(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		Home_Page.btnUser(driver).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btnCreate(driver)));
		
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", Home_Page.btnCreate(driver));

		Register_Page.bx_username(driver).sendKeys("Testv1");

		Register_Page.bx_email(driver).sendKeys("test@test.com");

		Register_Page.bx_password(driver).sendKeys("Test1234");

		Register_Page.bx_confirmPassword(driver).sendKeys("Test1234");

		Register_Page.bx_firstName(driver).sendKeys("Testador");

		Register_Page.bx_lastName(driver).sendKeys("do teste");

		Register_Page.bx_phone(driver).sendKeys("0123456789");

		Register_Page.selectbx_country(driver).selectByVisibleText("Brazil");

		Register_Page.bx_city(driver).sendKeys("Cidade Teste");

		Register_Page.bx_adress(driver).sendKeys("Rua Test 123");

		Register_Page.bx_state(driver).sendKeys("TesteCity");
		
		Register_Page.bx_postalcode(driver).sendKeys("000000");

		Register_Page.chk_agree(driver).click();

		Register_Page.btn_register(driver).click();

	}

}
