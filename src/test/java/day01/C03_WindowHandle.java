import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
    }
}
