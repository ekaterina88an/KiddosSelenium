package Pages;

public class CreateAccountPage extends BasicPage{
    public static final String CREATE_ACCOUNT_PAGE_HEADER = "//*[(text() = 'Create Account')]";
    public static final String CREATE_ACCOUNT_FIRST_NAME_FIELD = "//input[@name = 'customer[first_name]']";
    public static final String CREATE_ACCOUNT_LAST_NAME_FIELD = "//input[@name = 'customer[last_name]']";
    public static final String CREATE_ACCOUNT_EMAIL_FIELD = "//input[@name = 'customer[email]']";
    public static final String CREATE_ACCOUNT_PASSWORD_FIELD = "//input[@name = 'customer[password]']";
    public static final String CREATE_ACCOUNT_CREATE_BUTTON = "//input[@value = 'Create']";
    public static final String CREATE_ACCOUNT_ERROR_ALL_MESSAGE = "//div[@class = 'errors']";
    public static final String CREATE_ACCOUNT_EMAIL_CANT_BE_BLANK_MESSAGE = "//div[@class = 'errors']//li";
    public static final String CREATE_ACCOUNT_SUCCESSFUL_ACCOUNT= "//* [@class= 'hero hero--medium hero__overlay']";



    public boolean isPageTitleVisible() {
        return elementExist(CREATE_ACCOUNT_PAGE_HEADER);
    }

    public void createAccountButtonClick() {
        clickOnElementsByXpath(CREATE_ACCOUNT_CREATE_BUTTON);
    }
    public boolean accountCreatedSuccessful(){
        return elementExist(CREATE_ACCOUNT_SUCCESSFUL_ACCOUNT);

    }
    public void createAccountEnterFirstName(String name){
        sendTextToElementsByXpath(CREATE_ACCOUNT_FIRST_NAME_FIELD, name);
    }
    public void createAccountEnterLastName(String lastname){
        sendTextToElementsByXpath(CREATE_ACCOUNT_LAST_NAME_FIELD, lastname);
    }
    public void createAccountEnterEmail(String email) {
        sendTextToElementsByXpath(CREATE_ACCOUNT_EMAIL_FIELD, email);
    }
    public void createAccountEnterPass(String password) {
        sendTextToElementsByXpath(CREATE_ACCOUNT_PASSWORD_FIELD, password);
    }
    public boolean isErrorMessageAllBlankFields(){
        return elementExist(CREATE_ACCOUNT_ERROR_ALL_MESSAGE);
    }
    public boolean isCreateAccErrorInvalidEmailVisible(){
        return elementExist(CREATE_ACCOUNT_EMAIL_CANT_BE_BLANK_MESSAGE);
    }

}


