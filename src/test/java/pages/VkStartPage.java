package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VkStartPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='index_email']" )
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='index_pass']" )
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='index_login_button']")
    private WebElement enterButton;

    @Step("Ввод логина")
    public void enterLogin(String keyword){
        emailField.sendKeys(keyword);
        }

    @Step("Ввод пароля")
    public void enterPassword(String keyword2){
        passwordField.sendKeys(keyword2);
    }

    @Step("Нажатие кнопки Войти")
    public void clickOnEnterButton(){
        enterButton.click();
    }




    public VkStartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


}
