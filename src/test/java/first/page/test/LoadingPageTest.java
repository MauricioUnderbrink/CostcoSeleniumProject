package first.page.test;

import costco.page.elements.MainPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoadingPageTest {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        // WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        String url = "https://www.costcotravel.com/";
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterclass() {

        driver.close();
        driver.quit();
    }

    // Test if the Packages tab is selected

    @Test(priority = 1)
    public void isPackagesTabSelected() {

        WebElement PackageTab = MainPageElements.getPackagesTabElement(driver);
        Assert.assertTrue(PackageTab.getAttribute("class").contains("active"));
        driver.switchTo().defaultContent();
    }

    /**
     * This test will select each of the tab options and check if they are selected
     */
    @Test(priority = 2)
    public void testSelectingEachTab() throws InterruptedException {
        // get all the tabs
        List<WebElement> tabList = MainPageElements.getAllMainTabs(driver);
        waitThread();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement PackagesTab = MainPageElements.getPackagesTabElement(driver);
        // wait.until(ExpectedConditions.visibilityOf(MainPageElements.getPackagesTabElement(driver)));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PackagesTab);
        for (WebElement eachTab : tabList) {
            // Click the PackagesTab
            eachTab.click();
            //Check if the selected tab changes to selected
            String spanText = MainPageElements.getSpanTabSelection(eachTab).getText();
            Assert.assertEquals(spanText, "- selected", "The text are not the same");

        }

    }

    @Test(priority = 3)
    public static void testSelectingEachSubTabsUnderPackages() {

        if(!MainPageElements.getPackagesTabElement(driver).isSelected()) {
            MainPageElements.getPackagesTabElement(driver).click();
        }

        //get the list of subtabs
        List<WebElement> allSubTabs = MainPageElements.getAllSubTabsPackagesTabElement(driver);
        //Loop selecting each tab

        List<String> eachTabsName = new ArrayList<>();
        for (WebElement eachSubTab : allSubTabs) {

            eachTabsName.add(eachSubTab.getText());
            eachSubTab.click();
            String spanText = MainPageElements.getSpanTabSelection(eachSubTab).getText();
            Assert.assertEquals(spanText, "- selected", "The text are not the same");
        }


    }


    private void waitThread() {
        try {
            Thread.sleep(1000); // Sleep for 5 seconds (5000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
