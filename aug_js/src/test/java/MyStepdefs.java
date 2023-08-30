import Pages.CustomerRegistrationPage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    WebDriver driver;

    LoginPage loginPage;
    CustomerRegistrationPage customerRegistrationPage;

    @Before
    public void start(){

        driver = TestRunner.driver;
        //driver = BaseTest.driver;
        loginPage = new LoginPage(driver);

    }
    @Given("User navigates to the application")
    public void userNavigatesToTheApplication() {

        String actualtitle = driver.getTitle();
        String exptitle = "Your Store";
        Assert.assertEquals(exptitle,actualtitle);
    }

    @When("User enters valid credentials")
    public void userEntersValidCredentials() {

        loginPage.My_account.click();
        loginPage.login.click();

        loginPage.username.sendKeys("admin");
        loginPage.pwd.sendKeys("admin");
    }

    @And("Clicks on Login button")
    public void clicksOnLoginButton() {
        loginPage.loginbtn.click();
    }

    @Then("User is navigated to the Dashboard page")
    public void userIsNavigatedToTheDashboardPage() {
    }
}
