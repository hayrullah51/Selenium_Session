package day14;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExel {

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
        Sheet sheet = workbook.getSheet("Sayfa1");
        //excel dosyamizda calismak istedigimiz sayfayi bu sekilde seceriz


        //- Row objesi olusturun sheet.getRow(index)
        Row row = sheet.getRow(3);

        //- Cell objesi olusturun row.getCell(index)
        Cell cell = row.getCell(3);
        //satir secimi yapildiktan sonra hucre secimi bu sekilde yapilir


        //- 3. index'deki satirin 3. index'indeki datanin Cezayir oldugunu test edin
        System.out.println(cell);
        String expectedData = "Cezayir";
        String actualData = cell.toString();
        Assert.assertEquals(expectedData,actualData);
        Assert.assertEquals(expectedData,cell.getStringCellValue());


    }
}
