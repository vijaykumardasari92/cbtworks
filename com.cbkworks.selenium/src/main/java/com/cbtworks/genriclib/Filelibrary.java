package com.cbtworks.genriclib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelibrary {

	public String Readpropdata(String propfile, String key) throws Throwable {
		// read property file data
		FileInputStream fis = new FileInputStream(propfile);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key, "incorrect key");
		return value;
	}

	// read Xl data
	public String readdatafromxlsheet(String xlfile, String sheet, int row, int cell) throws Throwable {
		FileInputStream fis1 = new FileInputStream(xlfile);

		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.toString();
		return value;
	}

}
