package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemoveUI;

public class IsAddElement {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, AddRemoveUI.add);
    }
}
