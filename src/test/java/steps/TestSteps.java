package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSteps {
    WebDriver driver;
    EnterVehicleDataPage vehicleDataPage;
    EnterInsurantDataPage insurantDataPage;
    EnterProductDataPage productDataPage;
    SelectPriceOptionPage priceOptionPage;
    SendQuotePage sendQuotePage;

    @Given("I am on the insurance application page")
    public void navigateToApplicationPage() {
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        vehicleDataPage = new EnterVehicleDataPage(driver);
        insurantDataPage = new EnterInsurantDataPage(driver);
        productDataPage = new EnterProductDataPage(driver);
        priceOptionPage = new SelectPriceOptionPage(driver);
        sendQuotePage = new SendQuotePage(driver);
    }

    @When("I fill in the vehicle data and proceed")
    public void fillVehicleData() {
        vehicleDataPage.fillVehicleData(
                "BMW",            // Make
                "Scooter",        // Model
                "500",            // Cylinder Capacity
                "100",            // Engine Performance
                "10/10/2022",     // Date of Manufacture
                "5",              // Number of Seats
                "2",              // Number of Seats Motorcycle
                "Petrol",         // Fuel Type
                "200",            // Payload
                "1500",           // Total Weight
                "30000",          // List Price
                "15000"           // Annual Mileage
        );
        vehicleDataPage.clickNext();
    }

    @When("I fill in the insurant data and proceed")
    public void fillInsurantData() {
        insurantDataPage.fillInsurantData(
                "John",           // First Name
                "Doe",            // Last Name
                "01/01/1985",     // Date of Birth
                "123 Main St",    // Street Address
                "United States",  // Country
                "12345",          // Zip Code
                "Employee",       // Occupation
                true,             // Hobby: Speeding
                false,            // Hobby: Bungee Jumping
                true,             // Hobby: Cliff Diving
                false,            // Hobby: Skydiving
                false             // Hobby: Other
        );
        insurantDataPage.clickNext();
    }

    @When("I fill in the product data and proceed")
    public void fillProductData() {
        productDataPage.fillProductData(
                "12/12/2024",     // Start Date
                "3000000",        // Insurance Sum
                "Bonus 2",        // Merit Rating
                "Partial Coverage", // Damage Insurance
                true,             // Optional Product: Euro Protection
                false,            // Optional Product: Legal Defense Insurance
                "Yes"             // Courtesy Car
        );
        productDataPage.clickNext();
    }

    @When("I select a price option and proceed")
    public void selectPriceOption() {
        priceOptionPage.selectPriceOption("Gold");
        priceOptionPage.clickNext();
    }

    @When("I fill in the quote details and submit")
    public void fillQuoteDetailsAndSubmit() {
        sendQuotePage.fillQuoteDetails(
                "test@example.com", // E-Mail
                "123456789",        // Phone
                "john_doe",         // Username
                "Password123"       // Password
        );
        sendQuotePage.clickSend();
    }

    @Then("I should see the message {string}")
    public void verifySuccessMessage(String expectedMessage) {
        // Chama o métdo atualizado de verificação da mensagem e armazena o resultado
        boolean isMessageDisplayed = sendQuotePage.verifySuccessMessage(expectedMessage);

        // Verifica se a mensagem foi exibida corretamente
        assertTrue(isMessageDisplayed, "Expected success message was not displayed.");

        // Encerra o driver após o teste
        driver.quit();
    }
}
