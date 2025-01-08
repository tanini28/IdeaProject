package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import Pages1.BasePage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VovkHomePage extends BasePage {

    public VovkHomePage(WebDriver driver) {
        super(driver);
    }

    //локатори test1
    public By searchButton = By.xpath("//a[contains(@class, 'bottom-header__tools-search-btn')]"); // Кнопка пошуку
    public By searchInput = By.xpath("//input[@name='search' and @placeholder='Пошук' and @class='header-search__field']"); // Поле  для пошуку
    public By searchSubmitButton = By.xpath("//*[@id='search']/button"); // Кнопка пошуку
    public By Product = By.xpath("//a[@href='https://vovk.com/ua/suknja-midi-lljana-lajm/' and contains(@class, 'card-hover-link')]");// вибір сукні
    public By sizeSelector = By.xpath("//label[text()='XXS-XS']/preceding-sibling::input"); //вибір розміру
    public By addToCartButton = By.xpath("//div[contains(@class, 'item__button-add') and contains(@class, 'item__button') and text()='Додати в кошик']"); // Кнопка додавання в кошик
    public By cartButton = By.xpath("//a[@href='https://vovk.com/index.php?route=checkout/cart']"); //кнопка для переходу до кошика
    public By cartProduct = By.xpath("//font[text()='Сукня міді лляна лайм' and @style='vertical-align: inherit;']"); // сукня у кошику

    //test1
    public void openHomePage() {
        openUrl("https://vovk.com/ua/");
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    //введення тексту у поле пошуку
    public void enterSearchText(String text) {
        driver.findElement(searchInput).sendKeys(text);
    }

    //натискання на кнопку пошуку
    public void clickSearchSubmitButton() {
        driver.findElement(searchSubmitButton).click();
    }

    //натискання на продукт (сукня лляна)
    public void clickProduct() {
        driver.findElement(Product).click();
    }

    //вибір розміру
    public void selectSize() {
        driver.findElement(sizeSelector).click();
    }

    // додавання продукту в кошик
    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    //перехІД до кошика
    public void goToCart() {
        driver.findElement(cartButton).click();
    }

    // чи є продукт у кошику
    public boolean isProductInCart() {
        try {
            return driver.findElement(cartProduct).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //test2
    //локатори test2
    public final String feedbackButton = "//a[@href='https://vovk.com/ua/contacts/']"; // кнопка зворотного зв'язку
    public final String nameText = "//*[@id='input-name']"; //текстове поле введення імені
    public final String emailInput = "//*[@id='input-email']"; //текстове поле введення електронної пошти
    public final String questionTextarea = "//*[@id='input-enquiry']"; //текстове поле для введення питання
    public final String submitButton = "//input[@class='button__contact' and @value='Відправити']"; // кнопки "Відправити".
    public By ToContactPage = By.xpath("//h1[text()='Контакти']"); // знаходження повідомлення
    public final String homeLogo = "//*[@id='header']/div/a/img"; //логотипу сайту


    public void clickHomeLogo() {
        clickElementByXpath(homeLogo);
    }

    public void clickFeedbackButton() {
        clickElementByXpath(feedbackButton); //кнопку зворотного зв'язку
    }

    public void enterName(String name) {
        sendKeysToElementByXpath(nameText, name);
    }

    public void enterEmail(String email) {
        sendKeysToElementByXpath(emailInput, email);
    }

    public void enterQuestion(String question) {
        sendKeysToElementByXpath(questionTextarea, question); //текст питання
    }

    public void clickSubmitButton() {
        clickElementByXpath(submitButton); //кнопка "Відправити"
    }

    //сторінка після відправки містить текст "Контакти" і пуста
    public boolean ToContactPage() {
        try {
            // Перевіряємо, чи є текст "Контакти" на сторінці
            WebElement contactHeading = driver.findElement(By.xpath("//h1[text()='Контакти']"));
            // Перевіряємо, чи на сторінці немає інших елементів (наприклад, форми)
            List<WebElement> otherElements = driver.findElements(By.xpath("//*"));
            return contactHeading.isDisplayed() && otherElements.size() == 1;  // Тільки заголовок "Контакти"
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    //test3
//локатори test3
    public By menuButton = By.xpath("//span[contains(@class, 'header__burger--text') and contains(., 'Меню')]");
    public By novinkiButton = By.xpath("///div[contains(@class, 'menu__upper-group') and contains(@class, 'category_news_nav')]");
    public By firstProductButton = By.xpath("//a[contains(@href, 'suknja-prjama-zi-stijkoju-midi-trikotazh-angora-molochna')]");
    public By sizeButton = By.xpath("//input[@id='tab2-option-1768262912']");
    public By quickBuyButton = By.xpath("//div[contains(@onclick, 'cart.add') and contains(@onclick, '24710')]");
    public By orderButton = By.xpath("//a[contains(@href, 'route=checkout/checkout')]");
    public By cartButton2 = By.xpath("//a[contains(@href, 'route=checkout/cart')]");
    public void clickMenu() {
        driver.findElement(menuButton).click();
    }

    public void clickNovinki() {
        driver.findElement(novinkiButton).click();
    }

    //перший товар
    public void clickFirstProduct() {
        driver.findElement(firstProductButton).click();
    }

    public void clickSize() {
        driver.findElement(sizeButton).click();
    }

    //"Швидка покупка"
    public void clickQuickBuy() {
        driver.findElement(quickBuyButton).click();
    }

    // Метод для натискання на оформлення замовлення
    public void clickOrder() {
        driver.findElement(orderButton).click();
    }

    // Метод для переходу в кошик
    public void goToCart2() {
        driver.findElement(cartButton2).click();
    }

    //test4
    public By registerButton = By.xpath("//div[@class='header__right-sector']/a[@href='https://vovk.com/login-page/']");
    public By registrationPage = By.xpath("//a[@href='registration-page']/div[@class='registration__form-button-gray']");
    public By fieldName = By.xpath("//input[@name='firstname']");
    public By fieldLastName = By.xpath("//input[@name='lastname']");
    public By fieldTelephone = By.xpath("//input[@id='input-telephone']");
    public By fieldEmail =By.xpath("//input[@name='email']");
    public By FieldPassword = By.xpath("//div/input[@name='password']");
    public By fieldConfirmPassword = By.xpath("//div/input[@name='confirm']");
    public By toRegisterButton = By.xpath("//input[@type='submit']");
    public By registrationSuccessful = By.xpath("//*[@id='content']//h1");

    // Реєстрація
    public void clickRegisterLink() {
        driver.findElement(registerButton).click();
    }

    public void clickRegistrationPage(){
        driver.findElement(registrationPage).click();
    }
        // ім'я
     public void enterNameRegister(String Name) {
         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Іван");

     }
      public void enterLastName(String LastName){
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Вовк");
      }

      public void enterTelephone(String Telephone){
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("999999999");
      }

        //Email
    public void enterEmailRegister(String Email) {
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ivan@example.com");
    }
        //Пароль
     public void enterPassword(String password) {
            driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("ivan999");
     }
        //Підтвердження пароля
     public void enterConfirmPassword(String confirmPassword) {
            driver.findElement(By.xpath("//div/input[@name='confirm']")).sendKeys("ivan999");
     }
        //Зареєструватися
      public void clickRegisterButton() {
            driver.findElement(By.xpath("//input[@type='submit']")).click();
      }

    public boolean isRegistrationSuccessPageDisplayed() {
        return driver.getCurrentUrl().contains("route=account/success") &&
               driver.findElement(By.xpath("//div[@class='success__title']/h1")).getText().equals("Облікова запис успішно створена!");
    }


}
