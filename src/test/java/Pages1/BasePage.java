package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для відкриття URL
    public void openUrl(String url) {
        System.out.println("Відкриття сторінки: " + url);
        driver.get(url); // Відкриваємо сторінку через драйвер
    }

    // Загальний метод для знаходження елементів за XPath
     public WebElement findElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    // Загальний метод для кліку на елемент
    public void clickElementByXpath(String xpath) {
        findElementByXpath(xpath).click();
    }

    // Загальний метод для введення тексту в поле
    public void sendKeysToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }

}