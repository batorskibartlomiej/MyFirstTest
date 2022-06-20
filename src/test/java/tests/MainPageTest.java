package tests;

import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.TestBase;

public class MainPageTest extends TestBase {

    @Test

    public void mainPageTest() {
        MainPage mainPage=new MainPage();

        mainPage.clickOnExamples()
                .checkTittle()
                .closeTutorialButton();


        mainPage.clickOnTypesOfbugs()
                .checkTittle();

        mainPage.clickOnFindBugs()
                .checkTittle();

        mainPage.clickOnReportBugs()
                .checkTittle();


    }
}
