package hooks ; 

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hoooks {

	@Before
	public void before(Scenario name) {
		System.out.println("********* Before Evey Scenario *************** ");
		System.out.println(name.getName());
		System.out.println(name.getStatus());
	}
	
//	@BeforeStep
//	public void beforeStep() {
//		System.out.println("********* Before Evey Step *************** ");
//	}

	
	@After
	public void After(Scenario name) {
		System.out.println("********* After Evey Scenario *************** ");
		System.out.println(name.getName());
		System.out.println(name.getStatus());
	}
	
	
//	@AfterStep
//	public void afterStep() {
//		System.out.println("********* After Evey Step *************** ");
//	}
	
	
}
