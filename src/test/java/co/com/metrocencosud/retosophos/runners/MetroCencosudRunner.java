package co.com.metrocencosud.retosophos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/metrocencosud.feature",
        glue = {"co.com.metrocencosud.retosophos.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class MetroCencosudRunner {
}
