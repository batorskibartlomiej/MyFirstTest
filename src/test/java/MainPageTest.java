import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    @Test

    public void mainPageTest(){
        MainPage mainPage=new MainPage();
        mainPage.clickOnExamples();

    }
}
