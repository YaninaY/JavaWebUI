package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a program that will open five different pages in new windows
//Write a cycle that will switch through all pages one by one
//For each page, display the name and link to this page in the console.
//And it will close the page whose title contains the word “Zoo”.
public class OpenWebPages {
    public static void main(String[] args) throws InterruptedException {
        long millis = 2000;

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://www.automationpractice.pl/index.php");

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://zoo.waw.pl/");

        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://www.w3schools.com/");

        WebDriver driver4 = new ChromeDriver();
        driver4.get("https://www.clickspeedtester.com/click-counter/");

        WebDriver driver5 = new ChromeDriver();
        driver5.get("https://andersenlab.com/");

        WebDriver[] drivers = {driver1, driver2, driver3, driver4, driver5};
        for (int i = 0; i < drivers.length; i++) {
            WebDriver currentDriver = drivers[i];
            String pageTitle = currentDriver.getTitle();

            System.out.println("Title name: " + pageTitle);
            System.out.println("Link on web site: " + currentDriver.getCurrentUrl());

            if (pageTitle.contains("Zoo")) {
                currentDriver.close();
            }

            Thread.sleep(2000);
        }

        driver1.quit();
        driver2.quit();
        driver3.quit();
        driver4.quit();
        driver5.quit();
    }
}





