package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMainPage {

    WebDriver driver;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchField;

    @FindBy(xpath = "//*[contains(text(), 'Gmail')]")
    public WebElement gmail;

    @FindBy(xpath = "//*[@class='content__title']")
    public WebElement title;

    @FindBy(xpath = "//header//*[@class='gb_8e']")
    public WebElement menuTogle;

    @FindBy(xpath = "//*[@id=\"gb\"]//img")
    public WebElement logo;

    @FindBy(xpath = "//*[@class=\"gb_db\"]")
    public WebElement accountInformationMenu;

}
