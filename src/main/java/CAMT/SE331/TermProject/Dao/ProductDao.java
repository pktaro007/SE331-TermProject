package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Product;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductDao {
    List<Product> getProducts();
    List<Product> getProducts(String anyKeyword);
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Product product);
    Product updateProduct(Product product);

}
