package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C01_FileExistUpload extends TestBaseBeforeAfter {

    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
       WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        //chooseFile butonuna basalim
        System.out.println(System.getProperty("user.home"));

        String dosyaYolu = "C:\\Users\\PC\\Downloads\\text.txt";
        dosyaSec.sendKeys(dosyaYolu);
        //Yuklemek istediginiz dosyayi secelim.
        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //“File Uploaded!” textinin goruntulendigini test edelim.
        Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
    }
}
