package Pages;

public class CartPage extends BasicPage{
    public static final String CART_PAGE_HEADER = "//*[(text() = 'Your cart')]";

    public boolean isPageTitleVisible() {
        return elementExist(CART_PAGE_HEADER);
    }
}

