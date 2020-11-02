package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DailyReflectionsPage extends BasePage{

    public DailyReflectionsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//article/center")
    private WebElement reflectionTitle;

    @FindBy(xpath="//article/b")
    private WebElement reflectionQuote;

    @FindBy(xpath="//article/div/font/i")
    private WebElement reflectionSource;
    //takes only first occurrence, the one we care about

    @FindBy(xpath="//article")
    private WebElement reflectionText;
}
