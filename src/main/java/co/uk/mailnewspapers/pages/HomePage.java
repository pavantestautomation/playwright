package co.uk.mailnewspapers.pages;

import co.uk.mailnewspapers.pages.onemail.BurgerMenu;
import co.uk.mailnewspapers.pages.onemail.NewspaperPage;
import co.uk.mailnewspapers.pages.onemail.TodayPage;
import com.microsoft.playwright.Page;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class HomePage {
    @Getter
    private final Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void acceptCookie(){
        this.page.locator("button[id*=accept-btn]").click();
    }


    public void dailyMailLogo() {
        if(!this.page.locator("img.masthead-logo").isVisible())
            throw new RuntimeException("Home page not loaded");
    }

    public BurgerMenu burgerMenu() {
        return new BurgerMenu(this.page);
    }

    public NewspaperPage newsPaper() {
        return new NewspaperPage(this.page);
    }

    public TodayPage today() {
        return new TodayPage(this.page);
    }


}
