package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    @AfterClass
    public void tearDown() {
       driver.quit();
    }

    @Test
    public void testLoginWithValidCredentials() throws Exception{
        driver.findElement(By.name("email")).sendKeys("user@example.com");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(500);
    }
}

