package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasina gidiniz
        //Kaynak kodlari icinde "Gateway" kelimesinin oldugunu test edin
        driver.get("https://www.amazon.com");
        String istenen_kelime = "Gateway";
        String amazon_recourse =  driver.getPageSource();

        if (amazon_recourse.contains(istenen_kelime)){
            System.out.println(istenen_kelime+" bulundu Test PASSED");
        }else {
            System.out.println(istenen_kelime+" bulunamadi Test FAILED");
        }
        driver.close();
       // driver.quit(); --> birden fazla sayfa varsa hepsini kapatir

    }
}
