package e5p2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
			// for (int j = 0; j < cellcount; j++) {
			for (int j = 0; j < 2; j++) {
				Cell c = r.getCell(j);
				try {
					if (c.getCellType() == CellType.STRING) {
						data[i - 1][j] = c.getStringCellValue();
					} else {
						// data[i - 1][j] = String.valueOf(c.getNumericCellValue());
						data[i - 1][j] = String.format("%.0f", c.getNumericCellValue());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}

	public static void excelWriter(String excelPath, String newStudentsList[][])
			throws InvalidFormatException, IOException {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(excelPath));
			// Create Workbook instance holding .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("staff");

			int rownum = 0;
			for (String[] student : newStudentsList) {
				Row row = sheet.createRow(rownum++);

				int colum = 0;
				for (String value : student) {
					Cell cell = row.createCell(colum++);
					cell.setCellValue(value);
				}
			}

			// Write workbook into the excel
			workbook.write(fileOutputStream);
			// Close the workbook
			workbook.close();

		} catch (Exception ie) {
			ie.printStackTrace();
		}

	}
}