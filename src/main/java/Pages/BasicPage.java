package Pages;

import Utils.UseCaseBase;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.io.IOException;
//Samayi glavnyi class

public class BasicPage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    //pomogaet podojdat nekotoroe vremya

    //poluchaet webDriver iz classa UseCaseBase
    public void setWebDriver(WebDriver webDriver){

       this.webDriver = webDriver; //prisvaivaet znachenie svoemu webDeiver
        wait = new WebDriverWait(webDriver,10);

    }
    protected void clickOnElementsByXpath(String xpath){
        findElementByXpath(xpath).click();

    }
//zaponyaet edit box
    protected void sendTextToElementsByXpath(String xpath, String text){
       webDriver.findElement(By.xpath(xpath)).sendKeys(text);

    }
    //proverit sushesvuet li elemetn na stranice
    protected boolean elementExist(String xpath) {
        try {
            webDriver.findElement(By.xpath(xpath));
            return true;
        }
        catch (Exception err){
            return false;

        }
    }
    protected WebElement findElementByXpath(String xpath){
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));//jdem kogda elemet poyavitsya na ekrane
        element = webDriver.findElement(By.xpath(xpath));
        return element;

    }
    //proverka na kakom url my nahodimsya
    protected String getCurrentPageURL(){
        return webDriver.getCurrentUrl();


    }
    public void takeScreenshot(String name) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + name + ".jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void byVisibleElement(String xpath) {

        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        //Locating element by link text and store in variable "Element"
        WebElement Element = webDriver.findElement(By.xpath(xpath));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
    public void closePopUp(){
        findElementByXpath("//i [@class='_close-icon']").click();
    }


    }



