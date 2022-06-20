package tests;

import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.TestBase;

public class ExampleOfBugsTest extends TestBase {




    @Test
    public void exampleOfBugsTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickOnExamples()
                .closeTutorialButton()
                .clickSocialShareButtonBugs()
                .checkTittleSocialBugs()
                .closeButton();


    }
}
