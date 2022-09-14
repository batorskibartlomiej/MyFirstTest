package tests;

import org.testng.annotations.Test;
import pageobjects.ContactUs;
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
                .checkTittle()
                .writeFirstName()
                .writeLastName()//contactUs
                .writeEmail()
                .writeSubject()
                .sendButtonError()
                .checkErrorMsg()
                .writeMsg()
                .sendButton();
        mainPage.clickOnExamples()
                .clickOnVideoPlayer();

        //Get the list of window handles




    }
}
