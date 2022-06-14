
import org.testng.annotations.Test;

public class ExampleOfBugsTest extends TestBase {




    @Test
    public void exampleOfBugsTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickOnExamples();
        ExamplesOfBugs examplesOfBugs = new ExamplesOfBugs();
        examplesOfBugs.closeTutorialButton();
        examplesOfBugs.clickSocialShareButtonBugs();
        Thread.sleep(600);//do poprawy!!! zrobic clase z waitami
        examplesOfBugs.checkTittleSocialBugs();


    }
}
