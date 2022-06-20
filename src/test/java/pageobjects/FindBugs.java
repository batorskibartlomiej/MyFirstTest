package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FindBugs {

    @FindBy(xpath = "//*[@id='post-88']/div/h6")
    private WebElement tittle;


    public FindBugs() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public void checkTittle() {
        String text = tittle.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Explore a practice test site that has 25 real bugs planted inside.");
    }
}
