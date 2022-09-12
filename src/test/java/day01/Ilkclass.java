import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        /*
        En temel haliyle bir otamasyon yapmak icin class'imizda otomasyon icin
        grekli olan webdriver'in yerini gostermemiz gerekir
        Bunun icin Java kutuphanesinden System.setproperty() 'unu kullaniriz
        ve method'un icine
         1. driver'i yazariz
         2. fiziki yolunu kopyalariz
         */

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("Actual Title : "+driver.getTitle());
        System.out.println("Actual URL"+driver.getCurrentUrl());
    }
}
