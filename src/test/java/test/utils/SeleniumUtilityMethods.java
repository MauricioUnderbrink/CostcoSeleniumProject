package test.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeleniumUtilityMethods {

/*
    public static Map<String, String> getTabText(WebDriver driver, WebElement element){



return a;

    }

/*


    /**
     * This method will return all the available options from a dropdown selection field
     */
    public static Map<String, String> getAvailableDropdownOptions(WebDriver driver,
                                                                  WebElement element) {
        Select dropDownSelection = new Select(element);
        List<WebElement> options = dropDownSelection.getOptions();
        Map<String, String> availableOptions = new HashMap<>();
        for (WebElement option : options) {
            String methodValue = option.getAttribute("value");
            String methodText = option.getText();
            availableOptions.put(methodValue, methodText);
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



}
