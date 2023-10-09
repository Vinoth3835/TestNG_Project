package StepRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\THIS PC\\eclipse-workspace\\shivin_tech\\CucumberBDDSep_1pm\\Features", glue = {
		"Stepdefinition" }, monochrome = true, plugin = { "pretty", "html:Reports/Htmlreport.html",
				"junit:Reports/junitReport.xml", "json:Reports/jsonReport.json" }, dryRun = false)

public class Runner extends AbstractTestNGCucumberTests {

}
