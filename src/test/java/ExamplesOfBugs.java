import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExamplesOfBugs {


    @FindBy(xpath = "//*[@id='sq-content']/div/section/h3")
    private WebElement examplesOfBugsName;
    @FindBy(xpath = "  //*[@id='TourTip0']/button")
    private WebElement closeTutorialButton;
    @FindBy(xpath = "//*[@id='sq-content']/div/section/div/a[1]/div/div/h5")
    private WebElement socialShareButtonBugs;
    @FindBy(xpath="//*[@id='popmake-4434']/div/h5")
    private WebElement tittleSocialBugs;


    public ExamplesOfBugs() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void checkTittle() {

        String text = examplesOfBugsName.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Examples of Bugs");


    }


    public void closeTutorialButton() {
        closeTutorialButton.click();
    }


    public void clickSocialShareButtonBugs() {
        socialShareButtonBugs.click();
    }

    public void checkTittleSocialBugs() {

        String text = tittleSocialBugs.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Social share buttons don’t work");


    }

}