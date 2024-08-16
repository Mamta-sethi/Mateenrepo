package com.vtiger.genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDatafromExcel(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstantpaths.excelpath);
	    Workbook wd = WorkbookFactory.create(fis);
	   return wd.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();


	}
}
