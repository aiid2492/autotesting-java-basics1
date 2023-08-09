import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practical_work_8_Test {
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
    public void search_element_home_theater_site_Tests()
    {
        driver.navigate().to("http://qa.skillbox.ru/module19/");
        var locator11 = By.xpath("//span[@class = 'da-arrows-prev']"); //Кнопка перехода к предыдущему объявлению в слайдере «<». <span class="da-arrows-prev"></span>
        var locator12 = By.xpath("//a[@class = 'da-link button']"); //Кнопка «Узнать больше» в слайдере. Используйте поиск сразу по двум классам. <a href="#" class="da-link button">Узнать больше</a>
        var locator14 = By.xpath("//a[@href = '#noAction']"); //Все неактивные фильтры из раздела фильмов, которые есть в онлайн-кинотеатре.
        var locator15 = By.xpath("//*[starts-with(@class, 'button')]"); //Все элементы, у которых класс начинается на слова button.
        var locator16 = By.xpath("//*[text()='Подписаться сейчас']"); // Кнопка «Подписаться сейчас».
        var locator17 = By.xpath("//ul[contains(@id,'clint-slider')]/li"); //Все картинки клиентов из раздела «Наши клиенты». Для уточнения локатора используйте указание ближайшего родительского элемента с ID
        var locator18 = By.xpath("//*[@id='price']//following-sibling::li[@class='price']"); // Необязательное задание. Все элементы с ценами тарифов, следующих после тарифа «Любительский».
        var locator19 = By.xpath("//*[@id='contact-form']//following-sibling::*[@class='span12']"); //Необязательное задание. Все поля для ввода в форме «Скажите “Привет”», которые предшествуют полю «* Текст сообщения».
        Assert.assertEquals(1, driver.findElements(locator11).size());
        Assert.assertEquals(3, driver.findElements(locator12).size());
        Assert.assertEquals(4,driver.findElements(locator14).size());
        Assert.assertEquals(7,driver.findElements(locator15).size());
        Assert.assertEquals(1,driver.findElements(locator16).size());
        Assert.assertEquals(17,driver.findElements(locator17).size());
        Assert.assertEquals(3,driver.findElements(locator18).size());
        Assert.assertEquals(3, driver.findElements(locator19).size());
    }
    @Test
    public void search_element_online_institut_site_Tests()
    {
        driver.navigate().to("http://qa.skillbox.ru/module16/maincatalog/");
        var locator21 = By.xpath("//*[text()='Алфавит для взрослых (обновлённый материал)']");  //Заголовок пятого курса.
        var locator22 = By.xpath("(//*[text()='7 месяцев'])[6]"); // Элемент с учебным периодом последнего курса.
        var locator23 = By.xpath("//*[@href='#']/.."); //Необязательное задание. Все div, которые являются непосредственными родителями для ссылок с href='#'.
        var locator24 = By.xpath("(//*[@href='#']/..)[5]"); // Необязательное задание. Преобразуйте предыдущий локатор, чтобы он возвращал пятый элемент.
        var locator25 = By.xpath("(//*[text()='Все курсы'])/ancestor::*"); //Необязательное задание. Все родительские элементы заголовка «Все курсы».
        Assert.assertEquals("Алфавит для взрослых (обновлённый материал)", driver.findElement(locator21).getText());
        Assert.assertEquals("7 месяцев", driver.findElement(locator22).getText());
        Assert.assertEquals(8, driver.findElements(locator23).size());
        Assert.assertEquals(1, driver.findElements(locator24).size());
        Assert.assertEquals(7, driver.findElements(locator25).size());
    }
    @Test
    public void search_element_home_theater_site_Tests2()
    {
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
        var locator31 = By.xpath("(//a[@href])[last()]"); //Ссылка «О магазине» в футере.
        var locator32 = By.xpath("(//*[.='Бестселлеры'])[4]"); //Заголовок «Бестселлеры».
        var locator33 = By.xpath("//input[@id='search-input']"); //Строка поиска
        Assert.assertEquals("О магазине", driver.findElement(locator31).getText());
        Assert.assertEquals("Бестселлеры", driver.findElement(locator32).getText());
        Assert.assertEquals(1, driver.findElements(locator33).size());
    }
    @Test
    public void search_elementTrash_home_theater_site_Tests3()
    {
        driver.navigate().to("http://qajava.skillbox.ru/checkout.html");
        var locator34 = By.xpath("//*[text()='Ваш заказ: ']"); // Заголовок «Ваш заказ: в корзине.
        var locator35 = By.xpath("//*[@id='total']"); // Итоговая сумма заказа в корзине.
        Assert.assertEquals("Ваш заказ:", driver.findElement(locator34).getText());
        Assert.assertEquals("Итого: 0р.", driver.findElement(locator35).getText());
    }
    @Test
    public void search_cancelButton_home_theater_site_Tests4()
    {
        driver.navigate().to("http://qajava.skillbox.ru/search.html");
        var locator36 = By.xpath("//*[text()='Отменить']"); // Кнопка «Отменить» на странице поиска.
        Assert.assertEquals("Отменить", driver.findElement(locator36).getText());

    }
}
