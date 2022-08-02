package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ExamplesOfBugs;
import pageobjects.FindBugs;


public class MainPage {


    @FindBy(id = "menu-item-5906")
    private WebElement examplesOfBugs;
    @FindBy(id = "menu-item-1024")
    private WebElement typesOfbugs;
    @FindBy(xpath = "//*[@id='menu-item-561']/a")
    private WebElement findBugs;
    @FindBy(xpath = "//*[@id='menu-item-5687']/a")
    private WebElement reportBugs;



    public MainPage() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public ExamplesOfBugs clickOnExamples() {

        examplesOfBugs.click();
        return new ExamplesOfBugs();

    }

    public TypesOfBugs clickOnTypesOfbugs() {
        typesOfbugs.click();
        return new TypesOfBugs();
    }

    public FindBugs clickOnFindBugs() {
        findBugs.click();

        return new FindBugs();
    }


    public ReportBugs clickOnReportBugs() {
        reportBugs.click();
        return new ReportBugs();
    }
}
