import Pages.ContactUsPage;
import Pages.CreateAccountPage;
import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignInPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static LoginPage loginPage;
    public static final Logger logger = LogManager.getLogger(SignInPageTest.class);

    @BeforeAll
    public static void classSetUp() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
    }
    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void enterValuesTest() throws InterruptedException {
        logger.info("enterValuesTest is running");
        mainPage.loginPage();
        loginPage.loginPageEnterEmail("ekaterina20an@gmail.com");
        loginPage.loginPageEnterPass("6677");
        loginPage.signInButtonClick();
        Thread.sleep(5000);
        boolean isAccountHeaderVisible = loginPage.isAccountHeaderVisible();
        assertTrue(isAccountHeaderVisible);


    }
    @Test
    public void invalidEmailValueTest() throws InterruptedException {
        logger.info("invalidEmailValueTest is running");
        mainPage.loginPage();
        loginPage.loginPageEnterEmail("ekaterina20angmail.com");
        loginPage.loginPageEnterPass("6677");
        loginPage.signInButtonClick();
        Thread.sleep(5000);
        boolean isErrorInvalidEmailVisible = loginPage.isErrorInvalidEmailVisible();
        assertTrue(isErrorInvalidEmailVisible);

    }


}
