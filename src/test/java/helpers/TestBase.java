package helpers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.VkLoginErrorPage;
import pages.VkStartPage;
import pages.VkUserPage;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    private InitBrowserDriver initBrowserDriver = new InitBrowserDriver();
    private WebDriver driver = initBrowserDriver.chromeDriver();
    public VkStartPage vkStartPage;
    public VkUserPage vkUserPage;
    public VkLoginErrorPage vkLoginErrorPage;

    @BeforeMethod
    public void setUp(){
        vkStartPage = new VkStartPage(driver);
        vkUserPage = new VkUserPage(driver);
        vkLoginErrorPage = new VkLoginErrorPage(driver);
        driver.get("https://vk.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void  closeUp() {driver.close();}
}
