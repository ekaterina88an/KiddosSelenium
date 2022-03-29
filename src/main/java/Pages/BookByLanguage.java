package Pages;

public class BookByLanguage extends BasicPage{
    private static final String BOOK_BY_LANG_TITLE = "//h1[text()='Find your language']";


    public boolean isPageTitleVisible() {
        return elementExist(BOOK_BY_LANG_TITLE);

    }
}
