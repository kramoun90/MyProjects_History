package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/HomePage.feature"}
        , glue = {"stepDefinitions"}
//        , tags = ""
        , monochrome = true
        , plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"}
)
public class Cigna_TestNgRunner  extends AbstractTestNGCucumberTests {
}
