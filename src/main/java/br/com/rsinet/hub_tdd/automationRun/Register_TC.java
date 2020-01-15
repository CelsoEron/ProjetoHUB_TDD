package br.com.rsinet.hub_tdd.automationRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.appModules.Register_Action;
import br.com.rsinet.hub_tdd.utility.Screenshot;

public class Register_TC {
	private static ChromeDriver driver;

	@BeforeClass
	public static void openBrowser() {
		driver = new ChromeDriver();
		Reporter.log("Abrindo o Chrome Browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		Reporter.log("Maximizando a janela do Chrome");
	}

	@Test(groups = { "Cadastro" }, priority = 0)
	public void validRegister() {
		driver.get("http://advantageonlineshopping.com/");
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
		driver.get("http://advantageonlineshopping.com/");
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
		driver.quit();
		Reporter.log("Saindo do Chrome");
	}
}
