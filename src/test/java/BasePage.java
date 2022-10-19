import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private final int BASIC_TIME = 15;

    //to make less code we will use $ method - to get element & $$ - to get elements (List<WebElements>)
    public WebElement $(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> $$(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public WebElement getElementByVisibility(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> getElementsByVisibility(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public WebElement moveTo(String locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement($(locator)).perform();
        return driver.findElement(By.xpath(locator));
    }

    public void moveCursor(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}
