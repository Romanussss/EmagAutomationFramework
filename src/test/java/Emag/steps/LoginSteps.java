package Emag.steps;

import Emag.pages.HomePage;
import Emag.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private HomePage homePage;

    @Step
    public void navigateToLogin(){
        loginPage.open();
    }

    @Step
    public void setCredentialsAndLogIn(String email, String pass){
        loginPage.setUserLoginEmail(email);
        loginPage.clickLoginButton();
        waitABit(300);
        loginPage.setPasswordField(pass);

        loginPage.clickLoginButton();
    }

    @Step
    public void multiFactorAutentificationSkip(){
        loginPage.clickActivateLaterButton();
    }
}
