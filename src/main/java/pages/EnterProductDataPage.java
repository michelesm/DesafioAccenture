package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterProductDataPage {
    WebDriver driver;

    @FindBy(id = "startdate")
    WebElement startDateField;

    @FindBy(id = "insurancesum")
    WebElement insuranceSumDropdown;

    @FindBy(id = "meritrating")
    WebElement meritRatingDropdown;

    @FindBy(id = "damageinsurance")
    WebElement damageInsuranceDropdown;

    @FindBy(xpath = "//input[@id='EuroProtection']/following-sibling::span")
    WebElement optionalEuroProtection;

    @FindBy(xpath = "//input[@id='LegalDefenseInsurance']/following-sibling::span")
    WebElement optionalLegalDefenseInsurance;

    @FindBy(id = "courtesycar")
    WebElement courtesyCarDropdown;

    @FindBy(id = "nextselectpriceoption")
    WebElement nextButton;

    public EnterProductDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillProductData(String startDate, String insuranceSum, String meritRating, String damageInsurance,
                                boolean selectEuroProtection, boolean selectLegalDefenseInsurance, String courtesyCar) {
        startDateField.sendKeys(startDate);
        insuranceSumDropdown.sendKeys(insuranceSum);
        meritRatingDropdown.sendKeys(meritRating);
        damageInsuranceDropdown.sendKeys(damageInsurance);

        if (selectEuroProtection) optionalEuroProtection.click();
        if (selectLegalDefenseInsurance) optionalLegalDefenseInsurance.click();

        courtesyCarDropdown.sendKeys(courtesyCar);
    }

    public void clickNext() {
        nextButton.click();
    }
}
