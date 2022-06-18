package co.uk.mailnewspapers.context;


import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Paths;

public class Hooks {

    @Autowired
    Environment environment;


    @Before
    public void init(){
            TestContext.getBrowserInstance();
            TestContext.getBrowserContextInstance().tracing().start(new Tracing.StartOptions()
                .setScreenshots(true)
                .setSnapshots(true));
        TestContext.getPageInstance().navigate("https://www.mailplus.co.uk/");
        TestContext.getPageInstance().locator("a.header-menu-item p:has-text('Today')").click();
    }

    @After
    public void teardown(){
     // TestContext.getBrowserContextInstance().tracing().stop(new Tracing.StopOptions().setPath(Paths.get("target/trace.zip")));
    }
}
