package co.com.metrocencosud.retosophos.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import java.util.List;

/**
 * En esta clase se encuentra mapeados los elementos para agregar el producto al carrito de compras
 */

public class SelectPage extends PageObject {


    public List<WebElementFacade> getItemsArticle() {
        return findAll(By.xpath("//*[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart']"));
    }

    public static final Target SHOPPING_BASKET = Target.the("Shopping Basket").locatedBy("//*[@class='btn red minicart__action--toggle-open food-site']");


     public static final Target SEE_BASKET = Target.the("See Basket").locatedBy("(//a[@class='btn primary minicart__action minicart__action--buy'])[3]");
}
