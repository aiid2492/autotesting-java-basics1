import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnCinemaTests34 {
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
    public void OnCinemaTest()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmsElement = driver.findElement(By.name("films"));
        var serialsElement = driver.findElement(By.name("serials"));
        var buttonSaveElement = driver.findElement(By.id("save"));
        var buttontwoElement = driver.findElement(By.id("two"));
        var checkboxElement = driver.findElements(By.className("fake-checkbox"));
        var radiobutElement = driver.findElements(By.className("fake-radiobutton"));
        var buttoninElement = driver.findElement(By.className("section__button"));
        var buttonokElement = driver.findElement(By.id("ok"));
        var films = "Перевозчик";
        var serials = "Ведьмак";
        filmsElement.sendKeys(films);
        serialsElement.sendKeys(serials);
        buttonSaveElement.click();
        buttontwoElement.click();
        checkboxElement.get(1).click();
        radiobutElement.get(2).click();
        buttoninElement.click();
        buttonokElement.click();
        var actualResult = driver.findElement(By.id("best_films"));
        var actualResult1 = driver.findElement(By.id("best_serials"));
        var actualResult2 = driver.findElement(By.id("language"));
        var actualResult3 = driver.findElement(By.id("age"));
        Assert.assertEquals(films, actualResult.getText());
        Assert.assertEquals(serials, actualResult1.getText());
        Assert.assertEquals("С английскими субтитрами", actualResult2.getText());
        Assert.assertEquals("26-30", actualResult3.getText());
    }
    @Test
    public void OnCinemaTest2()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmsElement = driver.findElement(By.name("films"));
        var serialsElement = driver.findElement(By.name("serials"));
        var buttonSaveElement = driver.findElement(By.id("save"));
        var buttontwoElement = driver.findElement(By.id("two"));
        var checkboxElement = driver.findElements(By.className("fake-checkbox"));
        var radiobutElement = driver.findElements(By.className("fake-radiobutton"));
        var buttoninElement = driver.findElement(By.className("section__button"));
        var buttonokElement = driver.findElement(By.id("ok"));
        var films = "";
        var serials = "";
        filmsElement.sendKeys(films);
        serialsElement.sendKeys(serials);
        buttonSaveElement.click();
        buttontwoElement.click();
        buttoninElement.click();
        buttonokElement.click();
        var actualResult = driver.findElement(By.id("best_films"));
        var actualResult1 = driver.findElement(By.id("best_serials"));
        var actualResult2 = driver.findElement(By.id("language"));
        var actualResult3 = driver.findElement(By.id("age"));
        Assert.assertEquals(films, actualResult.getText());
        Assert.assertEquals(serials, actualResult1.getText());
        Assert.assertEquals("", actualResult2.getText());
        Assert.assertEquals("", actualResult3.getText());
    }
    @Test
    public void OnCinemaTest3()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmsElement = driver.findElement(By.name("films"));
        var serialsElement = driver.findElement(By.name("serials"));
        var buttonSaveElement = driver.findElement(By.id("save"));
        var buttontwoElement = driver.findElement(By.id("two"));
        var buttoninElement = driver.findElement(By.className("section__button"));
        var buttonokElement = driver.findElement(By.id("ok"));
        var films = "Перевозчик";
        var serials = "Ведьмак";
        filmsElement.sendKeys(films);
        serialsElement.sendKeys(serials);
        buttonSaveElement.click();
        buttontwoElement.click();
        buttoninElement.click();
        buttonokElement.click();
        var actualResult = driver.findElement(By.id("best_films"));
        var actualResult1 = driver.findElement(By.id("best_serials"));
        var actualResult2 = driver.findElement(By.id("language"));
        var actualResult3 = driver.findElement(By.id("age"));
        Assert.assertEquals(films, actualResult.getText());
        Assert.assertEquals(serials, actualResult1.getText());

    }
}
