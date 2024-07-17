package tests;

import org.junit.Test;
import pageObject.GoogleMainPage;
import pageObject.GoogleResultsPage;

import static org.junit.Assert.assertTrue;

public class AutomationTests extends BaseTest {


    @Test
    public void googleSearch() {
        String searchWord = "automation";

        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.search(searchWord);

        assertTrue(googleMainPage.getTitle().contains(searchWord));
    }

    @Test
    public void googleSearchSecondPhrase() {
        String searchWord = "automation tests";
        String searchedURL = "https://www.getxray.app";

        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.search(searchWord);

        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        boolean isLinkWithSearchedUrlPresent = googleResultsPage.isAnyLinkContainsUrl(searchedURL);

        assertTrue("Our searched URL is not present in any link", isLinkWithSearchedUrlPresent);
    }
}
