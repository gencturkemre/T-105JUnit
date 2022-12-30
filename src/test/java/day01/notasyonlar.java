package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class notasyonlar {

    WebDriver driver;

    String https = "https://www.";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {

        //driver.close();
        driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.amazon.com");
        //driver.get(https+"google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to(https+"google.com");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println(driver.getWindowHandle());
        Thread.sleep(1000);
        driver.navigate().forward();
        System.out.println(driver.getWindowHandle());
        Thread.sleep(1000);
        driver.navigate().refresh();
    }

    @Test
    public void test02() throws InterruptedException {

        driver.get("https://www.google.com");
        String ilkSayfaHandleDegeri=driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(1000);
        driver.navigate().to(https+"amazon.com");
        Thread.sleep(1000);
        System.out.println(driver.getWindowHandles());
        driver.switchTo().window(ilkSayfaHandleDegeri);
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(https+"wiswquarter.com");


























    }


}
