import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    @Test

    public void mainPageTest(){
        MainPage mainPage=new MainPage();
        mainPage.clickOnExamples();

        ExamplesOfBugs examplesOfBugs=new ExamplesOfBugs();
        examplesOfBugs.checkText();
        examplesOfBugs.closeTutorialButton();

        mainPage.clickOnTypesOfbugs();
        TypesOfBugs typesOfBugs= new TypesOfBugs();
        typesOfBugs.checkText();

        mainPage.clickOnFindBugs();


    }
}
