package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.ShoppingCart;

import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ShoppingCartDao {
    List<ShoppingCart> getShoppingCarts();
    List<ShoppingCart> getShoppingCartBefore(Date stateDate);
    List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate);
    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart);
}
