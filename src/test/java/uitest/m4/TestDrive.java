package uitest.m4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestDrive {

    @Test
    public void test() {
        //System.setProperty("webdriver.chrome.driver","C:/Users/anasser/Downloads");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
