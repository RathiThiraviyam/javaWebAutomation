package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Feature/letCode.feature"},
        glue = {"StepDef"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {

}
