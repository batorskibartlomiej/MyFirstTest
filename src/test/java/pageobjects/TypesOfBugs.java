package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TypesOfBugs {

    @FindBy(xpath="//*[@id='post-1081']/div/section/h6")
    private WebElement text;





    public TypesOfBugs(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }

    public void checkTittle(){
        String name = text.getText();
        System.out.println(name);
        Assert.assertEquals(name, "Learn the different types of bugs that commonly occur in websites and apps." );
    }
}
