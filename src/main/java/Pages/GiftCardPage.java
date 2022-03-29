package Pages;

public class GiftCardPage extends BasicPage{
    public static final String GIFT_CARD_PAGE_HEADER = "//*[(text() = 'Gift Card')]";

    public boolean isPageTitleVisible(){
        return elementExist(GIFT_CARD_PAGE_HEADER);


    }

}
