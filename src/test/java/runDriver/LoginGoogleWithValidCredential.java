package runDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"stepDefinition"})
public class LoginGoogleWithValidCredential {

}


		