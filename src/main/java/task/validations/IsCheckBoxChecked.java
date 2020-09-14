package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxesUI;
import ui.FormAuthenticationUI;

public class IsCheckBoxChecked {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, CheckBoxesUI.checkboxChecked);
    }
}
