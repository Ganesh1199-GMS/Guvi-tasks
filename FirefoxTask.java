package guvitasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTask {
    public static void main(String[] args) {
        // Set the path for the GeckoDriver
       // System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("http://google.com");

        // Print the URL of the current page
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}

