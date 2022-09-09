import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        /*
        1. Amazon sayfasina gidiniz
        2. Basligin "Amazon" icerdigini test ediniz
        3.Url'nin amazon icerdigini test edin
        4. Sayfayi kapatin
         */
        driver.get("https://www.amazon.com/");
        String testTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (testTitle.contains(expectedTitle)){
            System.out.println(expectedTitle+" bulundu, Test PASSED");
        }else {
            System.out.println(expectedTitle+" bulunamadi, Test FAILED");
        }

        String actualURL = driver.getCurrentUrl();
        String expectedUrl = "amazon";

        if (actualURL.contains(expectedUrl)){
            System.out.println(expectedUrl+" icerir,Test PASSED");
        }else {
            System.out.println(expectedUrl+" bulunmadi.Test FAILED");
        }
        driver.close();

    }
}
