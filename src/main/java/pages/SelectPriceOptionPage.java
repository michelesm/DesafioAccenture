package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPriceOptionPage {
    WebDriver driver;

    public SelectPriceOptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPriceOption(String option) {
        // Encontrar o elemento <span> que corresponde à opção "Gold" e clicar nele
        WebElement optionLabel = driver.findElement(By.cssSelector("input[value='" + option + "'] + span.ideal-radio"));
        optionLabel.click();
    }

    public void clickNext() {
        driver.findElement(By.id("nextsendquote")).click();
    }
}
