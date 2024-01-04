package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, tags = "@smoke", features="src/features", glue={"stepDefinitions","common"})
public class Runner {


}
