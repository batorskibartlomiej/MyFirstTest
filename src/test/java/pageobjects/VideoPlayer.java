package pageobjects;

import driver.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import waits.WaitForElement;

import java.util.ArrayList;

public class VideoPlayer {



    @FindBy(xpath = "//*[@id='post-1510']/div/h3")
    private WebElement tittle;

    @FindBy (xpath = "//*[@id='post-1510']/div/div/div/div[1]/div/div[1]/div/button")
    private WebElement video1;
    @FindBy(xpath = "//*[@id='post-1510']/div/div/div/div[2]/div/div[1]/div/div[1]/button[1]")
    public WebElement video2;
    @FindBy(xpath="//*[@id='post-1510']/div/div/div/div[3]/div/div[1]/div/button")
    private WebElement video3;
    @FindBy(xpath="//*[@id='post-1510']/div/div/div/div[4]/div/div[1]/div/div[1]/button[1]")
    private WebElement video4;
    @FindBy(xpath="//*[@id='post-1510']/div/div/div/div[1]/div/div[1]/div/div[1]/button[2]")
    public WebElement fullscreen1;
    @FindBy(xpath="//*[@id='post-1510']/div/div/div/div[2]/div/div[1]/div/div[1]/button[2]")
    public WebElement fullscreen2;
    @FindBy(xpath="//*[@id='post-1510']/div/div/div/div[3]/div/div[1]/div/div[1]/button[2]")
    public WebElement fullscreen3;



    


    public VideoPlayer() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public VideoPlayer checkTittle() {
        ArrayList<String> tabs2 = new ArrayList<String>(DriverManager.getWebDriver().getWindowHandles());
        DriverManager.getWebDriver().switchTo().window(tabs2.get(1));
        DriverManager.getWebDriver().close();
        DriverManager.getWebDriver().switchTo().window(tabs2.get(2));

        WaitForElement.waitUntilElemembtIsVisible(tittle);
        String tittleVideo = tittle.getText();
        System.out.println(tittleVideo);
        Assert.assertEquals(tittleVideo, "Latest News");
        return this;
    }


    public VideoPlayer clickVideo1( ) throws InterruptedException {
        WaitForElement.waitUntilElementIsClickable(video1);
        video1.click();



        //video1.click();
        return this;
    }

    public VideoPlayer clickVideo3(){
        WaitForElement.waitUntilElementIsClickable(video3);
        video3.click();
        return this;
    }
    public VideoPlayer clickVideo4(){
        WaitForElement.waitUntilElementIsClickable(video4);
        video4.click();
        return this;
    }


    public VideoPlayer clickVideo2() throws InterruptedException {
        WaitForElement.waitUntilElementIsClickable(video2);
        video2.click();
        Thread.sleep(2000);
        video2.click();

        //video1.click();
        return this;
    }

    public VideoPlayer clickFullScreen1() throws InterruptedException {
        WaitForElement.waitUntilElementIsClickable(fullscreen1);
        fullscreen1.click();
        Thread.sleep(2000);

//        Actions actions = new Actions(DriverManager.getWebDriver());
//        actions.sendKeys(String.valueOf('\u001B')).perform();
       fullscreen1.click();
        return this;
    }

    public VideoPlayer clickFullScreen2() throws InterruptedException {
        WaitForElement.waitUntilElementIsClickable(fullscreen2);
        fullscreen2.click();

//       WaitForElement.waitUntilElementIsClickable(fullscreen2);
//        fullscreen2.click();
      Actions actions = new Actions(DriverManager.getWebDriver());
      actions.sendKeys(String.valueOf('\u001B')).perform();
//        actions.sendKeys(Keys.ESCAPE);

        return this;



    }

    public VideoPlayer clickFullScreen3() throws InterruptedException {
        WaitForElement.waitUntilElementIsClickable(fullscreen3);
        fullscreen3.click();
        Thread.sleep(2000);

//        Actions actions = new Actions(DriverManager.getWebDriver());
//        actions.sendKeys(String.valueOf('\u001B')).perform();
        fullscreen3.click();
        return this;
    }
}
