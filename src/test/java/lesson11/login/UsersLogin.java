package lesson11.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsersLogin {
    @Test(dataProvider = "userData")
    public void Login(String email, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        driver.quit();
    }

    @DataProvider(name = "userData")
    public Object[][] provideUserData() {
        return new Object[][]{
                {"anyatest@gmail.com", "12345678"},
                {"anyatest1@gmail.com", "12345678"},
                {"anyatest2@gmail.com", "12345678"}
        };
    }
}
