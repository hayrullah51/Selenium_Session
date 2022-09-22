package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {

        /*
        Amazon sayfasina gidiniz
        arama kutusunu locate ediniz
        arama kutusunun tagname'nin input oldugunu test ediniz
        arama kutusunun  name attribute'nin  degerinin dield-keywords oldugunu test ediniz
         */

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");

        WebElement serchBox = driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(serchBox.getTagName().equals("input") ? "Tag name : 'input', Test PASSED" : "Test FAILED tag name : "+serchBox.getTagName());

        System.out.println(serchBox.equals("input") ? "Tag name : 'input', Test PASSED" : "Test FAILED tag name : "+serchBox.getTagName());




    }
}
