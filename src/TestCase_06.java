import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase_06 {
    public static void main(String[] args) {
        /*
        Test Case 6: Validate ComfyElite Contact Us page "SEND" button
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And validate "SEND" button is displayed and clickable
        And validate button text is displayed as “SEND”
         */
        WebDriver driver = Driver.goToComfy();
        WebElement sendButton = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled());
        System.out.println(sendButton.getText().equals("SEND"));

        Driver.quitDriver();



    }
}
