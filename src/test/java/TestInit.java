import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;

    public void openUrl(String site) {
        driver.get(site);
    }

    @BeforeMethod
    public void starteri() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

   /* @AfterMethod
    public void after() {
        driver.quit();
    }*/

}
