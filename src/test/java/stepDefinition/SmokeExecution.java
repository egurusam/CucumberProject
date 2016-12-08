package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeExecution {

	
	WebDriver driver;
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkSpace\\Library\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
}

@When("^Enter valid UserName and Password$")
public void Enter_valid_UserName_and_Password() throws Throwable {
}

@Then("^user should login successfully$")
public void user_should_login_successfully() throws Throwable {
   
}


}
