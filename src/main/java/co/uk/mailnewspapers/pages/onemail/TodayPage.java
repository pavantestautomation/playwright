package co.uk.mailnewspapers.pages.onemail;

import com.microsoft.playwright.Page;

public class TodayPage {
    private final Page page;
    private final String todayLocator = "text=Today";

    public TodayPage(Page page) {
        this.page = page;
        this.page.locator(todayLocator).click();
    }

    public boolean isActive() {
        return !this.page.locator(todayLocator).getAttribute("style").isEmpty();
    }
}
