package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/feature/CreateLead.feature"},glue= {"steps","pages"},monochrome=true,tags= {"@smoke"})
public class RunTest {

}
