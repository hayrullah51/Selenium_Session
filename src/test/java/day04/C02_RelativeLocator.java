package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //sayfadaki berlin webelementine tiklayalim relative locator kullanalim
       WebElement NYCWE =  driver.findElement(By.id("pid3_thumb"));
       WebElement BYAreaCWE =  driver.findElement(By.id("pid8_thumb"));
       WebElement berlinWE =  driver.findElement(RelativeLocator.with(By.tagName("img")).below(NYCWE).toLeftOf(BYAreaCWE));
        berlinWE.click();
    }
}
