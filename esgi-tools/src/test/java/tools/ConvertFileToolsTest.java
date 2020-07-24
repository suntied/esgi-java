package tools;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConvertFileToolsTest {
    //Path To change
    public static final String EXCEL_FILE_PATH = "C:/Users/Marco/Documents/Projet/esgi/src/test/resources/fileexcel/fichier.xlsx";
    @Test
    void exportToExcel() throws IOException, InvalidFormatException {
        ConvertFileTools.exportToExcel(EXCEL_FILE_PATH);
    }
}