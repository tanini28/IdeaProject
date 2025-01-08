package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OgoTourContacts {

    public WebDriver driver;
    public OgoTourHomePage ogoTourHomePage;

    @Test
    public void OgoTourContact () {

        driver = new ChromeDriver();
        ogoTourHomePage = new OgoTourHomePage(driver);
        driver.manage().deleteAllCookies();

        ogoTourHomePage.OpenHomePage();
        ogoTourHomePage.enterName("Марина");
        ogoTourHomePage.enterLastName("Кокора");
        ogoTourHomePage.enterEmail("kokora@example.com");
        ogoTourHomePage.enterMessage("Хочу поїхати в Єгипет, надішліть варіанти");
        ogoTourHomePage.clickSubmitButton();

        Assert.assertTrue( ogoTourHomePage.isSuccessMessageDisplayed(),"Повідомлення про успіх не відображено");

        String expectedMessage = "Дякуємо за ваше звернення! З вами зв'яжутся найближчим часом.";
        Assert.assertEquals("Текст повідомлення про успіх не співпадає", expectedMessage, ogoTourHomePage.getSuccessMessageText());
    }
}



