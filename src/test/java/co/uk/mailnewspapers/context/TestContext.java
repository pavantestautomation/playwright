package co.uk.mailnewspapers.context;

import com.microsoft.playwright.*;

public class TestContext {

    private static Playwright playwrightInstance;
    private static Browser browserInstance;
    private static BrowserContext browserContextInstance;
    private static Page pageInstance;

    public static Playwright getPlaywrightInstance() {
        if (playwrightInstance == null)
            return playwrightInstance = Playwright.create();
        return playwrightInstance;
    }

    public static Browser getBrowserInstance() {
        if (browserInstance == null)
            return browserInstance = getPlaywrightInstance().chromium()
                    .launch(new BrowserType.LaunchOptions()
                            .setHeadless(false).setSlowMo(50));
        return browserInstance;
    }

    public static BrowserContext getBrowserContextInstance() {
        if (browserContextInstance == null)
            return browserContextInstance = getBrowserInstance().newContext();
        return browserContextInstance;
    }

    public static Page getPageInstance(){
        if(pageInstance==null)
            return getBrowserInstance().newPage();
        return pageInstance;
    }
}