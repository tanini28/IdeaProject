package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.OgoTourHomePage;

import static org.testng.Assert.assertEquals;

public class OgoTourHotTest extends TestInit{

    public WebDriver driver;
    public OgoTourHomePage ogoTourHomePage;

    @Test
    public void ogoTourHotTest (){

        OgoTourHomePage ogoTourHomePage = new OgoTourHomePage(driver);
        ogoTourHomePage.openHomePage();

        ogoTourHomePage.clickHotTour();
        ogoTourHomePage.clickTourAlbania();
        ogoTourHomePage.clickLogoTour();
        ogoTourHomePage.clickCountry();
        ogoTourHomePage.clickOnSearchField();
        Assert.assertTrue(ogoTourHomePage.isDropdownDisplayed("//*[@id='ui-id-1']/li[2]"), "Випадаючий список не відображається після кліку на поле пошуку.");

        ogoTourHomePage.selectCountryFromDropdown("//*[@id='ui-id-1']/li[2]");

        String expectedUrl = "https://ogotour.com.ua/hotels/australia/";
        String currentUrl = driver.getCurrentUrl();

        assertEquals("Перехід на сторінку Австралії не вдалось!", expectedUrl, currentUrl);

    }
}
