package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/Feature/featurefile.feature", glue = "stepDefinition",
		plugin = {"html: test-reports"},
		monochrome = true)


public class execute {

}
