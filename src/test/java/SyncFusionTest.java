import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SyncFusionTest {

    public WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.syncfusion.com/");
    }

    @Test
    public void signInSQLInject() throws InterruptedException {
        Thread.sleep(3500);
        driver.findElement(By.id("login-btn-menu")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("user-name")).sendKeys("testiranje_mittp@mail.com");
        Thread.sleep(1500);
        driver.findElement(By.id("password")).sendKeys("root') OR 1 = 1 -- ]");
        Thread.sleep(3500);
        driver.findElement(By.cssSelector("#signin-form > form > div.form-field.logon-field > input")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void signInPasswordNone() throws InterruptedException {
        Thread.sleep(3500);
        driver.findElement(By.id("login-btn-menu")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("user-name")).sendKeys("testiranje_mittp@mail.com");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#signin-form > form > div.form-field.logon-field > input")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void signInValid() throws InterruptedException {
        Thread.sleep(3500);
        driver.findElement(By.id("login-btn-menu")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("user-name")).sendKeys("testiranje_mittp@mail.com");
        Thread.sleep(1500);
        driver.findElement(By.id("password")).sendKeys("mittp123");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#check_box")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#signin-form > form > div.form-field.logon-field > input")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void signOut() throws InterruptedException {
        Thread.sleep(3500);
        driver.findElement(By.id("login-btn-menu")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("user-name")).sendKeys("testiranje_mittp@mail.com");
        Thread.sleep(1500);
        driver.findElement(By.id("password")).sendKeys("mittp123");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#check_box")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#signin-form > form > div.form-field.logon-field > input")).click();
        Thread.sleep(3500);
        driver.findElement(By.cssSelector("#menu-signin > div")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#logout-section > div > div > div > div.signout-section > a")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void signUp() throws InterruptedException {
        Thread.sleep(3500);
        driver.findElement(By.id("login-btn-menu")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"signin-form\"]/form/div[6]/p/a")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("CustomerName")).sendKeys("mittp");
        Thread.sleep(1500);
        driver.findElement(By.id("email-address")).sendKeys("testiranje_mittp@mail.com");
        Thread.sleep(1500);
        driver.findElement(By.id("new-password")).sendKeys("mittp123");
        Thread.sleep(1500);
        driver.findElement(By.id("CompanyName")).sendKeys("mittpTest");
        Thread.sleep(1500);
        driver.findElement(By.id("PhoneNumber")).sendKeys("1234567890");
        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.name("IsUserAcceptedPrivacyPolicy")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("create-account")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void passwordLessThan8() throws InterruptedException {
        Thread.sleep(3500);
        driver.findElement(By.id("login-btn-menu")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"signin-form\"]/form/div[6]/p/a")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("CustomerName")).sendKeys("mittp");
        Thread.sleep(1500);
        driver.findElement(By.id("email-address")).sendKeys("testiranje_mittp@mail.com");
        Thread.sleep(1500);
        driver.findElement(By.id("new-password")).sendKeys("mittp");
        Thread.sleep(1500);
        driver.findElement(By.id("CompanyName")).sendKeys("mittp");
        Thread.sleep(1500);
        driver.findElement(By.id("PhoneNumber")).sendKeys("1234567890");
        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.name("IsUserAcceptedPrivacyPolicy")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("create-account")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
