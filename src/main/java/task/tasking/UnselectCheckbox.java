package task.tasking;

import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import reportHelper.helper.ScreenShotHelper;
import ui.CheckBoxesUI;
import ui.HomePageUI;

public class UnselectCheckbox {

    public static void as(WebDriver driver) {
        Click.on(driver, HomePageUI.checkboxes);
        Click.on(driver, CheckBoxesUI.checkbox2);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Unselect checkbox");
    }

}
