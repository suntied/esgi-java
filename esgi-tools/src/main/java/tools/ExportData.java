package tools;

import javax.swing.text.Document;
import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ExportData {

    public static void exportToCsv(String currenyData) throws IOException {
        //Todo export String to csv file
        List<String> tabString = new Arrays.asList(currenyData.split(","));

        BufferedWriter writeToCSV = File.newBufferedWriter(Paths.get("RapportCSV.csv"));
        writeToCSV.write("Date, value");
        writeToCSV.newLine();

        for (String stringList : tabString){
            writeToCSV.append(String.join(",", stringList));
            writeToCSV.newLine();

        }


    }

    public static void exportToPdf(String currenyData) throws FileNotFoundException {
        //Todo export String to Pdf file
        List<String> tabString;
        tabString = new Arrays.asList(currenyData.split(","));
        String out = "ReportingSupervision.pdf";
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document,
                new FileOutputStream("./rapport.pdf"));
        document.add(new Paragraph("Rapport :"));
        document.add(new Paragraph(tabString));
    }
}
