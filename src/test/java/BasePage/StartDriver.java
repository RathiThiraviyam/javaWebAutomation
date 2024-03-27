package BasePage;

import org.openqa.selenium.WebDriver;
import static BasePage.DriverUtil.getLocalDriver;

public class StartDriver{
    public static WebDriver driver;

    public  static WebDriver getDriver(){
        String strBrowser = "chrome";
        if (driver == null) {
            System.out.println("Launch URL");
            driver = getLocalDriver(strBrowser);
        }
        return driver;
        }


    }