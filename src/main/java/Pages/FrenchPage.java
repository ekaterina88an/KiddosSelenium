package Pages;

public class FrenchPage extends BasicPage {
    public static final String FRENCH_PAGE_HEADER = "//*[(text() = 'French - Français')]";

    public boolean isPageTitleVisible() {
        return elementExist(FRENCH_PAGE_HEADER);
    }
}
