package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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
                .clickOnVideoPlayer()
                .goToVideoPlayer()
                .checkTittle()
                .clickVideo1()
                .clickFullScreen1()
                .clickVideo2()
                .clickFullScreen2()
                .clickVideo2()
                .clickFullScreen2();


        //Get the list of window handles




    }
}
