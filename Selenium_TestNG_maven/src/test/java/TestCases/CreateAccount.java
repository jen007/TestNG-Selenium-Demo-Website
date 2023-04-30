package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccount {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test (priority = 1)
    public void RegisterWithValidCredentials() throws InterruptedException {
        driver.findElement(By.id("input-firstname")).sendKeys("Harry");
        driver.findElement(By.id("input-lastname")).sendKeys("Potter");
        driver.findElement(By.id("input-email")).sendKeys("Harrypotter@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("#Harry4Style007");
        Thread.sleep(500);
    }
    @Test (priority = 2)
    public void ConfirmSubscription()throws InterruptedException {
        driver.findElement(By.id("input-newsletter-no")).click();
        Thread.sleep(500);
    }
    @Test (priority = 3)
    public void ConfirmRuleandPolicy()throws InterruptedException {
        driver.findElement(By.className("form-check-input")).click();
        Thread.sleep(500);
    }
    @Test (priority = 4)
    public void ConfirmRegistation() {
        driver.findElement(By.cssSelector("button[class ='btn btn-primary']")).click();
    }

}