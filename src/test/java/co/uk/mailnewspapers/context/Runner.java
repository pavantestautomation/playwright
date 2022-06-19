package co.uk.mailnewspapers.context;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "co.uk.mailnewspapers",
        tags="not @ignore",
        monochrome = true,
        dryRun = false,
        publish = true,
        plugin={"pretty", "html:target/test-report/report.html", "json:target/test-report/json/report.json"})
public class Runner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
