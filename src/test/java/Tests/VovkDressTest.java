package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.VovkHomePage;

public class VovkDressTest {

    public WebDriver driver;
    public VovkHomePage vovkHomePage;

    @Test
    public void dressTest() {
        driver = new ChromeDriver();
        vovkHomePage = new VovkHomePage(driver);

        vovkHomePage.openHomePage();

        vovkHomePage.clickSearchButton();
        vovkHomePage.enterSearchText("сукня");
        vovkHomePage.clickSearchSubmitButton();

        Assert.assertTrue(driver.getTitle().contains("сукня"), "Сторінка не завантажилась");

        vovkHomePage.clickProduct();

        Assert.assertTrue(driver.getTitle().contains("Сукня лляна"), "Сторінка продукту не завантажилась");
        vovkHomePage.selectSize();
        vovkHomePage.addToCart();
        vovkHomePage.goToCart();

        Assert.assertTrue(vovkHomePage.isProductInCart(), "Продукт не знайдений у кошику");


    }
}
