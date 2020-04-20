package utils;

import net.sourceforge.htmlunit.corejs.javascript.ObjArray;

public class ExcelDataProviderFunc {
	
	public static void main(String[] args) {
		String ExcelPath = "/home/sarada/eclipse-workspace/Seleniumjavaframework/excel/demo_datafile_selenium.xlsx/";
		TestData(ExcelPath, "Sheet1");
	}

	public static Object[][] TestData(String ExcelPath, String WorkSheet) {
		ExcelUtils eu1 = new ExcelUtils(ExcelPath, WorkSheet);
		int rowcount = eu1.getRowCount();
		int colcount = eu1.getColCount();
		
		Object data[][] = new Object[rowcount-1][colcount];
		
		for(int i= 2; i<=rowcount; i++) {
			for(int j=0; j<colcount; j++) {
				String cellData = eu1.getRowDataString(i,j);
				System.out.print(cellData + " | ");
				data[i-2][j] = cellData;
			}
			System.out.println();
		}
		return data;	
	}
}
