package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class C05_ReadExel {
    public static void main(String[] args) {

    }

    @Test
    public void readExelTest1() throws IOException {

        //-Dosya yolunu bir String degiskene atayalim
        String patch = "src/recources/ulkeler.xlsx";

        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(patch);

        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fis);

        //-WorkbookFactory.create(fileInputStream)
        //-sayfa 2'ye gidip satir sayisinin 6, kullanilan satir sayisinin ise 3 oldugunu test edin

       int sonSatir = workbook.getSheet("Sayfa2").getLastRowNum();
       int expectedLastRow = 15;
        Assert.assertEquals(expectedLastRow,sonSatir+1);

       int kullanilanSatirSayisi = workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
       int expectedKullanilanSayisi = 3;
       Assert.assertEquals(expectedKullanilanSayisi,kullanilanSatirSayisi);




    }
}
