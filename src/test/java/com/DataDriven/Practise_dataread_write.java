package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practise_dataread_write {

	public static void readData() throws IOException {

		File f = new File(
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Dataset\\dataread.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);

		CellType typeofcell = cell.getCellType();

		if (typeofcell.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (typeofcell.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
		wb.close();
	}

	public static void readDataAll() throws IOException {

		File f = new File(
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Dataset\\datareadAll.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);

		int Rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < Rowsize; i++) {
			Row row = sheetAt.getRow(i);

			int Cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < Cellsize; j++) {
				Cell cell = row.getCell(j);

				CellType typeofcell = cell.getCellType();

				if (typeofcell.equals(CellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"     ");

				} else if (typeofcell.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();
					long value = (long) numericCellValue;
					System.out.println(value);
				}
			}

		}
		wb.close();
	}

	public static void write() throws IOException {
		File f = new File("C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Dataset\\datawrite.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("data4").createRow(0).createCell(0).setCellValue("email");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
				

		wb.close();
	}

	public static void main(String[] args) throws IOException {

		write();
	}
}
