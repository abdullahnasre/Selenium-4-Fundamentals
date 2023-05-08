package uitest.m4;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class ByCSSTest {
    @Test
    public void byCssSelector(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        var datePicker = driver.findElement(By.cssSelector("input[type=date]"));
        datePicker.sendKeys("10/12/2023");
        driver.quit();
    }

    @Test
    public void byCssSelector_2(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        var checkBox = driver.findElement(By.cssSelector("[type=checkbox]:not(:checked)"));
        checkBox.click();

        driver.quit();
    }
}
