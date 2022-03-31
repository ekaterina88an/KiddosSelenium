package Pages;

public class CartPage extends BasicPage{
    public static final String CART_PAGE_HEADER = "//*[(text() = 'Your cart')]";
    public static final String CART_PAGE_QUANTITY_FIELD = "//input [@class = 'cart__qty-input']";
    public static final String CART_PAGE_REMOVE_BUTTON = "//a[@class='btn btn--small btn--secondary cart__remove']";

    public boolean isPageTitleVisible() {
        return elementExist(CART_PAGE_HEADER);
    }

    public String isCartNotEmpty(){
        String value = findElementByXpath(CART_PAGE_QUANTITY_FIELD).getAttribute("value");

        return value;
    }
    public void removeButtonClick(){
        findElementByXpath(CART_PAGE_REMOVE_BUTTON).click();
    }




}

