package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.security.IdentityScope;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mercadolibre.com/");
        driver.manage().window().maximize();
    }

        WebElement inputBO = driver.findElement(By.id("BO"));
        inputBO.click();

        WebElement cookie = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]"));
        cookie.click();
        WebElement cerrarSms = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/button"));
        cerrarSms.click();

        WebElement buscar = driver.findElement(By.name("as_word"));
        buscar.sendKeys("celular Iphone 13");
        buscar.submit();

        WebElement iphoneRojo = driver.findElement(By.text("Brand New iPhone 13 Available For Sell  :+1314470545"));
        iphoneRojo.click();
        WebElement nuevo = driver.findElement(By.className("ui-pdp-header__subtitle"));
        usado.click();


        WebElement buscar = driver.findElement(By.name("as_word"));
        buscar.sendKeys("celular Iphone 13");
        buscar.submit();

        boolean elementExists;
        boolean element2;
        boolean element3;

            elementExists = driver.findElements(By.xpath("//*[@id='root-app']/div/ol/li[1]/div/div/div/div/div[2]/a/div/div[1]/h2/text()")).size() != 0;
            element2 = driver.findElements(By.xpath("//*[@id='root-app']/div/ol/li[2]/div/div/div/div/div[2]/a/div/div[1]/h2")).size() != 0;
            element3 = driver.findElements(By.xpath("//*[@id='root-app']/div/ol/li[3]/div/div/div/div/div[2]/a/div/div[1]/h2")).size() != 0;

        driver.quit();
    }

        public static void main(String[] args) {
            BaseTest baseTest = new BaseTest();
            baseTest.setUp();
        }
}
