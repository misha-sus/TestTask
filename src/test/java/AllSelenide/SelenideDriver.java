package AllSelenide;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.concurrent.TimeUnit;

public class SelenideDriver {

    private static RemoteWebDriver driver;
    private static WebElement element;


    //открывает сайт
    public static void open(String URL) {
        try {
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(URL);
        } catch (Exception e) {
            close();
        }
    }
    // локтор xpath
    public static WebElement $x(String xpath) {
        try {
            element = driver.findElement(By.xpath(xpath));
        } catch (Exception e) {
            close();
        }
        return element;
    }
    //локатор CSS
    public static WebElement $(String cssSelector) {
        try {
            element = driver.findElement(By.cssSelector(cssSelector));
        } catch (Exception e) {
            close();
        }
        return element;
    }
     //закрывает браузер
    public static void close() {
        driver.quit();
    }
}
