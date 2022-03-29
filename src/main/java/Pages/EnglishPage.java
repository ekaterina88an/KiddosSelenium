package Pages;

public class EnglishPage extends BasicPage{
    public static final String ENGLISH_PAGE_HEADER = "//input [@type = 'button']";

    public boolean isPageTitleVisible() {
        return elementExist(ENGLISH_PAGE_HEADER);
    }
}

