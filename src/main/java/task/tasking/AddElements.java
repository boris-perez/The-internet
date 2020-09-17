package task.tasking;

import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import Helpers.helper.ScreenShotHelper;
import ui.AddRemoveUI;
import ui.HomePageUI;

public class AddElements {

    public static void as(WebDriver driver) {
        Click.on(driver, HomePageUI.addRemove);
        Click.on(driver, AddRemoveUI.add);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Add Elements");
    }

}
