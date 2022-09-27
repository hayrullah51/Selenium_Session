package day14;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C04_ReadExel {

    @Test
    public void readExelTest01() throws IOException {

        //-Dosya yolunu bir String degiskene atayalim
        String patch = "src/recources/ulkeler.xlsx";
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream = new FileInputStream(patch);
        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //-WorkbookFactory.create(fileInputStream)

        //-Turkce baskentler sutununu yazdiralim
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println(sonSatir);

        String baskentlerTr ="";

        for (int i = 1; i <=sonSatir; i++) {

           baskentlerTr = workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString();
            System.out.println(baskentlerTr);
        }
/*
        Workbook workbook = WorkbookFactory.create(fis);
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();
        List<String> turkceBaskentler = new ArrayList<String>();
        int j = 0;
        for (int i = 0; i <=sonSatir ; i++) {
            turkceBaskentler.add(i,workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString());

        }
        for (int i = 0; i <=sonSatir ; i++) {
            System.out.println(i + "inci Sehir = " + turkceBaskentler.get(i).toString());
            }

 */
        }

    }

