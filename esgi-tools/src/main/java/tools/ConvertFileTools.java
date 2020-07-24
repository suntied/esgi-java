package tools;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ConvertFileTools {

    public static Map<String, Double> exportToExcel(String pathName) throws InvalidFormatException {
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new File(pathName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String,Double> mapReturn = new HashMap<>();

        Sheet sheet = workbook.getSheetAt(0);

        DataFormatter dataFormatter = new DataFormatter();
        for (Row row: sheet) {
            if(!dataFormatter.formatCellValue(row.getCell(0)).equals("date")){
                String value = dataFormatter.formatCellValue(row.getCell(1));
                value = value.replace(',','.');

                mapReturn.put(dataFormatter.formatCellValue(row.getCell(0)),Double.parseDouble(value));
            }
        }


        return mapReturn;
    }
}
