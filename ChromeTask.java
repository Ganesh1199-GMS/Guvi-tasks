package guvitasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTask {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to demoblaze
        driver.get("https://www.demoblaze.com/");

        // Verify if the title of the page is "STORE"
        if (driver.getTitle().equals("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        // Close the browser
        driver.quit();
    }
}
