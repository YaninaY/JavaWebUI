package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyActions {
    public static void main(String[] args) throws InterruptedException {
        searchBar();
    }

    //this is a method that will repeat the actions on the video with the clothing site
    private static void searchBar() throws InterruptedException {
        int millis = 2000;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.name("search_query")).sendKeys("Printed chiffon dress");
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("#searchbox  button[type=submit]")).submit();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("#list")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("[data-id-product='7']")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("a[title=Women]")).click();
        Thread.sleep(millis);
        driver.findElement(By.name("search_query")).sendKeys("Faded Short");
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("#searchbox  button[type=submit]")).submit();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("[data-id-product='1']")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("div.top-pagination-content button")).click();
        Thread.sleep(millis);
        driver.quit();
    }

}
