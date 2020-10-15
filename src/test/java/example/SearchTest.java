package example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class SearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://web.whatsapp.com/");
    }

    @Test
    public void testGoogleSearch() {
//        WebElement element = driver.findElement(By.name("q"));
//        element.clear();
//
//        element.sendKeys("Testowanie Selenium WebDriver");
//
//        element.submit();
    }
    @After

    public void tearDown() {
//        driver.quit();
    }
}