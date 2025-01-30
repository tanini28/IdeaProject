package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class ZazaPrintHomePage extends BasePage {


    public ZazaPrintHomePage(WebDriver driver) {

        super(driver);
    }

    public void openHomePage() {
        driver.get("https://zaza-print.com.ua/");
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //test1
    private static final String MAIN_BANNER = ("");
    private static final String PRINT_CATALOG_BUTTON =("//a[@title='Каталог продукції']");
    private static final String PRODUCT_BUTTON = ("//a[@href='https://zaza-print.com.ua/catalog/reklamna-ta-imidzheva-produktsiia/']");
    private static final String VIZUTKY_BUTTON = ("//a[@href='https://zaza-print.com.ua/catalog/vizytky/']");
    private static final String PHONE_NUMBER_FIELD = ("//b[contains(., '(0352)') and contains(., '22-05-04')]");
    private static final String EMAIL_FIELD = ("//a[@href='mailto:zaza.print@gmail.com' and @class='blue']");
    private static final String LOGO_IMAGE = ("//a[@class='logo' and @href='https://zaza-print.com.ua/']");
    private static final String DROPDOWN = ("//div[@class='dropdown']");
    private static final String CITY_BUTTON = ("//a[@href='#tab-city-3']");

    public void checkMainBanner() {
        WebElement mainBanner = waitElementToBeVisible(MAIN_BANNER);
        Assert.assertTrue(mainBanner.isDisplayed(), "Головний банер не відображається");
    }

    public void clickPrintCatalog(){
        waitElementToBeVisible(PRINT_CATALOG_BUTTON).click();
    }

    public void clickProduct(){
        waitElementToBeVisible(PRODUCT_BUTTON).click();
    }

    public void clickVizytky(){
        waitElementToBeVisible(VIZUTKY_BUTTON).click();
    }

    public WebElement getPhoneNumber() {
        return waitElementToBeVisible(PHONE_NUMBER_FIELD);
    }

    public void assertPhoneNumber() {
        WebElement phoneNumber = getPhoneNumber();
        Assert.assertTrue(phoneNumber.isDisplayed(), "Номер телефону не відображається");
    }

    public WebElement getEmail() {
        return waitElementToBeVisible(EMAIL_FIELD);
    }
    public void assertEmail() {
        WebElement email = getEmail();
        Assert.assertTrue(email.isDisplayed(), "Email не відображається");
    }

    public void clickLogoImage(){
        waitElementToBeVisible(LOGO_IMAGE).click();
    }

    public void clickDropDown(){
        waitElementToBeVisible(DROPDOWN).click();
    }

    public void clickCity(){
        waitElementToBeVisible(CITY_BUTTON).click();
    }

    //test2
    private static final String SEARCH_TEXT = ("//input[@type='search']");
    private static final String SEARCH_SUBMIT_BUTTON = ("//a[@onclick='document.getElementById('SearchForm').submit(); return false;']");
    private static final String RESULT_TEXT = ("//div/h1[@class='main-title'])]");


    public void enterSearchText(String text) {
       waitElementToBeVisible(SEARCH_TEXT).sendKeys(text);
    }

    public void clickSearchSubmitButton() {
        waitElementToBeVisible(SEARCH_SUBMIT_BUTTON).click();
    }

    public void setResultText(){
    WebElement resultText = waitElementToBeVisible(RESULT_TEXT);
        Assert.assertTrue(resultText.isDisplayed(), "Текст з результатами пошуку не відображається");
    }

    public void assertFlyersLink() {
        WebElement flyersLink = waitElementToBeVisible("Флаєри");

        Assert.assertTrue(flyersLink.isDisplayed(), "Посилання 'Флаєри' не відображається");
        Assert.assertTrue(flyersLink.getAttribute("href").startsWith("https://zaza-print.com.ua/catalog/flaiery/"),
                "Посилання веде не на очікувану сторінку");
    }


    //test3

    private static final String ABOUT_US_LINK = ("//a[contains(text(),'Про нас')]");
    private static final String COMPANY_INFO = ("//h1[@class='main-title']");
    private static final String VIDEO_LINK = ("//a[contains(@href, 'https://www.youtube.com/watch?v=wHvp3ul3pXs')]");
    private static final String MAIN_LOGO_IMAGE = ("//div[@class='logo-block']");


    public void clickAboutUs() {
        waitElementToBeVisible(ABOUT_US_LINK).click();
    }

    public void isCompanyInfoAvailable() {
        waitElementToBeVisible(COMPANY_INFO).isDisplayed();
    }

    public void isVideoLinkAvailable() {
        try {
            waitElementToBeVisible(VIDEO_LINK).isDisplayed();
        } catch (Exception _) {
        }
    }

    public void clickVideoLink() {
        waitElementToBeVisible(VIDEO_LINK).click();
    }

    public void isVideoPageOpened() {
        waitElementToBeVisible(VIDEO_LINK).click();
        wait.until(ExpectedConditions.urlContains("youtube.com"));
    }

    public void clickMainLogoImage(){
        waitElementToBeVisible(MAIN_LOGO_IMAGE).click();
    }


}

