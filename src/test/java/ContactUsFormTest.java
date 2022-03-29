import Pages.ContactUsPage;
import Pages.MainPage;
import Utils.SharedDriver;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsFormTest extends UseCaseBase {
    private static MainPage mainPage;
    public static ContactUsPage contactUsPage;
    public static final Logger logger = LogManager.getLogger(ContactUsPage.class);

    @BeforeAll
    public static void classSetUp() {
        mainPage = new MainPage();
        contactUsPage = new ContactUsPage();

    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }


    @Test
    public void emptyNameTest() throws InterruptedException {
        logger.info("emptyNameTest is running");
        mainPage.contactUsOpen();
        contactUsPage.contactUsEnterEmail("nikolai@mail.ru");
        contactUsPage.setContactUsEnterText("Text test");
        contactUsPage.contactUsSendMessageButton();
        Thread.sleep(5);
        boolean isNoNameErrorMessagesVisible = contactUsPage.isNoNameErrorMessagesVisible();
        assertTrue(isNoNameErrorMessagesVisible);
    }
    @Test
    public void emptyEmailTest() throws InterruptedException {
        logger.info("emptyEmailTest is running");
        mainPage.contactUsOpen();
        contactUsPage.contactUsEnterName("Olga");
        contactUsPage.setContactUsEnterText("Text test");
        contactUsPage.contactUsSendMessageButton();
        Thread.sleep(5);
        boolean isNoEmailErrorMessageVisible = contactUsPage.isNoEmailErrorMessageVisible();
        assertTrue(isNoEmailErrorMessageVisible);
    }
    @Test
    public void emptyTextTest() throws InterruptedException {
        logger.info("emptyTextTest is running");
        mainPage.contactUsOpen();
        contactUsPage.contactUsEnterName("Olga");
        contactUsPage.contactUsEnterEmail("nikolai@mail.ru");
        contactUsPage.contactUsSendMessageButton();
        Thread.sleep(5000);
        boolean isEmptyMessageFieldErrorMessageVisible = contactUsPage.isEmptyMessageFieldErrorMessageVisible();
        assertTrue(isEmptyMessageFieldErrorMessageVisible);
    }
    @Test
    public void invalidEmailTest() throws InterruptedException {
        logger.info("invalidEmailTest is running");
        mainPage.contactUsOpen();
        contactUsPage.contactUsEnterName("Olga");
        contactUsPage.contactUsEnterEmail("romannkimyahoo.com");
        contactUsPage.contactUsSendMessageButton();
        Thread.sleep(5000);
        boolean isEnterValidEmailErrorMessageVisible = contactUsPage.isEnterValidEmailErrorMessageVisible();
        assertTrue(isEnterValidEmailErrorMessageVisible);
        logger.info("The last test was run");
    }



}
