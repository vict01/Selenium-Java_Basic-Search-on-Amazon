package TestBench;

import PageObject.LandingPage;
import TestFramework.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class HappyPathTest extends BaseTest {

    LandingPage methods;

    @Before
    public void prepare() {
        methods = new LandingPage(getDriver());
    }

    @Test()
    public void happyPathTest() {
        methods.openLandingPage();
        methods.do_A_Search("Belt Bag for Women Fanny");
        methods.clickOnAnySearchResult(0);
        methods.clickOnAddToCart();
        methods.validateProductAddedToCart();
    }

}
