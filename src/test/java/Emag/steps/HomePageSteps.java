package Emag.steps;

import Emag.pages.HomePage;
import Emag.pages.LoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class HomePageSteps extends ScenarioSteps{
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public boolean verifySuccesfullLogin() {
        if (homePage.checkHeaderImage()) return true;
        else {
            return false;

        }
    }







}

