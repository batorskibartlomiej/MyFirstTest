import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    @Test

    public void mainPageTest() {
        MainPage mainPage=new MainPage();
        mainPage.clickOnExamples();

        ExamplesOfBugs examplesOfBugs=new ExamplesOfBugs();
        examplesOfBugs.checkTittle();
        examplesOfBugs.closeTutorialButton();

        mainPage.clickOnTypesOfbugs();
        TypesOfBugs typesOfBugs= new TypesOfBugs();
        typesOfBugs.checkTittle();

        mainPage.clickOnFindBugs();
        FindBugs findBugs= new FindBugs();
        findBugs.checkTittle();

        mainPage.clickOnReportBugs();
        ReportBugs reportBugs= new ReportBugs();
        reportBugs.checkTittle();


    }
}
