import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase_02 {
    public static void main(String[] args) {
        /*
        Test Case 2: Validate ComfyElite Contact Us page "Connect With Us" section
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see heading1 as "Connect With Us"
        And user should be able to see “Facebook” icon and hyperlink reference
        for it should be “https://www.facebook.com/103179127717601”
        And user should be able to see “Instagram” icon and hyperlink reference for
        it should be “https://www.instagram.com/comfyelite”
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        driver.findElement(By.xpath("//*[text()='Contact Us']")).click();

        WebElement connectWithUs = driver.findElement(By.xpath("//h1[@role='heading']/span"));
        WebElement facebookIconLink = driver.findElement(By.xpath("//div[@data-aid='SOCIAL_SOCIAL_LINKS']/a[1]"));
        WebElement instagramIconLink = driver.findElement(By.xpath("//div[@data-aid='SOCIAL_SOCIAL_LINKS']/a[2]"));

        System.out.println(connectWithUs.isDisplayed() && connectWithUs.getText().equals("Connect With Us"));
        System.out.println(facebookIconLink.isDisplayed() && facebookIconLink.getAttribute("href").equals("https://www.facebook.com/103179127717601"));
        System.out.println(instagramIconLink.isDisplayed() && instagramIconLink.getAttribute("href").equals("https://www.instagram.com/comfyelite"));

        Driver.quitDriver();



    }
}
