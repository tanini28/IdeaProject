package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.ZazaPrintHomePage;

public class ZazaPrintAboutOfUsTest extends TestInit{

    public WebDriver driver;
    public ZazaPrintHomePage zazaPrintHomePage;

    @Test
    public void zazaPrintAboutOfUsTest() {

        driver = new ChromeDriver();
        zazaPrintHomePage = new ZazaPrintHomePage(driver);

        driver.manage().deleteAllCookies();

        zazaPrintHomePage.clickAboutUs();
        zazaPrintHomePage.isCompanyInfoAvailable();
        zazaPrintHomePage.isVideoLinkAvailable();
        zazaPrintHomePage.clickVideoLink();
        zazaPrintHomePage.isVideoPageOpened();
        zazaPrintHomePage.clickMainLogoImage();

    }
}
