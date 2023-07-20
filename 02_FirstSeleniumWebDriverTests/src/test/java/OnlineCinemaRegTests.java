import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineCinemaRegTests {
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
    public void OnlineCinemaRegTest()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.name("name")).sendKeys("Виталий");
        driver.findElement(By.name("email")).sendKeys("skillbox@test.ru");
        driver.findElement(By.name("password")).sendKeys("qwerty!123");
        driver.findElement(By.className("form-submit")).click();
        var actualResult = driver.findElement(By.className("form-result")).getText();
        var expectedResult = "Вам на почту skillbox@test.ru отправлено письмо";
        Assert.assertEquals("Неправильный текст приветствия", expectedResult, actualResult);
    }
    @Test
    public void OnlineCinemaRegTest1()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.className("form-submit")).click();
        var actualResult = driver.findElement(By.className("form-error")).getText();
        var expectedResult = "Введите имя";
        Assert.assertEquals( expectedResult, actualResult);
    }
}
