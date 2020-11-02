package example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.support.FindBy;

public class SearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://aa24.pl/pl/codzienne-refleksje");
    }

    @Test
    public void testGoogleSearch() {
//        WebElement element = driver.findElement(By.name("q"));
//        element.clear();
//
//        element.sendKeys("Testowanie Selenium WebDriver");
//
//        element.submit();
        WebElement reflectionTitle = driver.findElement(By.xpath("//article/center"));
        WebElement reflectionQuote = driver.findElement(By.xpath("//article/b"));
        WebElement reflectionSource = driver.findElement(By.xpath("//article/div/font/i"));
        WebElement reflectionText = driver.findElement(By.xpath("//article"));

        System.out.println(reflectionTitle.getText());
        System.out.println(reflectionQuote.getText());
        System.out.println(reflectionSource.getText());
        System.out.println(reflectionText.getText());
    }
    @After

    public void tearDown() {
//        driver.quit();
    }
}