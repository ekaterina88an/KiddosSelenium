package Pages;

public class BookTwoPage extends BasicPage{
    public static final String BOOK_TWO_PAGE_HEADER = "//*[alt = 'Afrikaans-Bilingual-kids-book-I-Love-My-Mom-English-Shelley-Admont-KidKiddos-cover']";
    public static final String BOOK_TWO_ADD_TO_CART_BUTTON = "//button[@class='btn product-form__cart-submit']";
    public static final String BOOK_TWO_QUANTITY_MENU = "//input[@id='Quantity']";

    public boolean isPageTitleVisible() {
        return elementExist(BOOK_TWO_PAGE_HEADER);
    }

    public void bookTwoCartButtonClick() {
        clickOnElementsByXpath(BOOK_TWO_ADD_TO_CART_BUTTON);
    }

    public void addQuantityAfrikaansBook(String books) {

        findElementByXpath(BOOK_TWO_QUANTITY_MENU).clear();
        sendTextToElementsByXpath(BOOK_TWO_QUANTITY_MENU,books);


    }




}



