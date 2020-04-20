package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectpath = System.getProperty("user.dir");
		ExcelUtils eu = new ExcelUtils(projectpath + "/excel/demo_datafile_selenium.xlsx/", "Sheet1");
		eu.getRowCount();
		eu.getRowDataNumber(2,1);
		eu.getRowDataString(3,0);
		eu.getColCount();
	}

}
