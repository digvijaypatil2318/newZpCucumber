package JaiBalaji;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/Balaji.feature"},
		glue= {"StepDefinition"},
		monochrome=true,
		dryRun=false,
		plugin= {"junit:Reports/abc.xml"},
		tags= "@SanityTesting and @EndToEndTesting"
		)








public class TestRunnerBalaji {

}
