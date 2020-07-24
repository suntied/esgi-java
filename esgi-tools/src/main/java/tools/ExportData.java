package tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ExportData {

    public static void exportToCsv(String currenyData) throws IOException {
        //Todo export String to csv file
        List<String> tabString = new Arrays.asList(currenyData.split(","));

        BufferedWriter writeToCSV = File.newBufferedWriter(Paths.get("users-with-header.csv"));
        writeToCSV.write("Date, value");
        writeToCSV.newLine();

        for (String stringList : tabString){
            writeToCSV.append(String.join(",", stringList));
            writeToCSV.newLine();

        }


    }

    public static void exportToPdf(String currenyData) {
        //Todo export String to Pdf file
        List<String> tabString;
        tabString = new Arrays.asList(currenyData.split(","));



    }
}
