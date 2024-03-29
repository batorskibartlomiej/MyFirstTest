package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import waits.WaitForElement;

public class ExamplesOfBugs {


    @FindBy(xpath = "//*[@id='sq-content']/div/section/h3")
    private WebElement examplesOfBugsName;
    @FindBy(xpath = "  //*[@id='TourTip0']/button")
    private WebElement closeTutorialButton;
    @FindBy(xpath = "//*[@id='sq-content']/div/section/div/a[1]/div/div/h5")
    private WebElement socialShareButtonBugs;
    @FindBy(xpath = "//*[@id='sq-content']/div/section/div/a[2]/div/div/p" )
    private WebElement sendButtonReturnsError;
    @FindBy(xpath="//*[@id='popmake-4434']/div/h5")
    private WebElement tittleSocialBugs;
    @FindBy(xpath="//*[@id='sq-content']/div/section/div/a[3]/div/div/h5")
    private WebElement videoPlayer;

    @FindBy(xpath="//*[@id='popmake-4434']/button")
    private WebElement closeButton;
    @FindBy(xpath="//*[@id='popmake-4434']/div/div/ol/li[1]/a/b")
    private WebElement videoPlayerSite;
//    @FindBy(xpath="//*[@id='popmake-4434']/href")
    @FindBy(id="low_s")
     private WebElement articleList;

    ////*[@id="popmake-4434"]/div/div/ol/li[1]/a/b

    @FindBy(id="medium_s")
    private WebElement contactUsForm;

    public ExamplesOfBugs() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public ExamplesOfBugs checkTittle() {

        String text = examplesOfBugsName.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Examples of Bugs");
        return new ExamplesOfBugs();


    }


    public ExamplesOfBugs closeTutorialButton() {
        closeTutorialButton.click();
        return this;
    }

    public ExamplesOfBugs closeButton() {
        closeButton.click();
        return new ExamplesOfBugs();
    }


    public ExamplesOfBugs clickSocialShareButtonBugs() {
        socialShareButtonBugs.click();
        return  new ExamplesOfBugs();
    }

    public ExamplesOfBugs clickSendButtonRetunrsError() {
        sendButtonReturnsError.click();
        return  this;
    }

    public ExamplesOfBugs checkTittleSocialBugs() {

        WaitForElement.waitUntilElemembtIsVisible(tittleSocialBugs);
        String text = tittleSocialBugs.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Social share buttons don’t work");
        return  this;


    }

    public ArticleList showArticleList() {
        WaitForElement.waitUntilElementIsClickable((articleList));
        articleList.click();
        return new ArticleList();
    }

    public ContactUs clickContactForm() {
        WaitForElement.waitUntilElementIsClickable((contactUsForm));
        contactUsForm.click();
        return new ContactUs();
    }

    public ExamplesOfBugs clickOnVideoPlayer(){
        WaitForElement.waitUntilElementIsClickable(videoPlayer);
        videoPlayer.click();
        return this;
    }

    public VideoPlayer goToVideoPlayer(){
        WaitForElement.waitUntilElementIsClickable(videoPlayerSite);
        videoPlayerSite.click();
        return new VideoPlayer();
    }
}