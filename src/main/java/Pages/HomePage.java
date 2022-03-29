package Pages;

public class HomePage extends BasicPage {
    public static final String HOME_PAGE_HEADER = "//div [@class= 'hero__inner']";

    public boolean isPageTitleVisible(){
        return elementExist(HOME_PAGE_HEADER);


    }
}
