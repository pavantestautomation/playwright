package co.uk.mailnewspapers.core.ui;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


@Configuration
public class BrowserFactory {

    @Getter
    private Page page;

    public void initBrowser(String browserName, boolean isHeadless) {
        this.page = createPage(launch(browserName, isHeadless));
    }

   private Browser launch(String browserName, boolean isHeadless) {
        Playwright playwright = Playwright.create();
        return playwright.chromium().launch(launchOptions(browserName, isHeadless));
    }

    private Page createPage(Browser browser) {
        return browser.newContext(new Browser.NewContextOptions().setViewportSize(null)).newPage();
    }

    private BrowserType.LaunchOptions launchOptions(String browserName, boolean isHeadless) {
        List<String> args = new ArrayList<>();
        args.add("--start-maximized");
        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions();
        options.setChannel(BrowserList.findBrowser(browserName).name());
        options.setHeadless(isHeadless);
        if (isHeadless) {
            args.add("--window-size=1920,1080");
        }
        return options.setArgs(args);
    }

    public void close() {
        this.page.context().close();
    }
}

enum BrowserList {
    firefox,
    chrome,
    edge;

    public static BrowserList findBrowser(String browserName) {
        return Stream.of(BrowserList.values()).filter(browser -> browserName
                .equalsIgnoreCase(browser.name())).findFirst().orElseThrow(() -> new RuntimeException("given browser is not handled"));
    }
}
