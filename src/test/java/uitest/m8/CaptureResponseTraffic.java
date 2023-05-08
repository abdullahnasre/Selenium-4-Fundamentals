package uitest.m8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v109.network.Network;
import org.openqa.selenium.devtools.v109.network.model.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureResponseTraffic {
    WebDriver driver;
    DevTools devTools;
    @Test
    public void captureResponseTraffic(){
        driver = new ChromeDriver();
        devTools = ((ChromeDriver)driver).getDevTools();
        devTools.createSession();

        devTools.addListener(Network.responseReceived(),
                responseReceived -> {
                    Response r = responseReceived.getResponse();
                    System.out.printf("Response status: %s \n",r.getStatus());
                    Assert.assertTrue(r.getStatus()  <= 400);
                }
        );

        driver.get("http://127.0.0.1:8000/");
    }
    @Test
    public void manipulateTraffic(){

    }
    @AfterMethod
    public void cleanup(){
        devTools.send(Network.disable());
        devTools.close();
        driver.quit();
    }
}
