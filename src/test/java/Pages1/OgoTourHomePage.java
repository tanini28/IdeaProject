package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OgoTourHomePage extends BasePage {


    public OgoTourHomePage(WebDriver driver) {
        super(driver);
    }

    Actions actions;


    public void OpenHomePage() {
        openUrl("https://ogotour.com.ua/");
    }

    //Test1
    public void clickHotTour(){
        driver.findElement(By.xpath("//li[@id='menu-item-1206337']")).click();
    }

    public void clickTourAlbania(){
        driver.findElement(By.xpath("//a[@class='popular-link' and text()='гарячі тури в Албанію'])")).click();
    }

    public void clickLogoTour(){
        driver.findElement(By.xpath("//a[@class='logo']")).click();
    }

    public void clickCountry(){
        driver.findElement(By.xpath("//li[@id='menu-item-1105384']")).click();
    }

    public void clickOnSearchField(){
        driver.findElement(By.xpath("//input[@type='text']")).click();
    }

    public boolean isDropdownDisplayed(String dropdown) {
        return driver.findElement(By.xpath("//*[@id='ui-id-1']/li[2]")).isDisplayed();
    }

    public void selectCountryFromDropdown(String countryName) {
        driver.findElement(By.xpath("//*[@id='ui-id-1']/li[2]")).click();
    }

    public void navigateToAustralia() {
        clickOnSearchField();
        selectCountryFromDropdown("//*[@id='ui-id-1']/li[2]");
    }

    //test2


    public void hoverAndSelectEuropeTours() {
        WebElement menuElement = driver.findElement(By.xpath("//a[text()='Всі тури']"));
        actions.moveToElement(menuElement).perform();
        WebElement europeOption = driver.findElement(By.xpath("//li[@id='menu-item-1154378']"));
        europeOption.click();
    }

    public void selectCountry(String countryName) {
        WebElement searchField = driver.findElement(By.xpath("//input[@id='location']"));
        searchField.click();
        searchField.sendKeys(countryName);
        WebElement countryOption = driver.findElement(By.xpath("//*[@id='ui-id-554']/span/b"));
        countryOption.click();
    }

    public boolean isCountrySelected(String countryName) {
        WebElement selectedCountry = driver.findElement(By.xpath("//*[@id='ui-id-554']/span/b"));
        return selectedCountry.getAttribute("Єгипет").equals(countryName);
    }

    public void clickOk(){
        driver.findElement(By.xpath("//span[text()='ок']")).click();
    }

    public void clickFind(){
        driver.findElement(By.xpath("//button[@class='new_f-form-submit']")).click();
    }


    //test3
    public void clickContacts(){
        driver.findElement(By.xpath("//li[@id='menu-item-1154381']")).click();
    }

    public void enterName(String name) {
        WebElement nameField = driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']"));
        nameField.sendKeys(name);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameField = driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-text']"));
        lastNameField.sendKeys(lastName);
    }


    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-email wpcf7-validates-as-required wpcf7-text wpcf7-validates-as-email']"));
        emailField.sendKeys(email);
    }

    public void enterMessage(String message) {
        WebElement messageField = driver.findElement(By.xpath("//textarea[@placeholder='Введіть текст повідомлення']"));
        messageField.sendKeys(message);
    }


    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Відправити']"));
        submitButton.click();
    }

    //успішна відправка
    public boolean isSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='form__success-info']"));
        return successMessage.isDisplayed();
    }

    public String getSuccessMessageText() {
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='form__success-info']"));
        return successMessage.getText();
    }

}
