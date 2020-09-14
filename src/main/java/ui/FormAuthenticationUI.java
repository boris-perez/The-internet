package ui;

import org.openqa.selenium.By;

public class FormAuthenticationUI {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginButton = By.xpath("//button[@class='radius']");
    public static By alertError = By.xpath("//*[contains(@class,'flash error')]");
    public static By alertSuccess = By.xpath("//*[contains(@class,'flash success')]");

}
