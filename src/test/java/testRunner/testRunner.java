package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ={".//Feature Files/Login.feature"}, // Providing the path for feature files 
		//features ={".//Feature Files/ScenarioOutline.feature"}, // Providing the path for feature files 
		// glue = {"StepDefinitionTwo","hooks"},  // Provide the path for the Step definitions package
		 dryRun = true // If set to true, will check if each step inside the feature file has its mapping step definition  
		
		)
public class testRunner {
	
}
