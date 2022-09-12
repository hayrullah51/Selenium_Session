import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Navigateethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().to("https://www.techproeducation.com");
        //Tekrar amazon sayfasina donelim
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver.navigate().back();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver.navigate().forward();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

        driver.navigate().refresh();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver.close();
    }
}
