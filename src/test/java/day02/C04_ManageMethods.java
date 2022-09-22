package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
        Ileride wait konusunu genis olarak ele alacagiz
        Bir sayfa acilirken, ilk basta sayfanin icerisindeki elementlerre gore bir
        yukleme suresine ihtiyac vardir veya bir web elementinin kullanilabilmesi icin zamana ihtiuac olabilir
        implicitlyWait bize sayfanin yuklenmesi ve sayfanin elementlerine ulasim icin
        beklenecek maxsimum sureyi belirleme olanagi tanir.
         */
        driver.get("https://www.amazon.com");

    }
}
