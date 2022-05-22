import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase_03 {
    public static void main(String[] args) {
        /*
        Test Case 3: Validate ComfyElite Contact Us page "Contact Us" "SEND US A MESSAGE" form headings
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see heading2 as "Contact Us"
        And user should be able to see heading4 as "SEND US A MESSAGE"
         */
        WebDriver driver = Driver.goToComfy(); // setting property, instantiating, maximazing, waiting and navigating to main web page and going to “CONTACT US” page
        WebElement contactUsHeading2 = driver.findElement(By.xpath("//h2[@data-ux='SectionHeading']/span"));
        WebElement sendAMess = driver.findElement(By.xpath("//h4[@data-ux='HeadingMinor']"));

        System.out.println(contactUsHeading2.isDisplayed() && contactUsHeading2.getText().equals("Contact Us"));
        System.out.println(sendAMess.isDisplayed() && sendAMess.getText().equals("SEND US A MESSAGE"));

        Driver.quitDriver();

    }
}
