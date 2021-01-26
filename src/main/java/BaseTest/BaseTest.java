package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {



    public static WebDriver driver;

    @BeforeMethod
    public void startBrowser() {

        //System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\Mohammad\\Documents\\workspacewawe\\course3\\src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mabed\\Desktop\\assignment\\atyponBook\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");

    }
//    @AfterMethod(alwaysRun = true)
//    public void CloseBrowser() {
//
//        driver.quit();
//    }
}
