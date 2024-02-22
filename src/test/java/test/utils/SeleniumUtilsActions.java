package test.utils;

import costco.page.elements.MainPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtilsActions {


    /**
     * This method will scroll to the given element
     * @param driver
     * @param element
     */
    public static void scrollToElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.scrollToElement(element);
    }

}
