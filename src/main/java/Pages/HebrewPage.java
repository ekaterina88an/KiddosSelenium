package Pages;

public class HebrewPage extends BasicPage{
    public static final String HEBREW_PAGE_HEADER = "//*[(text() = 'Hebrew - עִבְרִית')]";

    public boolean isPageTitleVisible(){
        return elementExist(HEBREW_PAGE_HEADER);


    }
}
