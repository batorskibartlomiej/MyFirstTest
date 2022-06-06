import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExamplesOfBugs {



    @FindBy(xpath= "//*[@id='sq-content']/div/section/h3" )
    private WebElement examplesOfBugs;



    private WebDriver driver;

    public ExamplesOfBugs(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkText(){

        String text= examplesOfBugs.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Examples of Bugs");



    }



}
