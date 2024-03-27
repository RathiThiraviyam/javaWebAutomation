package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    static WebDriver getLocalDriver(String strBrowserName) {
        WebDriver driver = null;
        System.out.println("Select the browser:");
        try {
            switch (strBrowserName) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                default:
                    driver = new EdgeDriver();
            }
        } catch (Exception ex) {
            ex.getStackTrace();
            System.out.println(ex.getMessage());
        }
        return driver;
    }
}