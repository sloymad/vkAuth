package tests;

import helpers.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginWithWrongEmail extends TestBase {
    @Test
    public void logInWithWrongPassword(){
        vkStartPage.enterLogin("+793124901951");
        vkStartPage.enterPassword("2020327zz");
        vkStartPage.clickOnEnterButton();

       // assertEquals(vkLoginErrorPage.errorMessageBlock(), true, "Не удается войти.");
       // assertTrue(vkLoginErrorPage.errorMessageBlock(), "Не удается войти");
        assertEquals(vkLoginErrorPage.errorMessageBlock(),true, "Присутствует");
    }

}
