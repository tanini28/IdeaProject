package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZazaPrintSearchFlayers {

    public WebDriver driver;
    public ZazaPrintHomePage  zazaPrintHomePage;

    @Test
    public void ZazaPrintSearch() {

        driver = new ChromeDriver();
        zazaPrintHomePage = new ZazaPrintHomePage(driver);
        driver.manage().deleteAllCookies();

        zazaPrintHomePage.openHomePage();
        zazaPrintHomePage.enterSearchText("Флаєри");
        zazaPrintHomePage.clickSearchSubmitButton();
        zazaPrintHomePage.setResultText();
        zazaPrintHomePage.setResultText();

        driver.quit();

    }
}
