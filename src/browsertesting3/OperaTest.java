package browsertesting3;
/*
Opera browser test
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest {
    public static void main(String []args){

        String baseURL03 = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.opera.driver","drivers/operadriver.exe");

        WebDriver driver = new OperaDriver();

        driver.manage().window().maximize();

        driver.get(baseURL03);

        //driver.quit();


    }

}
