package utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    XSSFWorkbook excelWorkBook;
    XSSFSheet excelSheet;
    XSSFCell cell;

    public String getDataFromCell(String path, String sheet, int rowNumber, int columnNumber) {
        try {
            FileInputStream file = new FileInputStream(path);
            excelWorkBook = new XSSFWorkbook(file);
            excelSheet = excelWorkBook.getSheet(sheet);
            cell = excelSheet.getRow(rowNumber).getCell(columnNumber);
            file.close();
        } catch (Exception e) {
            System.out.println("No data found");
            return "";

        }
        return cell.getStringCellValue();
    }


}
