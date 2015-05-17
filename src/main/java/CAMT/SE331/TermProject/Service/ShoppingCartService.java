package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.ShoppingCart;

import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ShoppingCartService {
    List<ShoppingCart> getShoppingCarts();
    List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate);
    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart);
}
