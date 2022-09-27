package practice;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 extends TestBaseBeforeAfter {

    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    // ikinci emojiye tıklayın (hayvan emojisini seçin)
    // tüm hayvan emojilerine tıklayın
    // formu doldurun (dilediğinizi yazabilirsiniz)
    // apply butonuna tıklayın


    @Test
    public void test() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın (hayvan emojisini seçin)
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
       driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

        // tüm hayvan emojilerine tıklayın
      List<WebElement> animals = driver.findElements(By.xpath("//div[@class='mdl-tabs__panel is-active']/div/img"));
        //1. yol tumemojilere tek tek tikladik
        /*
        for (WebElement each:animals
             ) {
            each.click();
        }

         */

        //2. yol tiklama
        animals.forEach(t-> t.click());

        // formu doldurun (dilediğinizi yazabilirsiniz)
        //--> iframe girdik ve geri cikmamiz gerekiyor!!!
        driver.switchTo().defaultContent();//driver eski yerinde
        Actions actions1 = new Actions(driver);
        Faker faker = new Faker();
      List<WebElement> boxes =  driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));

      //Bu listi kullanarak her bir webelementi kolayca boxes listinde bulunan webelement'lerimize gonderebilecegiz
      List<String> text = new ArrayList<>(Arrays.asList("bu","listi","kullanarak","her","bir","webelementi","kolayca","boxes","listinde","bulunan","webelement"));

        for (int i = 0; i < boxes.size(); i++) {
            boxes.get(i).sendKeys(text.get(i));
        }

        // apply butonuna tıklayın
        driver.findElement(By.id("send")).click();





    }
}
