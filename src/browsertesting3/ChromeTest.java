package browsertesting3;
/*
Chrome browser test
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    public static void main(String[] args) {

        String baseURL01 = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(baseURL01);

        driver.quit();

    }
}
