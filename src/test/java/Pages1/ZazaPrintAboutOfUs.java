package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZazaPrintAboutOfUs {

    public WebDriver driver;
    public ZazaPrintHomePage  zazaPrintHomePage;

    @Test
    public void ZazaPrintAboutOfUs1() {

        driver = new ChromeDriver();
        zazaPrintHomePage = new ZazaPrintHomePage(driver);
        driver.manage().deleteAllCookies();

        zazaPrintHomePage.clickAboutUs();
        zazaPrintHomePage.isCompanyInfoAvailable();
        zazaPrintHomePage.isVideoLinkAvailable();
        zazaPrintHomePage.clickVideoLink();
        zazaPrintHomePage.isVideoPageOpened();
        zazaPrintHomePage.clickLogoImage();

        driver.quit();
    }
}
