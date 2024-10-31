package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterInsurantDataPage {
    WebDriver driver;

    @FindBy(id = "firstname")
    WebElement firstNameField;

    @FindBy(id = "lastname")
    WebElement lastNameField;

    @FindBy(id = "birthdate")
    WebElement birthdateField;

    @FindBy(id = "streetaddress")
    WebElement streetAddressField;

    @FindBy(id = "country")
    WebElement countryDropdown;

    @FindBy(id = "zipcode")
    WebElement zipCodeField;

    @FindBy(id = "occupation")
    WebElement occupationDropdown;

    @FindBy(xpath = "//input[@id='speeding']/following-sibling::span")
    WebElement hobbySpeeding;

    @FindBy(xpath = "//input[@id='bungeejumping']/following-sibling::span")
    WebElement hobbyBungeeJumping;

    @FindBy(xpath = "//input[@id='cliffdiving']/following-sibling::span")
    WebElement hobbyCliffDiving;

    @FindBy(xpath = "//input[@id='skydiving']/following-sibling::span")
    WebElement hobbySkydiving;

    @FindBy(xpath = "//input[@id='other']/following-sibling::span")
    WebElement hobbyOther;

    @FindBy(id = "nextenterproductdata")
    WebElement nextButton;

    public EnterInsurantDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillInsurantData(String firstName, String lastName, String birthdate, String streetAddress, String country,
                                 String zipCode, String occupation, boolean selectSpeeding, boolean selectBungeeJumping,
                                 boolean selectCliffDiving, boolean selectSkydiving, boolean selectOther) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        birthdateField.sendKeys(birthdate);
        streetAddressField.sendKeys(streetAddress);
        countryDropdown.sendKeys(country);
        zipCodeField.sendKeys(zipCode);
        occupationDropdown.sendKeys(occupation);

        if (selectSpeeding) hobbySpeeding.click();
        if (selectBungeeJumping) hobbyBungeeJumping.click();
        if (selectCliffDiving) hobbyCliffDiving.click();
        if (selectSkydiving) hobbySkydiving.click();
        if (selectOther) hobbyOther.click();
    }

    public void clickNext() {
        nextButton.click();
    }
}
