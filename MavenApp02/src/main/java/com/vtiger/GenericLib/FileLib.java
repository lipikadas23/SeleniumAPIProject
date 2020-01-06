package com.vtiger.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * FileLib class used to read, write data from the Excel file, property file and
 * write data into the Excel file, property file
 * 
 * @author Manoj
 * 
 */
public class FileLib {

	public static String path = "../MavenApp02/src/test/resources/searchOpportunityTSData.xlsx";
	public static String value;
	
	public static String getPropertyvalue(String key) {
		try {
			FileInputStream fio = new FileInputStream("../MavenApp02/src/test/resources/commonData.properties");
			Properties pfile = new Properties();
			pfile.load(fio);
			value = pfile.getProperty(key);
		} catch (Exception ex) {	}
		return value;
	}

	public static String getExcelData(String shit, int rowno, int cellno){

		try {
			Workbook book = WorkbookFactory.create((new FileInputStream(path)));
			Sheet sheet = book.getSheet(shit);
			Row row = sheet.getRow(rowno);
			Cell cell = row.getCell(cellno);
			value = cell.getStringCellValue();
		}
		catch (EncryptedDocumentException e) {	// TODO Auto-generated catch block			e.printStackTrace();
			
		} catch (FileNotFoundException e) {		// TODO Auto-generated catch block			e.printStackTrace();
			
		} catch (IOException e) {		// TODO Auto-generated catch block			e.printStackTrace();
			
		}
		
		return value;
	}
}

/*
 * String value = WorkbookFactory.create(new
 * FileInputStream(path)).getSheet(shit).getRow(rowno).getCell(cellno).
 * getStringCellValue();
 */