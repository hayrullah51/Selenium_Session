package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {
        /*
            Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Sayfanin boyutlari "+driver.manage().window().getSize());
        System.out.println("Sayfanin konumu "+driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(20,20));
        Thread.sleep(4000);
        driver.manage().window().setSize(new Dimension(800,600));
        driver.close();
    }
}
