import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReportBugs {

    @FindBy(xpath="//*[@id='post-4501']/div/h6")
    private WebElement tittle;


    public ReportBugs() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void checkTittle() {

        String text= tittle.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Practice creating bug reports by selecting the five practice bugs.");
    }
}
