import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteHelloTests32 {
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
    public void testsHello()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Соловьев Виталий");
        driver.findElement(By.name("email")).sendKeys("test@skilbox.ru");
        driver.findElement(By.name("phone")).sendKeys("+77263622717");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Соловьев Виталий.\n" +
                "На вашу почту (test@skilbox.ru) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: +77263622717.";
        Assert.assertEquals("Неправильный текст приветствия", expectedResult, actualResult);
    }

    @Test
    public void testSiteHello()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("phone")).sendKeys("");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, .\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .";
        Assert.assertEquals("Неправильный текст приветствия", expectedResult, actualResult);
    }
    @Test
    public void testsHello2()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Соловьев Виталий");
        driver.findElement(By.name("email")).sendKeys("skillbox");
        driver.findElement(By.name("phone")).sendKeys("Армада");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Соловьев Виталий.\n" +
                "На вашу почту (skillbox) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: Армада.";
        Assert.assertEquals("Неправильный текст приветствия", expectedResult, actualResult);
    }
    @Test
    public void testsHello3()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("!@#$%%");
        driver.findElement(By.name("email")).sendKeys("!@$%%^");
        driver.findElement(By.name("phone")).sendKeys("!@#$$%^");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, !@#$%%.\n" +
                "На вашу почту (!@$%%^) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: !@#$$%^.";
        Assert.assertEquals("Неправильный текст приветствия", expectedResult, actualResult);
    }
    @Test
    public void testsHello4()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("123456");
        driver.findElement(By.name("email")).sendKeys("123456");
        driver.findElement(By.name("phone")).sendKeys("123456");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, 123456.\n" +
                "На вашу почту (123456) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: 123456.";
        Assert.assertEquals("Неправильный текст приветствия", expectedResult, actualResult);
    }
}
