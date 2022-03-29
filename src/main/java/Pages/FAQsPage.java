package Pages;

public class FAQsPage extends BasicPage{
    public static final String FAQS_PAGE_HEADER = "//*[(text() = 'FAQ/addition info')]";

    public boolean isPageTitleVisible() {
        return elementExist(FAQS_PAGE_HEADER);
    }
}
