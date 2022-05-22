package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
        }

        public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver goToComfy(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        driver.findElement(By.xpath("//*[text()='Contact Us']")).click();
        if(!driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Current URL is not correct");
        return driver;
    }
}

