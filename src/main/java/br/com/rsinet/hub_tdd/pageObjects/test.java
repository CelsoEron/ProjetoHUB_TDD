package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	private static ChromeDriver driver;

	public static void main(String[] args) {

		System.out.println(Home_Page.txtDetailsProduct(driver));
	}
}
