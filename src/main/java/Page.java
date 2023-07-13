import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    private WebDriver driver;
    private String baseURL = "https://www.panda.by/";
    private String footerEmailLocator = "//a/a[@href='mailto:market@panda.by']";

    public Page(WebDriver driver) {

        this.driver = driver;
    }

    public void openBaseURL() {

        driver.get(baseURL);
    }

    public String getFooterEmailText() {

        WebElement actFooterEmail = driver.findElement(By.xpath(footerEmailLocator));
        String actFooterEmailMessage = actFooterEmail.getText();
        return actFooterEmailMessage;
    }
}
