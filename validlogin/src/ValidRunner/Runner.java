package ValidRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/validloginFeatures",
glue="src/validstepDefinitions",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:test-ouput"})
public class Runner {

}
