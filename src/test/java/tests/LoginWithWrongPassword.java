package tests;

import helpers.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWithWrongPassword extends TestBase {

    @Test
    public void logInWithWrongPassword(){
        vkStartPage.enterLogin("+79312490195");
        vkStartPage.enterPassword("2020327z");
        vkStartPage.clickOnEnterButton();

        // assertEquals(vkLoginErrorPage.errorMessageBlock(), true, "Не удается войти.");
        // assertTrue(vkLoginErrorPage.errorMessageBlock(), "Не удается войти");
        assertEquals(vkLoginErrorPage.errorMessageBlock(),true, "Присутствует");
    }
}
