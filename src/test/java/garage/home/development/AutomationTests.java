package garage.home.development;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationTests extends BaseTest {


    @Test
    public void googleSearch() {


//      find the search field enter search text and click "enter"
        String SearchWord = "automation";
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchWord);
        WebElement searchBtn = driver.findElement(By.xpath("//input[@name='q']"));
        searchBtn.submit();

        //check the title of the result page
        String actualPageTitle = driver.getTitle();
        Assert.assertTrue(actualPageTitle.contains(SearchWord));
    }

    @Test
    public void googleSearchSecondPhrase() {
        String SearchWord1 = "automation tests";
        String SearchedURL = "www.guru99.com";

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchWord1);
        WebElement webElement = driver.findElement(By.xpath("//input[@name='q']"));
        webElement.submit();

        List<WebElement> l = driver.findElements(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/a/div/cite"));
        l.toString().contains(SearchedURL);
    }

}
