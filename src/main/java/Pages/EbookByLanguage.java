package Pages;

public class EbookByLanguage extends BasicPage{
    private static final String EBOOK_BY_LANG_TITLE = "//h1[text()='ebooks']";


    public boolean isPageTitleVisible() {
        return elementExist(EBOOK_BY_LANG_TITLE);

    }
}

