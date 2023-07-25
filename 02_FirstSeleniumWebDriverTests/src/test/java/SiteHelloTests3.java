import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteHelloTests3 {
    @Test
    public void testsHello()
    {
        System.setProperty("webdiver.chrome.driver", "drivers\\chromedriver.exe");
        var driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Соловьев Виталий");
        driver.findElement(By.name("email")).sendKeys("test@skilbox.ru");
        driver.findElement(By.name("phone")).sendKeys("+77263622717");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Соловьев Виталий.\n" +
                "На вашу почту (test@skilbox.ru) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: +77263622717.";


        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }

    @Test
    public void testSiteHello()
    {
        System.setProperty("webdiver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("phone")).sendKeys("");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, .\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }
    @Test
    public void testsHello2()
    {
        System.setProperty("webdiver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Соловьев Виталий");
        driver.findElement(By.name("email")).sendKeys("skillbox");
        driver.findElement(By.name("phone")).sendKeys("Армада");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Соловьев Виталий.\n" +
                "На вашу почту (skillbox) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: Армада.";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }
    @Test
    public void testsHello3()
    {
        System.setProperty("webdiver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("!@#$%%");
        driver.findElement(By.name("email")).sendKeys("!@$%%^");
        driver.findElement(By.name("phone")).sendKeys("!@#$$%^");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, !@#$%%.\n" +
                "На вашу почту (!@$%%^) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: !@#$$%^.";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }

}
