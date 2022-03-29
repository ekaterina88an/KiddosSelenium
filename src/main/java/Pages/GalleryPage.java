package Pages;

public class GalleryPage extends BasicPage {
    public static final String GALLERY_PAGE_HEADER = "//*[(text() = 'Gallery')]";

    public boolean isPageTitleVisible() {
        return elementExist(GALLERY_PAGE_HEADER);
    }
}
