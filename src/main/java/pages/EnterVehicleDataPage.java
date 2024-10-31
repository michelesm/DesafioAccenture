package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterVehicleDataPage {
    WebDriver driver;

    @FindBy(id = "make")
    WebElement makeDropdown;

    @FindBy(id = "model")
    WebElement modelDropdown;

    @FindBy(id = "cylindercapacity")
    WebElement cylinderCapacityField;

    @FindBy(id = "engineperformance")
    WebElement enginePerformanceField;

    @FindBy(id = "dateofmanufacture")
    WebElement dateOfManufactureField;

    @FindBy(id = "numberofseats")
    WebElement numberOfSeatsDropdown;

    @FindBy(id = "numberofseatsmotorcycle")
    WebElement numberOfSeatsMotorcycleDropdown;

    @FindBy(id = "fuel")
    WebElement fuelTypeDropdown;

    @FindBy(id = "payload")
    WebElement payloadField;

    @FindBy(id = "totalweight")
    WebElement totalWeightField;

    @FindBy(id = "listprice")
    WebElement listPriceField;

    @FindBy(id = "annualmileage")
    WebElement annualMileageField;

    @FindBy(id = "nextenterinsurantdata")
    WebElement nextButton;

    public EnterVehicleDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillVehicleData(String make, String model, String cylinderCapacity, String enginePerformance, String dateOfManufacture,
                                String numberOfSeats, String numberOfSeatsMotorcycle, String fuelType, String payload,
                                String totalWeight, String listPrice, String annualMileage) {
        makeDropdown.sendKeys(make);
        modelDropdown.sendKeys(model);
        cylinderCapacityField.sendKeys(cylinderCapacity);
        enginePerformanceField.sendKeys(enginePerformance);
        dateOfManufactureField.sendKeys(dateOfManufacture);
        numberOfSeatsDropdown.sendKeys(numberOfSeats);
        numberOfSeatsMotorcycleDropdown.sendKeys(numberOfSeatsMotorcycle);
        fuelTypeDropdown.sendKeys(fuelType);
        payloadField.sendKeys(payload);
        totalWeightField.sendKeys(totalWeight);
        listPriceField.sendKeys(listPrice);
        annualMileageField.sendKeys(annualMileage);
    }

    public void clickNext() {
        nextButton.click();
    }
}
