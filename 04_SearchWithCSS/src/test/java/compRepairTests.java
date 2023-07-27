import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class compRepairTests {
    protected static WebDriver driver;
    @BeforeClass
    public static void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }
    private By nameLocator = By.cssSelector(".data.text");
    private By emailLocator = By.cssSelector(".data.field");
    private By reviewtLocator = By.cssSelector(".field.text");
    private By resultLocator = By.className("message-header");
    private By resultLocator1 = By.cssSelector(".message-description.comment");
    private By sendButtLocator = By.id("comment");
    @Test
    public void compRepairTest()
    {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson3/os.html");
        var name = "Сергей";
        var email = "test@skillbox.ru";
        var review = "Бла бла бла бла бла бла  бла";
        driver.findElement(nameLocator).sendKeys(name);
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(reviewtLocator).sendKeys(review);
        driver.findElement(sendButtLocator).click();
        Assert.assertTrue("Не отобразился текст ", driver.findElement(resultLocator).isDisplayed());
        Assert.assertTrue("Не правильный текст ", driver.findElement(resultLocator1).isDisplayed());
    }
    private By fioLocator = By.cssSelector(".form-input.fio");
    private By streetLocator = By.cssSelector(".data.form-input.street");
    private By numberLocator = By.cssSelector(".form-input.house");
    private By flatLocator = By.cssSelector(".form-input.flat");
    private By dateLocator = By.cssSelector(".form-input.date");
    private By buttonLocator = By.cssSelector(".form-submit");
    private By actualResult = By.cssSelector(".form-result.result");
    @Test
    public void compRepairTest2()
    {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson3/index.html");
        var fio = "Сергей Васильевич";
        var street = "Пушкина";
        var numbHouse = "26";
        var flat = "2";
        var date = "завтра";
        driver.findElement(fioLocator).sendKeys(fio);
        driver.findElement(streetLocator).sendKeys(street);
        driver.findElement(numberLocator).sendKeys(numbHouse);
        driver.findElement(flatLocator).sendKeys(flat);
        driver.findElement(dateLocator).sendKeys(date);
        driver.findElement(buttonLocator).click();
        Assert.assertTrue("Не отобразился текст ", driver.findElement(actualResult).isDisplayed());
    }
}
