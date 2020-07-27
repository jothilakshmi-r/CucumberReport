package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.it.Date;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAMSUNDAR\\workspace\\POM\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void loadURL(String url)
	{
		driver.get(url);
	}

	public static void fill(WebElement e, String value)
	{
		e.sendKeys(value);
	}
	
	public static void btnClk(WebElement e)
	{
		e.click();
	
}
	public static String getData(int rowCount, int colCount) throws IOException
	{
		File f = new File("C:\\Users\\SHYAMSUNDAR\\workspace\\POM\\Excel\\SeleniumDataExcel.xlsx");
		String name = null;
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet("Cucumber");
		Row r = s.getRow(rowCount);
		Cell c = r.getCell(colCount);
		int type = c.getCellType();
		
		if(type==1)
		{
			name = c.getStringCellValue();
		}
		else if(type ==0)
		{
			if(DateUtil.isCellDateFormatted(c))
			{
				java.util.Date date = c.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
				name = sf.format(date);
		}
			else
			{
				double d = c.getNumericCellValue();
				long ln = (long)d;
				name = String.valueOf(ln);
			}
		}
		return name;
		
	}
}