package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.ZazaPrintHomePage;

public class ZazaPrintCatalogTest extends TestInit {

    public WebDriver driver;
    public ZazaPrintHomePage zazaPrintHomePage;

    @Test
    public void zazaPrintMenuTest() {

        driver = new ChromeDriver();
        zazaPrintHomePage = new ZazaPrintHomePage(driver);
        driver.manage().deleteAllCookies();

        zazaPrintHomePage.openHomePage();

        zazaPrintHomePage.checkMainBanner();
        zazaPrintHomePage.clickPrintCatalog();
        zazaPrintHomePage.clickProduct();
        zazaPrintHomePage.clickVizytky();
        zazaPrintHomePage.getPhoneNumber();
        zazaPrintHomePage.assertPhoneNumber();
        zazaPrintHomePage.getEmail();
        zazaPrintHomePage.assertEmail();
        zazaPrintHomePage.clickLogoImage();
        zazaPrintHomePage.clickDropDown();
        zazaPrintHomePage.clickCity();



    }
}
