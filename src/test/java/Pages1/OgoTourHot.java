package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OgoTourHot {

    public WebDriver driver;
    public OgoTourHomePage ogoTourHomePage;

    @Test
    public void OgoTourHot1 (){

        driver = new ChromeDriver();
        ogoTourHomePage = new OgoTourHomePage(driver);

        ogoTourHomePage.OpenHomePage();

        ogoTourHomePage.clickHotTour();
        ogoTourHomePage.clickTourAlbania();
        ogoTourHomePage.clickLogoTour();
        ogoTourHomePage.clickCountry();
        ogoTourHomePage.clickOnSearchField();
        Assert.assertTrue(ogoTourHomePage.isDropdownDisplayed("//*[@id='ui-id-1']/li[2]"), "Випадаючий список не відображається після кліку на поле пошуку.");

        ogoTourHomePage.selectCountryFromDropdown("//*[@id='ui-id-1']/li[2]");
        ogoTourHomePage.navigateToAustralia();

        String expectedUrl = "https://ogotour.com.ua/hotels/australia/";
        String currentUrl = driver.getCurrentUrl();

        // Перевіряємо, чи поточний URL збігається з очікуваним
        assertEquals("Перехід на сторінку Австралії не вдалось!", expectedUrl, currentUrl);

        driver.quit();
    }
}
