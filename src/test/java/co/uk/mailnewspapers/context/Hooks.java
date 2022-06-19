package co.uk.mailnewspapers.context;


import co.uk.mailnewspapers.core.ui.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(value="classpath:cucumber.xml")
public class Hooks {

    @Autowired
    Environment environment;
    @Autowired
    BrowserFactory browserFactory;
    @Autowired
    TestContext testContext;

    @Before
    public void init(Scenario scenario){
        browserFactory.initBrowser("chrome",false);
        testContext.setPage(browserFactory.getPage());
        System.out.println("Page has code" + testContext.getPage().hashCode());
        testContext.getPage().navigate(environment.getProdUrl());
        testContext.getPage().locator("//button[text()='Accept All Cookies']").click();
        testContext.getPage().locator("//p[text()='Best Of']").click();
        scenario.attach(testContext.getPage().screenshot(), "image/png", scenario.getName());
    }

    @After
    public void teardown(){
        testContext.getPage().context().close();
    }
}
