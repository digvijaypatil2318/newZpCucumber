package JaiSuryaDev;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature/DataDriven.feature"},
		glue= {"StepDefinition"},
		monochrome=true,
		dryRun=true,
		plugin= {"html:Reports/xyz.html"}
		
		
		
		
		
		
		
		) 





public class TestRunner {

}
