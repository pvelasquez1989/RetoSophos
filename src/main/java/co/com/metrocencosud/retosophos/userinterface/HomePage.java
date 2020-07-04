package co.com.metrocencosud.retosophos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage extends PageObject {


    public static final Target OPTION_SEARCH_ARTICLE = Target.the("Option search article").located(By.id("search-autocomplete-input"));

}
