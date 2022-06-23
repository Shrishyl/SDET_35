 package genaricsUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author DELL
 *to data from excel
 */
public class ExcelUtility {
	
	public String getExcel(String name ,int row,int cell) throws Throwable {
	FileInputStream fxe = new FileInputStream("./src/test/resources/VtigerTestCase.xlsx");
	Workbook workbook = WorkbookFactory.create(fxe);
	return workbook.getSheet(name).getRow(row).getCell(cell).getStringCellValue();

}
	/**
	 * 
	 * @param name
	 * @param row
	 * @param cell
	 * to write data from exacel 
	 * @throws Throwable
	 */
	public String  WriteExcel(String name ,int row,int cell) throws Throwable {
		FileInputStream flexl=new FileInputStream("./src/test/resources/VtigerTestCase.xlsx");
		Workbook workbook = WorkbookFactory.create(flexl);
		Sheet sheet = workbook.getSheet(name); 
		 sheet.getRow(row).createCell(cell).setCellValue(name);
		 
		 FileOutputStream ftys=new FileOutputStream("./src/test/resources/VtigerTestCase.xlsx");
		 workbook.write(ftys);
		 return name;
		 
		 
	
		 
		
		
	}
}