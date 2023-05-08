package uitest.m4;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static helper.Pages.SAVINGS;

public class GetTableDataDemo {
    @Test
    public void getTableData(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(SAVINGS);

        WebElement table = driver.findElement(By.id("rates"));
        System.out.println("Table Data:");
        System.out.println(table.getText());

        System.out.println("Single row data:");
        List<WebElement> rows =table.findElements(By.tagName("tr"));
        System.out.println(rows.get(0).getText());

        driver.quit();
    }
}
