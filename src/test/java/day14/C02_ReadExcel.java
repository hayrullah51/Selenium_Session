package day14;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExcel {

    @Test
    public void readExelTest01() throws IOException {
        //- Dosya yolunu bir String degiskene atayalim
        String patch = "src/recources/ulkeler.xlsx";

        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream = new FileInputStream(patch);

        //- Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //- WorkbookFactory.create(fileInputStream)
        //- Sheet objesi olusturun workbook.getSheetAt(index)
        //excel dosyamizda calismak istedigimiz sayfayi bu sekilde seceriz
        //- Row objesi olusturun sheet.getRow(index)
        //- Cell objesi olusturun row.getCell(index)
        //satir secimi yapildiktan sonra hucre secimi bu sekilde yapilir
        String actualData = workbook.getSheet("Sayfa1").
                getRow(3).
                getCell(3).
                toString();
        System.out.println("actual data : "+actualData);
        Assert.assertEquals(actualData,"Cezayir");



    }
}
