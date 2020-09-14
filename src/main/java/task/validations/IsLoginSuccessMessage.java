package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.FormAuthenticationUI;

public class IsLoginSuccessMessage {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, FormAuthenticationUI.alertSuccess);
    }
}
