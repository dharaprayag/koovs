package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
	@CucumberOptions
		(
			features = "src/test/java/features",
			glue = "stepDefinations"
		)

	public class testRunner extends AbstractTestNGCucumberTests
	{
		//first the TestRunner file extension is JUnit (till @RunWith(Cucumber.class) not commented)
		// how to convert JUnit file convert into TestNG file
			// 1. Comment @RunWith(Cucumber.class)
			// 2. extends 'AbstractTestNGCucumberTests' then it converts into testNG file
		//now we can trigger from testNg file (when test executes testng file it will come here and
		//file is in testNg extension so it can executes from TestRunner file)
		
	}
