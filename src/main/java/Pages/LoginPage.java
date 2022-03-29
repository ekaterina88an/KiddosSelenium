package Pages;

public class LoginPage extends BasicPage{
    public static final String LOGIN_PAGE_HEADER = "//*[(text() = 'Login')]";
    public static final String LOGIN_PAGE_EMAIL_FIELD = "//* [@id = 'CustomerEmail']";
    public static final String LOGIN_PAGE_PASSWORD = "//* [@id = 'CustomerPassword']";
    public static final String LOGIN_PAGE_SIGNIN_BUTTON = "//* [@value = 'Sign In']";
    public static final String LOGIN_PAGE_ACCOUNT_HEADER = "//* [@value = 'Submit']";
    public static final String LOGIN_PAGE_INVALID_EMAIL_ERROR = "//*[contains(text() = 'Please include an '@' in the email address.')]";
    public static final String CREATE_ACCOUNT = "//* [@id = 'customer_register_link']";





    public boolean isPageTitleVisible() {
        return elementExist(LOGIN_PAGE_HEADER);

    }
    public void signInButtonClick(){
        clickOnElementsByXpath(LOGIN_PAGE_SIGNIN_BUTTON);

    }
    public void loginPageEnterEmail(String email){
        sendTextToElementsByXpath(LOGIN_PAGE_EMAIL_FIELD, email);
    }
    public void loginPageEnterPass(String password){
        sendTextToElementsByXpath(LOGIN_PAGE_PASSWORD, password);
    }
    public boolean isAccountHeaderVisible(){
        return elementExist(LOGIN_PAGE_ACCOUNT_HEADER);
    }
    public boolean isErrorInvalidEmailVisible(){
        return elementExist(LOGIN_PAGE_INVALID_EMAIL_ERROR);
    }
    public CreateAccountPage createAccountPageOpen  (){
        clickOnElementsByXpath(CREATE_ACCOUNT);
        return new CreateAccountPage();

    }

}

