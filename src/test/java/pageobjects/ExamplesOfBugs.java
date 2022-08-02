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

    @FindBy(xpath="//*[@id='popmake-4434']/button")
    private WebElement closeButton;

//    @FindBy(xpath="//*[@id='popmake-4434']/href")
    @FindBy(id="low_s")
     private WebElement articleList;

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
        return new ExamplesOfBugs();
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
        return  new ExamplesOfBugs();
    }

    public ExamplesOfBugs checkTittleSocialBugs() {

        WaitForElement.waitUntilElemembtIsVisible(tittleSocialBugs);
        String text = tittleSocialBugs.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Social share buttons don’t work");
        return  new ExamplesOfBugs();


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
}