package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OgoTourSearch {

    public WebDriver driver;
    public OgoTourHomePage ogoTourHomePage;

    @Test
    public void OgoTourSearch1(){

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
