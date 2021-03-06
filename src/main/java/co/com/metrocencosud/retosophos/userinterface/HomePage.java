package co.com.metrocencosud.retosophos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * En esta clase estan mapeados los elementos de la busqueda y de la validación del producto
 */

public class HomePage extends PageObject {

    public static final Target OPTION_SEARCH_ARTICLE = Target.the("Option search article").located(By.id("search-autocomplete-input"));

    public static final Target QUANTITY_ITEMS = Target.the("Quantity Items").locatedBy("//*[@class='total-items-title']");
}
