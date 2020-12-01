package garage.home.development;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutomationTests {



    private final String URL = "https:\\www.google.com.ua";
    private final String SearchWord = "automation";
    private final String SearchWord1 = "automation tests";
    private final String SearchedURL = "www.guru99.com";
    private WebDriver driver;

    @Test
    public void googleSearch() {
        //driver instance
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mykola_Motyshyn\\Downloads\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //visit google search page
        driver.get(URL);

        //find the search field enter search text and click "enter"
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchWord);
        WebElement searchbtn = driver.findElement(By.xpath("//input[@name='q']"));
        searchbtn.submit();

        //check the title of the result page
        driver.getTitle();
        Assert.assertEquals(SearchWord, "automation");

        driver.findElement(By.xpath("//input[@name='q']")).clear();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchWord1);
        WebElement button = driver.findElement(By.xpath("//div[@class='FAuhyb']"));
        button.click();




//        driver.findElement(By.xpath("//*[contains(text(), \"Уперед\")]")).click();
       List<WebElement> l = driver.findElements(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/a/div/cite"));
       l.toString().compareTo(SearchedURL);

        driver.quit();


    }

}
