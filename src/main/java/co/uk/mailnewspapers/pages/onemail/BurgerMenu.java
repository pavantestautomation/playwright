package co.uk.mailnewspapers.pages.onemail;

import com.microsoft.playwright.Page;

import java.util.List;

public class BurgerMenu {

    private final Page page;

    public BurgerMenu(Page page) {
        this.page = page;
        this.page.locator("div.menu-icon-2").click();
    }

    public void sport() {
        this.page.locator("text=Sport").click();
    }

    public void showBiz() {
        this.page.locator("text=ShowBiz").click();
    }

    public void femail() {
        this.page.locator("text=Femail").click();
    }

    public void health() {
        this.page.locator("text=Health").click();
    }

    public void food() {
        this.page.locator("text=Food").click();
    }

    public void money() {
        this.page.locator("text=Money").click();
    }

    public void travel() {
        this.page.locator("text=Travel").click();
    }

    public void podcasts() {
        this.page.locator("text=Podcasts").click();
    }

    public List<String> getBurgerMenuItems(){
       return this.page.locator("div.sections-nav a").allTextContents();
    }

}
