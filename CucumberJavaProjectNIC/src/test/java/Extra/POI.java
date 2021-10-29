package Extra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;





public class POI {
	
	
	WebDriver driver;

	public POI(WebDriver driver) {
		this.driver = driver;
	}

	 public static  String main(String args[]) throws IOException {
	File file =    new File("C:\\Users\\Admin\\Desktop\\testExcel28.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
	 HSSFWorkbook wb=new HSSFWorkbook(inputStream);
	 HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
	  HSSFRow row=sheet.getRow(2);
	  HSSFCell cell=row.getCell(1);
	  String username = cell.getStringCellValue();
	System.out.println("print cell data--"+username);
	return username;
	
	
}
}