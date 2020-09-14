package Authentication;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;
import ui.FormAuthenticationUI;

public class AuthenticationTests extends BaseTest {

    @Test
    public void authenticationSuccessfulTests() {
        Login.as(webDriver, "tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
        Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver), "You logged into a secure area!\n" +
                "×");
    }

    @Test
    public void authenticationFailedTests() {
        Login.as(webDriver, "tomsmith", "Password!");
        Assert.assertTrue(IsLoginErrorMessage.visible(webDriver));
    }
}
