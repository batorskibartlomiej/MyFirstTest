import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {

    private WebDriver driver;


    @BeforeMethod
    public void beforetest() {

        driver = DriverManager.getWebDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://academybugs.com/find-bugs/#");
    }












    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}
