package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.ZazaPrintHomePage;

public class ZazaPrintSearchFlayersTest extends TestInit{

    public WebDriver driver;
    public ZazaPrintHomePage zazaPrintHomePage;

    @Test
    public void zazaPrintSearchTest() {

        driver = new ChromeDriver();
        zazaPrintHomePage = new ZazaPrintHomePage(driver);
        driver.manage().deleteAllCookies();

        zazaPrintHomePage.openHomePage();
        zazaPrintHomePage.enterSearchText("Флаєри");
        zazaPrintHomePage.clickSearchSubmitButton();
        zazaPrintHomePage.setResultText();
        zazaPrintHomePage.setResultText();



    }
}
