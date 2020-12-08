package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void startBrowser() {
        //driver instance
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mykola_Motyshyn\\Downloads\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //visit google search page
        String URL = "https:\\www.google.com.ua";
        driver.get(URL);
    }

    @After
    public void quit() {
        driver.quit();
    }
}
