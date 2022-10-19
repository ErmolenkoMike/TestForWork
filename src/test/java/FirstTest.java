import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTest extends BasePage {
    public FirstTest(WebDriver driver) {
        super(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement newArrivals() {
        return $("//a[@href='/search/clothes']");
    }

    public WebElement aCMECup() {
        return $("//a[@href='/product/acme-cup']");
    }

    public WebElement addToCart() {
        return $("//button[@class='Button_root__G_l9X ProductSidebar_button__13iVS']");
    }

    public void changeQuantity() {
        sleep(3);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//div[@class = 'flex flex-row h-9']/*[4]")).click();
        }
    }

    public WebElement checkOnPrice() {
        return $("//div[@class='flex justify-between border-t border-accent-2 py-3 font-bold mb-2']");
    }

    public WebElement closeCartMenu() {
        return $("//button[@aria-label='Close']");
    }

    public WebElement openFeatured() {
        return $("//a[@href='/search/featured']");
    }

    public WebElement quaterZipPage() {
        return $("//a[@href='/product/quarter-zip']");
    }

    public WebElement chooseSizeM() {
        return $("//button[@aria-label='size m']");
    }

    public WebElement assertForQuarter() {
        return $("//a[@href='/product/quarter-zip']//span[@class='CartItem_productName__RYrlX']");
    }

    public WebElement assertForCup() {
        return $("//a[@href='/product/acme-cup']//span[@class='CartItem_productName__RYrlX']");
    }

    public WebElement checkOut() {
        return $("//a[@class='Button_root__G_l9X']");
    }

    public WebElement emailEnter() {
        return $("//input[@placeholder='Email or mobile phone number']");
    }

    public WebElement firstNameEnter(){
        return $("//input[@placeholder='First name (optional)']");
    }

    public WebElement lastNameEnter(){
        return $("//input[@placeholder='Last name']");
    }

    public WebElement addressEnter(){
        return $("//input[@placeholder='Address']");
    }

    public WebElement appatmentEnter(){
        return $("//input[@placeholder='Apartment, suite, etc. (optional)']");
    }

    public WebElement cityEnter(){
        return $("//input[@placeholder='City']");
    }

    public WebElement postCodeEnter(){
        return $("//input[@placeholder='Postal code']");
    }

    public WebElement continueShipping(){
        return $("//button[@id='continue_button']");
    }

    public WebElement choosePayment(){
        return $("//input[@id='checkout_shipping_rate_id_usps-prioritymailinternational-58_26']");
    }

    public WebElement verifyText(){
        return $("//div[@class='blank-slate']");
    }
}
