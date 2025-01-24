package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.VovkHomePage;

public class VovkMenuTest {

    public WebDriver driver;
    public VovkHomePage vovkHomePage;

    @Test
    public void vovkMenuTest() {

        driver = new ChromeDriver();
        vovkHomePage = new VovkHomePage(driver);

        vovkHomePage.openHomePage();
        vovkHomePage.clickMenu();
        vovkHomePage.clickNovinki();
        vovkHomePage.clickFirstProduct();
        vovkHomePage.clickSize();
        vovkHomePage.clickQuickBuy();
        vovkHomePage.clickOrder();

        Assert.assertTrue(driver.getCurrentUrl().contains("order"));

    }
}
