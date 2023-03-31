package Emag.Tests;

import Emag.steps.HomePageSteps;
import Emag.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected HomePageSteps homePageSteps;

}
