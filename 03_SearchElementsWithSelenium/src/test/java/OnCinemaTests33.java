import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnCinemaTests33 {
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
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        var emailElement = driver.findElement(By.className("form-input"));
        var passwordElement = driver.findElement(By.id("password"));
        var passwordConfirmElement = driver.findElement(By.name("confirm_password"));
    }
    @Test
    public void ShoeStoreTest()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var nameElement = driver.findElement(By.name("check"));
        var buttonElement = driver.findElement(By.id("check-size-button"));

    }

}
