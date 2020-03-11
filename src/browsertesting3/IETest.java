package browsertesting3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
Internet Explorer Test
 */
public class IETest {

    public static void main(String[] args) {

        String baseURL04 = "https://www.wcht.org.uk";

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        driver.manage().window().maximize();

        driver.get(baseURL04);

        //driver.quit();

    }
}
