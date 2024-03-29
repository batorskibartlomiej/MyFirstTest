package waits;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForElement {



    private static WebDriverWait getWebDriverWait(){

        return  new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(10));
    }


    public static void waitUntilElemembtIsVisible(WebElement element){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }



    public static void waitUntilElementIsClickable(WebElement element){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitSomeTime(){
        FluentWait<WebDriver> fluentWait = new FluentWait(getWebDriverWait());
        fluentWait.withTimeout(Duration.ofSeconds(30));
    }



}



