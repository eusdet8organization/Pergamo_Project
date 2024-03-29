package eu.pergoma.stepDefinitions;

import eu.pergoma.utilities.ConfigurationReader;
import eu.pergoma.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.time.Duration;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}
