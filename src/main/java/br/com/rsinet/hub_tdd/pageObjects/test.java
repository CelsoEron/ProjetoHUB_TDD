package br.com.rsinet.hub_tdd.pageObjects;

import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class test {

	public static void main(String[] args) throws Exception {
		ExcelUtils.setProdutosFile(Constant.Path_TestData + Constant.File_TestData , "Produtos");
		String test = ExcelUtils.getCellData(1, 1);
		
		System.out.println(test);
		System.out.println(ExcelUtils.getCellData(2, 0));
	}
}
