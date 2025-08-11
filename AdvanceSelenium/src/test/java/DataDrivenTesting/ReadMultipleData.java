package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData {
	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("./TSD/Products.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("sheet1");
		int lrn = sheet.getLastRowNum();
		System.out.println(lrn);
		for(int i=1;i<=lrn;i++) {
			XSSFRow row = sheet.getRow(i);
			short lcn = row.getLastCellNum();
			for(short j=0;j<=lcn;j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				
			}
		}
		book.close();
		fis.close();
		
		
	}

}
