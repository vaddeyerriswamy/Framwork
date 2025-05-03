package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Secondclass {
	@Test
	public  void getShett() throws IOException {
		File src= new File("D:\\JOB Details\\All Testing Materials\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("Sheet1");
		System.out.println(sh.getSheetName());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(2).getStringCellValue());
		int tr=sh.getPhysicalNumberOfRows();
		System.out.println(tr);
		int tc=sh.getLastRowNum();
		System.out.println(tc);

		
	}
	
}
