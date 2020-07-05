package co.com.metrocencosud.retosophos.tasks;


import co.com.metrocencosud.retosophos.userinterface.SelectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.metrocencosud.retosophos.userinterface.HomePage.*;
import static co.com.metrocencosud.retosophos.userinterface.SelectPage.SEE_BASKET;
import static co.com.metrocencosud.retosophos.userinterface.SelectPage.SHOPPING_BASKET;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SelectArticle implements Task {
    private String article;
    private int number;
    private SelectPage selectPage;

    public SelectArticle(int number, String article){
        this.number = number;
        this.article = article;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

      actor.attemptsTo(

              Enter.theValue(article).into(OPTION_SEARCH_ARTICLE).thenHit(Keys.ENTER)
      );

      actor.attemptsTo(Click.on(selectPage.getItemsArticle().get(0)));

      if (number > 1){
          for (int i =1; i < number; i++){
         actor.attemptsTo(

                 WaitUntil.the(SHOPPING_BASKET, isVisible()),
                 Scroll.to(SHOPPING_BASKET),
                 Click.on(SHOPPING_BASKET)
         );
          }
      }
      actor.attemptsTo(Click.on(SEE_BASKET)
      );

    }
    public static SelectArticle selectsArticle(int number, String article){
        return Tasks.instrumented(SelectArticle.class, number, article);

    }
}
