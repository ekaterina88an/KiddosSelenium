package Pages;

public class ContactUsPage extends BasicPage{
    public static final String CONTACT_US_HEADER = "//h1[text() = 'Contact us']";
    private static final String CONTACT_US_NAME = "//input [@name = 'field[3]']";
    private static final String CONTACT_US_EMAIL = "//input[@name= 'email']";
    private static final String CONTACT_US_TEXT = "//*[@name = 'field[7]']";
    private static final String CONTACT_US_SEND_BUTTON = "//*[@name = 'field[7]']";
    public static final String CONTACT_US_EMPTY_NAME_ERROR_MESSAGE = "//div[@class = '_form_element _field3 _full_width ']//div[@class = '_error _above']//*[text() = 'This field is required.']";
    public static final String CONTACT_US_EMPTY_EMAIL_ERROR_MESSAGE = "//div[@class = '_form_element _x69676162 _full_width ']//div[@class = '_error _above']//*[text() = 'This field is required.']";
    public static final String CONTACT_US_EMPTY_MESSAGE_ERROR_MESSAGE = "//div[@class = '_form_element _field7 _full_width ']//div[@class = '_error _above']//*[text() = 'This field is required.']";
    public static final String CONTACT_US_ENTER_VALID_EMAIL_ERROR_MESSAGE = "//*[text() = 'Enter a valid email address.']";



    public boolean isPageTitleVisible(){
       return elementExist(CONTACT_US_HEADER);
    }
    public void contactUsSendMessageButton() {
        clickOnElementsByXpath(CONTACT_US_SEND_BUTTON);
    }
    public void contactUsEnterName(String name){
        sendTextToElementsByXpath(CONTACT_US_NAME, name);
    }
    public void contactUsEnterEmail(String email){
        sendTextToElementsByXpath(CONTACT_US_EMAIL,email);
    }
    public void setContactUsEnterText(String text){
        sendTextToElementsByXpath(CONTACT_US_TEXT,text);
    }
    public boolean isNoNameErrorMessagesVisible(){
        return elementExist(CONTACT_US_EMPTY_NAME_ERROR_MESSAGE);
    }

    public boolean isNoEmailErrorMessageVisible(){

        return elementExist(CONTACT_US_EMPTY_EMAIL_ERROR_MESSAGE);
    }

    public boolean isEmptyMessageFieldErrorMessageVisible(){
        return elementExist(CONTACT_US_EMPTY_MESSAGE_ERROR_MESSAGE);
    }
    public boolean isEnterValidEmailErrorMessageVisible(){
        return elementExist(CONTACT_US_ENTER_VALID_EMAIL_ERROR_MESSAGE);
    }
}
