package Pages;

public class BlogPage extends BasicPage{
    public static final String BLOG_PAGE_HEADER = "//*[(text() = 'Blog')]";

    public boolean isPageTitleVisible() {
        return elementExist(BLOG_PAGE_HEADER);
    }
}
