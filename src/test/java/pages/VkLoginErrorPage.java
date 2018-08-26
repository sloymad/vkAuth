package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VkLoginErrorPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='email']" )
    private WebElement phoneOrEmailField;

    @FindBy(xpath = "//input[@id='pass']" )
    private WebElement enterPassField;

    @FindBy(xpath = "//button[@id='login_button']")
    private WebElement logInButton;

    @FindBy(id = "login_message")
    private WebElement errorMessage;


    @Step("Ввод логина")
    public void enterLogin(String keyword){
        phoneOrEmailField.sendKeys(keyword);
    }

    @Step("Ввод пароля")
    public void enterPassword(String keyword2){
        enterPassField.sendKeys(keyword2);
    }

    @Step("Нажатие кнопки Войти")
    public void clickOnEnterButtonAgain(){
        logInButton.click();
    }

    @Step("Ошибка входа")

    public boolean errorMessageBlock() {

        return errorMessage.isDisplayed();
    }

    public VkLoginErrorPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



}
