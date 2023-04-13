package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
        glue = "StepDefinitions" ,
        dryRun = false,
       // tags = "@testcase1 or @testcase2 and @smoke",
       // tags = "@smoke1 or @testcase2 and @smoke or @smoke or @smoke2",
        tags = "@smoke1",
       // tags = "@ScenarioOutline1",
      //  tags = "@dataTable",
        plugin = {"pretty","html:target/Cucumber.html","json:target/Cucumber.json"}
)
class SmokeRunner {
}


//tags option will execute the tagged testcase as mentioned in your runner class
// plugin makes thr council more readable
// target folder is mostly used for storing the test case executing reports generated using cucumber