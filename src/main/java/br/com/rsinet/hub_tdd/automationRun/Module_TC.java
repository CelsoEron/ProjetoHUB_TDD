package br.com.rsinet.hub_tdd.automationRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.appModules.Register_Action;

public class Module_TC {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://advantageonlineshopping.com/");
		
		Register_Action.Execute(driver);
		Register_Action.Execute(driver);
		Register_Action.Execute(driver);
		
		driver.quit();
	}
}
