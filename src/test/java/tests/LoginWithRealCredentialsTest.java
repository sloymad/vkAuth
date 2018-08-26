package tests;

import helpers.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginWithRealCredentialsTest extends TestBase {

    @Test
    public void logInOnVkPage(){
        vkStartPage.enterLogin("+79312490195");
        vkStartPage.enterPassword("2020327zz");
        vkStartPage.clickOnEnterButton();
        assertEquals(vkUserPage.moveToTheMessages(), true, "Мои Сообщения");

    }
}
