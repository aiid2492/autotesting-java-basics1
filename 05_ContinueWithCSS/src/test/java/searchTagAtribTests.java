import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchTagAtribTests {
    private static WebDriver driver;
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
    @Test
    public void searchTagAttribTest1()
    {
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
        var locator11 = driver.findElement(By.cssSelector("a[test-info='about-us']"));
        var locator12 = driver.findElements(By.cssSelector("a[href='']"));
        var locator14 = driver.findElements(By.cssSelector("div[class='book-price']"));
        var locator15 = driver.findElements(By.cssSelector("button[class^='book']"));
        var locator16 = driver.findElements(By.cssSelector("[class$='main']"));
        var locator17 = driver.findElements(By.cssSelector("a[class*='menu']"));
        var locator21 = driver.findElements(By.cssSelector("footer[id='footer'] > div"));
        var locator22 = driver.findElement(By.cssSelector("li[id='genres'] + *"));
        Assert.assertEquals("О магазине", locator11.getText());
        Assert.assertEquals(3, locator12.size());
        Assert.assertEquals(15,locator14.size());
        Assert.assertEquals(15,locator15.size());
        Assert.assertEquals(1,locator16.size());
        Assert.assertEquals(8,locator17.size());
        Assert.assertEquals(3,locator21.size());
        Assert.assertEquals("Новинки", locator22.getText());
    }
    @Test
    public void searchTagAttribTest2()
    {
        driver.navigate().to("http://qajava.skillbox.ru/search.html");
        var locator13 = driver.findElements(By.cssSelector("option[selected]"));
        var locator23 = driver.findElements(By.cssSelector("div.filter-container ~ *"));
        Assert.assertEquals(2, locator13.size());
        Assert.assertEquals(3, locator23.size());
    }
    @Test
    public void searchTagAttribTest3()
    {
        driver.navigate().to("http://qajava.skillbox.ru/module05/auth/index.html/");
        var locator31 = driver.findElement(By.cssSelector("section.important-section-block[for='main-header-page'] > h1:first-child"));
        var locator32 = driver.findElement(By.cssSelector("form.form[id='login-form'] > *:last-child"));
        var locator33 = driver.findElement(By.cssSelector("body > *:nth-child(3)"));
        var locator34 = driver.findElement(By.cssSelector("div.footer__menuList > a:nth-of-type(1)"));
        var locator35 = driver.findElement(By.cssSelector("div.footer__menu > div.footer__menuList:first-child > a:nth-of-type(1)"));
        Assert.assertEquals("КЛУБ ЛЮБИТЕЛЕЙ", locator31.getText());
        Assert.assertEquals("Войти", locator32.getText());
        Assert.assertEquals("footer", locator33.getTagName());
        Assert.assertEquals("a", locator34.getTagName());
        Assert.assertEquals("С \"ног\"", locator35.getText());
    }
}
