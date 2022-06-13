import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExamplesOfBugs {



    @FindBy(xpath= "//*[@id='sq-content']/div/section/h3" )
    private WebElement examplesOfBugsName;
    @FindBy(xpath="  //*[@id='TourTip0']/button")
    private WebElement closeTutorialButton;








    public ExamplesOfBugs() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void checkText(){

        String text= examplesOfBugsName.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Examples of Bugs");



    }


    public void closeTutorialButton() {
        closeTutorialButton.click();
    }
}
