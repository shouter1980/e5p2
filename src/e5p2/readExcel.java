package e5p2;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {
 public String[][] getCellData(String path, String sheetName) throws InvalidFormatException, IOException {
  FileInputStream stream = new FileInputStream(path);
  Workbook workbook = WorkbookFactory.create(stream);
  Sheet s = workbook.getSheet(sheetName);
  int rowcount = s.getLastRowNum();
  int cellcount = s.getRow(0).getLastCellNum();
  String data[][] = new String[rowcount][cellcount];
  for (int i = 1; i <= rowcount; i++) {
   Row r = s.getRow(i);
   //for (int j = 0; j < cellcount; j++) {
   for (int j = 0; j < 2; j++) {
    Cell c = r.getCell(j);
    try {
     if (c.getCellType() == CellType.STRING) {
      data[i - 1][j] = c.getStringCellValue();
     } else {
      //data[i - 1][j] = String.valueOf(c.getNumericCellValue());
    	 /*this is branch 1b 2019-06-20 12:17*/
    	 data[i - 1][j] = String.format ("%.0f", c.getNumericCellValue());
     }
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  }
  return data;
 }
}