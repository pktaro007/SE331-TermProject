package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by Dto on 2/8/2015.
 */
@Repository
@Profile("db.SimpleDao")
public class SimpleProductDao implements  ProductDao{

    private Set<Product> products;
    public SimpleProductDao(){
        Product[] initProduct =  {
                new Product(1l,"Galaxy Gear","Smartwatch",1000.00),
                new Product(2l,"iPhone Earpod","For listening music",2000.00),
                new Product(3l,"HTC PM36100"," MFor calling",2500.00),
                new Product(4l,"Go Pro","Use for selfie",20000.00)
        };
        products = new TreeSet<Product>(Arrays.asList(initProduct));

    }
    @Override
    public List<Product> getProducts() {
        return new ArrayList<Product>(products);
    }

    @Override
    public List<Product> getProducts(String anyKeyword) {
        HashSet output = new HashSet();
        for(Product product:products){
            if (product.getName().contains(anyKeyword) || product.getDescription().contains(anyKeyword)){
                output.add(product);
            }
        }
        List<Product> outputList = (new ArrayList<Product>());
        outputList.addAll(output);
        return outputList;
    }

    @Override
    public Product addProduct(Product product) {
        product.setId((long) (products.size()+1));
        products.add(product);
        return product;
    }

    @Override
    public Product deleteProduct(Product product) {
        if (products.remove(product)){
            return product;
        }else
        {
            return null;
        }
    }

    @Override
    public Product updateProduct(Product product) {
        Product toRemove = getProduct(product.getId());
        if (toRemove == null){
            return null;
        }
        if (!products.remove(product))
            return null;

        products.add(product);
        return product;
    }

    @Override
    public Product getProduct(Long id){
        for(Product product:products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
}
