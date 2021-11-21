package JaiHanuman;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/hanuman.feature"},
		glue= {"StepDefinitionHanuman"},
		monochrome=false,
		dryRun=false,
		plugin= {"html:Reports/abc.html"}
		
		
		
		)












public class TestRunnerHanuman {

}
