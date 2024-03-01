package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        validCredentials();
        invalidCredentials();
    }

    //input correct credentials for login form
    private static void validCredentials() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        driver.findElement(By.name("email")).sendKeys("anyatest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type=submit]")).submit();
        Thread.sleep(5000);
        driver.quit();
    }
    //input incorrect credentials for login form
    private static void invalidCredentials() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        driver.findElement(By.name("email")).sendKeys("anyatest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345679");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type=submit]")).submit();
        Thread.sleep(5000);
        driver.quit();
    }

}
