package day14;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ReadExel {

    @Test
    public void readExelTest() throws IOException {

        yazdir("Sayfa1", 12, 2);
        Assert.assertEquals( yazdir("Sayfa1", 12, 2).toString(),"Bahamalar");

        int satir = 12;
        int sutun = 2;
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        String actualData = workbook.
                getSheet("Sayfa1")
                .getRow(satir-1)
                .getCell(sutun-1)
                .toString();
        //Index 0'dan başladığı için bizden istenen satıra ulaşabilmek için bir eksiğini alırız
        System.out.println(actualData);
    }

    public Cell yazdir(String sheet, int satir, int sutun) throws IOException {

        String patch = "src/recources/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(patch);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Cell data = workbook.getSheet(sheet).getRow(satir).getCell(sutun);

        return data;
    }
}
