package Pages;

import Const.Const;

public class MainPage extends BasicPage {
    private static final String LOGO_IMG = "//img[@itemprop = 'logo']";
    private static final String CONTACT_US = "//a[text() = 'Contact us']";
    private static final String HOME_LINK = "//a[text() = 'Home']";
    private static final String BOOK_BY_LANG = "//a[text()='Books by language']";
    private static final String EBOOK_BY_LANG = "//a[text()='eBooks by language']";
    private static final String BOOKS_BY_LANGUAGE_DROP_DOWN_MENU = "//a[@aria-controls = 'SiteNavLabel-books-by-language']";
    private static final String AFRIKAANS_PAGE = "//a[text() = 'Afrikaans']";
    private static final String HEBREW_PAGE = "//a[text() = 'Hebrew - עִבְרִית']";
    private static final String EBOOKS_BY_LANGUAGE_DROP_DOWN_MENU = "//a[@aria-controls = 'SiteNavLabel-books-by-language']";
    private static final String ENGLISH_PAGE = "//a[text() = 'English Only']";
    private static final String ROMANIAN_PAGE = "//a[text() = 'Romanian - Română']";
    private static final String UKRAINIAN_PAGE = "//a[text()= 'Ukrainian - Українська']";
    private static final String SPANISH_PAGE = "//a[text() = 'Español']";
    private static final String FRENCH_PAGE = "//a[text() = 'Français']";
    private static final String CHINESE_PAGE = "//a[text() = '中文']";
    private static final String GIFT_CARD_PAGE = "//a[text() = 'Gift Card']";
    private static final String GALLERY_PAGE = "//a[text() = 'Gallery']";
    private static final String RESOURCES_PAGE_DROP_DOWN_MENU = "//a[@aria-controls = 'SiteNavLabel-resources']";
    private static final String RESOURCES_OPTION_DROP_DOWN_MENU = "//a[text() = 'Videos']";
    private static final String FAQ_PAGE = "//a[text() = 'FAQs']";
    private static final String BLOG_PAGE = "//a[text() = 'Blog']";
    private static final String LOGIN_PAGE = "//* [@class = 'icon icon-login']";
    private static final String CART_PAGE = "//* [@class = 'icon icon-cart']";
    private static final String CURRENCY_OPTION = "//span[@class = 'currency-converter-currency-button cbb-desktop-view skiptranslate notranslate']";
    public static final String CURRENCY_GBP = "//*[text()='GBP']";




    //test budet vizivat etu funkciyu
//beret MAIN_URL iz Const
    public void navigateToMainPage() {
        webDriver.get(Const.MAIN_URL);

    }

    //ubeditsya chto stranitca otkrilas
    public boolean isLogoVisible() {
        Boolean isVisible = elementExist(LOGO_IMG);
        return isVisible;
    }
    //функция кликает и открывает окна

    public ContactUsPage contactUsOpen() {
        clickOnElementsByXpath(CONTACT_US);
        return new ContactUsPage();
    }

    public HomePage homePageOpen() {
        clickOnElementsByXpath(HOME_LINK);
        return new HomePage();
    }

    public BookByLanguage bookByLanguage() {
        clickOnElementsByXpath(BOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        clickOnElementsByXpath(BOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        return new BookByLanguage();
    }
    public AfrikaansPage afrikaansPage() throws InterruptedException {
        clickOnElementsByXpath(BOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        Thread.sleep(4);
        clickOnElementsByXpath(AFRIKAANS_PAGE);
        return new AfrikaansPage();
    }
    public HebrewPage hebrewPage() throws InterruptedException {
        clickOnElementsByXpath(BOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        Thread.sleep(4);
        clickOnElementsByXpath(HEBREW_PAGE);
        return new HebrewPage();
    }

    public EbookByLanguage ebookByLanguage(){
        clickOnElementsByXpath(EBOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        clickOnElementsByXpath(EBOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        return new EbookByLanguage();
    }
    public EnglishPage englishPage() throws InterruptedException {
        clickOnElementsByXpath(EBOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        Thread.sleep(3);
        clickOnElementsByXpath(ENGLISH_PAGE);
        return new EnglishPage();
    }
    public RomanianPage romanianPage() throws InterruptedException {
        clickOnElementsByXpath(EBOOKS_BY_LANGUAGE_DROP_DOWN_MENU);
        Thread.sleep(4);
        clickOnElementsByXpath(ROMANIAN_PAGE);
        return new RomanianPage();
    }
    public UkrainianPage ukrainianPage(){
        clickOnElementsByXpath(UKRAINIAN_PAGE);
        return new UkrainianPage();
    }
    public SpanishPage spanishPage() {
        clickOnElementsByXpath(SPANISH_PAGE);
        return new SpanishPage();
    }
    public FrenchPage frenchPage() {
        clickOnElementsByXpath(FRENCH_PAGE);
        return new FrenchPage();
    }
    public ChinesPage chinesPage() {
        clickOnElementsByXpath(CHINESE_PAGE);
        return new ChinesPage();

    }
    public GiftCardPage giftCardPage(){
        clickOnElementsByXpath(GIFT_CARD_PAGE);
        return new GiftCardPage();
    }
    public GalleryPage galleryPage(){
        clickOnElementsByXpath(GALLERY_PAGE);
        return new GalleryPage();
    }
    public ResourcesPage resourcesPage() throws InterruptedException {
        clickOnElementsByXpath(RESOURCES_PAGE_DROP_DOWN_MENU);
        Thread.sleep(4);
        clickOnElementsByXpath(RESOURCES_OPTION_DROP_DOWN_MENU);
        return new ResourcesPage();
    }
    public FAQsPage faQsPage(){
        clickOnElementsByXpath(FAQ_PAGE);
        return new FAQsPage();
    }

    public BlogPage blogPage(){
        clickOnElementsByXpath(BLOG_PAGE);
        return new BlogPage();
    }
    public LoginPage loginPage(){
        clickOnElementsByXpath(LOGIN_PAGE);
        return new LoginPage();
    }
    public CartPage cartPage(){
        clickOnElementsByXpath(CART_PAGE);
        return new CartPage();

    }
    public MainPage chooseCurrencyOption(){
        clickOnElementsByXpath(CURRENCY_OPTION);
        return new MainPage();
    }
    public boolean isCurrencyDropDownVisible(){
        return elementExist(CURRENCY_GBP);
    }


}
