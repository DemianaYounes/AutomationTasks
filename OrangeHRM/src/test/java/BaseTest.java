import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    public WebDriver driver;
    protected LoginPage page;
    @BeforeMethod
    public void setUp()
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        page=new LoginPage(driver);
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
