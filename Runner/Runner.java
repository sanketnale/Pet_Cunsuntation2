package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
	features= {"./src/test/java"},
			glue ="StepDefination1",
			dryRun=false,
			monochrome = true,
			plugin = {
					"pretty","json:target/JSONReports/report.json"
			}
			
		
			)
	public class Runner extends AbstractTestNGCucumberTests{


}
