package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBaseBeforeAfter;

import java.util.Set;

public class C01_Cookie extends TestBaseBeforeAfter {


    @Test
    public void test01() {
        //1-Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //-tum cookie’leri listeleyin
        Set<Cookie> cookiesSet = driver.manage().getCookies();
        cookiesSet.stream().forEach(t-> System.out.println("name : "+t.getName()+" value :"+t.getValue()));
        System.out.println(cookiesSet);
        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int cookiesSayisi = cookiesSet.size();
        Assert.assertTrue(cookiesSayisi>5);

        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        System.out.println("-----------");
        cookiesSet.stream().filter(t-> t.getName().equals("i18n-prefs")).forEach(t-> Assert.assertEquals("USD",t.getValue()));
        // 5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie yeniCookie = new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(yeniCookie);
        //6-eklediginiz cookie’nin sayfaya eklendigini test edin
        //7-ismi skin olan cookie’yi silin ve silindigini test edin
        //8-tum cookie’leri silin ve silindigini test edin
    }
}
