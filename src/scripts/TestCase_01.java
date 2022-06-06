package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase_01 {
    public static void main(String[] args) {

        /*
        Test Case 1: Validate ComfyElite Contact Us Page heading section
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see ComfyElite logo
        And user should be able to see heading2 as “High quality
        comfy pillows and accessories for travel, office and home.”
        xpath = "//h1[@id='firstHeading']"
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        System.out.println("User is on Contact us page - " + driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")); // we can also validate title, because it will be changed
        WebElement comfyEliteLogo = driver.findElement(By.xpath("//a[@title='COMFY ELITE']/div/img"));
        WebElement headind2 = driver.findElement(By.id("dynamic-tagline-48605"));
        //  WebElement headind22 = driver.findElement(By.xpath("//h2[@data-ux='Tagline']"));


        System.out.println("COMFY ELITE logo is displayed - " + (comfyEliteLogo.isDisplayed() && comfyEliteLogo.getAttribute("alt").equals("COMFY ELITE")));
        System.out.println("Heading2 is displayed - " + (headind2.isDisplayed() && headind2.getText().equals("High quality comfy pillows and accessories for travel, office and home.")));
        // System.out.println(headind22.isDisplayed());
        Driver.quitDriver();

    }
}
