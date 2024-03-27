package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class letCodePages {

private WebDriver driver;

public letCodePages(WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver, this);
}

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-end']//following-sibling::a")
    protected WebElement btnLogIn;


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter registered email']")
    protected static WebElement textUserName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    protected static WebElement textPassword;

    @FindBy(how = How.XPATH, using = "//button[text()='LOGIN']")
    protected WebElement loginBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='Sigup']")
    protected WebElement btnsignup;

    @FindBy(how = How.XPATH, using = "//b[text()='LetCode']")
    protected WebElement txtLetCode;



    public void clickLoginBtn() {
        btnLogIn.click();
    }

    public void enterUsername(String strUserName){
        System.out.println(strUserName);
        textUserName.click();
        textUserName.sendKeys(strUserName);
    }

    public void enterPassword(String strPassword){
        System.out.println(strPassword);
        textPassword.click();
        textPassword.sendKeys(strPassword);
    }

    public boolean clickLoginButton(){
        boolean isVerify = false;
        try {
            isVerify = btnsignup.isDisplayed();
        } catch (Exception error) {
            loginBtn.click();

            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(txtLetCode));
        }
        return isVerify;
    }

    public void clearPasswordField() {
        textPassword.clear();
    }

    public void visit() {
        driver.manage().window().maximize();
        driver.navigate().to("https://letcode.in/test");
    }
}
