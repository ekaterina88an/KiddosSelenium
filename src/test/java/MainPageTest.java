import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetUp() {
        mainPage = new MainPage();

    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        Boolean success = mainPage.isLogoVisible();
        assertTrue(success);

    }

    @Test
    public void contactUsPageTest() {
        logger.info("contactUsPageTest is running");
        ContactUsPage contactUsPage = mainPage.contactUsOpen();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void homePageTest() {
        logger.info("homePagetest is running");
        HomePage homePage = mainPage.homePageOpen();
        boolean isOpen = homePage.isPageTitleVisible();
        assertTrue(isOpen);
    }

    @Test
    public void ukrainianPageTest() {
        logger.info("ukrainianPageTest is running");
        UkrainianPage ukrainianPage = mainPage.ukrainianPage();
        boolean isOpen1 = ukrainianPage.isPageTitleVisible();
        assertTrue(isOpen1);
    }

    @Test
    public void spanishPageTest() {
        logger.info("spanishPageTest is running");
        SpanishPage spanishPage = mainPage.spanishPage();
        boolean isOpen2 = spanishPage.isPageTitleVisible();
        assertTrue(isOpen2);


    }
    @Test
    public void frenchPageTest() {
        logger.info("frenchPageTest is running");
        FrenchPage frenchPage = mainPage.frenchPage();
        boolean isOpen3 = frenchPage.isPageTitleVisible();
        assertTrue(isOpen3);

    }
    @Test
    public void chinesePageTest(){
        logger.info("chinesePageTest is running");
        ChinesPage chinesPage = mainPage.chinesPage();
        boolean isOpen4 = chinesPage.isPageTitleVisible();
        assertTrue(isOpen4);
    }
    @Test
    public void giftCardTest(){
        logger.info("giftPageTest is running");
        GiftCardPage giftCardPage = mainPage.giftCardPage();
        boolean isOpen5 = giftCardPage.isPageTitleVisible();
        assertTrue(isOpen5);
    }
    @Test
    public void galleryTest(){
        logger.info("galleryPageTest is running");
        GalleryPage galleryPage = mainPage.galleryPage();
        boolean isOpen6 = galleryPage.isPageTitleVisible();
        assertTrue(isOpen6);
    }
    @Test
    public void faqsTest(){
        logger.info("FAQsPageTest is running");
        FAQsPage faQsPage = mainPage.faQsPage();
        boolean isOpen7 = faQsPage.isPageTitleVisible();
        assertTrue(isOpen7);
    }
    @Test
    public void blogTest(){
        logger.info("blogPageTest is running");
        BlogPage blogPage = mainPage.blogPage();
        boolean isOpen8 = blogPage.isPageTitleVisible();
        assertTrue(isOpen8);
    }
    @Test
    public void englishPageTest() throws InterruptedException {
        logger.info("englishPageTest is running");
        EnglishPage englishPage = mainPage.englishPage();
        boolean isOpen9 = englishPage.isPageTitleVisible();
        assertTrue(isOpen9);
    }
    @Test
    public void afrikaansPageTest() throws InterruptedException {
        logger.info("afrikaansPageTest is running");
        AfrikaansPage afrikaansPage = mainPage.afrikaansPage();
        boolean isOpen10 = afrikaansPage.isPageTitleVisible();
        assertTrue(isOpen10);
    }
    @Test
    public void hebrewPageTest() throws InterruptedException {
        logger.info("spanishPageTest is running");
        HebrewPage hebrewPage = mainPage.hebrewPage();
        boolean isOpen11 = hebrewPage.isPageTitleVisible();
        assertTrue(isOpen11);
    }
    @Test
    public void romanianPageTest() throws InterruptedException {
        logger.info("romanianPageTest is running");
        RomanianPage romanianPage = mainPage.romanianPage();
        boolean isOpen12 = romanianPage.isPageTitleVisible();
        assertTrue(isOpen12);
    }
    @Test
    public void resourcesMenuTest() throws InterruptedException {
        logger.info("resourcesMenuPageTest is running");
        ResourcesPage resourcesPage = mainPage.resourcesPage();
        boolean isOpen13 = resourcesPage.isPageTitleVisible();
        assertTrue(isOpen13);

    }
    @Test
    public void loginPageOpenTest(){
        logger.info("loginPageOpenTest is running");
        LoginPage loginPage = mainPage.loginPage();
        mainPage.takeScreenshot("loginPageOpenTest");
        boolean isOpen14 = loginPage.isPageTitleVisible();
        assertTrue(isOpen14);

    }
    @Test
    public void cartPageOpenTest(){
        logger.info("cartPageOpenTest is running");
        CartPage cartPage = mainPage.cartPage();
        mainPage.takeScreenshot("cartPageOpenTest");
        boolean isOpen15 = cartPage.isPageTitleVisible();
        assertTrue(isOpen15);

    }
    @Test
    public void currencyDropDownOptionTest(){
        logger.info("Currency drop down load test");
        mainPage.chooseCurrencyOption();
        mainPage.takeScreenshot("Currency drop downTest");
        boolean isCurrencyDropDownVisible = mainPage.isCurrencyDropDownVisible();
        assertTrue(isCurrencyDropDownVisible);
        logger.info("The last test was run");
    }



}
