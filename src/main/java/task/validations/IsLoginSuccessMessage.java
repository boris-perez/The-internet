package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthenticationUI;

public class IsLoginSuccessMessage {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, FormAuthenticationUI.alertSuccess);
    }

    public static String getTextSuccess(WebDriver webDriver) {
        WebElement element = webDriver.findElement(FormAuthenticationUI.alertSuccess);
        return element.getText();
    }
}
