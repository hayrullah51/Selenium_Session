package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Workday02 {
    public static void main(String[] args) {
        /*
         Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz...
        WebElement email_textbox = driver.findElement(By.id("session_email"));
        WebElement password_textbox = driver.findElement(By.id("session_password"));
        WebElement signin_button = driver.findElement(By.xpath("//input[@type='submit']"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        email_textbox.sendKeys("testtechproed@gmail.com");
        password_textbox.sendKeys("Test1234!");
        signin_button.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        System.out.println(" Expected user id nin testtechproed@gmail.com var mi ? \n"+(driver.findElement(By.className("navbar-text")).isDisplayed() ? "Test PASSED" : "Test FAILED"));

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        System.out.println("Addresses var mi ?"+driver.findElement(By.linkText("Addresses")).isDisplayed());
        System.out.println("Sign Out var mi ?"+driver.findElement(By.linkText("Sign out")).isDisplayed());

        //3. Sayfada kac tane link oldugunu bulun.
        driver.findElements(By.tagName("a")).stream().forEach(t-> System.out.println(t.getText()));
        System.out.println("Link adedi : "+driver.findElements(By.tagName("a")).stream().count());

        driver.close();
    }
}
