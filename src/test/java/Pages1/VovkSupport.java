package Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VovkSupport {

    public WebDriver driver;
    public VovkHomePage vovkHomePage;


   @Test
    public void VovkSupport() {

        driver = new ChromeDriver();
        vovkHomePage = new VovkHomePage(driver);

        vovkHomePage.openHomePage();
        vovkHomePage.clickFeedbackButton(); //кнопка зворотного зв'язку.
        vovkHomePage.enterName("Таня"); // ім'я "Таня".
        vovkHomePage.enterEmail("tanyabot28@gmail.com"); //email "tanyabot28@gmail.com".
        vovkHomePage.enterQuestion("Сайт не завжди відкривається, чому?"); //текст питання.
        vovkHomePage.clickSubmitButton();//кнопка "Відправити".


        boolean isRedirected = vovkHomePage.ToContactPage();
        Assert.assertTrue(isRedirected, "Після відправки форми користувач не був перенаправлений на сторінку Контакти!");

        vovkHomePage.clickHomeLogo(); //логотип сайту

        driver.quit();
    }
}
