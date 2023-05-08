package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class NavigationTest {



    @Test
    public void basicNavigationTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        DemoHelper.pause();
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }

    @Test
    public void basicNavigationTestRefactored(){
        WebDriver driver = DriverFactory.newDriver();

        driver.get(HOME);
        driver.get(SAVINGS);
        driver.quit();

    }
}
