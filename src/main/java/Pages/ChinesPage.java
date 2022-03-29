package Pages;

public class ChinesPage extends BasicPage {
    public static final String CHINESE_PAGE_HEADER = "//*[(text() = 'Mandarin Chinese - 中文')]";

    public boolean isPageTitleVisible() {
        return elementExist(CHINESE_PAGE_HEADER);
    }
}
