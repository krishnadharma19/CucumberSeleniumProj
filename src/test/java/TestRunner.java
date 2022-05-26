import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "StepDefinitions",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = { "pretty", "json:target/cucumber.json", "html:target/site/cucumber-pretty.html" })
public class TestRunner {
}