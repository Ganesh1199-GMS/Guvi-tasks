package guvitasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaTask {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for the ChromeDriver
        ///System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Wikipedia
        driver.get("https://www.wikipedia.org/");

        // Search for the query "Artificial Intelligence"
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.sendKeys(Keys.RETURN);

        // Wait for the results page to load
        Thread.sleep(2000);

        // Click on the "History" section link
        WebElement historyLink = driver.findElement(By.partialLinkText("History"));
        historyLink.click();

        // Print the title of the "History" section
        System.out.println("Title of the section: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

