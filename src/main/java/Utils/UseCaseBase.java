package Utils;
//vspomogatel`nyi klass dlya testov
//vse deti etogo classa budut vipolnyat beforeAll i afterAll


import Pages.BasicPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class UseCaseBase {
    private static WebDriver webDriver; //peredaet komu to
    private static BasicPage page; //sozdaet Basic Page(roditel vseh pages)



    @BeforeAll
    public static void setUpMain(){
        page =  new BasicPage();
        webDriver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME); //vzizvaet funkciyu getWebDriver
        page.setWebDriver(webDriver);


    }
    @AfterAll
    public static void tearDownMain() throws InterruptedException {

        SharedDriver.closeDriver();
        webDriver = null;

    }



}
