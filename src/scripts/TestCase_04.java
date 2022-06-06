package scripts;

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
        WebElement firstNInputBox = driver.findElement(By.xpath("//input[@data-aid='First Name']")); // By.xpath("((//form)[2]/div//input)[1]"));
        WebElement firstNLabel = driver.findElement(By.xpath("//div[@data-aid='First Name']/label")); // By.xpath("((//form)[2]/div//label)[2]"));
        WebElement lastNInputBox = driver.findElement(By.xpath("//div[@data-aid='Last Name']/input")); // By.xpath("((//form)[2]/div//input)[2]"));
        WebElement lastNLabel = driver.findElement(By.xpath("//div[@data-aid='Last Name']/label")); // By.xpath("((//form)[2]/div//label)[2]"));
        WebElement emailInputBox = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/input")); // By.xpath("((//form)[2]/div//input)[2]"));
        WebElement emailLabel = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/label")); // By.xpath("((//form)[2]/div//label)[2]"));
        WebElement messageInputBox = driver.findElement(By.xpath("//textarea[@role='textbox']"));

        System.out.println(firstNInputBox.isDisplayed() && firstNLabel.getText().equals("First Name*"));
        System.out.println(lastNInputBox.isDisplayed() && lastNLabel.getText().equals("Last Name*"));
        System.out.println(emailInputBox.isDisplayed() && emailLabel.getText().equals("Email*"));
        System.out.println(messageInputBox.isDisplayed() && messageInputBox.getAttribute("placeholder").equals("Message*"));

        String fName = "John";
        String lName = "Doe";
        String email = "jd@gmail.com";
        String message = "I love Java";

        firstNInputBox.sendKeys(fName);
        lastNInputBox.sendKeys(lName);
        emailInputBox.sendKeys(email);
        messageInputBox.sendKeys(message);

        System.out.println(firstNInputBox.getAttribute("value").equals(fName));
        System.out.println(lastNInputBox.getAttribute("value").equals(lName));
        System.out.println(emailInputBox.getAttribute("value").equals(email));
        System.out.println(messageInputBox.getText().equals(message));

        Driver.quitDriver();
    }
}
