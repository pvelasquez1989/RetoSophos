package co.com.metrocencosud.retosophos.stepdefinitions;

import co.com.metrocencosud.retosophos.tasks.prueba;
import co.com.metrocencosud.retosophos.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class MetroStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver browser;

    private Actor user = Actor.named("User");

    @Before
    public void init() {
        OnStage.setTheStage(OnlineCast.ofStandardActors());
    }




    @Given("^an user enters the MetroCencosud page$")
    public void anUserEntersTheMetroCencosudpage() {

       OnStage.theActorCalled("user").can(BrowseTheWeb.with((WebDriver) prueba.Page()));
    }


    @When("^the user search a product$")
    public void theUserSearchAProduct() throws Exception {

    }

    @Then("^the user check the product on basket$")
    public void theUserCheckTheProductOnBasket() throws Exception {

    }
}
