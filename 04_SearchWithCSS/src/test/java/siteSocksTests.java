import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class siteSocksTests {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    private By emailLocator = By.id("email");
    private By passwLocator = By.name("password");
    private By buttonLocator = By.cssSelector(".form-submit");
    private By actualResLocator = By.className("form-error-password-email");

    @Test
    public void socksTest() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/index.html");
        var email = "@";
        var password = "123";
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwLocator).sendKeys(password);
        driver.findElement(buttonLocator).click();
        Assert.assertTrue(driver.findElement(actualResLocator).isDisplayed());
        Assert.assertEquals("Некорректный email или пароль", driver.findElement(actualResLocator).getText());
    }
    private By emailLocator1 = By.cssSelector(".form-input.input-data");
    private By passwLocator1 = By.cssSelector(".form-input.password");
    private By buttonLocator1 = By.cssSelector(".form-submit");
    private By actualResLocator1 = By.cssSelector("pre.form-error-password-email");
    @Test
    public void socksTest2() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/changed.html");
        var email1 = "@";
        var password1 = "123";
        driver.findElement(emailLocator1).sendKeys(email1);
        driver.findElement(passwLocator1).sendKeys(password1);
        driver.findElement(buttonLocator1).click();
        Assert.assertTrue(driver.findElement(actualResLocator1).isDisplayed());
        Assert.assertEquals("Некорректный email или пароль", driver.findElement(actualResLocator1).getText());
    }
}
