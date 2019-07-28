package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/feature4Runner.feature",
				 glue="stepDefinitions",
				 monochrome=true,
				 dryRun = false)
public class Test4Runner {

}
