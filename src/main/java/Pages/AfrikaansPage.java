package Pages;

public class AfrikaansPage extends BasicPage{
    public static final String AFRIKAANS_PAGE_HEADER = "//*[(text() = 'Afrikaans')]";

    public boolean isPageTitleVisible() {
        return elementExist(AFRIKAANS_PAGE_HEADER);
    }
}


