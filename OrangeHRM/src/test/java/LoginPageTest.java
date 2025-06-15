import Pages.DashboardPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest extends BaseTest {
    @Test
    public void testValidLogin()
    {
        //Add username
        page.addUserName("Admin");
        //Add password
        page.addPassword("admin123");
        //Click Login
        DashboardPage dashboardPage=page.clickOnButton();
        //assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        assertTrue(dashboardPage.checkDashBoardIcon());
    }
    @Test
    public void testInvalidUsername()
    {
        page.addUserName("demiana");
        page.addPassword("admin123");
        page.clickOnButton();
        assertTrue(page.isInvalidErrorMessageVisible());  //true
    }
    @Test
    public void testInvalidPassword()
    {
        page.addUserName("Admin");
        page.addPassword("123");
        page.clickOnButton();
        assertTrue(page.isInvalidErrorMessageVisible());  //true
    }
    @Test
    public void testEmptyPassword()
    {
        page.addUserName("Admin");
        page.addPassword("");
        page.clickOnButton();
        assertTrue(page.isRequiredErrorMessageVisible());  //true
    }
    @Test
    public void testEmptyUsername()
    {
        page.addUserName("");
        page.addPassword("admin123");
        page.clickOnButton();
        assertTrue(page.isRequiredErrorMessageVisible());  //true
    }
    @Test
    public void testEmptyUsernameAndPassword()
    {
        page.addUserName("");
        page.addPassword("");
        page.clickOnButton();
        assertTrue(page.isDuplicateRequiredMessageVisible());  //true
    }
}
