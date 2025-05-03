package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLdata {
//		public static void main(String[] args) throws IOException {
//			
//			ReadXLdata red= new ReadXLdata();
//			red.getData("Login");
//		}
		@DataProvider(name="bvtData")
		public String[][] getData(Method m) throws IOException {
			String excelSheetName=m.getName();
					
			File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\testData.xlsx");
			FileInputStream fis= new FileInputStream(f);
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sheetName=wb.getSheet(excelSheetName);
			int totalRows=sheetName.getLastRowNum();
			System.out.println(totalRows);
			Row rowcells=sheetName.getRow(0);
			int totalcells=rowcells.getLastCellNum();
			System.out.println(totalcells);
			
			DataFormatter format= new DataFormatter();
			
			String testData[][]= new String[totalRows][totalcells];
			for(int i=1;i<totalRows;i++) {
				for(int j=0;j<totalcells;j++) {
					testData[i-1][j]=format.formatCellValue(sheetName.getRow(j).getCell(j));
					System.out.println(testData[i-1][j]);
				}
			}
			return testData;
			
			
			
		}
}
