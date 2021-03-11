package stepDefinitions;

import com.mycigna.Cigna_Homepage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class SD_HomePage extends WebAPI {
    static Cigna_Homepage cigna_homepage;

    // cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            //take Screenshot
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1");
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }
    @BeforeStep
    public static void getInit() {
        cigna_homepage = PageFactory.initElements(driver, Cigna_Homepage.class);
    }


}
