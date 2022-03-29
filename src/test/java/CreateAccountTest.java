import Pages.CreateAccountPage;
import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAccountTest extends UseCaseBase {
    private static MainPage mainPage;
    public static CreateAccountPage createAccountPage;
    public static LoginPage loginPage;
    public static final Logger logger = LogManager.getLogger(ContactUsFormTest.class);

    @BeforeAll
    public static void classSetUp() {
        mainPage = new MainPage();
        createAccountPage = new CreateAccountPage();
        loginPage = new LoginPage();


    }
    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.loginPage();
    }


    @Test
    public void createAccountOpenTest() {
        logger.info("createAccountOpenTest is running");
        CreateAccountPage createAccountPage = loginPage.createAccountPageOpen();
        boolean createAccountIsOpened = createAccountPage.isPageTitleVisible();
        assertTrue(createAccountIsOpened);

    }
    @Test
    public void createAccountAllFieldsTest(){
        logger.info("createAccountAllFieldsTest is running");
        CreateAccountPage createAccountPage = loginPage.createAccountPageOpen();
        createAccountPage.createAccountEnterFirstName("Anna");
        createAccountPage.createAccountEnterLastName("Borvenko");
        createAccountPage.createAccountEnterEmail("anna_dada@mail.ru");
        createAccountPage.createAccountEnterPass("12rrrr34");
        createAccountPage.createAccountButtonClick();
        boolean accountCreatedSuccessful = createAccountPage.accountCreatedSuccessful();
        assertTrue(accountCreatedSuccessful);
    }

    @Test
    public void allFieldsBlankTest() throws InterruptedException {
        logger.info("allFieldsBlankTest is running");
        CreateAccountPage createAccountPage = loginPage.createAccountPageOpen();
        createAccountPage.createAccountButtonClick();
        Thread.sleep(5000);
        boolean isErrorMessageAllBlankFields = createAccountPage.isErrorMessageAllBlankFields();
        assertTrue(isErrorMessageAllBlankFields);

    }
    @Test
    public void emailInvalidTest(){
        logger.info("emailInvalidTest is running");
        CreateAccountPage createAccountPage = loginPage.createAccountPageOpen();
        createAccountPage.createAccountEnterFirstName("Luybov");
        createAccountPage.createAccountEnterLastName("Borvenko");
        createAccountPage.createAccountEnterEmail("mail.ru");
        createAccountPage.createAccountEnterPass("12rrrr34");
        boolean isCreateAccErrorInvalidEmailVisible= createAccountPage.isCreateAccErrorInvalidEmailVisible();
        assertTrue(isCreateAccErrorInvalidEmailVisible);



    }
}
