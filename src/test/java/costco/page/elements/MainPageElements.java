package costco.page.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageElements {


        /**
         * This method returns All the main tabs WebElements for the main travel page
         * @param driver
         * @return WebElement
         */
        public static List<WebElement> getAllMainTabs(WebDriver driver){
            List<WebElement> tabList = driver.findElements(By.xpath("//ul[@class='search-tab-flex']/li"));
            return tabList;
        }


        /**
         * This method returns the Packages Tab WebElement
         * @param driver
         * @return WebElement
         */
        public static WebElement getPackagesTabElement(WebDriver driver) {
            WebElement PackageTab =	driver.findElement(By.xpath("//li[@data-tab='vacation-packages']"));
            return PackageTab;
        }

        /**
         * This method returns the Hotels Tab WebElement
         * @param driver
         * @return WebElement
         */
        public static WebElement getHotelTabElement(WebDriver driver) {
            WebElement PackageTab =	driver.findElement(By.xpath("//li[@data-tab='hotels']"));
            return PackageTab;
        }

        /**
         * This method returns the Cruises Tab WebElement
         * @param driver
         * @return WebElement
         */
        public static WebElement getCruisesTabElement(WebDriver driver) {
            WebElement PackageTab =	driver.findElement(By.xpath("//li[@data-tab='Cruises']"));
            return PackageTab;
        }

        /**
         * This method returns the Hotels Tab WebElement
         * @param driver
         * @return WebElement
         */
        public static WebElement getRentalCarsTabElement(WebDriver driver) {
            WebElement PackageTab =	driver.findElement(By.xpath("//li[@data-tab='rental-cars']"));
            return PackageTab;
        }


    /**
     * This method returns the Span WebElement from the selected tab
     * @param eachTab
     * @return WebElement
     */
    public static WebElement getSpanTabSelection(WebElement eachTab) {
        WebElement spanTabSelection = eachTab.findElement(By.tagName("span"));
        return spanTabSelection;
    }



   // --------------------------Packages Tab fields    -----------------------------------


    /**
     * This method returns all the sub-tabs WebElement from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static List<WebElement> getAllSubTabsPackagesTabElement(WebDriver driver ) {
        List<WebElement> vacationPackagesTab = driver.findElements(By.xpath("//ul[@class='mbl-hfc-btn-level']//li"));
        return vacationPackagesTab;
    }


    /**
     * This method returns the Vacation Packages WebElement from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getVacationPackagesTabElement(WebDriver driver ) {
        WebElement vacationPackagesTab = driver.findElement(By.cssSelector("#package-sub-vp"));
        return vacationPackagesTab;
    }


    /**
     * This method returns the Destination field WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getDestinationFieldElement(WebDriver driver ) {
        WebElement destinationFieldElement = driver.findElement(By.xpath("//select[@id='vacation_package_destination']"));
        return destinationFieldElement;
    }


    /**
     * This method returns the Destination error message field WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getDestinationErrorElement(WebDriver driver ) {
        WebElement destinationerrorElement = driver.findElement(By.xpath("//label[@id='vacation_package_destination_widget-error']"));
        return destinationerrorElement;
    }



    /**
     * This method returns the Destination field WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getRegionFieldElement(WebDriver driver ) {
        WebElement regionFieldElement = driver.findElement(By.xpath("//select[@id='region']"));
        return regionFieldElement;
    }



    /**
     * This method returns the Departure Date Widget WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getDepartureDateFieldElement(WebDriver driver ) {
        WebElement departureDateField = driver.findElement(By.xpath("//input[@id='departureDateWidget']"));
        return departureDateField;
    }

    /**
     * This method returns the Departure Date calendar Widget WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getDepartureCalendarWidgetElement(WebDriver driver ) {
        WebElement departureDateWidget = driver.findElement(By.xpath("//div[@id='departure_date_widget']//button[@type='button']"));
        return departureDateWidget;
    }

    /**
     * This method returns the Return Date Widget WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getReturnDateWidgetElement(WebDriver driver ) {
        WebElement returnDateWidget = driver.findElement(By.xpath("//input[@id='returnDateWidget']"));
        return returnDateWidget;
    }


    /**
     * This method returns the Flying From Checkbox WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getFlyingFromCheckboxElement(WebDriver driver ) {
        WebElement flyingFrom = driver.findElement(By.xpath("//input[@id='flightItineraryCheckboxWidget']"));
        return flyingFrom;
    }

    /**
     * This method returns the Flying From Airport Selection WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getFlyingFromAirportCitySelectionElement(WebDriver driver ) {
        WebElement flyingFromAirportSelection = driver.findElement(By.xpath("//input[@id='departureCityTextWidget']"));
        return flyingFromAirportSelection;
    }

    /**
     * This method returns the Flying Class Selection WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getClassDropdownSelectionElement(WebDriver driver ) {
        WebElement flightClass = driver.findElement(By.xpath("//select[@id='serviceClassWidget']"));
        return flightClass;
    }

    /**
     * This method returns the Rooms Selection WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getRoomsDropdownSelectionElement(WebDriver driver ) {
        WebElement rooms = driver.findElement(By.xpath("//div[@id='number_of_rooms_widget']//select[@class='numberOfRoomsWidget']"));
        return rooms;
    }

    /**
     * This method returns the Adults Selection WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getAdultsDropdownSelectionElement(WebDriver driver ) {
        WebElement adultsDropdown = driver.findElement(By.xpath("//select[@id='adultsInRoomForWidget_1']"));
        return adultsDropdown;
    }

    /**
     * This method returns the Children Selection WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getChildrenDropdownSelectionElement(WebDriver driver ) {
        WebElement ChildrenDropdown = driver.findElement(By.xpath("//select[@id='childrenInRoomForWidget_1']"));
        return ChildrenDropdown;
    }

    /**
     * This method returns the Search Button WebElement from the Vacation Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getSearchButtonElement(WebDriver driver ) {
        WebElement ChildrenDropdown = driver.findElement(By.xpath("//div[@id='vpSearchSubmitId']//button[@type='button'][normalize-space()='Search']"));
        return ChildrenDropdown;
    }
    
    //----------------------Hotel + Flight ---------
    /**
     * This method returns the Hotel + Flight Tab WebElement from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHotelAndFlightTabElement(WebDriver driver ) {
        WebElement hotelAndFlightTab = driver.findElement(By.cssSelector("#package-sub-hp"));
        return hotelAndFlightTab;
    }


//----------------------Hotel + Flight + Car ---------


    /**
     * This method returns the Hotel + Flight + Car Tab WebElement from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHotelAndFlightAndCarTabElement(WebDriver driver ) {
        WebElement hotelAndFlightAndCarTab = driver.findElement(By.xpath("//a[@id='package-sub-hfcp']"));
        return hotelAndFlightAndCarTab;
    }


    /**
     * This method returns the age confirmation checkbox WebElement for the Hotel and Flight and Car Tab from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHFCAgeConfirmationCheckboxElement(WebDriver driver ) {
        WebElement ageConfirmationCheckbox = driver.findElement(By.xpath("//div[@id='hfcDriversAgeWidgetDiv']//span[@class='checkbox-widget-element']"));
        return ageConfirmationCheckbox;
    }


    //----------------------Hotel + Car ---------


    /**
     * This method returns the Hotel + Flight + Car Tab WebElement from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHotelAndCarTabElement(WebDriver driver ) {
        WebElement hotelAndCarTab = driver.findElement(By.xpath("//a[@id='package-sub-hcp']"));
        return hotelAndCarTab;
    }



    /**
     * This method returns the Car Drop-Off at Same Location Radio Button WebElement for the Hotel and Car Tab from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHotelCarCarDropOffAtSameLocationRadioButtonElement(WebDriver driver ) {
        WebElement carDropOffAtSameLocation = driver.findElement(By.xpath("//div[@id='dpHotelCar']//span[@class='radio-widget-element']"));
        return carDropOffAtSameLocation;
    }


    /**
     * This method returns the Car Drop-Off at Different Location Radio Button WebElement for the Hotel and Car Tab from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHotelCarCarDropOffAtDifferentLocationRadioButtonElement(WebDriver driver ) {
        WebElement carDropOffAtDifferentLocation = driver.findElement(By.xpath("//span[@class='radio-widget differentDropOffLocationContainer']//span[1]"));
        return carDropOffAtDifferentLocation;

    }

    /**
     * This method returns the Car Drop-Off at Different Location Radio Button WebElement for the Hotel and Car Tab from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHotelCarCarPickUpAndDropOffLocationFieldElement(WebDriver driver ) {
        WebElement carPickUpAndDropOffLocation = driver.findElement(By.xpath("//input[@id='hcPickupLocationTextWidget']"));
        return carPickUpAndDropOffLocation;

    }

    /**
     * This method returns the age confirmation checkbox WebElement for the Hotel and Car Tab from the Packages tab
     * @param driver
     * @return WebElement
     */
    public static WebElement getHCAgeConfirmationCheckboxElement(WebDriver driver ) {
        WebElement ageConfirmationCheckbox = driver.findElement(By.xpath("//div[@id='hcDriversAgeWidgetDiv']//span[@class='checkbox-widget-element']"));
        return ageConfirmationCheckbox;
    }


    //----------------------Hotel Only ---------



    }



