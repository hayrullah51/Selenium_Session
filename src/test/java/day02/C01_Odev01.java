package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        System.out.println("Sayfa title : "+driver.getTitle());

        String actuaTitle = driver.getTitle();
        String istenenTitle = "amazon";

        if (actuaTitle.contains(istenenTitle)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }
        System.out.println("Sayfanin url'i : "+ driver.getCurrentUrl());
        String actualURL = driver.getCurrentUrl();
        String arananKelime = "amazon";

        if (actualURL.contains(arananKelime)){
            System.out.println("URL Testi PASSED");
        }else {
            System.out.println("URL Testi FAILED");
        }

        System.out.println("Handle degeri : "+driver.getWindowHandle());
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Getaway";

        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcode Testi PASSED");
        }else {
            System.out.println("Sourcecode Testi FAILED");
        }
        driver.close();


    }
}
