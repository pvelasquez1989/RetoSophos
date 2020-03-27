package co.com.metrocencosud.retosophos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/metrocencosud.feature",
        glue = "co.com.metrocencosud.retosophos.stepdefinitions",
        snippets = CAMELCASE

)
public class MetroCencosudRunner {


}
