package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a method whose parameters accept two WebElements.
//the method displays information to the console which of the two elements is located higher on the page,
//which element is located to the left on the page, and also which of the elements occupies the largest area.
public class WebPageElementComparator {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");

        // looking for two elements and compare
        WebElement shoppingCartElement = driver.findElement(By.cssSelector("div.shopping_cart > a"));
        WebElement womenElement = driver.findElement(By.cssSelector("a[title=Women]"));

        ElementParameters shoppingCartElementParameters = getElementParameters(shoppingCartElement);
        ElementParameters womenElementParams = getElementParameters(womenElement);

        System.out.println("Element 1 = WomanElement");
        System.out.println("Element 2 = CardElement");
        compareParameter("top space", shoppingCartElementParameters.Y, womenElementParams.Y);
        compareParameter("left space", shoppingCartElementParameters.X, womenElementParams.X);
        compareParameter(
                "square area",
                shoppingCartElementParameters.X * shoppingCartElementParameters.Y,
                womenElementParams.X * womenElementParams.X);

        driver.quit();
    }

    private static ElementParameters getElementParameters(WebElement element) {
        ElementParameters parameters = new ElementParameters();
        parameters.X = element.getLocation().getX();
        parameters.Y = element.getLocation().getY();
        return parameters;
    }

    private static void compareParameter(String parameterName, int value1, int value2) {
        if (value1 < value2) {
            System.out.println("Element 1 has a smaller " + parameterName + " than Element 2.");
        } else if (value1 > value2) {
            System.out.println("Element 1 has a larger " + parameterName + " than Element 2.");
        } else {
            System.out.println("Elements have the same " + parameterName + ".");
        }
    }

    private static class ElementParameters {
        public int X;
        public int Y;
    }
}
