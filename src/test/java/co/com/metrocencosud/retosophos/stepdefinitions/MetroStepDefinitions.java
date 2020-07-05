package co.com.metrocencosud.retosophos.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.util.Map;
import static co.com.metrocencosud.retosophos.tasks.SelectArticle.selectsArticle;
import static co.com.metrocencosud.retosophos.questions.StatusTheArticleOnBasket.theArticleOnBasket;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


@RunWith(Cucumber.class)
public class MetroStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor user = Actor.named("User");
    @Before
    public void setup() {

        user.can(BrowseTheWeb.with(browser));
    }


    @Given("^an user enters the MetroCencosud page$")
    public void anUserEntersTheMetroCencosudpage() {

        user.wasAbleTo(Open.url("https://www.metro.pe/especiales/cybermetro"));

    }


    @When("^the user search a product$")
    public void theUserSearchAProduct(Map<String, String> dataTable)  {
     user.attemptsTo(selectsArticle(Integer.parseInt(dataTable.get("number")), dataTable.get("article")));


    }

    @Then("^the user check the product on basket$")
    public void theUserCheckTheProductOnBasket(Map<String,String> dataTable) {
        user.should(seeThat(theArticleOnBasket(dataTable.get("validation"))));
    }
}
