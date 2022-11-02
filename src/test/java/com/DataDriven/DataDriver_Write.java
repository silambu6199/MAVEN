package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_Write {

	public static void writeParticularData() throws IOException {

		File f = new File("C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Dataset\\datawrite.xlsx");
		FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		//wb.createSheet("Data1").createRow(0).createCell(0).setCellValue("Mobile Num");
		wb.getSheet("Data1").getRow(0).createCell(1).setCellValue("9952350462");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Success");
		
	}

	public static void main(String[] args) throws IOException {
		
		writeParticularData();
		
	}
}
