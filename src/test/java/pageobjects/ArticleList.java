package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import waits.WaitForElement;

import java.util.ArrayList;

public class ArticleList  {



    @FindBy(xpath = "//*[@id='sq-content']//h5")
    private WebElement tittle;
    //*[@id="sq-content"]/header/div/h5

    public ArticleList(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }//wzorzec singleton


    public void checkArticlesTittleSite() {
        String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();
        String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle ))
                .findFirst()
                .get();
        DriverManager.getWebDriver().switchTo().window(newTabHandle);



        WaitForElement.waitUntilElemembtIsVisible(tittle);
        String siteTittle= tittle.getText();
        System.out.println(siteTittle);
        Assert.assertEquals(siteTittle,"Articles");

    }
}
