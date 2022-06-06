import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExamplesOfBugsTest {

    private WebDriver driver;


    @BeforeMethod
    public void beforetest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://academybugs.com/find-bugs/#");
    }





    @Test
    public void examplesOfBugs(){

        MainPage mainPage= new MainPage(driver);
        mainPage.clickOnExamples();
        ExamplesOfBugs examplesOfBugs = new ExamplesOfBugs(driver);
        examplesOfBugs.checkText();
        ok




    }

    @AfterMethod
    public void afterTest() {
        // driver.close();
        driver.quit();
    }

}
