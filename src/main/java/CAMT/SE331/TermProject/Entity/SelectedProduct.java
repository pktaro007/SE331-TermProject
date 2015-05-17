package CAMT.SE331.TermProject.Entity;

/**
 * Created by Dto on 2/7/2015.
 */
public class SelectedProduct {
    Product product;
    Integer amount;

    public Double getTotalPrice(){
        return 0.0;
    }

    public SelectedProduct() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public SelectedProduct(Product product, Integer amount) {

        this.product = product;
        this.amount = amount;
    }
}
