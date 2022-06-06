package scripts;

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
        1. MAke sure it is deselected
        2. click on it, check if it is selected
        3. click one more time, check if it is deselected
            WE HAVE TO CLICK ON A DIV, BUT CHECK IF INPUT TAG IS SELECTED, but not a div
            click() clicking in the middle of webElement
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

        /*

            WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact Us']"));
            contactUsLink.click();

            if(driver.getTitle().equals("Contact Us | COMFY ELITE")) System.out.println("User is on Contact Us page");
            else throw new NotFoundException("User is not routed to Contact Us page");


            WebElement checkBoxInput = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/input"));
            WebElement checkBoxDiv = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/div"));

            //Default - deselected
            if(!checkBoxInput.isSelected()) System.out.println("Check box is not selected by default");
            else throw new NotFoundException("Check box is selected by default");

            Thread.sleep(2000);
            checkBoxDiv.click();

            //Make sure it is selected
            if(checkBoxInput.isSelected()) System.out.println("Check box is selected after the click");
            else throw new NotFoundException("Check box is not selected after the click");

            Thread.sleep(2000);
            checkBoxDiv.click();

            //Make sure it is deselected again
            if(!checkBoxInput.isSelected()) System.out.println("Check box is deselected after the second click");
            else throw new NotFoundException("Check box is not getting deselected after the second click");

            Driver.quitDriver();
        }
    }
         */





    }
}
