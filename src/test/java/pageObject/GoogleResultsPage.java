package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleResultsPage extends BasePage {

    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='yuRUbf']/a")
    public List<WebElement> resultLinks;

    public boolean isAnyLinkContainsUrl(String url) {
        boolean isLinkWithSearchedUrlPresent = resultLinks.stream()
                .map(WebElement::getText)
                .anyMatch(linkText -> linkText.contains(url));
        return isLinkWithSearchedUrlPresent;
    }
}
