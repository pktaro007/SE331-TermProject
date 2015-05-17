package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Product;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductService {
    List<Product> getProducts();
    List<Product> getProducts(String anyKeyword);
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);
}
