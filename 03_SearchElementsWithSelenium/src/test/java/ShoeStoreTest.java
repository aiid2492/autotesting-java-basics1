import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoeStoreTest {
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
    public void ShoeStoreTest1()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var sizeElement = driver.findElement(By.id("size"));
        var buttonElement = driver.findElement(By.id("check-size-button"));
        var size = "40";
        sizeElement.sendKeys(size);
        buttonElement.click();
        var actualResultElement = driver.findElement(By.tagName("label"));
        Assert.assertEquals("В нашем магазине есть обувь вашего размера", actualResultElement.getText());
    }
    @Test
    public void ShoeStoreTest2()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var sizeElement = driver.findElement(By.id("size"));
        var buttonElement = driver.findElement(By.id("check-size-button"));
        var size = "2";
        sizeElement.sendKeys(size);
        buttonElement.click();
        var actualResultElement = driver.findElement(By.tagName("label"));
        Assert.assertEquals("В нашем магазине нет обуви вашего размера", actualResultElement.getText());
    }
    @Test
    public void ShoeStoreTest3()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var sizeElement = driver.findElement(By.id("size"));
        var buttonElement = driver.findElement(By.id("check-size-button"));
        var size = "";
        sizeElement.sendKeys(size);
        buttonElement.click();
        var actualResultElement = driver.findElement(By.tagName("label"));
        Assert.assertEquals("Введите размер обуви!", actualResultElement.getText());
    }

}
