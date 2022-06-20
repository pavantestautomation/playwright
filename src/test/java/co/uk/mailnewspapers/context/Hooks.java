package co.uk.mailnewspapers.context;


import co.uk.mailnewspapers.core.ui.BrowserFactory;
import co.uk.mailnewspapers.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(value = "classpath:cucumber.xml")
public class Hooks {

    @Autowired
    Environment environment;
    @Autowired
    BrowserFactory browserFactory;
    @Autowired
    TestContext testContext;

    @Before
    public void init(Scenario scenario) {
        testContext.setScenario(scenario);
        browserFactory.initBrowser("chrome", false);
        browserFactory.getPage().navigate(environment.getProdUrl());
        testContext.setHomePage(new HomePage(browserFactory.getPage()));
    }

    @After()
    public void teardown(Scenario scenario) {
        if (scenario.isFailed())
            testContext.attachScreenShot();
        browserFactory.close();
    }
}
