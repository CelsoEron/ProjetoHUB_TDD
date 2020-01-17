package br.com.rsinet.hub_tdd.automationRun;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.appModules.Register_Action;
import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.utility.Screenshot;

public class Register_TC {
	
	private static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		driver = DriverManager.startChrome();
		Reporter.log("Abrindo o Chrome Browser");

	}

	@Test(groups = { "Cadastro" }, priority = 0)
	public void validRegister() {
		DriverManager.openWebSite(driver);
		Reporter.log("Acessando o endereço da loja");

		Register_Action.ExecuteValid(driver);
		Reporter.log("Executando o teste válido do registro");

		Assert.assertEquals("http://advantageonlineshopping.com/#/", driver.getCurrentUrl());
		Reporter.log("Verificando se a página final é a home para cadastros com sucesso");
		Screenshot.captureScreenShot(driver);
		Reporter.log("Tirando o print da página final");
	}

	@Test(groups = { "Cadastro" }, priority = 1)
	public void invalidRegister() {
		DriverManager.openWebSite(driver);
		Reporter.log("Acessando o endereço da loja");

		Register_Action.ExecuteInvalid(driver);
		Reporter.log("Executando o teste inválido do registro");

		Assert.assertEquals("http://advantageonlineshopping.com/#/register", driver.getCurrentUrl());
		Reporter.log("Verificando se a página final é a cadastro para cadastros com falha");
		Screenshot.captureScreenShot(driver);
		Reporter.log("Tirando o print da página final");
	}

//	

	@AfterClass
	public static void closeBrowser() {
		DriverManager.closeChrome(driver);
		Reporter.log("Saindo do Chrome");
	}
}
