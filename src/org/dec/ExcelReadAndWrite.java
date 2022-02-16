package org.dec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAndWrite {
	
	public static void main(String[] args) throws Throwable {
		
		//write
		
		File f = new File(".//excel//Dec.xlsx");
		FileOutputStream file = new FileOutputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("DecBatch");
		
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue("karthi");
		
		wb.write(file);
		wb.close();
		
		//read
		FileInputStream file1 = new FileInputStream(f);
		
		XSSFRow row2 = sheet.getRow(0);
		XSSFCell cell2 = row2.getCell(0);
		
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		
		
		
		
		
	}

}
