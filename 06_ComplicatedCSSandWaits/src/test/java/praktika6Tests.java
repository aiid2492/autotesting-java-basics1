import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class praktika6Tests {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
    private By taxiTestLocator = By.cssSelector("input:not([id])"); // Найдите тег input, у которого нет атрибута id.
    private By taxiTestLocator1 = By.cssSelector("p[class^='form']:not([class$='error'])"); // Найдите все теги p, у которых одновременно выполняются два условия: 1)class начинается на слово form; 2)class НЕ заканчивается на слово error.
    private By taxiTestLocator2 = By.cssSelector("div.form-inner p.form-row:nth-of-type(1)"); // Найдите <div class="form-inner">, у него найдите первый по счёту элемент такого типа: <p class="form-row">.
    @Test
    public void ordertaxiTest()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module04/practice1/");
        Assert.assertEquals("input", driver.findElement(taxiTestLocator).getTagName());
        Assert.assertEquals(3, driver.findElements(taxiTestLocator1).size());
        Assert.assertEquals("p", driver.findElement(taxiTestLocator2).getTagName());
    }

    private By noteLocator = By.cssSelector(".articlePreview__link");
    private By noteTitleLocator = By.cssSelector("input.baseInput__field");
    private By noteTextLocator = By.cssSelector("textarea.baseTextarea__text");
    private By listTitleLocator = By.cssSelector("div.articlePreview.pageArticle__articlePreview:nth-of-type(1)  p.articlePreview__title");
    private By listTextLocator = By.cssSelector("div.articlePreview.pageArticle__articlePreview:nth-of-type(1)  p.articlePreview__text");
    private By delButtonLocator = By.cssSelector(".pageArticle__button:nth-of-type(2) > svg.pageArticle__icon:nth-of-type(1)");
    private By notelistLocator = By.cssSelector(".articlePreview.pageArticle__articlePreview > .articlePreview__link");
    private By contentLocator = By.cssSelector(".articlePreview.pageArticle__articlePreview");




    @Test
    public void onlineNoteTest() {
        driver.navigate().to("http://qa.skillbox.ru/module15/bignotes/#/statistic");
        driver.findElement(noteLocator).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(noteTitleLocator));
        var noteTitle1Locator = driver.findElement(noteTitleLocator).getAttribute("value");
        var noteText1Locator = driver.findElement(noteTextLocator).getAttribute("value");
        Assert.assertEquals(driver.findElement(listTitleLocator).getText(), noteTitle1Locator);
        Assert.assertEquals(driver.findElement(listTextLocator).getText(), noteText1Locator);
        driver.findElement(delButtonLocator).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(notelistLocator));
        driver.findElement(notelistLocator).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(noteTitle1Locator)));
        driver.findElement(delButtonLocator).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(contentLocator));
        Assert.assertEquals("Элемент не удален", driver.findElements(contentLocator).size(),0);
    }
}
