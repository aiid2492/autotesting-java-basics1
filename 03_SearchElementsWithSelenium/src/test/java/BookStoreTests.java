import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStoreTests {
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdiver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void BookStoreTest()
    {
        driver.navigate().to("http://qajava.skillbox.ru/");
        var linkElement = driver.findElement(By.linkText("Обратная связь"));
        var linkElement2 = driver.findElement(By.linkText("Предзаказы"));
        var buttonElement = driver.findElement(By.className("book-add"));
        var cartcountElement = driver.findElement(By.id("cart_count"));
        var bookmenuElement = driver.findElement(By.id("genres"));
        var searchElement = driver.findElement(By.name("search-input-form"));
    }
    @Test
    public void BookStoreTest1()
    {
        driver.navigate().to("http://qajava.skillbox.ru/");
        var bookElements = driver.findElements(By.className("book-info"));
        Assert.assertEquals("Неверное количество книг на странице", 15, bookElements.size());

    }
}
