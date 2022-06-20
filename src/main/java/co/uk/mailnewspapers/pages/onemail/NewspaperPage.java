package co.uk.mailnewspapers.pages.onemail;

import com.microsoft.playwright.Page;

public class NewspaperPage {
    private final Page page;
    private final String newsPaperLocator = "text=NewsPaper";

    public NewspaperPage(Page page) {
        this.page = page;
        this.page.locator(newsPaperLocator).click();
    }

    public boolean isActive() {
        return !this.page.locator(newsPaperLocator).getAttribute("style").isEmpty();
    }

}
