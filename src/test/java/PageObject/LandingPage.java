package PageObject;

import TestFramework.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement barSearch;

    @FindBy(how = How.CLASS_NAME, using = "s-image")
    public List<WebElement> searchResult;

    @FindBy(how = How.ID,using = "add-to-cart-button")
    public WebElement addToCartBtn;

    @FindBy(how = How.CSS, using = ".a-alert-inline-success")
    public WebElement addedToCartConfirmation;

    public void openLandingPage() {
        driver.get("https://www.amazon.com/");
    }

    public void do_A_Search(String product){
        waitForElementTobeClickable(barSearch);
        barSearch.sendKeys(product);
        barSearch.sendKeys(Keys.ENTER);
    }

    public void clickOnAnySearchResult(int idProduct){
        waitForElementTobeClickable(searchResult.get(idProduct));
        searchResult.get(idProduct).click();
    }

    public void clickOnAddToCart(){
        waitForElementTobeClickable(addToCartBtn);
        addToCartBtn.click();
    }

    public void validateProductAddedToCart(){
        waitForElementTobeVisible(addedToCartConfirmation);
        assert addedToCartConfirmation.isDisplayed();
    }

}
