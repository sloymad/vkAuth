package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VkUserPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Сообщения')]")
    private WebElement myMessages;

    @Step("Переход в сообщения")
    public boolean moveToTheMessages() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myMessages.getText().contains("Сообщения");
    }

    public VkUserPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


}
