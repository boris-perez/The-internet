package task.tasking;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import reportHelper.helper.ScreenShotHelper;
import ui.FormAuthenticationUI;
import ui.HomePageUI;

public class Login {


    public static void as(WebDriver driver, String user, String passWord) {
        Click.on(driver, HomePageUI.authentication);
        Enter.text(driver, FormAuthenticationUI.username, user);
        Enter.text(driver, FormAuthenticationUI.password, passWord);
        Click.on(driver, FormAuthenticationUI.loginButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Login");
    }
}
