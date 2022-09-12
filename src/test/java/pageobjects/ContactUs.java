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

    @FindBy(id="first_name")
    private WebElement firstName;

    @FindBy(name="last_name")
    private WebElement lastName;

    @FindBy(xpath="//*[@id='contact-form']/div[2]/input")
    private WebElement email;

    @FindBy(xpath="//*[@id='contact-form']/div[3]/input")
    private WebElement subject;

    @FindBy(xpath="//*[@id='contact-form']/div[5]/button")
    private WebElement sendButton;


    //*[@id="contact-form"]/div[1]/div/div[2]/input
//*[@id="contact-form"]/div[2]/input


    public ContactUs() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public ContactUs checkTittle(){
        ArrayList<String> tabs2 = new ArrayList<String>(DriverManager.getWebDriver().getWindowHandles());
        DriverManager.getWebDriver().switchTo().window(tabs2.get(1));
        DriverManager.getWebDriver().close();
        DriverManager.getWebDriver().switchTo().window(tabs2.get(2));

        String tittle = tiitle.getText();
        System.out.println(tittle);
        Assert.assertEquals(tittle, "Contact Us");
        return this;


    }

    public ContactUs writeFirstName(){
        firstName.click();
        firstName.sendKeys("Bartek");
        return this;
    }

    public ContactUs writeLastName(){
        lastName.click();
        lastName.sendKeys("Batorski");
        return this;
    }


    public ContactUs writeEmail() {
        email.click();
        email.sendKeys("test@wp.pl");
        return this;
    }

    public ContactUs writeSubject() {
        subject.click();
        subject.sendKeys("TEST");
        return this;

    }

    public ContactUs sendButtonError() {
        sendButton.click();
        return this;
    }
}
