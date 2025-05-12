package Selenium;
import java.util.Random;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.*;
import java.io.IOException;
public class Seleniumpractice {

	//long MobileNo = 7028803470L;
	
	
	
	//public static void main(String[] args) {
//		int count = 0;
//		long MobileNo = 7028803470L;
//		
//        while (true) {
//            System.out.println("Count: " + MobileNo);
//
//            if (MobileNo > 7028803470L) {
//                System.out.println("Breaking out of the loop");
//                break; // Exit the loop when count reaches 5
//            }
//
//            MobileNo++;
//        }
		
		
		
		
//		int intValue = 42;
//		String stringValue = "" + intValue;
//		
//		System.out.println(stringValue);
		
		
		
//		public static int generateRandomNumber(int min, int max) {
//	        if (min >= max) {
//	            throw new IllegalArgumentException("Max must be greater than min");
//	        }
//
//	        Random random = new Random();
//	        return random.nextInt((max - min) + 1) + min;
//	    }
//
//	    public static void main(String[] args) {
//	        // Example: Generate a random number between 1 and 100
//	        int randomNum = generateRandomNumber(10000000, 99999999);
//	        System.out.println("Random Number: " + randomNum);
//	        
//	        String MobileNo="70" + randomNum;
//	        
//	        System.out.println(MobileNo);
//	    }
//	    
	    
	    
	    public static void main(String[] args) {
	        try {
	            // Specify the path to your Excel file
	            String excelFilePath = "E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\excellsheet automation\\data.xlsx";

	            // Create a FileInputStream to read the Excel file
	            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	            // Create a Workbook from the Excel file
	            Workbook workbook = new XSSFWorkbook(inputStream);

	            // Get the first sheet from the workbook
	            Sheet sheet = workbook.getSheetAt(0);

	            // Iterate through each row in the sheet
	            for (Row row : sheet) {
	                // Iterate through each cell in the row
	                for (Cell cell : row) {
	                    // Fetch data based on cell type
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t");
	                            break;
//	                        case NUMERIC:
//	                            System.out.print(cell.getNumericCellValue() + "\t");
//	                            break;
	                       // case BOOLEAN:
//	                            System.out.print(cell.getBooleanCellValue() + "\t");
//	                            break;
	                       // case BLANK:
	                        //    System.out.print("[BLANK]\t");
	                          //  break;
//	                        default:
//	                            System.out.print("[UNKNOWN]\t");
	                    }
	                }
	                System.out.println(); // Move to the next line for the next row
	            }

	            // Close the workbook and input stream
	            workbook.close();
	            inputStream.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
		
       
		
		
	
	

