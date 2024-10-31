package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendQuotePage {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "phone")
    WebElement phoneField;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "confirmpassword")
    WebElement confirmPasswordField;

    @FindBy(id = "sendemail")
    WebElement sendButton;

    @FindBy(css = "div.confirm")
    WebElement successMessage;

   public SendQuotePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillQuoteDetails(String email, String phone, String username, String password) {
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
    }

    public void clickSend() {
        sendButton.click();
    }

    public boolean verifySuccessMessage(String expectedMessage) {
        try {
            // Espera que o modal com o título da mensagem de sucesso fique visível
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sweet-alert h2")));

            // Compara o texto do título do modal com o esperado
            return confirmationMessage.getText().equals(expectedMessage);
        } catch (Exception e) {
            System.out.println("Erro: Mensagem de confirmação não encontrada ou não exibida a tempo.");
            return false;
        }
    }
}
