import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePick {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        // Find the login button and click on it
        WebElement calender = driver.findElement(By.id("datepicker"));
        calender.click();
    }
}
