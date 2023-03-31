package Emag.Tests;

import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void logInWithValidCredentials(){
        loginSteps.navigateToLogin();
        loginSteps.setCredentialsAndLogIn("vladroman1257@gmail.com","XE&Ct8u$meBGjux");
        loginSteps.multiFactorAutentificationSkip();
    }
}
