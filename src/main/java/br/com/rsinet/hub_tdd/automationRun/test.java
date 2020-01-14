package br.com.rsinet.hub_tdd.automationRun;

import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class test {

	public static void main(String[] args) throws Exception {
		ExcelUtils.setProdutosFile( Constant.File_TestData, "Produtos");
		String sProduto = ExcelUtils.getCellData(2, 1);
		System.out.println(sProduto);
	}
}
