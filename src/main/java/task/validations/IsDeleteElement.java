package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemoveUI;
import ui.FormAuthenticationUI;

public class IsDeleteElement {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, AddRemoveUI.remove);
    }
}
