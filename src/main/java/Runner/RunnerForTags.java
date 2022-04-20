package Runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Features", glue={"StepDefinition"},
        //  tags ={"@smoke", "@regression"}
        tags = "@smoke"
//tags = {"@smoke"}
        //tags = {"@smoke and @regression"}
        //tags = {"(@smoke or @regression) and @important"}
)
public class RunnerForTags {
}

