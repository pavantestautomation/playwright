package co.uk.mailnewspapers.context;

import co.uk.mailnewspapers.core.ui.BrowserFactory;
import co.uk.mailnewspapers.pages.HomePage;
import io.cucumber.java.Scenario;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Data
public class TestContext {

 private HomePage homePage;
 private Scenario scenario;

 @Autowired
 BrowserFactory browserFactory;

 public void attachScreenShot() {
  scenario.attach(this.browserFactory.getPage().screenshot(),"image/jpeg", UUID.randomUUID().toString());
 }


}