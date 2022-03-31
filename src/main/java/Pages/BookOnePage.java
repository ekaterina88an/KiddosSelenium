package Pages;

public class BookOnePage extends BasicPage {
    public static final String BOOK_ONE_PAGE_HEADER = "//*[@src= '//cdn.shopify.com/s/files/1/1788/1145/products/I-Love-to-Eat-Fruits-and-Vegetables-kids-bedtime-story-english-cover_195x195@2x.jpg?v=1492987398']";
    public static final String BOOK_ONE_ADD_TO_CART_BUTTON = "//button[@class='btn product-form__cart-submit']";
    public static final String BOOK_ONE_QUANTITY_MENU = "//input[@id='Quantity']";

    public boolean isPageTitleVisible() {
        return elementExist(BOOK_ONE_PAGE_HEADER);
    }

    public void bookOneCartButtonClick() {
        clickOnElementsByXpath(BOOK_ONE_ADD_TO_CART_BUTTON);
    }

    public void addQuantityEnglishBook(String books) {

        findElementByXpath(BOOK_ONE_QUANTITY_MENU).clear();
        sendTextToElementsByXpath(BOOK_ONE_QUANTITY_MENU,books);


        }




    }

