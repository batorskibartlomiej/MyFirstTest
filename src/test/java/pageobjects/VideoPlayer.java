package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import waits.WaitForElement;

import java.util.ArrayList;

public class VideoPlayer {

    @FindBy(xpath="//*[@id='post-1510']/div/h3")
    private WebElement tittle;
    @FindBy(xpath="//*[@id='post-1510']/div/div/div/div[1]/div/div[1]/div/button")
    private WebElement video1;


    public VideoPlayer(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public VideoPlayer checkTittle(){
        ArrayList<String> tabs2 = new ArrayList<String>(DriverManager.getWebDriver().getWindowHandles());
        DriverManager.getWebDriver().switchTo().window(tabs2.get(1));
        DriverManager.getWebDriver().close();
        DriverManager.getWebDriver().switchTo().window(tabs2.get(2));

        WaitForElement.waitUntilElemembtIsVisible(tittle);
        String tittleVideo= tittle.getText();
        System.out.println(tittleVideo);
        Assert.assertEquals(tittleVideo, "Latest News");
        return this;
    }


    public VideoPlayer clickVideo1() throws InterruptedException {
        video1.click();
        Thread.sleep(5000);
        //video1.click();
        return this;
    }


}
