package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        /*
        Yeni bir Class olusturalim.C06_ManageWindow
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfayi simge durumuna getirin
simge durumunda 3 saniye bekleyip sayfayi maximize yapin
Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
Sayfayi fullscreen yapin
Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
Sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Pencere konumu : "+driver.manage().window().getPosition());
        System.out.println("Pencere olculeri : "+driver.manage().window().getSize());
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }
}
