package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    public static void main(String[] args) throws InterruptedException {
        registration();
        passwordnotMatch();
    }
    //input correct data for registration form

    //the data here will be different from the data in the test cases excel documents
    // because I have already created a user with this data
    private static void registration() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Registration")).click();
        driver.findElement(By.name("firstName")).sendKeys("Aanya");
        driver.findElement(By.name("lastName")).sendKeys("Tooletowa");
        driver.findElement(By.name("dateOfBirth")).sendKeys("16/06/1994");
        driver.findElement(By.name("email")).sendKeys("aanyatest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("passwordConfirmation")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type=submit]")).submit();
        Thread.sleep(5000);
        driver.quit();
    }

    //input different passwords for registration form
    private static void passwordnotMatch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Registration")).click();
        driver.findElement(By.name("firstName")).sendKeys("Anya");
        driver.findElement(By.name("lastName")).sendKeys("Toletowa");
        driver.findElement(By.name("dateOfBirth")).sendKeys("16/06/1994");
        driver.findElement(By.name("email")).sendKeys("anyatest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1234567");
        driver.findElement(By.name("passwordConfirmation")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type=submit]")).submit();
        Thread.sleep(5000);
        driver.quit();
    }

}
