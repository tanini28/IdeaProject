package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.OgoTourHomePage;

public class OgoTourSearchTest {

    public WebDriver driver;
    public OgoTourHomePage ogoTourHomePage;

    @Test
    public void ogoTourSearchTest(){

        driver = new ChromeDriver();
        ogoTourHomePage = new OgoTourHomePage(driver);
        driver.manage().deleteAllCookies();

        ogoTourHomePage.OpenHomePage();
        ogoTourHomePage.hoverAndSelectEuropeTours();
        ogoTourHomePage.selectCountry("Єгипет");

        Assert.assertTrue(ogoTourHomePage.isCountrySelected("Єгипет"), "Країна не була вибрана успішно!");

        ogoTourHomePage.clickOk();
        ogoTourHomePage.clickFind();
    }


}
