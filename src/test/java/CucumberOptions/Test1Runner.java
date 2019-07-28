package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/feature1Runner.feature",
				 glue="stepDefinitions",				
				 monochrome=true,
				 dryRun = false)
public class Test1Runner {

}
