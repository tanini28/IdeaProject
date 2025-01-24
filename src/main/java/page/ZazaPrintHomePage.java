package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ZazaPrintHomePage extends BasePage {


    public ZazaPrintHomePage(WebDriver driver) {

        super(driver);
    }

    public void openHomePage() {
        driver.get("https://zaza-print.com.ua/");
    }

    //test1
    public void checkMainBanner() {
        System.out.println("Перевірка головного банера на Zaza Print");
    }

    public void clickPrintCatalog(){
        driver.findElement(By.xpath("//a[@title='Каталог продукції']")).click();
    }

    public void clickProduct(){
        driver.findElement(By.xpath("//a[@href='https://zaza-print.com.ua/catalog/reklamna-ta-imidzheva-produktsiia/']")).click();
    }
    public void clickVizytky(){
        driver.findElement(By.xpath("//a[@href='https://zaza-print.com.ua/catalog/vizytky/']")).click();
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(By.xpath("//b[contains(., '(0352)') and contains(., '22-05-04')]"));
    }

    public void assertPhoneNumber() {
        WebElement phoneNumber = getPhoneNumber();
        Assert.assertTrue(phoneNumber.isDisplayed(), "Номер телефону не відображається");
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//a[@href='mailto:zaza.print@gmail.com' and @class='blue']"));
    }
    public void assertEmail() {
        WebElement email = getEmail();
        Assert.assertTrue(email.isDisplayed(), "Email не відображається");
    }

    public void clickLogoImage(){
        driver.findElement(By.xpath("//a[@class='logo' and @href='https://zaza-print.com.ua/']")).click();
    }

    public void clickDropDown(){
        driver.findElement(By.xpath("//div[@class='dropdown']")).click();
    }

    public void clickCity(){
        driver.findElement(By.xpath("//a[@href='#tab-city-3']")).click();
    }

    //test2

    public void enterSearchText(String text) {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(text);
    }

    public void clickSearchSubmitButton() {
        driver.findElement(By.xpath("//a[@onclick='document.getElementById('SearchForm').submit(); return false;']")).click();
    }

    public void setResultText(){
    WebElement resultText = driver.findElement(By.xpath("//div/h1[@class='main-title'])]"));
        Assert.assertTrue(resultText.isDisplayed(), "Текст з результатами пошуку не відображається");
    }

    public void assertFlyersLink() {
        WebElement flyersLink = driver.findElement(By.linkText("Флаєри"));

        Assert.assertTrue(flyersLink.isDisplayed(), "Посилання 'Флаєри' не відображається");

        String expectedUrl = "https://zaza-print.com.ua/catalog/flaiery/";
        Assert.assertEquals(flyersLink.getAttribute("href"), expectedUrl, "Посилання веде не на ту сторінку");
    }

    //test3

    public void clickAboutUs() {
        WebElement aboutUsLink = driver.findElement(By.xpath("//a[contains(text(),'Про нас')]"));
        aboutUsLink.click();
    }

    public boolean isCompanyInfoAvailable() {
        WebElement companyInfo = driver.findElement(By.className("//h1[@class='main-title']"));
        return companyInfo.isDisplayed();
    }

    public boolean isVideoLinkAvailable() {
        try {
            WebElement videoLink = driver.findElement(By.xpath("//a[contains(@href, 'https://www.youtube.com/watch?v=wHvp3ul3pXs')]"));
            return videoLink.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickVideoLink() {
        WebElement videoLink = driver.findElement(By.xpath("//a[contains(@href, 'https://www.youtube.com/watch?v=wHvp3ul3pXs')]"));
        videoLink.click();
    }

    public boolean isVideoPageOpened() {
        wait.until(ExpectedConditions.urlContains("youtube.com"));
        return driver.getCurrentUrl().contains("youtube.com");
    }

    public void clickMainLogoImage(){
        WebElement mainLogo = driver.findElement(By.xpath("//div[@class='logo-block']"));
    }


}

