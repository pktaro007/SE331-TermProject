package CAMT.SE331.TermProject.Controller;

import CAMT.SE331.TermProject.Entity.Product;
import CAMT.SE331.TermProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Dto on 2/8/2015.
 */
@RestController
@RequestMapping("/")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "product",method = RequestMethod.GET)
    public  List<Product> list(){
        return productService.getProducts();
    }

    @RequestMapping(value = "product",method = RequestMethod.POST)
    public @ResponseBody Product add(@RequestBody Product product, BindingResult bindingResult){
        return productService.addProduct(product);
    }

    @RequestMapping(value = "product/{id}",method = RequestMethod.GET)
    public  Product getProduct(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }

    @RequestMapping(value = "product/{id}",method = RequestMethod.PUT)
    public  Product edit(@PathVariable("id") Long id,@RequestBody Product product, BindingResult bindingResult){
        return productService.updateProduct(product);
    }

    @RequestMapping(value = "product/{id}",method = RequestMethod.DELETE)
    public  Product edit(@PathVariable("id") Long id){
        return productService.deleteProduct(id);
    }
}
