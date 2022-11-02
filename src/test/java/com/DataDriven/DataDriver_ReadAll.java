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

public class DataDriver_ReadAll {

	public static void readAllData() throws IOException {
		File f = new File("C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Dataset\\datareadAll.xlsx");
        FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
        Sheet sheetAt = wb.getSheetAt(0);
        int rowSize = sheetAt.getPhysicalNumberOfRows();
        for (int i = 0; i < rowSize; i++) {
			Row row = sheetAt.getRow(i);
			
		int cellSize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cellSize; j++) {
			
			Cell cell = row.getCell(j);
			CellType typeofcell = cell.getCellType();
			if (typeofcell.equals(CellType.STRING)) {
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);		
			}
			else if (typeofcell.equals(CellType.NUMERIC)) {
			  
				double numericCellValue = cell.getNumericCellValue();
				long newValue = (long) numericCellValue;
				System.out.println(newValue);		
	        }
	     }
	  }		
    }
           public static void main(String[] args) throws IOException {
	          readAllData();		
		}
}