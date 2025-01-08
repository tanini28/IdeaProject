package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZazaPrintCatalog {

    public WebDriver driver;
    public ZazaPrintHomePage  zazaPrintHomePage;

    @Test
    public void ZazaPrintMenu() {

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

        driver.quit();

    }
}
