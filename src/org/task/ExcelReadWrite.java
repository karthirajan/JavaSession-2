package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File(".//excel//demo.xlsx");
		FileOutputStream f = new FileOutputStream(file);
		
		XSSFWorkbook workbook  = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Students");
		
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		XSSFCell cell2 = row.createCell(1);
		
		cell.setCellValue("karthi");
		cell2.setCellValue(234455);
		
		workbook.write(f);
		workbook.close();
		
		
		FileInputStream f1 = new FileInputStream(file);
		XSSFSheet sheet2 = workbook.getSheet("Students");
		
		XSSFRow row2 = sheet2.getRow(0);
		XSSFCell cell3 = row2.getCell(0);
		XSSFCell cell4 = row2.getCell(1);
		
		String text = cell3.getStringCellValue();
		System.out.println(text);
		
		double d = cell4.getNumericCellValue();
		System.out.println(d);
		
		workbook.close();
		
	}

}
