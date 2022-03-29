package Pages;

public class ResourcesPage extends BasicPage{
    public static final String RESOURCES_PAGE_HEADER = "//*[(text() = 'Fun and Educational Videos for Kids')]";

    public boolean isPageTitleVisible() {
        return elementExist(RESOURCES_PAGE_HEADER);
    }
}
