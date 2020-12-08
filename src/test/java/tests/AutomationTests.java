package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObject.GoogleMainPage;
import pageObject.GoogleResultsPage;

public class AutomationTests extends BaseTest {


    @Test
    public void googleSearch() {
        String searchWord = "automation";

        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.search(searchWord);

        Assert.assertTrue(googleMainPage.getTitle().contains(searchWord));
    }

    @Test
    public void googleSearchSecondPhrase() {
        String searchWord = "automation tests";
        String searchedURL = "www.guru99.com";

        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.search(searchWord);

        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        boolean isLinkWithSearchedUrlPresent = googleResultsPage.isAnyLinkContainsUrl(searchedURL);

        Assert.assertTrue("Our searched URL is not present in any link", isLinkWithSearchedUrlPresent);
    }
}
