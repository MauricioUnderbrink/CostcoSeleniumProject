package test.utils;
import costco.page.elements.MainPageElements;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeleniumUtilityMethods {


    public static List<String> getTabText(WebDriver driver, List<WebElement> elements){


        List<WebElement> allSubTabsList = (List<WebElement>) elements;
        List<String> getSubTabTittles = new ArrayList<>();

        for(WebElement eachSubTab :  allSubTabsList ) {
            String tabText = eachSubTab.getText();

            if (tabText.contains("\n")) {
              String[] allText =  tabText.split("\n");

                getSubTabTittles.add(allText [0].trim());
            }else{
                getSubTabTittles.add(eachSubTab.getText().trim());
            }
        }
return getSubTabTittles;

    }




    /**
     * This method will return all the available options from a dropdown selection field
     */
    public static Map<String, String> getAvailableDropdownOptions(WebDriver driver,
                                                                  WebElement element) {
        Select dropDownSelection = new Select(element);
        List<WebElement> options = dropDownSelection.getOptions();
        Map<String, String> availableOptions = new HashMap<>();
        for (WebElement option : options) {
            String optionValue = option.getAttribute("value");
            String optionText = option.getText();
            availableOptions.put(optionValue, optionText);
        }

        return availableOptions;
    }

    /**
     * This method will set the dropdown field to the given text
     */
    public static void setDropdownByText(WebDriver driver, WebElement element,
                                         String selectOptionText) {
        WebElement dropdownElement = element;
        Select dropdownSelect = new Select(dropdownElement);
        WebElement selectedOption = dropdownSelect.getFirstSelectedOption();
        String selectedOptionText = selectedOption.getText();
        List<WebElement> options = dropdownSelect.getOptions();
        boolean optionFound = false;
        if (!selectedOptionText.contains(selectOptionText)) {
            for (WebElement option : options) {
                String optionText = option.getText();
                if (optionText.contains(selectOptionText)) {
                    optionFound = true;
                    dropdownSelect.selectByVisibleText(optionText);
                    break;
                }
            }

            if (!optionFound) {
                throw new NoSuchElementException(
                        "No selection option '" + selectOptionText + "' was found.");
            }
        }
    }

    /**
     * This method will set the dropdown field to the given value
     */
    public static void setDropdownByValue(WebDriver driver, WebElement element,
                                          String selectOptionValue) {
        WebElement dropdownElement = element;
        Select dropdownSelect = new Select(dropdownElement);
        List<WebElement> options = dropdownSelect.getOptions();
        boolean optionFound = false;
        for (WebElement option : options) {
            String methodText = option.getAttribute("value");
            if (methodText.equals(selectOptionValue)) {
                optionFound = true;
                dropdownSelect.selectByValue(selectOptionValue);
                break;
            }
        }

        if (!optionFound) {
            throw new NoSuchElementException(
                    "No selection option '" + selectOptionValue + "' was found.");
        }
    }

    /**
     * This method will click on the Tab by passing
     */
    public static void clickTab(WebDriver driver, WebElement element) {
        if(element != null && (!element.isSelected())) {
            element.click();
        }
    }

    /**
     * This method returns the selected option from a dropdown
     * @param element
     * @return String
     */
    public static String getSelectedOption(WebElement element) {
        Select getSelectedDestination = new Select(element);
        String selectedOption = getSelectedDestination.getFirstSelectedOption().getText();
        return selectedOption;
    }

    /**
     * This method selects the parent Tab and also the sub tab
     * @param driver
     * @param parentTab
     *  @param childTab
     */
    public static void selectParentAndChildTab(WebDriver driver, WebElement parentTab, WebElement childTab) {
        SeleniumUtilityMethods.clickTab(driver, parentTab);
        SeleniumUtilityMethods.clickTab(driver, childTab);
    }

    /**
     * This method sets the dropdown by text and asserts that it is selected
     * @param driver
     * @param element
     *  @param optionText
     */
    public static void setDropdownAndCheckThatIsSelected(WebDriver driver, WebElement element, String optionText) {
        SeleniumUtilityMethods.setDropdownByText(driver, element, optionText);
        //Check that the selected option gets selected
        String selectedDestinationOption = SeleniumUtilityMethods.getSelectedOption(element);
        Assert.assertEquals(selectedDestinationOption,optionText);
    }


    /**
     * This method sets the dropdown by text and asserts that the options do contain the giving text
     * @param driver
     * @param element
     *  @param optionText
     */
    public static void checkOptionsDoContainText(WebDriver driver, WebElement element, String optionText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if(element != null) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        //Get all Keys and Values from the Region options
        Map<String, String> getAvailableOptions = SeleniumUtilityMethods.getAvailableDropdownOptions(driver,element);
        List<String> getTextList = new ArrayList<>(getAvailableOptions.values());
        Assert.assertTrue(getTextList.contains(optionText));
    }

    /**
     * This method sets the dropdown by text and asserts that the options do not contain the giving text
     * @param driver
     * @param element
     *  @param optionText
     */
    public static void checkOptionsDoNotContainText(WebDriver driver, WebElement element, String optionText) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if(element != null) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
            //Get all Keys and Values from the Region options
            Map<String, String> getAvailableOptions = SeleniumUtilityMethods.getAvailableDropdownOptions(driver,element);
            List<String> getTextList = new ArrayList<>(getAvailableOptions.values());
            Assert.assertFalse(getTextList.contains(optionText));
        }


    /**
     * This method will select a date from a calendar
     * @param driver
     * @param element
     *  @param String
     */
        public static void selectDateFromCalendar(WebDriver driver, WebElement element,String Month, String Day, String year  ){

            //click on the calendar
          WebElement dateCalendar = MainPageElements.getDepartureCalendarWidgetElement(driver);
            dateCalendar.click();
            //select a data


            //WebElement date = dateCalendar.findElement(".//td[@tille = '"+);

        }


    }
