package Pages;

public class AfrikaansPage extends BasicPage{
    public static final String AFRIKAANS_PAGE_HEADER = "//*[(text() = 'Afrikaans')]";
    public static final String AFRIKAANS_PAGE_BOOK_TWO = "//img[@src = '//cdn.shopify.com/s/files/1/1788/1145/products/Afrikaans-Bilingual-kids-book-I-Love-My-Mom-English-Shelley-Admont-KidKiddos-cover_195x195@2x.jpg?v=1628510541']";
    public boolean isPageTitleVisible() {
        return elementExist(AFRIKAANS_PAGE_HEADER);
    }

    public void addToCartAfrikaansBook() throws InterruptedException {
        byVisibleElement(AFRIKAANS_PAGE_BOOK_TWO);
        findElementByXpath(AFRIKAANS_PAGE_BOOK_TWO).click();
    }
}



