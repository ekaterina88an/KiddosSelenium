package Pages;

public class SpanishPage extends BasicPage{
    public static final String SPANISH_PAGE_HEADER = "//*[(text() = 'Spanish - Español')]";

    public boolean isPageTitleVisible() {
        return elementExist(SPANISH_PAGE_HEADER);
    }
}
