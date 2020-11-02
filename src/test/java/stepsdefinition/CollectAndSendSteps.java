package stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DailyReflectionsPage;

public class CollectAndSendSteps {

    private WebDriver driver;
    private String dailyReflections;

    @Given("The web browser is open")
    public void theWebBrowserIsOpen() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("User opens aa24 reflections website and stores the text")
    public void userOpensAaReflectionsWebsiteAndStoresTheText() {
        driver.get("https://aa24.pl/pl/codzienne-refleksje");
        DailyReflectionsPage dailyReflectionsPage = new DailyReflectionsPage(driver);
        dailyReflections = dailyReflectionsPage.getDailyReflectionsText();
    }

    @Then("User opens WhatsApp")
    public void userOpensWhatsApp() {
    }

    @And("Sends stored texts")
    public void sendsStoredTexts() {
    }
}
