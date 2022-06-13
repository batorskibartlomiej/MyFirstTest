import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBugs {




    public FindBugs() {
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }



}
