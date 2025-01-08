package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VovkRegistration {

    public WebDriver driver;
    public VovkHomePage vovkHomePage;

    @Test
    public void VovkRegistration() {

        driver = new ChromeDriver();
        vovkHomePage = new VovkHomePage(driver);

        vovkHomePage.openHomePage();

        vovkHomePage.clickRegisterLink();
        vovkHomePage.clickRegistrationPage();
        vovkHomePage.enterNameRegister("Іван");
        vovkHomePage.enterTelephone("999999999");
        vovkHomePage.enterEmailRegister("ivan@example.com");
        vovkHomePage.enterPassword("ivan999");
        vovkHomePage.enterConfirmPassword("ivan999");
        vovkHomePage.clickRegisterButton();

        Assert.assertTrue(vovkHomePage.isRegistrationSuccessPageDisplayed(), "Сторінка успішної реєстрації не відображена.");

        vovkHomePage.clickHomeLogo();

        driver.quit();
    }

}

