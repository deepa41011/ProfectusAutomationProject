package runners;

import org.junit.runner.RunWith;

import com.qa.base.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/functionalTests",
		glue= {"stepDefinitions"},
		plugin = {"pretty", "html:Reports/cucumber-html-report/Report.html"}, 
		monochrome = true,
		dryRun = false

	)

public class TestRunner extends TestBase{
	
	/*
	 * @After public static void writeExtentReport() {
	 * Reporter.loadXMLConfig(prop.getProperty("reportConfigPath")); }
	 */
}
