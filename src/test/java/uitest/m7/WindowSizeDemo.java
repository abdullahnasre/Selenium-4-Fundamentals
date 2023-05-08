package uitest.m7;

import helper.DemoHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static helper.Pages.HOME;

public class WindowSizeDemo {
    @Test
    public void WindowSizeDemo(){
        WebDriver driver = new ChromeDriver();
        driver.get(HOME);
        WebDriver.Window window = driver.manage().window();

        window.maximize();
        window.minimize();
        DemoHelper.pause();
        window.setSize(new Dimension(1200,800));
        driver.quit();
    }
}
