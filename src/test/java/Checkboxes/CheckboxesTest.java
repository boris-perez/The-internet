package Checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SelectCheckbox;
import task.tasking.UnselectCheckbox;
import task.validations.IsCheckBoxChecked;

public class CheckboxesTest extends BaseTest {

    @Test
    public void selectCheckboxTest() {
        SelectCheckbox.as(webDriver);
        Assert.assertTrue(IsCheckBoxChecked.visible(webDriver));
    }

    @Test
    public void unselectCheckboxTest() {
        UnselectCheckbox.as(webDriver);
        Assert.assertTrue(!IsCheckBoxChecked.visible(webDriver));
    }
}
