import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class MainPage{


    @FindBy(id="menu-item-5906" )
    private WebElement examplesOfBugs;

    //*[@id="sq-content"]/div/section/h3

    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnExamples(){

        examplesOfBugs.click();

    }

    @Test
    public void checkExamples(){
        MainPage mainPage = new MainPage(driver);

    }




}
