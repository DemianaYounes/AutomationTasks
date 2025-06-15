package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage {
    //WebElements
    private final WebDriver driver;
    private WebDriverWait wait;
    private final By userNameField= By.cssSelector("input[name=\"username\"]");
    private final By passwordField=By.cssSelector("input[name=\"password\"]");
    private final By loginButton=By.cssSelector("button[type=\"submit\"]");
    private final By invalidErrorMessage=By.xpath("//p[contains(.,'Invalid credentials')]");
    private final By requiredErrorMessage=By.cssSelector("span.oxd-text.oxd-text--span.oxd-input-field-error-message");
    //Methods
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        //explicit wait
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void addUserName(String name)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
        driver.findElement(userNameField).sendKeys(name);
    }
    public void addPassword(String pass)
    {
        driver.findElement(passwordField).sendKeys(pass);
    }
    public DashboardPage clickOnButton()
    {
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
    public boolean isInvalidErrorMessageVisible()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(invalidErrorMessage));
        return driver.findElement(invalidErrorMessage).isDisplayed();
    }
    public boolean isRequiredErrorMessageVisible()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(requiredErrorMessage));
        return driver.findElement(requiredErrorMessage).isDisplayed();
    }
    public boolean isDuplicateRequiredMessageVisible()
    {
        List<WebElement> requiredErrprList=driver.findElements(requiredErrorMessage);
        for (WebElement webElement : requiredErrprList) {
            if (!webElement.isDisplayed()) //not displayed (false)
            {
                return false;
            }
        }
        return true;
    }
}
