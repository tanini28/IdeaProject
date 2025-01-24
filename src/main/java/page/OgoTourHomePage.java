package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class OgoTourHomePage extends BasePage {


    public OgoTourHomePage(WebDriver driver) {
        super(driver);
    }

    Actions actions;

    //Test1
    private static final String HOT_TOUR_BUTTON = ("//li[@id='menu-item-1206337']");
    private static final String HOT_TOUR_Albania = ("//a[@class='popular-link' and text()='гарячі тури в Албанію'])");
    private static final String LOGO_TOUR = ("//a[@class='logo']");
    private static final String SELECT_COUNTRY = ("//li[@id='menu-item-1105384']");
    private static final String SEARCH_FIELD =("//input[@type='text']");
    private static final String DROPDOWN =("//*[@id='ui-id-1']/li[2]");
    private static final String COUNTRY_FROM_DROPDOWN =("//*[@id='ui-id-1']/li[2]");


    public void OpenHomePage() {
        driver.get("https://ogotour.com.ua/");
    }

    public void clickHotTour(){
        waitElementToBeVisible(HOT_TOUR_BUTTON).click();
    }

    public void clickTourAlbania(){
        waitElementToBeVisible(HOT_TOUR_Albania).click();
    }

    public void clickLogoTour(){
        waitElementToBeVisible(LOGO_TOUR).click();
    }

    public void clickCountry(){
        waitElementToBeVisible(SELECT_COUNTRY).click();
    }

    public void clickOnSearchField(){
       waitElementToBeVisible(SEARCH_FIELD).click();
    }

    public boolean isDropdownDisplayed(String dropdown) {
        waitElementToBeVisible(DROPDOWN).isDisplayed();
        return false;
    }

    public boolean selectCountryFromDropdown(String countryName) {
        waitElementToBeVisible(COUNTRY_FROM_DROPDOWN).click();
        return false;
    }

    //test2

    private static final String MENU_ALL_TOUR = ("//a[text()='Всі тури']");
    private static final String OPTION_EUROPE = ("//li[@id='menu-item-1154378']");
    private static final String SEARCH_FIELD_COUNTRY = ("//input[@id='location']");
    private static final String COUNTRY_OPTION = ("//*[@id='ui-id-554']/span/b");
    private static final String COUNTRY_SELECTED =("//*[@id='ui-id-554']/span/b");
    private static final String BUTTON_OK =("//span[text()='ок']");
    private static final String BUTTON_FIND =("//button[@class='new_f-form-submit']");


    public void hoverAndSelectEuropeTours() {
        waitElementToBeVisible(MENU_ALL_TOUR);
        actions.perform();
       waitElementToBeVisible(OPTION_EUROPE).click();
    }

    public void selectCountry(String countryName) {
        waitElementToBeVisible(SEARCH_FIELD_COUNTRY).click();
        waitElementToBeVisible(SEARCH_FIELD_COUNTRY).sendKeys(countryName);
        waitElementToBeVisible(COUNTRY_OPTION).click();
    }

    public boolean isCountrySelected(String countryName) {
       waitElementToBeVisible(COUNTRY_SELECTED).getAttribute("Єгипет").equals(countryName);
        return false;
    }

    public void clickOk(){
        waitElementToBeVisible(BUTTON_OK).click();
    }

    public void clickFind(){
        waitElementToBeVisible(BUTTON_FIND).click();
    }


    //test3

    private static final String MENU_CONTACTS = ("//li[@id='menu-item-1154381']");
    private static final String FIRST_NAME_FIELD =  ("//input[@class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']");
    private static final String LAST_NAME_FIELD = ("//input[@class='wpcf7-form-control wpcf7-text']");
    private static final String EMAIL_FIELD = ("//input[@class='wpcf7-form-control wpcf7-email wpcf7-validates-as-required wpcf7-text wpcf7-validates-as-email']");
    private static final String MESSAGE_FIELD = ("//textarea[@placeholder='Введіть текст повідомлення']");
    private static final String SUBMIT_BUTTON = ("//input[@value='Відправити']");
    private static final String SUCCESS_MESSAGE = ("//div[@class='form__success-info']");
    private static final String SUCCESS_MESSAGE_TEXT = ("//div[@class='form__success-info']");


    public void clickContacts(){
        waitElementToBeVisible(MENU_CONTACTS).click();
    }

    public void enterName(String name) {
       waitElementToBeVisible(FIRST_NAME_FIELD).sendKeys(name);
    }

    public void enterLastName(String lastName) {
        waitElementToBeVisible(LAST_NAME_FIELD).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        waitElementToBeVisible(EMAIL_FIELD).sendKeys(email);
    }

    public void enterMessage(String message) {
       waitElementToBeVisible(MESSAGE_FIELD).sendKeys(message);
    }


    public void clickSubmitButton() {
        waitElementToBeVisible(SUBMIT_BUTTON).click();
    }

    public boolean isSuccessMessageDisplayed() {
       waitElementToBeVisible(SUCCESS_MESSAGE).isDisplayed();
        return false;
    }

    public String getSuccessMessageText() {
        return waitElementToBeVisible(SUCCESS_MESSAGE_TEXT).getText();
    }
}
