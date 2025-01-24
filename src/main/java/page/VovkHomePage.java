package page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VovkHomePage extends BasePage {

    public VovkHomePage(WebDriver driver) {
        super(driver);
    }

    //локатори test1
   private final String  Search_Button = ("//a[contains(@class, 'bottom-header__tools-search-btn')]");
    private final String  searchInput = ("//input[@name='search' and @placeholder='Пошук' and @class='header-search__field']");
    private final String searchSubmitButton = ("//*[@id='search']/button");
    private final String Product = ("//a[@href='https://vovk.com/ua/suknja-midi-lljana-lajm/' and contains(@class, 'card-hover-link')]");
    private final String sizeSelector = ("//label[text()='XXS-XS']/preceding-sibling::input");
    private final String addToCartButton = ("//div[contains(@class, 'item__button-add') and contains(@class, 'item__button') and text()='Додати в кошик']");
    private final String cartButton = ("//a[@href='https://vovk.com/index.php?route=checkout/cart']");
    private final String cartProduct = ("//font[text()='Сукня міді лляна лайм' and @style='vertical-align: inherit;']");

    //test1
    public void openHomePage() {
        driver.get("https://vovk.com/ua/");
    }

    public void clickSearchButton() {
        waitElementToBeVisible(Search_Button).click();
    }

    public void enterSearchText(String text) {
        waitElementToBeVisible(searchInput).sendKeys(text);
    }

    public void clickSearchSubmitButton() {
        waitElementToBeVisible(searchSubmitButton).click();
    }

    public void clickProduct() {
        waitElementToBeVisible(Product).click();
    }

    public void selectSize() {
        waitElementToBeVisible(sizeSelector).click();
    }

    public void addToCart() {
        waitElementToBeVisible(addToCartButton).click();
    }

    public void goToCart() {
        waitElementToBeVisible(cartButton).click();
    }

    public boolean isProductInCart() {
        try {
            return waitElementToBeVisible(cartProduct).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //test2

    private final String feedbackButton = "//a[@href='https://vovk.com/ua/contacts/']";
    private final String emailInput = "//*[@id='input-email']";
    private final String questionTextarea = "//*[@id='input-enquiry']";
    private final String submitButton = "//input[@class='button__contact' and @value='Відправити']";
    private final String homeLogo = "//*[@id='header']/div/a/img";
    private final String nameText = ("");

    public void clickHomeLogo() {
        waitElementToBeVisible(homeLogo).click();
    }

    public void clickFeedbackButton() {
        waitElementToBeVisible(feedbackButton).click();
    }

    public void enterName(String name) {
       waitElementToBeVisible(nameText).sendKeys(name);
    }

    public void enterEmail(String email) {
       waitElementToBeVisible(emailInput).sendKeys(email);
    }

    public void enterQuestion(String question) {
       waitElementToBeVisible(questionTextarea).sendKeys(question);
    }

    public void clickSubmitButton() {
       waitElementToBeVisible(submitButton).click();
    }

    public boolean ToContactPage() {
        try {
            WebElement contactHeading = driver.findElement(By.xpath("//h1[text()='Контакти']"));
            List<WebElement> otherElements = driver.findElements(By.xpath("//*"));
            return contactHeading.isDisplayed() && otherElements.size() == 1;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    //test3

    private final String  menuButton = ("//span[contains(@class, 'header__burger--text') and contains(., 'Меню')]");
    private final String novinkiButton = ("///div[contains(@class, 'menu__upper-group') and contains(@class, 'category_news_nav')]");
    private final String firstProductButton = ("//a[contains(@href, 'suknja-prjama-zi-stijkoju-midi-trikotazh-angora-molochna')]");
    private final String sizeButton = ("//input[@id='tab2-option-1768262912']");
    private final String quickBuyButton = ("//div[contains(@onclick, 'cart.add') and contains(@onclick, '24710')]");
    private final String orderButton = ("//a[contains(@href, 'route=checkout/checkout')]");
    private final String cartButton2 = ("//a[contains(@href, 'route=checkout/cart')]");

    public void clickMenu() {
        waitElementToBeVisible(menuButton).click();
    }

    public void clickNovinki() {
        waitElementToBeVisible(novinkiButton).click();
    }

    //перший товар
    public void clickFirstProduct() {
        waitElementToBeVisible(firstProductButton).click();
    }

    public void clickSize() {
        waitElementToBeVisible(sizeButton).click();
    }

    //"Швидка покупка"
    public void clickQuickBuy() {
       waitElementToBeVisible(quickBuyButton).click();
    }

    // Метод для натискання на оформлення замовлення
    public void clickOrder() {
       waitElementToBeVisible(orderButton).click();
    }

    // Метод для переходу в кошик
    public void goToCart2() {
       waitElementToBeVisible(cartButton2).click();
    }

    //test4
    private final String registerButton = ("//div[@class='header__right-sector']/a[@href='https://vovk.com/login-page/']");
    private final String registrationPage = ("//a[@href='registration-page']/div[@class='registration__form-button-gray']");
    private final String fieldName = ("//input[@name='firstname']");
    private final String fieldLastName = ("//input[@name='lastname']");
    private final String fieldTelephone = ("//input[@id='input-telephone']");
    private final String fieldEmail =("//input[@name='email']");
    private final String FieldPassword = ("//div/input[@name='password']");
    private final String fieldConfirmPassword = ("//div/input[@name='confirm']");
    private final String toRegisterButton = ("//input[@type='submit']");
    private final String registrationSuccessful = ("//*[@id='content']//h1");

    // Реєстрація
    public void clickRegisterLink() {
        waitElementToBeVisible(registerButton).click();
    }

    public void clickRegistrationPage(){
        waitElementToBeVisible(registrationPage).click();
    }
        // ім'я
     public void enterNameRegister(String Name) {
        waitElementToBeVisible(fieldName).sendKeys("Іван");

     }
      public void enterLastName(String LastName){
        waitElementToBeVisible(fieldLastName).sendKeys("Вовк");
      }

      public void enterTelephone(String Telephone){
        waitElementToBeVisible(fieldTelephone).sendKeys("999999999");
      }

    public void enterEmailRegister(String Email) {
            waitElementToBeVisible(fieldEmail).sendKeys("ivan@example.com");
    }

     public void enterPassword(String password) {
            waitElementToBeVisible(FieldPassword).sendKeys("ivan999");
     }

     public void enterConfirmPassword(String confirmPassword) {
            waitElementToBeVisible(fieldConfirmPassword).sendKeys("ivan999");
     }

      public void clickRegisterButton() {
           waitElementToBeVisible(toRegisterButton).click();
      }

    public boolean isRegistrationSuccessPageDisplayed() {
        return driver.getCurrentUrl().contains("route=account/success") &&
               waitElementToBeVisible(registrationSuccessful).getText().equals("Облікова запис успішно створена!");
    }


}
