package tests;

import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.TestBase;

import java.util.ArrayList;

public class ExampleOfBugsTest extends TestBase {




    @Test
    public void exampleOfBugsTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickOnExamples()
                .closeTutorialButton()
                .clickSocialShareButtonBugs()
                .checkTittleSocialBugs()
                .showArticleList()
                .checkArticlesTittleSite();
        mainPage.clickOnExamples()
                .clickSendButtonRetunrsError()
                .clickContactForm()
                .checkTittle();


        //Get the list of window handles




    }
}
