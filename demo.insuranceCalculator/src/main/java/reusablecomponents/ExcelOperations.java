package reusablecomponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperations {

	String filepath;
	Sheet sh;
	Workbook wb;

	public ExcelOperations(String sheetName)  {
		try {
			filepath = System.getProperty("user.dir") + PropertiesOperations.getPropertyValueByKey("testdata");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File testDataFile = new File(filepath);

		
		try {
			wb = WorkbookFactory.create(testDataFile);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sh = wb.getSheet(sheetName);
	}

	public HashMap<String, String> getTestData(int rowNum) throws Exception {

//		sh.getRow(0).getCell(0);
		HashMap<String, String> hm = new HashMap<>();
		for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());
		}
		return hm;
	}

	public int rowCount() {
		return sh.getLastRowNum();
	}

	public int colCount() {
		return sh.getRow(0).getLastCellNum();
	}

}
