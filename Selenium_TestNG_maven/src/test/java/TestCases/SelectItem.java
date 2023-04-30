package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectItem {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test (priority = 1)
    public void ItemSelectFromHomePage() throws Exception{
        driver.findElement(By.cssSelector("img[alt='iPhone 6']")).click();
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href=\"https://demo.opencart.com/index.php?route=checkout/cart&language=en-gb\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img[alt='Your Store']")).click();
        Thread.sleep(1000);
    }
    @Test (priority = 2)
    public void ItemSelectFromHomePage_2() throws Exception{
        driver.findElement(By.cssSelector("img[alt='Canon EOS 5D']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img[src=\"https://demo.opencart.com/image/cache/catalog/demo/canon_eos_5d_2-74x74.jpg\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class=\"mfp-close\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img[alt='Your Store']")).click();
        Thread.sleep(1000);
    }
    @Test (priority = 3)
    public void ItemSelectFromHomePage_3() throws Exception{
        driver.findElement(By.cssSelector("img[alt=\"iPhone\"]")).click();
        int millis = 1000;
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("img[src='https://demo.opencart.com/image/cache/catalog/demo/iphone_4-74x74.jpg']")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("img[alt='Your Store']")).click();
        Thread.sleep(millis);
    }
    @Test (priority = 3)
    public void ItemSelectFromHomePage_4() throws Exception{
        driver.findElement(By.cssSelector("img[alt=\"MacBook\"]")).click();
        int millis = 1000;
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("img[src='https://demo.opencart.com/image/cache/catalog/demo/macbook_3-74x74.jpg']")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-arrow mfp-arrow-right mfp-prevent-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("button[class=\"mfp-close\"]")).click();
        Thread.sleep(millis);
        driver.findElement(By.cssSelector("img[alt='Your Store']")).click();
        Thread.sleep(millis);
    }

}
