package day15;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C01_ReadExel {

    @Test
    public void readExelTesti() throws IOException {

        String patch = "src/recources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(patch);
        Workbook workbook = WorkbookFactory.create(fis);
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();

        int sayac = 4;
        for (int i = 0; i <sonSatir ; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(j).toString());
            }

        }



    }
}




