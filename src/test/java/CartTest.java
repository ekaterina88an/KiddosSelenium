import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.sql.*;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest extends UseCaseBase {
    private static MainPage mainPage;
    public static CartPage cartPage;
    public static EnglishPage englishPage;
    public static BookOnePage bookOnePage;
    public static AfrikaansPage afrikaansPage;
    public static BookTwoPage bookTwoPage;
    public static final Logger logger = LogManager.getLogger(CartTest.class);

    @BeforeAll
    public static void classSetUp() {
        mainPage = new MainPage();
        cartPage = new CartPage();
        englishPage = new EnglishPage();
        bookOnePage = new BookOnePage();
        afrikaansPage = new AfrikaansPage();
        bookTwoPage = new BookTwoPage();


    }
    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }



    @Test
    public void addOneBookToCart() throws InterruptedException {
        logger.info("addOneBookToCart is running");
        mainPage.englishPage();
        englishPage.addToCartEnglishBook();
        bookOnePage.bookOneCartButtonClick();
        String currentPage = cartPage.isCartNotEmpty();
        assertEquals("1",currentPage);


    }
    @ParameterizedTest
    @ValueSource(strings = {"5", "1","7"})
    public void addManyBooksToCartParametrizedTest(String booksInput) throws InterruptedException {
        logger.info("addManyBooksToCartParametrizedTest is running");
        mainPage.englishPage();
        englishPage.addToCartEnglishBook();
        bookOnePage.addQuantityEnglishBook(booksInput);
        bookOnePage.bookOneCartButtonClick();
        String currentPage = cartPage.isCartNotEmpty();
        assertEquals(booksInput,currentPage);
        cartPage.removeButtonClick();
    }

    @Test
    public void addMultipleLanguageBooksToCartTest() throws InterruptedException {
        logger.info("addMultipleLanguageBooksToCartTest is running");
        mainPage.englishPage();
        englishPage.addToCartEnglishBook();
        bookOnePage.addQuantityEnglishBook("2");
        bookOnePage.bookOneCartButtonClick();
        mainPage.afrikaansPage();
        afrikaansPage.addToCartAfrikaansBook();
        bookTwoPage.addQuantityAfrikaansBook("5");
        bookTwoPage.bookTwoCartButtonClick();
        String cartNotEmpty1 = cartPage.isCartNotEmpty();
        assertNotNull(cartNotEmpty1);
        String cartNotEmpty2 = cartPage.isCartNotEmpty();
        assertNotNull(cartNotEmpty2);
        logger.info("The last test was run");



    }





}
