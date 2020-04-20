package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	//static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet worksheet;

	public ExcelUtils(String excelPath, String workSheet1) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			worksheet = workbook.getSheet(workSheet1);

		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}
	}
	/**	
	public static void main(String[] args) {
		getRowCount();
		getRowDataString(2,0);
		getRowDataNumber(3,1);
	}*/

	public static int getRowCount() {
		int rowcount = 0;
		try {

			rowcount = worksheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);    

		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}	
		return rowcount;
	}

	public static String getRowDataString(int rowNum, int colNum) {
		String celldata =null;
		try {
			 celldata =worksheet.getRow(rowNum).getCell(colNum).getStringCellValue();   
			//System.out.println(celldata);

		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}	
		return celldata;
	}
	public static void getRowDataNumber(int rowNum, int colNum) {
		try {

			double celldata =worksheet.getRow(rowNum).getCell(colNum).getNumericCellValue();   
			//System.out.println(celldata);

		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}	
	}
	public static int getColCount() {
		int colcount = 0;
		try {

			colcount =worksheet.getRow(1).getPhysicalNumberOfCells();   
			System.out.println(colcount);

		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}	
		return colcount;
	}
	
}
