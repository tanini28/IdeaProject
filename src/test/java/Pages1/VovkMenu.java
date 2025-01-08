package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VovkMenu {

    public WebDriver driver;
    public VovkHomePage vovkHomePage;

    @Test
    public void VovkMenu1() {

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

        driver.quit();
    }
}
