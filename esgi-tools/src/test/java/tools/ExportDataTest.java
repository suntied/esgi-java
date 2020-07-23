package tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ExportDataTest {
    String test = "{\"bpi\":{\"2020-06-22\":9474.9,\"2020-06-23\":9591.715,\"2020-06-24\":9510.3,\"2020-06-25\":9274.1267,\"2020-06-26\":9127.55,\"2020-06-27\":9164.315,\"2020-06-28\":8991.5,\"2020-06-29\":9096.15,\"2020-06-30\":9144.385,\"2020-07-01\":9153.95,\"2020-07-02\":9199.875,\"2020-07-03\":9094.955,\"2020-07-04\":9083.395,\"2020-07-05\":9075.3125,\"2020-07-06\":9203.25,\"2020-07-07\":9265.375,\"2020-07-08\":9279.5833,\"2020-07-09\":9403.85,\"2020-07-10\":9144.715,\"2020-07-11\":9278.05,\"2020-07-12\":9279.05,\"2020-07-13\":9294.6625,\"2020-07-14\":9202.4067,\"2020-07-15\":9214.1275,\"2020-07-16\":9116.325,\"2020-07-17\":9122.22,\"2020-07-18\":9140.2575,\"2020-07-19\":9156.11,\"2020-07-20\":9185.375,\"2020-07-21\":9206.5125,\"2020-07-22\":9357.195},\"disclaimer\":\"This data was produced from the CoinDesk Bitcoin Price Index. BPI value data returned as USD.\",\"time\":{\"updated\":\"Jul 23, 2020 00:03:00 UTC\",\"updatedISO\":\"2020-07-23T00:03:00+00:00\"}}\n";
    String path = "";
    @Test
    void exportToCsv() {
        ExportData.exportToCsv(test);



        //Test De validation
        File tmpDir = new File(path);
        Assertions.assertTrue(tmpDir.exists());
    }
    @Test
    void exportToPdf(){
        ExportData.exportToPdf(test);



        //Test De validation
        File tmpDir = new File(path);
        Assertions.assertTrue(tmpDir.exists());
    }
}