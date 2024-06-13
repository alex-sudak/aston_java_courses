import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsByTest {

    static WebDriver driver;

    @BeforeAll
    static void webDriverSetup() {

//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();
 //       WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://mts.by");

//        WebElement cooAgreed = driver.findElement(By.id("cookie-agree"));
    }

    @Test
    public void titleTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        //       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mts.by");
//        WebDriverWait wait = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='Подробнее о сервисе']")));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/main/div/div[2]")));
        WebElement frame = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]"));
        driver.switchTo().frame(frame);
        WebElement cooAgreed = driver.findElement(By.id("cookie-agree"));

        WebElement title = driver.findElement(By.id("pay-section"));
        Assertions.assertEquals(title.getText(), "Онлайн пополнение ");
    }

    @Test
    public void payLogos() {
        WebElement visaLogo = driver.findElement(By.xpath("//img[@alt='Visa']"));
        Assertions.assertTrue(visaLogo.isDisplayed());

        WebElement verifiedByVisa = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        Assertions.assertTrue(verifiedByVisa.isDisplayed());

        WebElement masterCardLogo = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        Assertions.assertTrue(masterCardLogo.isDisplayed());

        WebElement masterCardSecureLogo = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        Assertions.assertTrue(masterCardSecureLogo.isDisplayed());

        WebElement belcardLogo = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        Assertions.assertTrue(belcardLogo.isDisplayed());
    }

    @Test
    public void aboutService() {
        WebElement serviceInformation = driver.findElement(By.xpath("//a[@href='Подробнее о сервисе']"));
        serviceInformation.click();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals(url, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Test
    public void continueButton() {
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='Подробнее о сервисе']")));
        WebElement phone = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phone.click();
        phone.sendKeys("297777777)");

        WebElement money = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        money.click();
        money.sendKeys("1");

        WebElement email = driver.findElement(By.xpath("//input[@id='connection-email']"));
        email.click();
        email.sendKeys("test123123123@mail.ru");

        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        button.click();

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frame);

        WebElement pay = driver.findElement(By.xpath("//a[@href='https://bepaid.by']"));
        pay.isDisplayed();
    }

    @AfterAll
    public static void closeSession() {
        driver.close();
        driver.quit();
    }
}