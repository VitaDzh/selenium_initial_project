import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase_04 {
    public static void main(String[] args) {
        /*
        Test Case 4: Validate ComfyElite Contact Us page "SEND US A MESSAGE" form
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And validate "First Name" input box
        And validate "Last Name" input box
        And validate "Email" input box
        And validate "Message" input box
        NOTE: Input validation includes input being displayed and user being able
        send keys to input box. It also requires validating the given labels and placeholders
         */
        WebDriver driver = Driver.goToComfy();
        WebElement firstNInputBox = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement firstNLabel = driver.findElement(By.xpath("//div[@data-aid='First Name']/label"));
        WebElement lastNInputBox = driver.findElement(By.xpath("//div[@data-aid='Last Name']/input"));
        WebElement lastNLabel = driver.findElement(By.xpath("//div[@data-aid='Last Name']/label"));
        WebElement emailInputBox = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/input"));
        WebElement emailLabel = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/label"));
        WebElement messageInputBox = driver.findElement(By.xpath("//textarea[@role='textbox']"));

        System.out.println(firstNInputBox.isDisplayed());
        System.out.println(firstNLabel.getText().equals("First Name*"));
        System.out.println(lastNInputBox.isDisplayed());
        System.out.println(lastNLabel.getText().equals("Last Name*"));
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(emailLabel.getText().equals("Email*"));
        System.out.println(messageInputBox.isDisplayed() && messageInputBox.getAttribute("placeholder").equals("Message*"));

        String fName = "John";
        String lName = "Doe";
        String email = "jd@gmail.com";
        String message = "I love Java";

        firstNInputBox.sendKeys(fName);
        lastNInputBox.sendKeys(lName);
        emailInputBox.sendKeys(email);
        messageInputBox.sendKeys(message);

        System.out.println(firstNInputBox.getAttribute("value"));
        System.out.println(lastNInputBox.getAttribute("value"));
        System.out.println(emailInputBox.getAttribute("value"));
        System.out.println(messageInputBox.getText());

        Driver.quitDriver();
    }
}
