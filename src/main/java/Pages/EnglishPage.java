package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnglishPage extends BasicPage{
    public static final String ENGLISH_PAGE_HEADER = "//input [@type = 'button']";
    public static final String ENGLISH_BOOK_1 = "//*[@src= '//cdn.shopify.com/s/files/1/1788/1145/products/I-Love-to-Eat-Fruits-and-Vegetables-kids-bedtime-story-english-cover_195x195@2x.jpg?v=1492987398\']";




    public boolean isPageTitleVisible() {
        return elementExist(ENGLISH_PAGE_HEADER);
    }


    public void addToCartEnglishBook() throws InterruptedException {
        byVisibleElement(ENGLISH_BOOK_1);
        closePopUp();
        findElementByXpath(ENGLISH_BOOK_1).click();
    }
}

