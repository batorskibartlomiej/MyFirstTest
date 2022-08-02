package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class ContactUs {

    @FindBy(xpath="//*[@id='contact-form']/h3")
    private WebElement tiitle;
//*[@id="contact-form"]/h3

    public ContactUs() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public void checkTittle(){
        ArrayList<String> tabs2 = new ArrayList<String>(DriverManager.getWebDriver().getWindowHandles());
        DriverManager.getWebDriver().switchTo().window(tabs2.get(1));
        DriverManager.getWebDriver().close();
        DriverManager.getWebDriver().switchTo().window(tabs2.get(2));

        String tittle = tiitle.getText();
        System.out.println(tittle);
        Assert.assertEquals(tittle, "Contact Us");

    }


}
