package Pages;

public class UkrainianPage extends BasicPage {
    public static final String UKRAINIAN_PAGE_HEADER = "//*[(text() = 'Ukrainian - Українська')]";

    public boolean isPageTitleVisible(){
        return elementExist(UKRAINIAN_PAGE_HEADER);


    }
}
