package co.uk.mailnewspapers.context;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "co.uk.mailnewspapers",
        tags="not @ignore",
        monochrome = true,
        dryRun = false,
        publish = true,
        plugin={"pretty", "html:target/test-report/report.html", "json:target/test-report/json/report.json"})
public class Runner {

}
