package day15;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel {

    @Test
    public void test1() throws IOException {
        //-Dosya yolunu bir String degiskene atayalim
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //-WorkbookFactory.create(fileInputStream)
        //-Sheet objesi olusturun workbook.getSheetAt(Sayfa1)
        //-Row objesi olusturun sheet.getRow(3)
        //-Cell objesi olusturun row.getCell(3)
        //-3. Satır 3. Cell'deki veriyi silelim
        //-Silindiğini test edin
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

        //-3. Satır 3. Cell'deki veriyi silelim
       // workbook.getSheet("Sayfa1").getRow(3).createCell(3).setCellValue("");
       // System.out.println(workbook.getSheet("Sayfa1").getRow(3).getLastCellNum());
       row.removeCell(cell);
        System.out.println(workbook.getSheet("Sayfa1").getRow(3).getLastCellNum());

        FileOutputStream fos = new FileOutputStream(patch);
        workbook.write(fos);

        //-Silindiğini test edin

        fos.close();
        workbook.getSheet("Sayfa1").getRow(3).createCell(3).setCellValue("");
        System.out.println(workbook.getSheet("Sayfa1").getRow(3).getLastCellNum());



    }
}
