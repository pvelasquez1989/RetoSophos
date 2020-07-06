package co.com.metrocencosud.retosophos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import java.util.logging.Logger;
import static co.com.metrocencosud.retosophos.userinterface.HomePage.QUANTITY_ITEMS;

/**
 * En esta clase validamos que el articulo sea agergado de manera exitosa al carrito de compras
 */

public class StatusTheArticleOnBasket implements Question<Boolean> {

    private String validation;
    private static final Logger LOGGER = Logger.getLogger(StatusTheArticleOnBasket.class.getName());

    public StatusTheArticleOnBasket(String validation){
        this.validation = validation;

    }
    @Override
    public Boolean answeredBy(Actor actor) {
        if (QUANTITY_ITEMS.resolveFor(actor).isCurrentlyVisible()) {
            actor.attemptsTo(Ensure.that(QUANTITY_ITEMS).text().containsIgnoringCase(validation));
        } else {
            LOGGER.info("The article isn't on the Basket");
            return false;
        }
        return true;
    }

   public static StatusTheArticleOnBasket theArticleOnBasket(String validation){
      return new  StatusTheArticleOnBasket(validation);


    }
}
