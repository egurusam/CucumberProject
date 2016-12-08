package stepDefinitionMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.experitest.selenium.MobileWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AdditionCalBasic {

	 private String host = "localhost";
	    private int port = 8889;
	    private String projectBaseDirectory = "C:\\Users\\gurusamy\\workspace\\project2";
	    protected MobileWebDriver driver = null;
	    
	@Given("^In Andriod and Open calculator Application$")
	public void in_Andriod_and_Open_calculator_Application() throws Throwable {
		driver = new MobileWebDriver( host, port, projectBaseDirectory, "xml", "reports", "Untitled");
		driver.setDevice("adb:ASUS_Z00LD");
        driver.useNativeIdentification();
	}

	@When("^Enter Two number for additon using plus button$")
	public void enter_Two_number_for_additon_using_plus_button() throws Throwable {
	   
		  
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

	@Then("^Two number should be added and right result should be displayed$")
	public void two_number_should_be_added_and_right_result_should_be_displayed() throws Throwable {
	 
	}


}
