package browsertesting3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
FireFox browser test
 */
public class FireFoxTest {

    public static void main(String []args){

        String baseURL02 = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get(baseURL02);

        driver.quit();

    }
}

