import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class TestCase_05 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Test Case 5: Validate ComfyElite Contact Us page "Sign up for our email list
        for updates, promotions, and more." Checkbox
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And validate the "Sign up for our email list for updates, promotions, and more." checkbox
        Note: Checkbox validation includes checkbox being selected and deselected by user
         */

        WebDriver driver = Driver.goToComfy();

        WebElement signUpBox = driver.findElement(By.xpath("//label[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']/div"));
        WebElement signupCheck = driver.findElement(By.xpath("//input[@data-ux='InputCheckbox']"));
        WebElement textMessage = driver.findElement(By.xpath("//label[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']/p"));
        signUpBox.click();
        Thread.sleep(3000);
        System.out.println(textMessage.getText().equals("Sign up for our email list for updates, promotions, and more.") ? "Text PASSED" : "Text FAILED");
        System.out.println("Checked box validation " + (signupCheck.isSelected() ? "PASSED" : "FAILED"));

        driver.quit();






    }
}
