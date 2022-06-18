package co.uk.mailnewspapers.context;


import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    Environment environment;


    @Before
    public void init(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.mailplus.co.uk/");
        page.locator("//button[text()='Accept All Cookies']").click();
        page.locator("//p[text()='Best Of']").click();
    }

    @After
    public void teardown(){
     // TestContext.getBrowserContextInstance().tracing().stop(new Tracing.StopOptions().setPath(Paths.get("target/trace.zip")));
    }
}
