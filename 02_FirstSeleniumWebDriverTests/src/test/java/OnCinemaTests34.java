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
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        var emailElement = driver.findElement(By.className("form-input"));
        var passwordElement = driver.findElement(By.id("password"));
        var passwordConfirmElement = driver.findElement(By.name("confirm_password"));
        var buttonElement = driver.findElement(By.tagName("button"));
        var headerResultElement = driver.findElement(By.tagName("h3"));
        var password = "123456";
        var email = "test@skillbox.ru";
        emailElement.sendKeys(email);
        passwordElement.sendKeys(password);
        passwordConfirmElement.sendKeys(password);
        buttonElement.click();
        var emailResultElement = driver.findElement(By.linkText(email));
        var emailResultElement2 = driver.findElement(By.partialLinkText(email));
        Assert.assertEquals("неверный текст при успешной регистрации", "Спасибо за регистрацию!", headerResultElement.getText());
        Assert.assertEquals("неверный email при успешной регистрации", email, emailResultElement.getText());
    }
}
