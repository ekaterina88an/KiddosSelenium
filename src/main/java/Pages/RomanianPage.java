package Pages;

public class RomanianPage extends BasicPage{
    public static final String ROMANIAN_PAGE_HEADER = "//input [@type = 'button']";

    public boolean isPageTitleVisible() {
        return elementExist(ROMANIAN_PAGE_HEADER);
    }
}

