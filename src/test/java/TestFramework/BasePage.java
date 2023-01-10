package TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected AjaxElementLocatorFactory ajaxElement;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        ajaxElement = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(ajaxElement, this);
        wait = new WebDriverWait(driver, 10, 100);
    }

    protected void waitForElementTobeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForElementTobeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
