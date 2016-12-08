package mobileImportedPackage;
import com.experitest.selenium.*;
import org.openqa.selenium.By;
import org.junit.*;
/**
 *
*/
public class FirstMobileScript {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\gurusamy\\workspace\\project2";
    protected MobileWebDriver driver = null;

    @Before
    public void setUp(){
        driver = new MobileWebDriver( host, port, projectBaseDirectory, "xml", "reports", "Untitled");
    }

    @Test
    public void testUntitled(){
        driver.setDevice("adb:ASUS_Z00LD");
        driver.useNativeIdentification();
        //driver.findElement(By.xpath("//*[@contentDescription='Calculator']")).click();
        //driver.client.deviceAction("Back");
        //if(driver.findElement(By.xpath("//*[@text='Calculator']")).waitFor(10000)){
            // If statement
        //}
        driver.findElement(By.xpath("//*[@text='Calculator']")).click();
        driver.findElement(By.xpath("//*[@text='C']")).click();
        driver.findElement(By.xpath("//*[@text='5']")).click();
        driver.findElement(By.xpath("//*[@text='1']")).click();
        driver.findElement(By.xpath("//*[@text='×']")).click();
        driver.findElement(By.xpath("//*[@text='6']")).click();
        driver.findElement(By.xpath("//*[@text='9']")).click();
        driver.findElement(By.xpath("//*[@text='=']")).click();
    }

    @After
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
        driver.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        driver.releaseClient();
    }
}
