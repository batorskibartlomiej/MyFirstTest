import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class MainPage{


    @FindBy(id="menu-item-5906" )
    private WebElement examplesOfBugs;

    //*[@id="sq-content"]/div/section/h3



    public MainPage() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnExamples(){

        examplesOfBugs.click();

    }






}
