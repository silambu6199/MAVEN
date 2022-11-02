package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_Read {
	public static void readParticularData() throws IOException {
		
		File f = new File("C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Dataset\\dataread.xlsx");
		FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		CellType typeofcell = cell.getCellType();
		
		if (typeofcell.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (typeofcell.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			int newvalue = (int) numericCellValue;
			System.out.println(newvalue);	
		}
	}
	public static void main(String[] args) throws IOException {
	
		readParticularData();
	}
}