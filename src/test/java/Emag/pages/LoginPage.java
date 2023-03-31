package Emag.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {
    @FindBy(id = "user_login_email")
    private WebElementFacade userLoginEmail;
    @FindBy(id = "user_login_continue")
    private WebElementFacade continueButton;
    @FindBy (id = "user_login_password")
    private WebElementFacade passwordField;
    @FindBy (css = "a.btn.btn-default.btn-rounded.btn-md.mrg-top-sm")
    private WebElementFacade activateLaterButton;


public void setUserLoginEmail(String email){typeInto(userLoginEmail,email);}

public void setPasswordField(String password){
    waitFor(passwordField);
    typeInto(passwordField,password);
}
public void clickLoginButton(){clickOn(continueButton);}

public void clickActivateLaterButton(){clickOn(activateLaterButton);}










}
