
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;


public class TestBase {

    private WebDriver driver;


    @BeforeMethod
    public void beforetest() {

        driver = DriverManager.getWebDriver();

        driver.navigate().to("https://academybugs.com/find-bugs/#");
    }


//    @AfterMethod
//    public void afterTest() {
//        DriverManager.disposeDriver();
//    }

}
