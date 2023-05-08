package uitest.m6;
import helper.DemoHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class WindowManagementDemo {
    @Test
    public void tabsAndWindows(){
        WebDriver driver = new ChromeDriver();
        driver.get(HOME);
        String firstTab = driver.getWindowHandle();
        DemoHelper.pause();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(SAVINGS);
        Assert.assertEquals(driver.getWindowHandles().size(),2);
        DemoHelper.pause();
        driver.switchTo().window(firstTab);
        driver.close(); // This will close just one tab,whichever we are on right now.
        Assert.assertEquals(driver.getWindowHandles().size(),1);

        driver.quit();
    }
}
