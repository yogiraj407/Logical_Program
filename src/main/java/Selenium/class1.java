package Selenium;

//import io.appium.java_client.AppiumBy;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class class1 {
	
		public static void main(String[] args) throws IOException {
			
			
			String Path="E:\\Software Testing\\Velocity Class\\Software Testing\\Automation\\excellsheet automation\\data.xlsx";
			
			FileInputStream fis= new FileInputStream(Path);
			
			String Data=WorkbookFactory.create(fis).getSheet("ram").getRow(4).getCell(1).getStringCellValue();
			//double data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(1).getNumericCellValue();
			//Date data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(1).getDateCellValue();
			
			
			System.out.println(Data);// run successfully individual , but not run simultaneously
			//System.out.println(data);
			
			//System.out.println(data);// to appear as written in excelsheet --> remain to study in privious given task 
			
			// see all task in this and next lectures at time of revision
			
			
			
			
//			Sheet s=WorkbookFactory.create(fis).getSheet("ram");
//			
//			int LastRow= s.getLastRowNum();
//			
//			Row r = s.getRow(0);
//			
//			int LastCell=r.getLastCellNum();
//			
//			System.out.println(LastRow+","+LastCell);
//			//System.out.println(LastCell);
			
			
			
		}
		
	}

	
	
	


